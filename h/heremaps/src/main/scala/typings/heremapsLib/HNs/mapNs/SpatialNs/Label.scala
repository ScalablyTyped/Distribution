package typings
package heremapsLib.HNs.mapNs.SpatialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
             * Data to used as rendering hint for a label
             * @property x {number} - The X coordinate of the first line's starting point
             * @property y {number} - The Y coordinate of the first line's base line
             * @property angle {number} - The clockwise rotation angle in radians
             * @property font {string} - The CSS font-family
             * @property size {number} - The CSS font-size
             * @property color {string} - The CSS color
             * @property text {string} - The text content, new line characters (\\u000A) are interpreted as line breaks
             */

trait Label extends js.Object {
  var angle: scala.Double
  var color: java.lang.String
  var font: java.lang.String
  var size: scala.Double
  var text: java.lang.String
  var x: scala.Double
  var y: scala.Double
}

