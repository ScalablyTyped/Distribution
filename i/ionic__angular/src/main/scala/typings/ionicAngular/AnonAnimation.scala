package typings.ionicAngular

import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.navInterfaceMod.NavDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnimation extends js.Object {
  var animation: NavDirection
  var direction: RouterDirection
}

object AnonAnimation {
  @scala.inline
  def apply(animation: NavDirection, direction: RouterDirection): AnonAnimation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnimation]
  }
}

