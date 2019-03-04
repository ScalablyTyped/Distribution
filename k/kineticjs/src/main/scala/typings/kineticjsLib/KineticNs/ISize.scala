package typings
package kineticjsLib.KineticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISize extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object ISize {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): ISize = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[ISize]
  }
}

