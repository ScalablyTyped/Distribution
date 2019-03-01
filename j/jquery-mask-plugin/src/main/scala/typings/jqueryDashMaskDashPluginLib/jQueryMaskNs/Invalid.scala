package typings
package jqueryDashMaskDashPluginLib.jQueryMaskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invalid extends js.Object {
  var e: java.lang.String
  var p: scala.Double
  var v: java.lang.String
}

object Invalid {
  @scala.inline
  def apply(e: java.lang.String, p: scala.Double, v: java.lang.String): Invalid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("e")(e)
    __obj.updateDynamic("p")(p)
    __obj.updateDynamic("v")(v)
    __obj.asInstanceOf[Invalid]
  }
}

