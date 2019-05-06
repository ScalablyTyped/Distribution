package typings
package atIonicReactLib.distComponentsNavigationIonRouterOutletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextInterface extends js.Object {
  def goBack(): scala.Unit
}

object ContextInterface {
  @scala.inline
  def apply(goBack: () => scala.Unit): ContextInterface = {
    val __obj = js.Dynamic.literal(goBack = js.Any.fromFunction0(goBack))
  
    __obj.asInstanceOf[ContextInterface]
  }
}

