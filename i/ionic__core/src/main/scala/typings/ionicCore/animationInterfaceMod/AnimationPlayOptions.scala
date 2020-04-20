package typings.ionicCore.animationInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationPlayOptions extends js.Object {
  var sync: Boolean
}

object AnimationPlayOptions {
  @scala.inline
  def apply(sync: Boolean): AnimationPlayOptions = {
    val __obj = js.Dynamic.literal(sync = sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPlayOptions]
  }
}

