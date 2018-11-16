package typings
package heatmapDotJsLib.heatmapDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HeatmapData[T] extends js.Object {
  /**
       * An array of data points
       */
  var data: js.Array[T]
  /**
       * Max value of the valueField
       */
  var max: scala.Double
  /**
       * Min value of the valueField
       */
  var min: scala.Double
}

