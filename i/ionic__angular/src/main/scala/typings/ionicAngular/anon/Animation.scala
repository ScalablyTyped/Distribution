package typings.ionicAngular.anon

import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.navInterfaceMod.NavDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animation extends js.Object {
  var animation: NavDirection
  var direction: RouterDirection
}

object Animation {
  @scala.inline
  def apply(animation: NavDirection, direction: RouterDirection): Animation = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
}

