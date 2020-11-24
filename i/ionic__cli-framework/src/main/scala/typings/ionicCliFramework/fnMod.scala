package typings.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/cli-framework/utils/fn", JSImport.Namespace)
@js.native
object fnMod extends js.Object {
  
  def resolveValue[T](fns: js.Function0[js.Promise[js.UndefOr[T]]]*): js.Promise[js.UndefOr[T]] = js.native
  
  def resolveValueSync[T](fns: js.Function0[js.UndefOr[T]]*): js.UndefOr[T] = js.native
}
