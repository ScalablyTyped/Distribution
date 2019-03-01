package typings
package lobiboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Width extends js.Object {
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Width {
  @scala.inline
  def apply(width: scala.Int | scala.Double = null): Anon_Width = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Width]
  }
}

