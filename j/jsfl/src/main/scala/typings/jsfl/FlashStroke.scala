package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashStroke extends js.Object {
  /// A Boolean value, same as the Sharp Corners setting in the custom Stroke Style dialog box.
  var breakAtCorners: Boolean
  /// A string that specifies the type of cap for the stroke.
  var capType: String
  /// A string, hexadecimal value, or integer that represents the stroke color.
  var color: js.Any
  /// A string that specifies the type of hatching for the stroke.
  var curve: String
  /// An integer that specifies the lengths of the solid part of a dashed line.
  var dash1: Double
  /// An integer that specifies the lengths of the blank part of a dashed line.
  var dash2: Double
  /// A string that specifies the density of a stippled line.
  var density: String
  /// A string that specifies the dot size of a stippled line.
  var dotSize: String
  /// An integer that specifies the spacing between dots in a dotted line.
  var dotSpace: Double
  /// A string that specifies the thickness of a hatch line.
  var hatchThickness: String
  /// A string that specifies the jiggle property of a hatched line.
  var jiggle: String
  /// A string that specifies the type of join for the stroke.
  var joinType: String
  /// A string that specifies the length of a hatch line.
  var length: String
  /// A float value that specifies the angle above which the tip of the miter will be truncated by a segment.
  var miterLimit: Double
  /// A string that specifies the pattern of a ragged line.
  var pattern: String
  /// A string that specifies the rotation of a hatch line.
  var rotate: String
  /// A string that specifies the type of scale to be applied to the stroke.
  var scaleType: String
  /// A Fill object that represents the fill settings of the stroke.
  var shapeFill: FlashFill
  /// A string that specifies the spacing of a hatched line.
  var space: String
  /// A Boolean value that specifies whether stroke hinting is set on the stroke.
  var strokeHinting: Boolean
  /// A string that describes the stroke style.
  var style: String
  /// An integer that specifies the stroke size.
  var thickness: Double
  /// A string that specifies the variation of a stippled line.
  var variation: String
  /// A string that specifies the wave height of a ragged line.
  var waveHeight: String
  /// A string that specifies the wave length of a ragged line.
  var waveLength: String
}

object FlashStroke {
  @scala.inline
  def apply(
    breakAtCorners: Boolean,
    capType: String,
    color: js.Any,
    curve: String,
    dash1: Double,
    dash2: Double,
    density: String,
    dotSize: String,
    dotSpace: Double,
    hatchThickness: String,
    jiggle: String,
    joinType: String,
    length: String,
    miterLimit: Double,
    pattern: String,
    rotate: String,
    scaleType: String,
    shapeFill: FlashFill,
    space: String,
    strokeHinting: Boolean,
    style: String,
    thickness: Double,
    variation: String,
    waveHeight: String,
    waveLength: String
  ): FlashStroke = {
    val __obj = js.Dynamic.literal(breakAtCorners = breakAtCorners.asInstanceOf[js.Any], capType = capType.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], curve = curve.asInstanceOf[js.Any], dash1 = dash1.asInstanceOf[js.Any], dash2 = dash2.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], dotSize = dotSize.asInstanceOf[js.Any], dotSpace = dotSpace.asInstanceOf[js.Any], hatchThickness = hatchThickness.asInstanceOf[js.Any], jiggle = jiggle.asInstanceOf[js.Any], joinType = joinType.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any], shapeFill = shapeFill.asInstanceOf[js.Any], space = space.asInstanceOf[js.Any], strokeHinting = strokeHinting.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], variation = variation.asInstanceOf[js.Any], waveHeight = waveHeight.asInstanceOf[js.Any], waveLength = waveLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FlashStroke]
  }
}

