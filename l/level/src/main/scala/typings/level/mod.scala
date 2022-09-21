package typings.level

import typings.abstractLevel.interfacesMod.NodeCallback
import typings.abstractLevel.mod.AbstractIterator
import typings.abstractLevel.mod.AbstractKeyIterator
import typings.abstractLevel.mod.AbstractLevel
import typings.abstractLevel.mod.AbstractValueIterator
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("level", "Level")
  @js.native
  open class Level[KDefault, VDefault] protected ()
    extends AbstractLevel[String | Buffer | js.typedarray.Uint8Array, KDefault, VDefault] {
    /**
      * Database constructor.
      *
      * @param location Directory path (relative or absolute) where LevelDB will store its
      * files, or in browsers, the name of the
      * [`IDBDatabase`](https://developer.mozilla.org/en-US/docs/Web/API/IDBDatabase) to be
      * opened.
      * @param options Options, of which some will be forwarded to {@link open}.
      */
    def this(location: String) = this()
    def this(location: String, options: DatabaseOptions[KDefault, VDefault]) = this()
    
    def batch[K, V](
      operations: js.Array[
          BatchOperation[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
            K, 
            V
          ]
        ],
      options: BatchOptions[K, V]
    ): js.Promise[Unit] = js.native
    def batch[K, V](
      operations: js.Array[
          BatchOperation[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
            K, 
            V
          ]
        ],
      options: BatchOptions[K, V],
      callback: NodeCallback[Unit]
    ): Unit = js.native
    
    def del[K](key: K, options: DelOptions[K]): js.Promise[Unit] = js.native
    def del[K](key: K, options: DelOptions[K], callback: NodeCallback[Unit]): Unit = js.native
    
    def get[K, V](key: K, options: GetOptions[K, V]): js.Promise[V] = js.native
    def get[K, V](key: K, options: GetOptions[K, V], callback: NodeCallback[V]): Unit = js.native
    
    def getMany[K, V](keys: js.Array[K], options: GetManyOptions[K, V]): js.Promise[js.Array[V]] = js.native
    def getMany[K, V](keys: js.Array[K], options: GetManyOptions[K, V], callback: NodeCallback[js.Array[V]]): Unit = js.native
    
    def iterator[K, V](options: IteratorOptions[K, V]): Iterator[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        K, 
        V
      ] = js.native
    
    def keys[K](options: KeyIteratorOptions[K]): KeyIterator[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        K
      ] = js.native
    
    /**
      * Location that was passed to the constructor.
      */
    def location: String = js.native
    
    def open(options: OpenOptions): js.Promise[Unit] = js.native
    def open(options: OpenOptions, callback: NodeCallback[Unit]): Unit = js.native
    
    def put[K, V](key: K, value: V, options: PutOptions[K, V]): js.Promise[Unit] = js.native
    def put[K, V](key: K, value: V, options: PutOptions[K, V], callback: NodeCallback[Unit]): Unit = js.native
    
    def values[K, V](options: ValueIteratorOptions[K, V]): ValueIterator[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof this */ Any, 
        K, 
        V
      ] = js.native
  }
  
  type BatchOperation[TDatabase, K, V] = (typings.classicLevel.mod.BatchOperation[TDatabase, K, V]) & (typings.browserLevel.mod.BatchOperation[TDatabase, K, V])
  
  trait BatchOptions[K, V]
    extends StObject
       with typings.classicLevel.mod.BatchOptions[K, V]
  object BatchOptions {
    
    inline def apply[K, V](): BatchOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BatchOptions[K, V]]
    }
  }
  
  @js.native
  trait ChainedBatch[TDatabase, K, V]
    extends typings.classicLevel.mod.ChainedBatch[TDatabase, K, V]
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.abstractLevel.abstractLevelMod.AbstractDatabaseOptions because var conflicts: createIfMissing, errorIfExists, keyEncoding, valueEncoding. Inlined 
  - typings.browserLevel.mod.DatabaseOptions because var conflicts: createIfMissing, errorIfExists, keyEncoding, valueEncoding. Inlined prefix, version */ trait DatabaseOptions[K, V]
    extends StObject
       with typings.classicLevel.mod.DatabaseOptions[K, V] {
    
    /**
      * Prefix for the `IDBDatabase` name. Can be set to an empty string.
      *
      * @defaultValue `'level-js-'`
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * The version to open the `IDBDatabase` with.
      *
      * @defaultValue `1`
      */
    var version: js.UndefOr[Double | String] = js.undefined
  }
  object DatabaseOptions {
    
    inline def apply[K, V](): DatabaseOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DatabaseOptions[K, V]]
    }
    
    extension [Self <: DatabaseOptions[?, ?], K, V](x: Self & (DatabaseOptions[K, V])) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setVersion(value: Double | String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait DelOptions[K]
    extends StObject
       with typings.classicLevel.mod.DelOptions[K]
  object DelOptions {
    
    inline def apply[K](): DelOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DelOptions[K]]
    }
  }
  
  trait GetManyOptions[K, V]
    extends StObject
       with typings.classicLevel.mod.GetManyOptions[K, V]
  object GetManyOptions {
    
    inline def apply[K, V](): GetManyOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetManyOptions[K, V]]
    }
  }
  
  trait GetOptions[K, V]
    extends StObject
       with typings.classicLevel.mod.GetOptions[K, V]
  object GetOptions {
    
    inline def apply[K, V](): GetOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetOptions[K, V]]
    }
  }
  
  @js.native
  trait Iterator[TDatabase, K, V] extends AbstractIterator[TDatabase, K, V]
  
  trait IteratorOptions[K, V]
    extends StObject
       with typings.classicLevel.mod.IteratorOptions[K, V]
  object IteratorOptions {
    
    inline def apply[K, V](): IteratorOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IteratorOptions[K, V]]
    }
  }
  
  @js.native
  trait KeyIterator[TDatabase, K] extends AbstractKeyIterator[TDatabase, K]
  
  trait KeyIteratorOptions[K]
    extends StObject
       with typings.classicLevel.mod.KeyIteratorOptions[K]
  object KeyIteratorOptions {
    
    inline def apply[K](): KeyIteratorOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyIteratorOptions[K]]
    }
  }
  
  trait OpenOptions
    extends StObject
       with typings.classicLevel.mod.OpenOptions
  object OpenOptions {
    
    inline def apply(): OpenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenOptions]
    }
  }
  
  trait PutOptions[K, V]
    extends StObject
       with typings.classicLevel.mod.PutOptions[K, V]
  object PutOptions {
    
    inline def apply[K, V](): PutOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PutOptions[K, V]]
    }
  }
  
  @js.native
  trait ValueIterator[TDatabase, K, V] extends AbstractValueIterator[TDatabase, K, V]
  
  trait ValueIteratorOptions[K, V]
    extends StObject
       with typings.classicLevel.mod.ValueIteratorOptions[K, V]
  object ValueIteratorOptions {
    
    inline def apply[K, V](): ValueIteratorOptions[K, V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValueIteratorOptions[K, V]]
    }
  }
}
