package typings
package jsflLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashStroke extends js.Object {
  /// A Boolean value, same as the Sharp Corners setting in the custom Stroke Style dialog box.
  var breakAtCorners: scala.Boolean
  /// A string that specifies the type of cap for the stroke.
  var capType: java.lang.String
  /// A string, hexadecimal value, or integer that represents the stroke color.
  var color: js.Any
  /// A string that specifies the type of hatching for the stroke.
  var curve: java.lang.String
  /// An integer that specifies the lengths of the solid part of a dashed line.
  var dash1: scala.Double
  /// An integer that specifies the lengths of the blank part of a dashed line.
  var dash2: scala.Double
  /// A string that specifies the density of a stippled line.
  var density: java.lang.String
  /// A string that specifies the dot size of a stippled line.
  var dotSize: java.lang.String
  /// An integer that specifies the spacing between dots in a dotted line.
  var dotSpace: scala.Double
  /// A string that specifies the thickness of a hatch line.
  var hatchThickness: java.lang.String
  /// A string that specifies the jiggle property of a hatched line.
  var jiggle: java.lang.String
  /// A string that specifies the type of join for the stroke.
  var joinType: java.lang.String
  /// A string that specifies the length of a hatch line.
  var length: java.lang.String
  /// A float value that specifies the angle above which the tip of the miter will be truncated by a segment.
  var miterLimit: scala.Double
  /// A string that specifies the pattern of a ragged line.
  var pattern: java.lang.String
  /// A string that specifies the rotation of a hatch line.
  var rotate: java.lang.String
  /// A string that specifies the type of scale to be applied to the stroke.
  var scaleType: java.lang.String
  /// A Fill object that represents the fill settings of the stroke.
  var shapeFill: FlashFill
  /// A string that specifies the spacing of a hatched line.
  var space: java.lang.String
  /// A Boolean value that specifies whether stroke hinting is set on the stroke.
  var strokeHinting: scala.Boolean
  /// A string that describes the stroke style.
  var style: java.lang.String
  /// An integer that specifies the stroke size.
  var thickness: scala.Double
  /// A string that specifies the variation of a stippled line.
  var variation: java.lang.String
  /// A string that specifies the wave height of a ragged line.
  var waveHeight: java.lang.String
  /// A string that specifies the wave length of a ragged line.
  var waveLength: java.lang.String
}

