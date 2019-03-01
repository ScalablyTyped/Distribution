package typings
package karmaDashViewportLib.KarmaViewportNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Breakpoint extends js.Object {
  var name: java.lang.String
  var size: karmaDashViewportLib.Anon_Height
}

object Breakpoint {
  @scala.inline
  def apply(name: java.lang.String, size: karmaDashViewportLib.Anon_Height): Breakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Breakpoint]
  }
}

