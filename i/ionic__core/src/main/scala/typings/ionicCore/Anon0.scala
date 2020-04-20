package typings.ionicCore

import typings.ionicCore.ionicCoreStrings.heavy
import typings.ionicCore.ionicCoreStrings.light
import typings.ionicCore.ionicCoreStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  var style: light | medium | heavy
}

object Anon0 {
  @scala.inline
  def apply(style: light | medium | heavy): Anon0 = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0]
  }
}

