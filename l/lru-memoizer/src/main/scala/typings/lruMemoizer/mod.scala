package typings.lruMemoizer

import typings.lruMemoizer.asyncMod.AsyncParams
import typings.lruMemoizer.asyncMod.IMemoized
import typings.lruMemoizer.syncMod.IMemoizedSync
import typings.lruMemoizer.syncMod.SyncParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[T1, T2, T3, T4, T5, T6, TResult](options: AsyncParams[T1, T2, T3, T4, T5, T6, TResult]): IMemoized[T1, T2, T3, T4, T5, T6, TResult] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[IMemoized[T1, T2, T3, T4, T5, T6, TResult]]
  
  @JSImport("lru-memoizer/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* was `typeof syncMemoizer` */
  inline def sync[T1, T2, T3, T4, T5, T6, TResult](options: SyncParams[T1, T2, T3, T4, T5, T6, TResult]): IMemoizedSync[T1, T2, T3, T4, T5, T6, TResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[IMemoizedSync[T1, T2, T3, T4, T5, T6, TResult]]
}
