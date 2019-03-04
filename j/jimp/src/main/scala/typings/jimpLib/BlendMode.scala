package typings
package jimpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlendMode extends js.Object {
  var mode: java.lang.String
  var opacityDest: scala.Double
  var opacitySource: scala.Double
}

object BlendMode {
  @scala.inline
  def apply(mode: java.lang.String, opacityDest: scala.Double, opacitySource: scala.Double): BlendMode = {
    val __obj = js.Dynamic.literal(mode = mode, opacityDest = opacityDest, opacitySource = opacitySource)
  
    __obj.asInstanceOf[BlendMode]
  }
}

