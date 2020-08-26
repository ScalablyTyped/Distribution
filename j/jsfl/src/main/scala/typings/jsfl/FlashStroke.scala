package typings.jsfl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashStroke extends js.Object {
  /// A Boolean value, same as the Sharp Corners setting in the custom Stroke Style dialog box.
  var breakAtCorners: Boolean = js.native
  /// A string that specifies the type of cap for the stroke.
  var capType: String = js.native
  /// A string, hexadecimal value, or integer that represents the stroke color.
  var color: js.Any = js.native
  /// A string that specifies the type of hatching for the stroke.
  var curve: String = js.native
  /// An integer that specifies the lengths of the solid part of a dashed line.
  var dash1: Double = js.native
  /// An integer that specifies the lengths of the blank part of a dashed line.
  var dash2: Double = js.native
  /// A string that specifies the density of a stippled line.
  var density: String = js.native
  /// A string that specifies the dot size of a stippled line.
  var dotSize: String = js.native
  /// An integer that specifies the spacing between dots in a dotted line.
  var dotSpace: Double = js.native
  /// A string that specifies the thickness of a hatch line.
  var hatchThickness: String = js.native
  /// A string that specifies the jiggle property of a hatched line.
  var jiggle: String = js.native
  /// A string that specifies the type of join for the stroke.
  var joinType: String = js.native
  /// A string that specifies the length of a hatch line.
  var length: String = js.native
  /// A float value that specifies the angle above which the tip of the miter will be truncated by a segment.
  var miterLimit: Double = js.native
  /// A string that specifies the pattern of a ragged line.
  var pattern: String = js.native
  /// A string that specifies the rotation of a hatch line.
  var rotate: String = js.native
  /// A string that specifies the type of scale to be applied to the stroke.
  var scaleType: String = js.native
  /// A Fill object that represents the fill settings of the stroke.
  var shapeFill: FlashFill = js.native
  /// A string that specifies the spacing of a hatched line.
  var space: String = js.native
  /// A Boolean value that specifies whether stroke hinting is set on the stroke.
  var strokeHinting: Boolean = js.native
  /// A string that describes the stroke style.
  var style: String = js.native
  /// An integer that specifies the stroke size.
  var thickness: Double = js.native
  /// A string that specifies the variation of a stippled line.
  var variation: String = js.native
  /// A string that specifies the wave height of a ragged line.
  var waveHeight: String = js.native
  /// A string that specifies the wave length of a ragged line.
  var waveLength: String = js.native
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
  @scala.inline
  implicit class FlashStrokeOps[Self <: FlashStroke] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBreakAtCorners(value: Boolean): Self = this.set("breakAtCorners", value.asInstanceOf[js.Any])
    @scala.inline
    def setCapType(value: String): Self = this.set("capType", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: js.Any): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurve(value: String): Self = this.set("curve", value.asInstanceOf[js.Any])
    @scala.inline
    def setDash1(value: Double): Self = this.set("dash1", value.asInstanceOf[js.Any])
    @scala.inline
    def setDash2(value: Double): Self = this.set("dash2", value.asInstanceOf[js.Any])
    @scala.inline
    def setDensity(value: String): Self = this.set("density", value.asInstanceOf[js.Any])
    @scala.inline
    def setDotSize(value: String): Self = this.set("dotSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setDotSpace(value: Double): Self = this.set("dotSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def setHatchThickness(value: String): Self = this.set("hatchThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setJiggle(value: String): Self = this.set("jiggle", value.asInstanceOf[js.Any])
    @scala.inline
    def setJoinType(value: String): Self = this.set("joinType", value.asInstanceOf[js.Any])
    @scala.inline
    def setLength(value: String): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setMiterLimit(value: Double): Self = this.set("miterLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotate(value: String): Self = this.set("rotate", value.asInstanceOf[js.Any])
    @scala.inline
    def setScaleType(value: String): Self = this.set("scaleType", value.asInstanceOf[js.Any])
    @scala.inline
    def setShapeFill(value: FlashFill): Self = this.set("shapeFill", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpace(value: String): Self = this.set("space", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrokeHinting(value: Boolean): Self = this.set("strokeHinting", value.asInstanceOf[js.Any])
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariation(value: String): Self = this.set("variation", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaveHeight(value: String): Self = this.set("waveHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaveLength(value: String): Self = this.set("waveLength", value.asInstanceOf[js.Any])
  }
  
}

