package typings.lruMemoizer

import typings.lruCache.mod.DeprecatedOptions
import typings.lruCache.mod.SharedOptions
import typings.lruMemoizer.lruMemoizerStrings.hit
import typings.lruMemoizer.lruMemoizerStrings.miss
import typings.lruMemoizer.lruMemoizerStrings.queue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMod {
  
  @js.native
  trait IBypassFunction[T1, T2, T3, T4, T5, T6] extends StObject {
    
    def apply(): Boolean = js.native
    def apply(arg1: T1): Boolean = js.native
    def apply(arg1: T1, arg2: T2): Boolean = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3): Boolean = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4): Boolean = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): Boolean = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6): Boolean = js.native
    def apply(rest: Any*): Boolean = js.native
  }
  
  @js.native
  trait IHashingFunction[T1, T2, T3, T4, T5, T6] extends StObject {
    
    def apply(): String = js.native
    def apply(arg1: T1): String = js.native
    def apply(arg1: T1, arg2: T2): String = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3): String = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4): String = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): String = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6): String = js.native
    def apply(rest: Any*): String = js.native
  }
  
  @js.native
  trait IMaxAgeFunction[T1, T2, T3, T4, T5, T6, TResult] extends StObject {
    
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6, res: TResult): Double = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, res: TResult): Double = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, res: TResult): Double = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, res: TResult): Double = js.native
    def apply(arg1: T1, arg2: T2, res: TResult): Double = js.native
    def apply(arg1: T1, res: TResult): Double = js.native
    def apply(res: TResult): Double = js.native
    def apply(rest: Any*): Double = js.native
  }
  
  type INodeStyleCallBack[SuccessArg] = js.Function2[/* err */ js.Error, /* result */ js.UndefOr[SuccessArg], Unit]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped lru-cache.lru-cache.LimitedByCount | lru-cache.lru-cache.LimitedBySize<string, any> | lru-cache.lru-cache.LimitedByTTL
  - Dropped lru-cache.anon.MaxEntrySize<string, any> | {} */ trait IParamsBase[T1, T2, T3, T4, T5, T6, TResult]
    extends StObject
       with SharedOptions[String, Any]
       with DeprecatedOptions[String, Any] {
    
    /**
      * Return true if the result should not be retrieved from the cache.
      */
    var bypass: js.UndefOr[IBypassFunction[T1, T2, T3, T4, T5, T6]] = js.undefined
    
    /**
      * Indicates if the resource should be cloned before is returned.
      */
    @JSName("clone")
    var clone_FIParamsBase: js.UndefOr[Boolean] = js.undefined
    
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
      * Do not queue requests if initial call is more than `queueMaxAge` milliseconds old.
      * Instead, invoke `load` again and create a new queue.
      * Defaults to 1000ms.
      */
    var queueMaxAge: js.UndefOr[Double] = js.undefined
  }
  object IParamsBase {
    
    inline def apply[T1, T2, T3, T4, T5, T6, TResult](
      hash: IHashingFunction[T1, T2, T3, T4, T5, T6],
      itemMaxAge: IMaxAgeFunction[T1, T2, T3, T4, T5, T6, TResult]
    ): IParamsBase[T1, T2, T3, T4, T5, T6, TResult] = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], itemMaxAge = itemMaxAge.asInstanceOf[js.Any])
      __obj.asInstanceOf[IParamsBase[T1, T2, T3, T4, T5, T6, TResult]]
    }
    
    extension [Self <: IParamsBase[?, ?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, T6, TResult](x: Self & (IParamsBase[T1, T2, T3, T4, T5, T6, TResult])) {
      
      inline def setBypass(value: IBypassFunction[T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "bypass", value.asInstanceOf[js.Any])
      
      inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setFreeze(value: Boolean): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
      
      inline def setFreezeUndefined: Self = StObject.set(x, "freeze", js.undefined)
      
      inline def setHash(value: IHashingFunction[T1, T2, T3, T4, T5, T6]): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setItemMaxAge(value: IMaxAgeFunction[T1, T2, T3, T4, T5, T6, TResult]): Self = StObject.set(x, "itemMaxAge", value.asInstanceOf[js.Any])
      
      inline def setQueueMaxAge(value: Double): Self = StObject.set(x, "queueMaxAge", value.asInstanceOf[js.Any])
      
      inline def setQueueMaxAgeUndefined: Self = StObject.set(x, "queueMaxAge", js.undefined)
    }
  }
  
  @js.native
  trait Listener extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  @js.native
  trait ResultBase extends StObject {
    
    /**
      * Delete an item given the parameters.
      */
    def del[T1, T2, T3, T4, T5, T6](arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6): Unit = js.native
    
    /**
      * Returns all keys in the cache.
      */
    def keys(): js.Array[String] = js.native
    
    @JSName("on")
    def on_hit(event: hit, handler: Listener): Unit = js.native
    @JSName("on")
    def on_miss(event: miss, handler: Listener): Unit = js.native
    @JSName("on")
    def on_queue(event: queue, handler: Listener): Unit = js.native
    
    /**
      * Clear the cache.
      */
    def reset(): Unit = js.native
  }
}
