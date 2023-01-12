package typings.levelup

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import typings.abstractLeveldown.mod.AbstractBatch
import typings.abstractLeveldown.mod.AbstractGetOptions
import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractIteratorOptions
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.abstractLeveldown.mod.AbstractOptions
import typings.abstractLeveldown.mod.ErrorCallback
import typings.abstractLeveldown.mod.ErrorValueCallback
import typings.levelup.anon.EncodingError
import typings.levelup.levelupStrings.`new`
import typings.levelup.levelupStrings.batch
import typings.levelup.levelupStrings.clear
import typings.levelup.levelupStrings.closed
import typings.levelup.levelupStrings.closing
import typings.levelup.levelupStrings.del
import typings.levelup.levelupStrings.open
import typings.levelup.levelupStrings.opening
import typings.levelup.levelupStrings.put
import typings.levelup.levelupStrings.ready
import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("levelup", JSImport.Namespace)
  @js.native
  open class ^[DB /* <: AbstractLevelDOWN[Any, Any] */] protected () extends LevelUp[DB, AbstractIterator[Any, Any]] {
    def this(db: DB) = this()
    def this(db: DB, cb: ErrorCallback) = this()
    def this(db: DB, options: Any) = this()
    def this(db: DB, options: Any, cb: ErrorCallback) = this()
  }
  @JSImport("levelup", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LevelUpConstructor = js.native
  
  trait AbstractClearOptions[K]
    extends StObject
       with AbstractOptions {
    
    var gt: js.UndefOr[K] = js.undefined
    
    var gte: js.UndefOr[K] = js.undefined
    
    var limit: js.UndefOr[Double] = js.undefined
    
    var lt: js.UndefOr[K] = js.undefined
    
    var lte: js.UndefOr[K] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object AbstractClearOptions {
    
    inline def apply[K](): AbstractClearOptions[K] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbstractClearOptions[K]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AbstractClearOptions[?], K] (val x: Self & AbstractClearOptions[K]) extends AnyVal {
      
      inline def setGt(value: K): Self = StObject.set(x, "gt", value.asInstanceOf[js.Any])
      
      inline def setGtUndefined: Self = StObject.set(x, "gt", js.undefined)
      
      inline def setGte(value: K): Self = StObject.set(x, "gte", value.asInstanceOf[js.Any])
      
      inline def setGteUndefined: Self = StObject.set(x, "gte", js.undefined)
      
      inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
      
      inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
      
      inline def setLt(value: K): Self = StObject.set(x, "lt", value.asInstanceOf[js.Any])
      
      inline def setLtUndefined: Self = StObject.set(x, "lt", js.undefined)
      
      inline def setLte(value: K): Self = StObject.set(x, "lte", value.asInstanceOf[js.Any])
      
      inline def setLteUndefined: Self = StObject.set(x, "lte", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    DB extends {clear (options : infer O, callback : std.ErrorCallback): void} ? levelup.levelup.LevelUpClear<O> : levelup.levelup.LevelUpClear<levelup.levelup.AbstractClearOptions<any>>
    }}}
    */
  type InferDBClear[DB] = LevelUpClear[AbstractClearOptions[Any]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    DB extends {del (key : infer K, options : infer O, callback : std.ErrorCallback): void} ? levelup.levelup.LevelUpDel<K, O> : levelup.levelup.LevelUpDel<any, abstract-leveldown.abstract-leveldown.AbstractOptions>
    }}}
    */
  type InferDBDel[DB] = LevelUpDel[Any, AbstractOptions]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    DB extends {get (key : infer K, options : infer O, callback : abstract-leveldown.abstract-leveldown.ErrorValueCallback<infer V>): void} ? levelup.levelup.LevelUpGet<K, V, O> : levelup.levelup.LevelUpGet<any, any, abstract-leveldown.abstract-leveldown.AbstractGetOptions>
    }}}
    */
  type InferDBGet[DB] = LevelUpGet[Any, Any, AbstractGetOptions]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    DB extends {getMany (keys : std.Array<infer K>, options : infer O, callback : abstract-leveldown.abstract-leveldown.ErrorValueCallback<std.Array<infer V>>): void} ? levelup.levelup.LevelUpGetMany<K, V, O> : levelup.levelup.LevelUpGetMany<any, any, abstract-leveldown.abstract-leveldown.AbstractGetOptions>
    }}}
    */
  type InferDBGetMany[DB] = LevelUpGetMany[Any, Any, AbstractGetOptions]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    DB extends {put (key : infer K, value : infer V, options : infer O, cb : any): void} ? levelup.levelup.LevelUpPut<K, V, O> : levelup.levelup.LevelUpPut<any, any, abstract-leveldown.abstract-leveldown.AbstractOptions>
    }}}
    */
  type InferDBPut[DB] = LevelUpPut[Any, Any, AbstractOptions]
  
  @js.native
  trait LevelUp[DB, Iterator] extends EventEmitter {
    
    def batch(): LevelUpChain[Any, Any] = js.native
    def batch(array: js.Array[AbstractBatch[Any, Any]]): js.Promise[Unit] = js.native
    def batch(array: js.Array[AbstractBatch[Any, Any]], callback: js.Function1[/* err */ js.UndefOr[Any], Any]): Unit = js.native
    def batch(array: js.Array[AbstractBatch[Any, Any]], options: Any): js.Promise[Unit] = js.native
    def batch(
      array: js.Array[AbstractBatch[Any, Any]],
      options: Any,
      callback: js.Function1[/* err */ js.UndefOr[Any], Any]
    ): Unit = js.native
    
    var clear: InferDBClear[DB] = js.native
    
    def close(): Unit = js.native
    def close(callback: ErrorCallback): Unit = js.native
    @JSName("close")
    def close_Promise(): js.Promise[Unit] = js.native
    
    def createKeyStream(): ReadableStream = js.native
    def createKeyStream(options: AbstractIteratorOptions[Any]): ReadableStream = js.native
    
    def createReadStream(): ReadableStream = js.native
    def createReadStream(options: AbstractIteratorOptions[Any]): ReadableStream = js.native
    
    def createValueStream(): ReadableStream = js.native
    def createValueStream(options: AbstractIteratorOptions[Any]): ReadableStream = js.native
    
    var del: InferDBDel[DB] = js.native
    
    var get: InferDBGet[DB] = js.native
    
    var getMany: InferDBGetMany[DB] = js.native
    
    def isClosed(): Boolean = js.native
    
    def isOpen(): Boolean = js.native
    
    def isOperational(): Boolean = js.native
    
    def iterator(): Iterator = js.native
    def iterator(options: AbstractIteratorOptions[Any]): Iterator = js.native
    
    /*
      emitted on given event
      */
    def on(event: open | ready | closed | opening | closing, cb: js.Function0[Unit]): this.type = js.native
    /*
      emitted when a batch operation has executed
      */
    @JSName("on")
    def on_batch(event: batch, cb: js.Function1[/* ary */ js.Array[Any], Unit]): this.type = js.native
    /*
      emitted when clear is called
      */
    @JSName("on")
    def on_clear(event: clear, cb: js.Function1[/* opts */ Any, Unit]): this.type = js.native
    /*
      emitted when a value is deleted
      */
    @JSName("on")
    def on_del(event: del, cb: js.Function1[/* key */ Any, Unit]): this.type = js.native
    /*
      emitted when a new value is 'put'
      */
    @JSName("on")
    def on_put(event: put, cb: js.Function2[/* key */ Any, /* value */ Any, Unit]): this.type = js.native
    
    def open(): Unit = js.native
    def open(callback: ErrorCallback): Unit = js.native
    @JSName("open")
    def open_Promise(): js.Promise[Unit] = js.native
    
    var put: InferDBPut[DB] = js.native
    
    val status: closed | open | opening | `new` | closing = js.native
  }
  
  type LevelUpBatch[K, O] = (js.Function2[/* key */ K, /* callback */ typings.std.ErrorCallback, Unit]) & (js.Function3[/* key */ K, /* options */ O, /* callback */ typings.std.ErrorCallback, Unit]) & (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[Unit]])
  
  @js.native
  trait LevelUpChain[K, V] extends StObject {
    
    def clear(): this.type = js.native
    
    def del(key: K): this.type = js.native
    
    val length: Double = js.native
    
    def put(key: K, value: V): this.type = js.native
    
    def write(): js.Promise[this.type] = js.native
    def write(callback: ErrorCallback): this.type = js.native
  }
  
  type LevelUpClear[O] = (js.Function1[/* callback */ typings.std.ErrorCallback, Unit]) & (js.Function2[/* options */ O, /* callback */ typings.std.ErrorCallback, Unit]) & (js.Function1[/* options */ js.UndefOr[O], js.Promise[Unit]])
  
  @js.native
  trait LevelUpConstructor
    extends StObject
       with Instantiable1[
          /* db */ AbstractLevelDOWN[Any, Any], 
          LevelUp[AbstractLevelDOWN[Any, Any], AbstractIterator[Any, Any]]
        ]
       with Instantiable2[
          /* db */ AbstractLevelDOWN[Any, Any], 
          (/* options */ Any) | (/* cb */ ErrorCallback), 
          LevelUp[AbstractLevelDOWN[Any, Any], AbstractIterator[Any, Any]]
        ]
       with Instantiable3[
          /* db */ AbstractLevelDOWN[Any, Any], 
          /* options */ Any, 
          /* cb */ ErrorCallback, 
          LevelUp[AbstractLevelDOWN[Any, Any], AbstractIterator[Any, Any]]
        ] {
    
    def apply[DB /* <: AbstractLevelDOWN[Any, Any] */](db: DB): LevelUp[DB, AbstractIterator[Any, Any]] = js.native
    def apply[DB /* <: AbstractLevelDOWN[Any, Any] */](db: DB, cb: ErrorCallback): LevelUp[DB, AbstractIterator[Any, Any]] = js.native
    def apply[DB /* <: AbstractLevelDOWN[Any, Any] */](db: DB, options: Any): LevelUp[DB, AbstractIterator[Any, Any]] = js.native
    def apply[DB /* <: AbstractLevelDOWN[Any, Any] */](db: DB, options: Any, cb: ErrorCallback): LevelUp[DB, AbstractIterator[Any, Any]] = js.native
    
    var errors: EncodingError = js.native
  }
  
  type LevelUpDel[K, O] = (js.Function2[/* key */ K, /* callback */ typings.std.ErrorCallback, Unit]) & (js.Function3[/* key */ K, /* options */ O, /* callback */ typings.std.ErrorCallback, Unit]) & (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[Unit]])
  
  type LevelUpGet[K, V, O] = (js.Function2[/* key */ K, /* callback */ ErrorValueCallback[V], Unit]) & (js.Function3[/* key */ K, /* options */ O, /* callback */ ErrorValueCallback[V], Unit]) & (js.Function2[/* key */ K, /* options */ js.UndefOr[O], js.Promise[V]])
  
  type LevelUpGetMany[K, V, O] = (js.Function2[/* keys */ js.Array[K], /* callback */ ErrorValueCallback[js.Array[V]], Unit]) & (js.Function3[
    /* keys */ js.Array[K], 
    /* options */ O, 
    /* callback */ ErrorValueCallback[js.Array[V]], 
    Unit
  ]) & (js.Function2[/* keys */ js.Array[K], /* options */ js.UndefOr[O], js.Promise[js.Array[V]]])
  
  type LevelUpPut[K, V, O] = (js.Function3[/* key */ K, /* value */ V, /* callback */ typings.std.ErrorCallback, Unit]) & (js.Function4[
    /* key */ K, 
    /* value */ V, 
    /* options */ O, 
    /* callback */ typings.std.ErrorCallback, 
    Unit
  ]) & (js.Function3[/* key */ K, /* value */ V, /* options */ js.UndefOr[O], js.Promise[Unit]])
  
  type _To = js.Object & LevelUpConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & LevelUpConstructor = ^
}
