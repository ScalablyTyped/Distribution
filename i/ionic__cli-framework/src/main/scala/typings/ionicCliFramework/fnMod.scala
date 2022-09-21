package typings.ionicCliFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnMod {
  
  @JSImport("@ionic/cli-framework/utils/fn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveValue[T](fns: js.Function0[js.Promise[js.UndefOr[T]]]*): js.Promise[js.UndefOr[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveValue")(fns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Promise[js.UndefOr[T]]]
  
  inline def resolveValueSync[T](fns: js.Function0[js.UndefOr[T]]*): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveValueSync")(fns.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.UndefOr[T]]
}
