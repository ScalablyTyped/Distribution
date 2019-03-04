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

object FlashStroke {
  @scala.inline
  def apply(
    breakAtCorners: scala.Boolean,
    capType: java.lang.String,
    color: js.Any,
    curve: java.lang.String,
    dash1: scala.Double,
    dash2: scala.Double,
    density: java.lang.String,
    dotSize: java.lang.String,
    dotSpace: scala.Double,
    hatchThickness: java.lang.String,
    jiggle: java.lang.String,
    joinType: java.lang.String,
    length: java.lang.String,
    miterLimit: scala.Double,
    pattern: java.lang.String,
    rotate: java.lang.String,
    scaleType: java.lang.String,
    shapeFill: FlashFill,
    space: java.lang.String,
    strokeHinting: scala.Boolean,
    style: java.lang.String,
    thickness: scala.Double,
    variation: java.lang.String,
    waveHeight: java.lang.String,
    waveLength: java.lang.String
  ): FlashStroke = {
    val __obj = js.Dynamic.literal(breakAtCorners = breakAtCorners, capType = capType, color = color, curve = curve, dash1 = dash1, dash2 = dash2, density = density, dotSize = dotSize, dotSpace = dotSpace, hatchThickness = hatchThickness, jiggle = jiggle, joinType = joinType, length = length, miterLimit = miterLimit, pattern = pattern, rotate = rotate, scaleType = scaleType, shapeFill = shapeFill, space = space, strokeHinting = strokeHinting, style = style, thickness = thickness, variation = variation, waveHeight = waveHeight, waveLength = waveLength)
  
    __obj.asInstanceOf[FlashStroke]
  }
}

