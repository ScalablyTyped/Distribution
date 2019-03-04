package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: js.Any
  var position: js.Any
  var `type`: js.Any
}

object Anon_Image {
  @scala.inline
  def apply(image: js.Any, position: js.Any, `type`: js.Any): Anon_Image = {
    val __obj = js.Dynamic.literal(image = image, position = position)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Image]
  }
}

