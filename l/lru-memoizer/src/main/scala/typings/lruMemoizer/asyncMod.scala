package typings.lruMemoizer

import typings.lruCache.mod.DeprecatedOptions
import typings.lruCache.mod.SharedOptions
import typings.lruMemoizer.syncMod.IMemoizedSync
import typings.lruMemoizer.syncMod.SyncParams
import typings.lruMemoizer.utilMod.IBypassFunction
import typings.lruMemoizer.utilMod.IHashingFunction
import typings.lruMemoizer.utilMod.IMaxAgeFunction
import typings.lruMemoizer.utilMod.INodeStyleCallBack
import typings.lruMemoizer.utilMod.ResultBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  object asyncMemoizer {
    
    inline def apply[T1, T2, T3, T4, T5, T6, TResult](options: AsyncParams[T1, T2, T3, T4, T5, T6, TResult]): IMemoized[T1, T2, T3, T4, T5, T6, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, T2, T3, T4, T5, T6, TResult]]
    
    @JSImport("lru-memoizer/lib/async", "asyncMemoizer")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof syncMemoizer` */
    inline def sync[T1, T2, T3, T4, T5, T6, TResult](options: SyncParams[T1, T2, T3, T4, T5, T6, TResult]): IMemoizedSync[T1, T2, T3, T4, T5, T6, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, T2, T3, T4, T5, T6, TResult]]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.lruMemoizer.utilMod.IParamsBase because var conflicts: clone. Inlined hash, hash, hash, hash, hash, hash, hash, hash, hash_Original, bypass, itemMaxAge, itemMaxAge, itemMaxAge, itemMaxAge, itemMaxAge, itemMaxAge, itemMaxAge, itemMaxAge, itemMaxAge_Original, freeze, disable, queueMaxAge */ trait AsyncParams[T1, T2, T3, T4, T5, T6, TResult]
    extends StObject
       with SharedOptions[String, Any]
       with DeprecatedOptions[String, Any] {
    
    /**
      * Return true if the result should not be retrieved from the cache.
      */
    var bypass: js.UndefOr[IBypassFunction[T1, T2, T3, T4, T5, T6]] = js.undefined
    
    /**
      * Disable the cache and executes the load logic directly.
      */
    var disable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if the resource should be freezed.
      */
    var freeze: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function to generate the key of the cache.
      */
    def hash(): String
    /**
      * A function to generate the key of the cache.
      */
    def hash(arg1: T1): String
    /**
      * A function to generate the key of the cache.
      */
    def hash(arg1: T1, arg2: T2): String
    /**
      * A function to generate the key of the cache.
      */
    def hash(arg1: T1, arg2: T2, arg3: T3): String
    /**
      * A function to generate the key of the cache.
      */
    def hash(arg1: T1, arg2: T2, arg3: T3, arg4: T4): String
    /**
      * A function to generate the key of the cache.
      */
    def hash(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): String
    /**
      * A function to generate the key of the cache.
      */
    def hash(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6): String
    /**
      * A function to generate the key of the cache.
      */
    def hash(rest: Any*): String
    /**
      * A function to generate the key of the cache.
      */
    @JSName("hash")
    var hash_Original: IHashingFunction[T1, T2, T3, T4, T5, T6]
    
    /**
      * An optional function to indicate the maxAge of an specific item.
      */
    def itemMaxAge(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, res: TResult): Double
    /**
      * An optional function to indicate the maxAge of an specific item.
      */
    def itemMaxAge(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, res: TResult): Double
    /**
      * An optional function to indicate the maxAge of an specific item.
      */
    def itemMaxAge(arg1: T1, arg2: T2, arg3: T3, arg4: T4, res: TResult): Double
    /**
      * An optional function to indicate the maxAge of an specific item.
      */
    def itemMaxAge(arg1: T1, arg2: T2, arg3: T3, res: TResult): Double
    /**
      * An optional function to indicate the maxAge of an specific item.
      */
    def itemMaxAge(arg1: T1, arg2: T2, res: TResult): Double
    /**
      * An optional function to indicate the maxAge of an specific item.
      */
    def itemMaxAge(arg1: T1, res: TResult): Double
    /**
      * An optional function to indicate the maxAge of an specific item.
      */
    def itemMaxAge(res: TResult): Double
    /**
      * An optional function to indicate the maxAge of an specific item.
      */
    def itemMaxAge(rest: Any*): Double
    /**
      * An optional function to indicate the maxAge of an specific item.
      */
    @JSName("itemMaxAge")
    var itemMaxAge_Original: IMaxAgeFunction[T1, T2, T3, T4, T5, T6, TResult]
    
    /**
      * The function that loads the resource when is not in the cache.
      */
    def load(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, cb: INodeStyleCallBack[TResult]): Unit
    /**
      * The function that loads the resource when is not in the cache.
      */
    def load(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, cb: INodeStyleCallBack[TResult]): Unit
    /**
      * The function that loads the resource when is not in the cache.
      */
    def load(arg1: T1, arg2: T2, arg3: T3, arg4: T4, cb: INodeStyleCallBack[TResult]): Unit
    /**
      * The function that loads the resource when is not in the cache.
      */
    def load(arg1: T1, arg2: T2, arg3: T3, cb: INodeStyleCallBack[TResult]): Unit
    /**
      * The function that loads the resource when is not in the cache.
      */
    def load(arg1: T1, arg2: T2, cb: INodeStyleCallBack[TResult]): Unit
    /**
      * The function that loads the resource when is not in the cache.
      */
    def load(arg1: T1, cb: INodeStyleCallBack[TResult]): Unit
    /**
      * The function that loads the resource when is not in the cache.
      */
    def load(cb: INodeStyleCallBack[TResult]): Unit
    /**
      * The function that loads the resource when is not in the cache.
      */
    def load(rest: Any*): Unit
    /**
      * The function that loads the resource when is not in the cache.
      */
    @JSName("load")
    var load_Original: IMemoizableFunction[T1, T2, T3, T4, T5, T6, TResult]
    
    /**
      * Do not queue requests if initial call is more than `queueMaxAge` milliseconds old.
      * Instead, invoke `load` again and create a new queue.
      * Defaults to 1000ms.
      */
    var queueMaxAge: js.UndefOr[Double] = js.undefined
  }
  object AsyncParams {
    
    inline def apply[T1, T2, T3, T4, T5, T6, TResult](
      hash: IHashingFunction[T1, T2, T3, T4, T5, T6],
      itemMaxAge: IMaxAgeFunction[T1, T2, T3, T4, T5, T6, TResult],
      load: IMemoizableFunction[T1, T2, T3, T4, T5, T6, TResult]
    ): AsyncParams[T1, T2, T3, T4, T5, T6, TResult] = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], itemMaxAge = itemMaxAge.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncParams[T1, T2, T3, T4, T5, T6, TResult]]
    }
    
    extension [Self <: AsyncParams[?, ?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, T6, TResult](x: Self & (AsyncParams[T1, T2, T3, T4, T5, T6, TResult])) {
      
      inline def setBypass(value: IBypassFunction[T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "bypass", value.asInstanceOf[js.Any])
      
      inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setFreeze(value: Boolean): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
      
      inline def setFreezeUndefined: Self = StObject.set(x, "freeze", js.undefined)
      
      inline def setHash(value: IHashingFunction[T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setItemMaxAge(value: IMaxAgeFunction[T1, T2, T3, T4, T5, T6, TResult]): Self = StObject.set(x, "itemMaxAge", value.asInstanceOf[js.Any])
      
      inline def setLoad(value: IMemoizableFunction[T1, T2, T3, T4, T5, T6, TResult]): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setQueueMaxAge(value: Double): Self = StObject.set(x, "queueMaxAge", value.asInstanceOf[js.Any])
      
      inline def setQueueMaxAgeUndefined: Self = StObject.set(x, "queueMaxAge", js.undefined)
    }
  }
  
  @js.native
  trait IMemoizableFunction[T1, T2, T3, T4, T5, T6, TResult] extends StObject {
    
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(arg1: T1, arg2: T2, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(arg1: T1, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(rest: Any*): Unit = js.native
  }
  
  @js.native
  trait IMemoized[T1, T2, T3, T4, T5, T6, TResult]
    extends StObject
       with ResultBase {
    
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(arg1: T1, arg2: T2, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(arg1: T1, cb: INodeStyleCallBack[TResult]): Unit = js.native
  }
}
