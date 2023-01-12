package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashStroke extends StObject {
  
  /// A Boolean value, same as the Sharp Corners setting in the custom Stroke Style dialog box.
  var breakAtCorners: Boolean
  
  /// A string that specifies the type of cap for the stroke.
  var capType: String
  
  /// A string, hexadecimal value, or integer that represents the stroke color.
  var color: Any
  
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
  
  inline def apply(
    breakAtCorners: Boolean,
    capType: String,
    color: Any,
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
  implicit open class MutableBuilder[Self <: FlashStroke] (val x: Self) extends AnyVal {
    
    inline def setBreakAtCorners(value: Boolean): Self = StObject.set(x, "breakAtCorners", value.asInstanceOf[js.Any])
    
    inline def setCapType(value: String): Self = StObject.set(x, "capType", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setDash1(value: Double): Self = StObject.set(x, "dash1", value.asInstanceOf[js.Any])
    
    inline def setDash2(value: Double): Self = StObject.set(x, "dash2", value.asInstanceOf[js.Any])
    
    inline def setDensity(value: String): Self = StObject.set(x, "density", value.asInstanceOf[js.Any])
    
    inline def setDotSize(value: String): Self = StObject.set(x, "dotSize", value.asInstanceOf[js.Any])
    
    inline def setDotSpace(value: Double): Self = StObject.set(x, "dotSpace", value.asInstanceOf[js.Any])
    
    inline def setHatchThickness(value: String): Self = StObject.set(x, "hatchThickness", value.asInstanceOf[js.Any])
    
    inline def setJiggle(value: String): Self = StObject.set(x, "jiggle", value.asInstanceOf[js.Any])
    
    inline def setJoinType(value: String): Self = StObject.set(x, "joinType", value.asInstanceOf[js.Any])
    
    inline def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setMiterLimit(value: Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setRotate(value: String): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setScaleType(value: String): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setShapeFill(value: FlashFill): Self = StObject.set(x, "shapeFill", value.asInstanceOf[js.Any])
    
    inline def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setStrokeHinting(value: Boolean): Self = StObject.set(x, "strokeHinting", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    inline def setVariation(value: String): Self = StObject.set(x, "variation", value.asInstanceOf[js.Any])
    
    inline def setWaveHeight(value: String): Self = StObject.set(x, "waveHeight", value.asInstanceOf[js.Any])
    
    inline def setWaveLength(value: String): Self = StObject.set(x, "waveLength", value.asInstanceOf[js.Any])
  }
}
