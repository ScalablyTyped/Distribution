package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.heavy
import typings.ionicCore.ionicCoreStrings.light
import typings.ionicCore.ionicCoreStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeavy extends js.Object {
  var style: medium | light | heavy
}

object AnonHeavy {
  @scala.inline
  def apply(style: medium | light | heavy): AnonHeavy = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHeavy]
  }
}

