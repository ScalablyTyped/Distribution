package typings.lruMemoizer

import typings.lruMemoizer.libAsyncMod.AsyncParams0
import typings.lruMemoizer.libAsyncMod.AsyncParams1
import typings.lruMemoizer.libAsyncMod.AsyncParams2
import typings.lruMemoizer.libAsyncMod.AsyncParams3
import typings.lruMemoizer.libAsyncMod.AsyncParams4
import typings.lruMemoizer.libAsyncMod.AsyncParams5
import typings.lruMemoizer.libAsyncMod.AsyncParams6
import typings.lruMemoizer.libAsyncMod.IMemoized
import typings.lruMemoizer.libSyncMod.IMemoizedSync
import typings.lruMemoizer.libSyncMod.SyncParams0
import typings.lruMemoizer.libSyncMod.SyncParams1
import typings.lruMemoizer.libSyncMod.SyncParams2
import typings.lruMemoizer.libSyncMod.SyncParams3
import typings.lruMemoizer.libSyncMod.SyncParams4
import typings.lruMemoizer.libSyncMod.SyncParams5
import typings.lruMemoizer.libSyncMod.SyncParams6
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[TResult](options: AsyncParams0[TResult]): IMemoized[Any, Any, Any, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[Any, Any, Any, Any, Any, Any, TResult]]
  inline def apply[T1, TResult](options: AsyncParams1[T1, TResult]): IMemoized[T1, Any, Any, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, Any, Any, Any, Any, Any, TResult]]
  inline def apply[T1, T2, TResult](options: AsyncParams2[T1, T2, TResult]): IMemoized[T1, T2, Any, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, T2, Any, Any, Any, Any, TResult]]
  inline def apply[T1, T2, T3, TResult](options: AsyncParams3[T1, T2, T3, TResult]): IMemoized[T1, T2, T3, Any, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, T2, T3, Any, Any, Any, TResult]]
  inline def apply[T1, T2, T3, T4, TResult](options: AsyncParams4[T1, T2, T3, T4, TResult]): IMemoized[T1, T2, T3, T4, Any, Any, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, T2, T3, T4, Any, Any, TResult]]
  inline def apply[T1, T2, T3, T4, T5, TResult](options: AsyncParams5[T1, T2, T3, T4, T5, TResult]): IMemoized[T1, T2, T3, T4, T5, Any, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, T2, T3, T4, T5, Any, TResult]]
  inline def apply[T1, T2, T3, T4, T5, T6, TResult](options: AsyncParams6[T1, T2, T3, T4, T5, T6, TResult]): IMemoized[T1, T2, T3, T4, T5, T6, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, T2, T3, T4, T5, T6, TResult]]
  
  @JSImport("lru-memoizer", JSImport.Namespace)
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
