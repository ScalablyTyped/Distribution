package typings.lruMemoizer

import typings.lruMemoizer.libSyncMod.IMemoizedSync
import typings.lruMemoizer.libSyncMod.SyncParams0
import typings.lruMemoizer.libSyncMod.SyncParams1
import typings.lruMemoizer.libSyncMod.SyncParams2
import typings.lruMemoizer.libSyncMod.SyncParams3
import typings.lruMemoizer.libSyncMod.SyncParams4
import typings.lruMemoizer.libSyncMod.SyncParams5
import typings.lruMemoizer.libSyncMod.SyncParams6
import typings.lruMemoizer.libUtilMod.INodeStyleCallBack
import typings.lruMemoizer.libUtilMod.IParamsBase0
import typings.lruMemoizer.libUtilMod.IParamsBase1
import typings.lruMemoizer.libUtilMod.IParamsBase2
import typings.lruMemoizer.libUtilMod.IParamsBase3
import typings.lruMemoizer.libUtilMod.IParamsBase4
import typings.lruMemoizer.libUtilMod.IParamsBase5
import typings.lruMemoizer.libUtilMod.IParamsBase6
import typings.lruMemoizer.libUtilMod.ResultBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAsyncMod {
  
  object asyncMemoizer {
    
    inline def apply[TResult](options: AsyncParams0[TResult]): IMemoized[Any, Any, Any, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[Any, Any, Any, Any, Any, Any, TResult]]
    inline def apply[T1, TResult](options: AsyncParams1[T1, TResult]): IMemoized[T1, Any, Any, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, Any, Any, Any, Any, Any, TResult]]
    inline def apply[T1, T2, TResult](options: AsyncParams2[T1, T2, TResult]): IMemoized[T1, T2, Any, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, T2, Any, Any, Any, Any, TResult]]
    inline def apply[T1, T2, T3, TResult](options: AsyncParams3[T1, T2, T3, TResult]): IMemoized[T1, T2, T3, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, T2, T3, Any, Any, Any, TResult]]
    inline def apply[T1, T2, T3, T4, TResult](options: AsyncParams4[T1, T2, T3, T4, TResult]): IMemoized[T1, T2, T3, T4, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, T2, T3, T4, Any, Any, TResult]]
    inline def apply[T1, T2, T3, T4, T5, TResult](options: AsyncParams5[T1, T2, T3, T4, T5, TResult]): IMemoized[T1, T2, T3, T4, T5, Any, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, T2, T3, T4, T5, Any, TResult]]
    inline def apply[T1, T2, T3, T4, T5, T6, TResult](options: AsyncParams6[T1, T2, T3, T4, T5, T6, TResult]): IMemoized[T1, T2, T3, T4, T5, T6, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, T2, T3, T4, T5, T6, TResult]]
    
    @JSImport("lru-memoizer/lib/async", "asyncMemoizer")
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof syncMemoizer` */
    inline def sync[TResult](options: SyncParams0[TResult]): IMemoizedSync[Any, Any, Any, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[Any, Any, Any, Any, Any, Any, TResult]]
    /* was `typeof syncMemoizer` */
    inline def sync[T1, TResult](options: SyncParams1[T1, TResult]): IMemoizedSync[T1, Any, Any, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, Any, Any, Any, Any, Any, TResult]]
    /* was `typeof syncMemoizer` */
    inline def sync[T1, T2, TResult](options: SyncParams2[T1, T2, TResult]): IMemoizedSync[T1, T2, Any, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, T2, Any, Any, Any, Any, TResult]]
    /* was `typeof syncMemoizer` */
    inline def sync[T1, T2, T3, TResult](options: SyncParams3[T1, T2, T3, TResult]): IMemoizedSync[T1, T2, T3, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, T2, T3, Any, Any, Any, TResult]]
    /* was `typeof syncMemoizer` */
    inline def sync[T1, T2, T3, T4, TResult](options: SyncParams4[T1, T2, T3, T4, TResult]): IMemoizedSync[T1, T2, T3, T4, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, T2, T3, T4, Any, Any, TResult]]
    /* was `typeof syncMemoizer` */
    inline def sync[T1, T2, T3, T4, T5, TResult](options: SyncParams5[T1, T2, T3, T4, T5, TResult]): IMemoizedSync[T1, T2, T3, T4, T5, Any, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, T2, T3, T4, T5, Any, TResult]]
    /* was `typeof syncMemoizer` */
    inline def sync[T1, T2, T3, T4, T5, T6, TResult](options: SyncParams6[T1, T2, T3, T4, T5, T6, TResult]): IMemoizedSync[T1, T2, T3, T4, T5, T6, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, T2, T3, T4, T5, T6, TResult]]
  }
  
  trait AsyncParams0[TResult]
    extends StObject
       with IParamsBase0[TResult] {
    
    def load(cb: INodeStyleCallBack[TResult]): Unit
    @JSName("load")
    var load_Original: IMemoizableFunction0[TResult]
  }
  object AsyncParams0 {
    
    inline def apply[TResult](hash: () => String, load: /* cb */ INodeStyleCallBack[TResult] => Unit): AsyncParams0[TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash), load = js.Any.fromFunction1(load))
      __obj.asInstanceOf[AsyncParams0[TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncParams0[?], TResult] (val x: Self & AsyncParams0[TResult]) extends AnyVal {
      
      inline def setLoad(value: /* cb */ INodeStyleCallBack[TResult] => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    }
  }
  
  trait AsyncParams1[T1, TResult]
    extends StObject
       with IParamsBase1[T1, TResult] {
    
    def load(a1: T1, cb: INodeStyleCallBack[TResult]): Unit
    @JSName("load")
    var load_Original: IMemoizableFunction1[T1, TResult]
  }
  object AsyncParams1 {
    
    inline def apply[T1, TResult](hash: T1 => String, load: (T1, /* cb */ INodeStyleCallBack[TResult]) => Unit): AsyncParams1[T1, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash), load = js.Any.fromFunction2(load))
      __obj.asInstanceOf[AsyncParams1[T1, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncParams1[?, ?], T1, TResult] (val x: Self & (AsyncParams1[T1, TResult])) extends AnyVal {
      
      inline def setLoad(value: (T1, /* cb */ INodeStyleCallBack[TResult]) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
    }
  }
  
  trait AsyncParams2[T1, T2, TResult]
    extends StObject
       with IParamsBase2[T1, T2, TResult] {
    
    def load(a1: T1, a2: T2, cb: INodeStyleCallBack[TResult]): Unit
    @JSName("load")
    var load_Original: IMemoizableFunction2[T1, T2, TResult]
  }
  object AsyncParams2 {
    
    inline def apply[T1, T2, TResult](hash: (T1, T2) => String, load: (T1, T2, /* cb */ INodeStyleCallBack[TResult]) => Unit): AsyncParams2[T1, T2, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction2(hash), load = js.Any.fromFunction3(load))
      __obj.asInstanceOf[AsyncParams2[T1, T2, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncParams2[?, ?, ?], T1, T2, TResult] (val x: Self & (AsyncParams2[T1, T2, TResult])) extends AnyVal {
      
      inline def setLoad(value: (T1, T2, /* cb */ INodeStyleCallBack[TResult]) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction3(value))
    }
  }
  
  trait AsyncParams3[T1, T2, T3, TResult]
    extends StObject
       with IParamsBase3[T1, T2, T3, TResult] {
    
    def load(a1: T1, a2: T2, a3: T3, cb: INodeStyleCallBack[TResult]): Unit
    @JSName("load")
    var load_Original: IMemoizableFunction3[T1, T2, T3, TResult]
  }
  object AsyncParams3 {
    
    inline def apply[T1, T2, T3, TResult](hash: (T1, T2, T3) => String, load: (T1, T2, T3, /* cb */ INodeStyleCallBack[TResult]) => Unit): AsyncParams3[T1, T2, T3, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction3(hash), load = js.Any.fromFunction4(load))
      __obj.asInstanceOf[AsyncParams3[T1, T2, T3, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncParams3[?, ?, ?, ?], T1, T2, T3, TResult] (val x: Self & (AsyncParams3[T1, T2, T3, TResult])) extends AnyVal {
      
      inline def setLoad(value: (T1, T2, T3, /* cb */ INodeStyleCallBack[TResult]) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction4(value))
    }
  }
  
  trait AsyncParams4[T1, T2, T3, T4, TResult]
    extends StObject
       with IParamsBase4[T1, T2, T3, T4, TResult] {
    
    def load(a1: T1, a2: T2, a3: T3, a4: T4, cb: INodeStyleCallBack[TResult]): Unit
    @JSName("load")
    var load_Original: IMemoizableFunction4[T1, T2, T3, T4, TResult]
  }
  object AsyncParams4 {
    
    inline def apply[T1, T2, T3, T4, TResult](
      hash: (T1, T2, T3, T4) => String,
      load: (T1, T2, T3, T4, /* cb */ INodeStyleCallBack[TResult]) => Unit
    ): AsyncParams4[T1, T2, T3, T4, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction4(hash), load = js.Any.fromFunction5(load))
      __obj.asInstanceOf[AsyncParams4[T1, T2, T3, T4, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncParams4[?, ?, ?, ?, ?], T1, T2, T3, T4, TResult] (val x: Self & (AsyncParams4[T1, T2, T3, T4, TResult])) extends AnyVal {
      
      inline def setLoad(value: (T1, T2, T3, T4, /* cb */ INodeStyleCallBack[TResult]) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction5(value))
    }
  }
  
  trait AsyncParams5[T1, T2, T3, T4, T5, TResult]
    extends StObject
       with IParamsBase5[T1, T2, T3, T4, T5, TResult] {
    
    def load(a1: T1, a2: T2, a3: T3, a4: T4, a5: T5, cb: INodeStyleCallBack[TResult]): Unit
    @JSName("load")
    var load_Original: IMemoizableFunction5[T1, T2, T3, T4, T5, TResult]
  }
  object AsyncParams5 {
    
    inline def apply[T1, T2, T3, T4, T5, TResult](
      hash: (T1, T2, T3, T4, T5) => String,
      load: (T1, T2, T3, T4, T5, /* cb */ INodeStyleCallBack[TResult]) => Unit
    ): AsyncParams5[T1, T2, T3, T4, T5, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction5(hash), load = js.Any.fromFunction6(load))
      __obj.asInstanceOf[AsyncParams5[T1, T2, T3, T4, T5, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncParams5[?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, TResult] (val x: Self & (AsyncParams5[T1, T2, T3, T4, T5, TResult])) extends AnyVal {
      
      inline def setLoad(value: (T1, T2, T3, T4, T5, /* cb */ INodeStyleCallBack[TResult]) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction6(value))
    }
  }
  
  trait AsyncParams6[T1, T2, T3, T4, T5, T6, TResult]
    extends StObject
       with IParamsBase6[T1, T2, T3, T4, T5, T6, TResult] {
    
    /**
      * The function that loads the resource when is not in the cache.
      */
    def load(a1: T1, a2: T2, a3: T3, a4: T4, a5: T5, a6: T6, cb: INodeStyleCallBack[TResult]): Unit
    /**
      * The function that loads the resource when is not in the cache.
      */
    @JSName("load")
    var load_Original: IMemoizableFunction6[T1, T2, T3, T4, T5, T6, TResult]
  }
  object AsyncParams6 {
    
    inline def apply[T1, T2, T3, T4, T5, T6, TResult](
      hash: (T1, T2, T3, T4, T5, T6) => String,
      load: (T1, T2, T3, T4, T5, T6, /* cb */ INodeStyleCallBack[TResult]) => Unit
    ): AsyncParams6[T1, T2, T3, T4, T5, T6, TResult] = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction6(hash), load = js.Any.fromFunction7(load))
      __obj.asInstanceOf[AsyncParams6[T1, T2, T3, T4, T5, T6, TResult]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncParams6[?, ?, ?, ?, ?, ?, ?], T1, T2, T3, T4, T5, T6, TResult] (val x: Self & (AsyncParams6[T1, T2, T3, T4, T5, T6, TResult])) extends AnyVal {
      
      inline def setLoad(value: (T1, T2, T3, T4, T5, T6, /* cb */ INodeStyleCallBack[TResult]) => Unit): Self = StObject.set(x, "load", js.Any.fromFunction7(value))
    }
  }
  
  type IMemoizableFunction0[TResult] = js.Function1[/* cb */ INodeStyleCallBack[TResult], Unit]
  
  type IMemoizableFunction1[T1, TResult] = js.Function2[/* a1 */ T1, /* cb */ INodeStyleCallBack[TResult], Unit]
  
  type IMemoizableFunction2[T1, T2, TResult] = js.Function3[/* a1 */ T1, /* a2 */ T2, /* cb */ INodeStyleCallBack[TResult], Unit]
  
  type IMemoizableFunction3[T1, T2, T3, TResult] = js.Function4[/* a1 */ T1, /* a2 */ T2, /* a3 */ T3, /* cb */ INodeStyleCallBack[TResult], Unit]
  
  type IMemoizableFunction4[T1, T2, T3, T4, TResult] = js.Function5[
    /* a1 */ T1, 
    /* a2 */ T2, 
    /* a3 */ T3, 
    /* a4 */ T4, 
    /* cb */ INodeStyleCallBack[TResult], 
    Unit
  ]
  
  type IMemoizableFunction5[T1, T2, T3, T4, T5, TResult] = js.Function6[
    /* a1 */ T1, 
    /* a2 */ T2, 
    /* a3 */ T3, 
    /* a4 */ T4, 
    /* a5 */ T5, 
    /* cb */ INodeStyleCallBack[TResult], 
    Unit
  ]
  
  type IMemoizableFunction6[T1, T2, T3, T4, T5, T6, TResult] = js.Function7[
    /* a1 */ T1, 
    /* a2 */ T2, 
    /* a3 */ T3, 
    /* a4 */ T4, 
    /* a5 */ T5, 
    /* a6 */ T6, 
    /* cb */ INodeStyleCallBack[TResult], 
    Unit
  ]
  
  @js.native
  trait IMemoized[T1, T2, T3, T4, T5, T6, TResult]
    extends StObject
       with ResultBase {
    
    def apply(a1: T1, a2: T2, a3: T3, a4: T4, a5: T5, a6: T6, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(a1: T1, a2: T2, a3: T3, a4: T4, a5: T5, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(a1: T1, a2: T2, a3: T3, a4: T4, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(a1: T1, a2: T2, a3: T3, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(a1: T1, a2: T2, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(a1: T1, cb: INodeStyleCallBack[TResult]): Unit = js.native
    def apply(cb: INodeStyleCallBack[TResult]): Unit = js.native
  }
}
