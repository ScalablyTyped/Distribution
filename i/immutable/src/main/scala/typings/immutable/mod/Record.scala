package typings.immutable.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.immutable.Immutable.Seq.Keyed
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Record[TProps /* <: js.Object */] extends js.Object {
  
  /**
    * @see `Map#asImmutable`
    */
  def asImmutable(): this.type = js.native
  
  /**
    * @see `Map#asMutable`
    */
  def asMutable(): this.type = js.native
  
  /**
    * Returns a new instance of this Record type with all values set
    * to their default values.
    */
  def clear(): this.type = js.native
  
  /**
    * Returns a new instance of this Record type with the value for the
    * specific key set to its default value.
    *
    * @alias remove
    */
  def delete[K /* <: /* keyof TProps */ String */](key: K): this.type = js.native
  
  /**
    * @alias removeIn
    */
  def deleteIn(keyPath: Iterable[_]): this.type = js.native
  
  // Value equality
  def equals(other: js.Any): Boolean = js.native
  
  /**
    * Returns the value associated with the provided key, which may be the
    * default value defined when creating the Record factory function.
    *
    * If the requested key is not defined by this Record type, then
    * notSetValue will be returned if provided. Note that this scenario would
    * produce an error when using Flow or TypeScript.
    */
  def get[K /* <: /* keyof TProps */ String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
  def get[K /* <: /* keyof TProps */ String */](key: K, notSetValue: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any = js.native
  def get[T](key: String, notSetValue: T): T = js.native
  
  def getIn(keyPath: Iterable[_]): js.Any = js.native
  
  // Reading values
  def has(key: String): Boolean = js.native
  
  // Reading deep values
  def hasIn(keyPath: Iterable[_]): Boolean = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[
    IterableIterator[
      js.Tuple2[
        /* keyof TProps */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: TProps[keyof TProps] */ js.Any
      ]
    ]
  ] = js.native
  
  def merge(collections: (Partial[TProps] | (Iterable[js.Tuple2[String, _]]))*): this.type = js.native
  
  def mergeDeep(collections: (Partial[TProps] | (Iterable[js.Tuple2[String, _]]))*): this.type = js.native
  
  def mergeDeepIn(keyPath: Iterable[_], collections: js.Any*): this.type = js.native
  
  def mergeDeepWith(
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* key */ js.Any, _],
    collections: (Partial[TProps] | (Iterable[js.Tuple2[String, _]]))*
  ): this.type = js.native
  
  def mergeIn(keyPath: Iterable[_], collections: js.Any*): this.type = js.native
  
  def mergeWith(
    merger: js.Function3[/* oldVal */ js.Any, /* newVal */ js.Any, /* keyof TProps */ /* key */ String, _],
    collections: (Partial[TProps] | (Iterable[js.Tuple2[String, _]]))*
  ): this.type = js.native
  
  def remove[K /* <: /* keyof TProps */ String */](key: K): this.type = js.native
  
  def removeIn(keyPath: Iterable[_]): this.type = js.native
  
  // Persistent changes
  def set[K /* <: /* keyof TProps */ String */](
    key: K,
    value: /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
  ): this.type = js.native
  
  // Deep persistent changes
  def setIn(keyPath: Iterable[_], value: js.Any): this.type = js.native
  
  // Conversion to JavaScript types
  /**
    * Deeply converts this Record to equivalent native JavaScript Object.
    *
    * Note: This method may not be overridden. Objects with custom
    * serialization to plain JS may override toJSON() instead.
    */
  def toJS(): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof TProps ]: any}
    */ typings.immutable.immutableStrings.Record with TopLevel[js.Any] = js.native
  
  /**
    * Shallowly converts this Record to equivalent native JavaScript Object.
    */
  def toJSON(): TProps = js.native
  
  /**
    * Shallowly converts this Record to equivalent JavaScript Object.
    */
  def toObject(): TProps = js.native
  
  // Sequence algorithms
  def toSeq(): Keyed[
    /* keyof TProps */ String, 
    /* import warning: importer.ImportType#apply Failed type conversion: TProps[keyof TProps] */ js.Any
  ] = js.native
  
  def update[K /* <: /* keyof TProps */ String */](
    key: K,
    updater: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ /* value */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: TProps[K] */ js.Any
    ]
  ): this.type = js.native
  
  def updateIn(keyPath: Iterable[_], updater: js.Function1[/* value */ js.Any, _]): this.type = js.native
  
  /**
    * @see `Map#wasAltered`
    */
  def wasAltered(): Boolean = js.native
  
  // Transient changes
  /**
    * Note: Not all methods can be used on a mutable collection or within
    * `withMutations`! Only `set` may be used mutatively.
    *
    * @see `Map#withMutations`
    */
  def withMutations(mutator: js.Function1[/* mutable */ this.type, _]): this.type = js.native
}
@JSImport("immutable", "Record")
@js.native
object Record extends js.Object {
  
  def apply[TProps](defaultValues: TProps): typings.immutable.Immutable.Record.Factory[TProps] = js.native
  def apply[TProps](defaultValues: TProps, name: String): typings.immutable.Immutable.Record.Factory[TProps] = js.native
  
  def getDescriptiveName(record: typings.immutable.Immutable.Record[_]): String = js.native
  
  def isRecord(maybeRecord: js.Any): /* is immutable.Immutable.Record<any> */ Boolean = js.native
  
  @js.native
  trait Factory[TProps /* <: js.Object */]
    extends Instantiable0[typings.immutable.Immutable.Record[TProps] with TProps]
       with Instantiable1[
          (/* values */ Iterable[js.Tuple2[String, js.Any]]) | (/* values */ Partial[TProps]), 
          typings.immutable.Immutable.Record[TProps] with TProps
        ] {
    
    def apply(): typings.immutable.Immutable.Record[TProps] with TProps = js.native
    def apply(values: Iterable[js.Tuple2[String, _]]): typings.immutable.Immutable.Record[TProps] with TProps = js.native
    def apply(values: Partial[TProps]): typings.immutable.Immutable.Record[TProps] with TProps = js.native
    
    /**
      * The name provided to `Record(values, name)` can be accessed with
      * `displayName`.
      */
    var displayName: String = js.native
  }
  @js.native
  object Factory extends js.Object {
    
    def apply[TProps /* <: js.Object */](): typings.immutable.Immutable.Record[TProps] with TProps = js.native
    def apply[TProps /* <: js.Object */](values: Iterable[js.Tuple2[String, _]]): typings.immutable.Immutable.Record[TProps] with TProps = js.native
    def apply[TProps /* <: js.Object */](values: Partial[TProps]): typings.immutable.Immutable.Record[TProps] with TProps = js.native
  }
}
