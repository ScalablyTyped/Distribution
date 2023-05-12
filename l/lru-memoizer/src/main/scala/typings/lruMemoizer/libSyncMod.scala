package typings.lruMemoizer

import typings.lruMemoizer.libUtilMod.IParamsBase0
import typings.lruMemoizer.libUtilMod.IParamsBase1
import typings.lruMemoizer.libUtilMod.IParamsBase2
import typings.lruMemoizer.libUtilMod.IParamsBase3
import typings.lruMemoizer.libUtilMod.IParamsBase4
import typings.lruMemoizer.libUtilMod.IParamsBase5
import typings.lruMemoizer.libUtilMod.IParamsBase6
import typings.lruMemoizer.libUtilMod.IParamsBasePlus
import typings.lruMemoizer.libUtilMod.ResultBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSyncMod {
  
  @JSImport("lru-memoizer/lib/sync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def syncMemoizer[TResult](options: SyncParams0[TResult]): IMemoizedSync[Any, Any, Any, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncMemoizer")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[Any, Any, Any, Any, Any, Any, TResult]]
  inline def syncMemoizer[T1, TResult](options: SyncParams1[T1, TResult]): IMemoizedSync[T1, Any, Any, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncMemoizer")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, Any, Any, Any, Any, Any, TResult]]
  inline def syncMemoizer[T1, T2, TResult](options: SyncParams2[T1, T2, TResult]): IMemoizedSync[T1, T2, Any, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncMemoizer")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, T2, Any, Any, Any, Any, TResult]]
  inline def syncMemoizer[T1, T2, T3, TResult](options: SyncParams3[T1, T2, T3, TResult]): IMemoizedSync[T1, T2, T3, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncMemoizer")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, T2, T3, Any, Any, Any, TResult]]
  inline def syncMemoizer[T1, T2, T3, T4, TResult](options: SyncParams4[T1, T2, T3, T4, TResult]): IMemoizedSync[T1, T2, T3, T4, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncMemoizer")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, T2, T3, T4, Any, Any, TResult]]
  inline def syncMemoizer[T1, T2, T3, T4, T5, TResult](options: SyncParams5[T1, T2, T3, T4, T5, TResult]): IMemoizedSync[T1, T2, T3, T4, T5, Any, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncMemoizer")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, T2, T3, T4, T5, Any, TResult]]
  inline def syncMemoizer[T1, T2, T3, T4, T5, T6, TResult](options: SyncParams6[T1, T2, T3, T4, T5, T6, TResult]): IMemoizedSync[T1, T2, T3, T4, T5, T6, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("syncMemoizer")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, T2, T3, T4, T5, T6, TResult]]
  
  type IMemoizableFunctionSync0[TResult] = js.Function0[TResult]
  
  type IMemoizableFunctionSync1[T1, TResult] = js.Function1[/* arg1 */ T1, TResult]
  
  type IMemoizableFunctionSync2[T1, T2, TResult] = js.Function2[/* arg1 */ T1, /* arg2 */ T2, TResult]
  
  type IMemoizableFunctionSync3[T1, T2, T3, TResult] = js.Function3[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, TResult]
  
  type IMemoizableFunctionSync4[T1, T2, T3, T4, TResult] = js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, TResult]
  
  type IMemoizableFunctionSync5[T1, T2, T3, T4, T5, TResult] = js.Function5[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* arg4 */ T4, /* arg5 */ T5, TResult]
  
  type IMemoizableFunctionSync6[T1, T2, T3, T4, T5, T6, TResult] = js.Function6[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* a4 */ T4, /* a5 */ T5, /* a6 */ T6, TResult]
  
  type IMemoizableFunctionSyncPlus[TResult] = js.Function1[/* repeated */ Any, TResult]
  
  @js.native
  trait IMemoizedSync[T1, T2, T3, T4, T5, T6, TResult]
    extends StObject
       with ResultBase {
    
    def apply(arg1: T1): TResult = js.native
    def apply(arg1: T1, arg2: T2): TResult = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3): TResult = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4): TResult = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): TResult = js.native
    def apply(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5, arg6: T6): TResult = js.native
  }
  
  trait SyncParams0[TResult]
    extends StObject
       with IParamsBase0[TResult] {
    
    def load(): TResult
    @JSName("load")
    var load_Original: IMemoizableFunctionSync0[TResult]
  }
  object SyncParams0 {
    
    inline def apply[TResult](hash: () => String, load: () => TResult): SyncParams0[TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash), load = js.Any.fromFunction0(load))
      __obj.asInstanceOf[SyncParams0[TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncParams0[?], TResult] (val x: Self & SyncParams0[TResult]) extends AnyVal {
      
      inline def setLoad(value: () => TResult): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    }
  }
  
  trait SyncParams1[T1, TResult]
    extends StObject
       with IParamsBase1[T1, TResult] {
    
    def load(arg1: T1): TResult
    @JSName("load")
    var load_Original: IMemoizableFunctionSync1[T1, TResult]
  }
  object SyncParams1 {
    
    inline def apply[T1, TResult](hash: T1 => String, load: T1 => TResult): SyncParams1[T1, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash), load = js.Any.fromFunction1(load))
      __obj.asInstanceOf[SyncParams1[T1, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncParams1[?, ?], T1, TResult] (val x: Self & (SyncParams1[T1, TResult])) extends AnyVal {
      
      inline def setLoad(value: T1 => TResult): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    }
  }
  
  trait SyncParams2[T1, T2, TResult]
    extends StObject
       with IParamsBase2[T1, T2, TResult] {
    
    def load(arg1: T1, arg2: T2): TResult
    @JSName("load")
    var load_Original: IMemoizableFunctionSync2[T1, T2, TResult]
  }
  object SyncParams2 {
    
    inline def apply[T1, T2, TResult](hash: (T1, T2) => String, load: (T1, T2) => TResult): SyncParams2[T1, T2, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction2(hash), load = js.Any.fromFunction2(load))
      __obj.asInstanceOf[SyncParams2[T1, T2, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncParams2[?, ?, ?], T1, T2, TResult] (val x: Self & (SyncParams2[T1, T2, TResult])) extends AnyVal {
      
      inline def setLoad(value: (T1, T2) => TResult): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
    }
  }
  
  trait SyncParams3[T1, T2, T3, TResult]
    extends StObject
       with IParamsBase3[T1, T2, T3, TResult] {
    
    def load(arg1: T1, arg2: T2, arg3: T3): TResult
    @JSName("load")
    var load_Original: IMemoizableFunctionSync3[T1, T2, T3, TResult]
  }
  object SyncParams3 {
    
    inline def apply[T1, T2, T3, TResult](hash: (T1, T2, T3) => String, load: (T1, T2, T3) => TResult): SyncParams3[T1, T2, T3, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction3(hash), load = js.Any.fromFunction3(load))
      __obj.asInstanceOf[SyncParams3[T1, T2, T3, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncParams3[?, ?, ?, ?], T1, T2, T3, TResult] (val x: Self & (SyncParams3[T1, T2, T3, TResult])) extends AnyVal {
      
      inline def setLoad(value: (T1, T2, T3) => TResult): Self = StObject.set(x, "load", js.Any.fromFunction3(value))
    }
  }
  
  trait SyncParams4[T1, T2, T3, T4, TResult]
    extends StObject
       with IParamsBase4[T1, T2, T3, T4, TResult] {
    
    def load(arg1: T1, arg2: T2, arg3: T3, arg4: T4): TResult
    @JSName("load")
    var load_Original: IMemoizableFunctionSync4[T1, T2, T3, T4, TResult]
  }
  object SyncParams4 {
    
    inline def apply[T1, T2, T3, T4, TResult](hash: (T1, T2, T3, T4) => String, load: (T1, T2, T3, T4) => TResult): SyncParams4[T1, T2, T3, T4, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction4(hash), load = js.Any.fromFunction4(load))
      __obj.asInstanceOf[SyncParams4[T1, T2, T3, T4, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncParams4[?, ?, ?, ?, ?], T1, T2, T3, T4, TResult] (val x: Self & (SyncParams4[T1, T2, T3, T4, TResult])) extends AnyVal {
      
      inline def setLoad(value: (T1, T2, T3, T4) => TResult): Self = StObject.set(x, "load", js.Any.fromFunction4(value))
    }
  }
  
  trait SyncParams5[T1, T2, T3, T4, T5, TResult]
    extends StObject
       with IParamsBase5[T1, T2, T3, T4, T5, TResult] {
    
    def load(arg1: T1, arg2: T2, arg3: T3, arg4: T4, arg5: T5): TResult
    @JSName("load")
    var load_Original: IMemoizableFunctionSync5[T1, T2, T3, T4, T5, TResult]
  }
  object SyncParams5 {
    
    inline def apply[T1, T2, T3, T4, T5, TResult](hash: (T1, T2, T3, T4, T5) => String, load: (T1, T2, T3, T4, T5) => TResult): SyncParams5[T1, T2, T3, T4, T5, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction5(hash), load = js.Any.fromFunction5(load))
      __obj.asInstanceOf[SyncParams5[T1, T2, T3, T4, T5, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncParams5[?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, TResult] (val x: Self & (SyncParams5[T1, T2, T3, T4, T5, TResult])) extends AnyVal {
      
      inline def setLoad(value: (T1, T2, T3, T4, T5) => TResult): Self = StObject.set(x, "load", js.Any.fromFunction5(value))
    }
  }
  
  trait SyncParams6[T1, T2, T3, T4, T5, T6, TResult]
    extends StObject
       with IParamsBase6[T1, T2, T3, T4, T5, T6, TResult] {
    
    def load(a1: T1, a2: T2, a3: T3, a4: T4, a5: T5, a6: T6): TResult
    @JSName("load")
    var load_Original: IMemoizableFunctionSync6[T1, T2, T3, T4, T5, T6, TResult]
  }
  object SyncParams6 {
    
    inline def apply[T1, T2, T3, T4, T5, T6, TResult](hash: (T1, T2, T3, T4, T5, T6) => String, load: (T1, T2, T3, T4, T5, T6) => TResult): SyncParams6[T1, T2, T3, T4, T5, T6, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction6(hash), load = js.Any.fromFunction6(load))
      __obj.asInstanceOf[SyncParams6[T1, T2, T3, T4, T5, T6, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncParams6[?, ?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, T6, TResult] (val x: Self & (SyncParams6[T1, T2, T3, T4, T5, T6, TResult])) extends AnyVal {
      
      inline def setLoad(value: (T1, T2, T3, T4, T5, T6) => TResult): Self = StObject.set(x, "load", js.Any.fromFunction6(value))
    }
  }
  
  trait SyncParamsPlus[TResult]
    extends StObject
       with IParamsBasePlus {
    
    def load(args: Any*): TResult
    @JSName("load")
    var load_Original: IMemoizableFunctionSyncPlus[TResult]
  }
  object SyncParamsPlus {
    
    inline def apply[TResult](hash: /* repeated */ Any => String, load: /* repeated */ Any => TResult): SyncParamsPlus[TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash), load = js.Any.fromFunction1(load))
      __obj.asInstanceOf[SyncParamsPlus[TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncParamsPlus[?], TResult] (val x: Self & SyncParamsPlus[TResult]) extends AnyVal {
      
      inline def setLoad(value: /* repeated */ Any => TResult): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    }
  }
}
