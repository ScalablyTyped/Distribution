package typings
package jszipLib.jszipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var currentFile: java.lang.String
  var percent: scala.Double
}

object Metadata {
  @scala.inline
  def apply(currentFile: java.lang.String, percent: scala.Double): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentFile")(currentFile)
    __obj.updateDynamic("percent")(percent)
    __obj.asInstanceOf[Metadata]
  }
}

