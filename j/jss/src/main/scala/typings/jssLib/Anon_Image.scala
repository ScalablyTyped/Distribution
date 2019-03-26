package typings
package jssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: scala.Nothing
  var position: scala.Nothing
  var `type`: scala.Nothing
}

object Anon_Image {
  @scala.inline
  def apply(image: scala.Nothing, position: scala.Nothing, `type`: scala.Nothing): Anon_Image = {
    val __obj = js.Dynamic.literal(image = image, position = position)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Image]
  }
}

