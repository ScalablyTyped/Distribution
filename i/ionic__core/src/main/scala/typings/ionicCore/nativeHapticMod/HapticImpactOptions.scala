package typings.ionicCore.nativeHapticMod

import typings.ionicCore.ionicCoreStrings.heavy
import typings.ionicCore.ionicCoreStrings.light
import typings.ionicCore.ionicCoreStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HapticImpactOptions extends js.Object {
  var style: light | medium | heavy
}

object HapticImpactOptions {
  @scala.inline
  def apply(style: light | medium | heavy): HapticImpactOptions = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HapticImpactOptions]
  }
}

