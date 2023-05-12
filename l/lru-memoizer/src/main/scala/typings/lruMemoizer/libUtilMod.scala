package typings.lruMemoizer

import typings.lruMemoizer.lruMemoizerStrings.hit
import typings.lruMemoizer.lruMemoizerStrings.miss
import typings.lruMemoizer.lruMemoizerStrings.queue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilMod {
  
  type IBypassFunction0 = js.Function0[Boolean]
  
  type IBypassFunction1[T1] = js.Function1[/* a1 */ T1, Boolean]
  
  type IBypassFunction2[T1, T2] = js.Function2[/* a1 */ T1, /* a2 */ T2, Boolean]
  
  type IBypassFunction3[T1, T2, T3] = js.Function3[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, Boolean]
  
  type IBypassFunction4[T1, T2, T3, T4] = js.Function4[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* a4 */ T4, Boolean]
  
  type IBypassFunction5[T1, T2, T3, T4, T5] = js.Function5[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* a4 */ T4, /* a5 */ T5, Boolean]
  
  type IBypassFunction6[T1, T2, T3, T4, T5, T6] = js.Function6[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* a4 */ T4, /* a5 */ T5, /* a6 */ T6, Boolean]
  
  type IBypassFunctionPlus = js.Function1[/* repeated */ Any, Boolean]
  
  type IHashingFunction0 = js.Function0[String]
  
  type IHashingFunction1[T1] = js.Function1[/* a1 */ T1, String]
  
  type IHashingFunction2[T1, T2] = js.Function2[/* a1 */ T1, /* a2 */ T2, String]
  
  type IHashingFunction3[T1, T2, T3] = js.Function3[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, String]
  
  type IHashingFunction4[T1, T2, T3, T4] = js.Function4[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* a4 */ T4, String]
  
  type IHashingFunction5[T1, T2, T3, T4, T5] = js.Function5[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* a4 */ T4, /* a5 */ T5, String]
  
  type IHashingFunction6[T1, T2, T3, T4, T5, T6] = js.Function6[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* a4 */ T4, /* a5 */ T5, /* a6 */ T6, String]
  
  type IHashingFunctionPlus = js.Function1[/* repeated */ Any, String]
  
  type IMaxAgeFunction0[TResult] = js.Function1[/* res */ TResult, Double]
  
  type IMaxAgeFunction1[T1, TResult] = js.Function2[/* a1 */ T1, /* res */ TResult, Double]
  
  type IMaxAgeFunction2[T1, T2, TResult] = js.Function3[/* a1 */ T1, /* a2 */ T2, /* res */ TResult, Double]
  
  type IMaxAgeFunction3[T1, T2, T3, TResult] = js.Function4[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* res */ TResult, Double]
  
  type IMaxAgeFunction4[T1, T2, T3, T4, TResult] = js.Function5[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* a4 */ T4, /* res */ TResult, Double]
  
  type IMaxAgeFunction5[T1, T2, T3, T4, T5, TResult] = js.Function6[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* a4 */ T4, /* a5 */ T5, /* res */ TResult, Double]
  
  type IMaxAgeFunction6[T1, T2, T3, T4, T5, T6, TResult] = js.Function7[
    /* a1 */ T1, 
    /* a2 */ T2, 
    /* a3 */ T3, 
    /* a4 */ T4, 
    /* a5 */ T5, 
    /* a6 */ T6, 
    /* res */ TResult, 
    Double
  ]
  
  type IMaxAgeFunctionPlus = js.Function1[/* repeated */ Any, Double]
  
  type INodeStyleCallBack[Success] = js.Function2[/* err */ js.Error | Null, /* result */ js.UndefOr[Success], Unit]
  
  trait IParamsBase0[TResult]
    extends StObject
       with IParamsBaseCommons {
    
    var bypass: js.UndefOr[IBypassFunction0] = js.undefined
    
    def hash(): String
    @JSName("hash")
    var hash_Original: IHashingFunction0
    
    var itemMaxAge: js.UndefOr[IMaxAgeFunction0[TResult]] = js.undefined
  }
  object IParamsBase0 {
    
    inline def apply[TResult](hash: () => String): IParamsBase0[TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash))
      __obj.asInstanceOf[IParamsBase0[TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParamsBase0[?], TResult] (val x: Self & IParamsBase0[TResult]) extends AnyVal {
      
      inline def setBypass(value: () => Boolean): Self = StObject.set(x, "bypass", js.Any.fromFunction0(value))
      
      inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
      
      inline def setHash(value: () => String): Self = StObject.set(x, "hash", js.Any.fromFunction0(value))
      
      inline def setItemMaxAge(value: TResult => Double): Self = StObject.set(x, "itemMaxAge", js.Any.fromFunction1(value))
      
      inline def setItemMaxAgeUndefined: Self = StObject.set(x, "itemMaxAge", js.undefined)
    }
  }
  
  trait IParamsBase1[T1, TResult]
    extends StObject
       with IParamsBaseCommons {
    
    var bypass: js.UndefOr[IBypassFunction1[T1]] = js.undefined
    
    def hash(a1: T1): String
    @JSName("hash")
    var hash_Original: IHashingFunction1[T1]
    
    var itemMaxAge: js.UndefOr[IMaxAgeFunction1[T1, TResult]] = js.undefined
  }
  object IParamsBase1 {
    
    inline def apply[T1, TResult](hash: T1 => String): IParamsBase1[T1, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash))
      __obj.asInstanceOf[IParamsBase1[T1, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParamsBase1[?, ?], T1, TResult] (val x: Self & (IParamsBase1[T1, TResult])) extends AnyVal {
      
      inline def setBypass(value: T1 => Boolean): Self = StObject.set(x, "bypass", js.Any.fromFunction1(value))
      
      inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
      
      inline def setHash(value: T1 => String): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
      
      inline def setItemMaxAge(value: (T1, TResult) => Double): Self = StObject.set(x, "itemMaxAge", js.Any.fromFunction2(value))
      
      inline def setItemMaxAgeUndefined: Self = StObject.set(x, "itemMaxAge", js.undefined)
    }
  }
  
  trait IParamsBase2[T1, T2, TResult]
    extends StObject
       with IParamsBaseCommons {
    
    var bypass: js.UndefOr[IBypassFunction2[T1, T2]] = js.undefined
    
    def hash(a1: T1, a2: T2): String
    @JSName("hash")
    var hash_Original: IHashingFunction2[T1, T2]
    
    var itemMaxAge: js.UndefOr[IMaxAgeFunction2[T1, T2, TResult]] = js.undefined
  }
  object IParamsBase2 {
    
    inline def apply[T1, T2, TResult](hash: (T1, T2) => String): IParamsBase2[T1, T2, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction2(hash))
      __obj.asInstanceOf[IParamsBase2[T1, T2, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParamsBase2[?, ?, ?], T1, T2, TResult] (val x: Self & (IParamsBase2[T1, T2, TResult])) extends AnyVal {
      
      inline def setBypass(value: (T1, T2) => Boolean): Self = StObject.set(x, "bypass", js.Any.fromFunction2(value))
      
      inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
      
      inline def setHash(value: (T1, T2) => String): Self = StObject.set(x, "hash", js.Any.fromFunction2(value))
      
      inline def setItemMaxAge(value: (T1, T2, TResult) => Double): Self = StObject.set(x, "itemMaxAge", js.Any.fromFunction3(value))
      
      inline def setItemMaxAgeUndefined: Self = StObject.set(x, "itemMaxAge", js.undefined)
    }
  }
  
  trait IParamsBase3[T1, T2, T3, TResult]
    extends StObject
       with IParamsBaseCommons {
    
    var bypass: js.UndefOr[IBypassFunction3[T1, T2, T3]] = js.undefined
    
    def hash(a1: T1, a2: T2, a3: T3): String
    @JSName("hash")
    var hash_Original: IHashingFunction3[T1, T2, T3]
    
    var itemMaxAge: js.UndefOr[IMaxAgeFunction3[T1, T2, T3, TResult]] = js.undefined
  }
  object IParamsBase3 {
    
    inline def apply[T1, T2, T3, TResult](hash: (T1, T2, T3) => String): IParamsBase3[T1, T2, T3, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction3(hash))
      __obj.asInstanceOf[IParamsBase3[T1, T2, T3, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParamsBase3[?, ?, ?, ?], T1, T2, T3, TResult] (val x: Self & (IParamsBase3[T1, T2, T3, TResult])) extends AnyVal {
      
      inline def setBypass(value: (T1, T2, T3) => Boolean): Self = StObject.set(x, "bypass", js.Any.fromFunction3(value))
      
      inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
      
      inline def setHash(value: (T1, T2, T3) => String): Self = StObject.set(x, "hash", js.Any.fromFunction3(value))
      
      inline def setItemMaxAge(value: (T1, T2, T3, TResult) => Double): Self = StObject.set(x, "itemMaxAge", js.Any.fromFunction4(value))
      
      inline def setItemMaxAgeUndefined: Self = StObject.set(x, "itemMaxAge", js.undefined)
    }
  }
  
  trait IParamsBase4[T1, T2, T3, T4, TResult]
    extends StObject
       with IParamsBaseCommons {
    
    var bypass: js.UndefOr[IBypassFunction4[T1, T2, T3, T4]] = js.undefined
    
    def hash(a1: T1, a2: T2, a3: T3, a4: T4): String
    @JSName("hash")
    var hash_Original: IHashingFunction4[T1, T2, T3, T4]
    
    var itemMaxAge: js.UndefOr[IMaxAgeFunction4[T1, T2, T3, T4, TResult]] = js.undefined
  }
  object IParamsBase4 {
    
    inline def apply[T1, T2, T3, T4, TResult](hash: (T1, T2, T3, T4) => String): IParamsBase4[T1, T2, T3, T4, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction4(hash))
      __obj.asInstanceOf[IParamsBase4[T1, T2, T3, T4, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParamsBase4[?, ?, ?, ?, ?], T1, T2, T3, T4, TResult] (val x: Self & (IParamsBase4[T1, T2, T3, T4, TResult])) extends AnyVal {
      
      inline def setBypass(value: (T1, T2, T3, T4) => Boolean): Self = StObject.set(x, "bypass", js.Any.fromFunction4(value))
      
      inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
      
      inline def setHash(value: (T1, T2, T3, T4) => String): Self = StObject.set(x, "hash", js.Any.fromFunction4(value))
      
      inline def setItemMaxAge(value: (T1, T2, T3, T4, TResult) => Double): Self = StObject.set(x, "itemMaxAge", js.Any.fromFunction5(value))
      
      inline def setItemMaxAgeUndefined: Self = StObject.set(x, "itemMaxAge", js.undefined)
    }
  }
  
  trait IParamsBase5[T1, T2, T3, T4, T5, TResult]
    extends StObject
       with IParamsBaseCommons {
    
    var bypass: js.UndefOr[IBypassFunction5[T1, T2, T3, T4, T5]] = js.undefined
    
    def hash(a1: T1, a2: T2, a3: T3, a4: T4, a5: T5): String
    @JSName("hash")
    var hash_Original: IHashingFunction5[T1, T2, T3, T4, T5]
    
    var itemMaxAge: js.UndefOr[IMaxAgeFunction5[T1, T2, T3, T4, T5, TResult]] = js.undefined
  }
  object IParamsBase5 {
    
    inline def apply[T1, T2, T3, T4, T5, TResult](hash: (T1, T2, T3, T4, T5) => String): IParamsBase5[T1, T2, T3, T4, T5, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction5(hash))
      __obj.asInstanceOf[IParamsBase5[T1, T2, T3, T4, T5, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParamsBase5[?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, TResult] (val x: Self & (IParamsBase5[T1, T2, T3, T4, T5, TResult])) extends AnyVal {
      
      inline def setBypass(value: (T1, T2, T3, T4, T5) => Boolean): Self = StObject.set(x, "bypass", js.Any.fromFunction5(value))
      
      inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
      
      inline def setHash(value: (T1, T2, T3, T4, T5) => String): Self = StObject.set(x, "hash", js.Any.fromFunction5(value))
      
      inline def setItemMaxAge(value: (T1, T2, T3, T4, T5, TResult) => Double): Self = StObject.set(x, "itemMaxAge", js.Any.fromFunction6(value))
      
      inline def setItemMaxAgeUndefined: Self = StObject.set(x, "itemMaxAge", js.undefined)
    }
  }
  
  trait IParamsBase6[T1, T2, T3, T4, T5, T6, TResult]
    extends StObject
       with IParamsBaseCommons {
    
    /**
      * Return true if the result should not be retrieved from the cache.
      */
    var bypass: js.UndefOr[IBypassFunction6[T1, T2, T3, T4, T5, T6]] = js.undefined
    
    /**
      * A function to generate the key of the cache.
      */
    def hash(a1: T1, a2: T2, a3: T3, a4: T4, a5: T5, a6: T6): String
    /**
      * A function to generate the key of the cache.
      */
    @JSName("hash")
    var hash_Original: IHashingFunction6[T1, T2, T3, T4, T5, T6]
    
    /**
      * An optional function to indicate the maxAge of an specific item.
      */
    var itemMaxAge: js.UndefOr[IMaxAgeFunction6[T1, T2, T3, T4, T5, T6, TResult]] = js.undefined
  }
  object IParamsBase6 {
    
    inline def apply[T1, T2, T3, T4, T5, T6, TResult](hash: (T1, T2, T3, T4, T5, T6) => String): IParamsBase6[T1, T2, T3, T4, T5, T6, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction6(hash))
      __obj.asInstanceOf[IParamsBase6[T1, T2, T3, T4, T5, T6, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParamsBase6[?, ?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, T6, TResult] (val x: Self & (IParamsBase6[T1, T2, T3, T4, T5, T6, TResult])) extends AnyVal {
      
      inline def setBypass(value: (T1, T2, T3, T4, T5, T6) => Boolean): Self = StObject.set(x, "bypass", js.Any.fromFunction6(value))
      
      inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
      
      inline def setHash(value: (T1, T2, T3, T4, T5, T6) => String): Self = StObject.set(x, "hash", js.Any.fromFunction6(value))
      
      inline def setItemMaxAge(value: (T1, T2, T3, T4, T5, T6, TResult) => Double): Self = StObject.set(x, "itemMaxAge", js.Any.fromFunction7(value))
      
      inline def setItemMaxAgeUndefined: Self = StObject.set(x, "itemMaxAge", js.undefined)
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LRU.Options<string, any> * / any */ trait IParamsBaseCommons extends StObject {
    
    /**
      * Indicates if the resource should be cloned before is returned.
      */
    @JSName("clone")
    var clone_FIParamsBaseCommons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Disable the cache and executes the load logic directly.
      */
    var disable: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates if the resource should be freezed.
      */
    var freeze: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Do not queue requests if initial call is more than `queueMaxAge` milliseconds old.
      * Instead, invoke `load` again and create a new queue.
      * Defaults to 1000ms.
      */
    var queueMaxAge: js.UndefOr[Double] = js.undefined
  }
  object IParamsBaseCommons {
    
    inline def apply(): IParamsBaseCommons = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParamsBaseCommons]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParamsBaseCommons] (val x: Self) extends AnyVal {
      
      inline def setClone_(value: Boolean): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
      
      inline def setClone_Undefined: Self = StObject.set(x, "clone", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setFreeze(value: Boolean): Self = StObject.set(x, "freeze", value.asInstanceOf[js.Any])
      
      inline def setFreezeUndefined: Self = StObject.set(x, "freeze", js.undefined)
      
      inline def setQueueMaxAge(value: Double): Self = StObject.set(x, "queueMaxAge", value.asInstanceOf[js.Any])
      
      inline def setQueueMaxAgeUndefined: Self = StObject.set(x, "queueMaxAge", js.undefined)
    }
  }
  
  trait IParamsBasePlus
    extends StObject
       with IParamsBaseCommons {
    
    var bypass: js.UndefOr[IBypassFunctionPlus] = js.undefined
    
    def hash(rest: Any*): String
    @JSName("hash")
    var hash_Original: IHashingFunctionPlus
    
    var itemMaxAge: js.UndefOr[IMaxAgeFunctionPlus] = js.undefined
  }
  object IParamsBasePlus {
    
    inline def apply(hash: /* repeated */ Any => String): IParamsBasePlus = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash))
      __obj.asInstanceOf[IParamsBasePlus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IParamsBasePlus] (val x: Self) extends AnyVal {
      
      inline def setBypass(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "bypass", js.Any.fromFunction1(value))
      
      inline def setBypassUndefined: Self = StObject.set(x, "bypass", js.undefined)
      
      inline def setHash(value: /* repeated */ Any => String): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
      
      inline def setItemMaxAge(value: /* repeated */ Any => Double): Self = StObject.set(x, "itemMaxAge", js.Any.fromFunction1(value))
      
      inline def setItemMaxAgeUndefined: Self = StObject.set(x, "itemMaxAge", js.undefined)
    }
  }
  
  @js.native
  trait Listener extends StObject {
    
    def apply(as: Any*): Unit = js.native
  }
  
  @js.native
  trait ResultBase extends StObject {
    
    /**
      * Delete an item given the parameters.
      */
    def del[T1, T2, T3, T4, T5, T6](
      a1: js.UndefOr[T1],
      a2: js.UndefOr[T2],
      a3: js.UndefOr[T3],
      a4: js.UndefOr[T4],
      a5: js.UndefOr[T5],
      a6: js.UndefOr[T6]
    ): Unit = js.native
    
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
