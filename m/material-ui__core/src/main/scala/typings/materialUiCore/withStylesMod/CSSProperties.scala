package typings.materialUiCore.withStylesMod

import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.AlignmentBaselineProperty
import typings.csstype.mod.BaselineShiftProperty
import typings.csstype.mod.ClipRuleProperty
import typings.csstype.mod.ColorInterpolationProperty
import typings.csstype.mod.ColorRenderingProperty
import typings.csstype.mod.DominantBaselineProperty
import typings.csstype.mod.FillProperty
import typings.csstype.mod.FillRuleProperty
import typings.csstype.mod.FloodColorProperty
import typings.csstype.mod.GlobalsNumber
import typings.csstype.mod.GlyphOrientationVerticalProperty
import typings.csstype.mod.LightingColorProperty
import typings.csstype.mod.MarkerEndProperty
import typings.csstype.mod.MarkerMidProperty
import typings.csstype.mod.MarkerProperty
import typings.csstype.mod.MarkerStartProperty
import typings.csstype.mod.ObsoleteProperties
import typings.csstype.mod.ShapeRenderingProperty
import typings.csstype.mod.StandardLonghandProperties
import typings.csstype.mod.StandardShorthandProperties
import typings.csstype.mod.StopColorProperty
import typings.csstype.mod.StrokeDasharrayProperty
import typings.csstype.mod.StrokeDashoffsetProperty
import typings.csstype.mod.StrokeLinecapProperty
import typings.csstype.mod.StrokeLinejoinProperty
import typings.csstype.mod.StrokeProperty
import typings.csstype.mod.StrokeWidthProperty
import typings.csstype.mod.TextAnchorProperty
import typings.csstype.mod.VectorEffectProperty
import typings.csstype.mod.VendorLonghandProperties
import typings.csstype.mod.VendorShorthandProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.csstype.mod.SvgProperties because var conflicts: clip, clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ @js.native
trait CSSProperties
  extends StandardLonghandProperties[Double | String]
     with StandardShorthandProperties[Double | String]
     with VendorLonghandProperties[Double | String]
     with VendorShorthandProperties[Double | String]
     with ObsoleteProperties[Double | String]
     with // Allow pseudo selectors and media queries
/* k */ StringDictionary[
      js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 493 */ js.Any
      ]
    ] {
  var alignmentBaseline: js.UndefOr[AlignmentBaselineProperty] = js.native
  var baselineShift: js.UndefOr[BaselineShiftProperty[Double | String]] = js.native
  var clipRule: js.UndefOr[ClipRuleProperty] = js.native
  var colorInterpolation: js.UndefOr[ColorInterpolationProperty] = js.native
  var colorRendering: js.UndefOr[ColorRenderingProperty] = js.native
  var dominantBaseline: js.UndefOr[DominantBaselineProperty] = js.native
  var fill: js.UndefOr[FillProperty] = js.native
  var fillOpacity: js.UndefOr[GlobalsNumber] = js.native
  var fillRule: js.UndefOr[FillRuleProperty] = js.native
  var floodColor: js.UndefOr[FloodColorProperty] = js.native
  var floodOpacity: js.UndefOr[GlobalsNumber] = js.native
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVerticalProperty] = js.native
  var lightingColor: js.UndefOr[LightingColorProperty] = js.native
  var marker: js.UndefOr[MarkerProperty] = js.native
  var markerEnd: js.UndefOr[MarkerEndProperty] = js.native
  var markerMid: js.UndefOr[MarkerMidProperty] = js.native
  var markerStart: js.UndefOr[MarkerStartProperty] = js.native
  var shapeRendering: js.UndefOr[ShapeRenderingProperty] = js.native
  var stopColor: js.UndefOr[StopColorProperty] = js.native
  var stopOpacity: js.UndefOr[GlobalsNumber] = js.native
  var stroke: js.UndefOr[StrokeProperty] = js.native
  var strokeDasharray: js.UndefOr[StrokeDasharrayProperty[Double | String]] = js.native
  var strokeDashoffset: js.UndefOr[StrokeDashoffsetProperty[Double | String]] = js.native
  var strokeLinecap: js.UndefOr[StrokeLinecapProperty] = js.native
  var strokeLinejoin: js.UndefOr[StrokeLinejoinProperty] = js.native
  var strokeMiterlimit: js.UndefOr[GlobalsNumber] = js.native
  var strokeOpacity: js.UndefOr[GlobalsNumber] = js.native
  var strokeWidth: js.UndefOr[StrokeWidthProperty[Double | String]] = js.native
  var textAnchor: js.UndefOr[TextAnchorProperty] = js.native
  var vectorEffect: js.UndefOr[VectorEffectProperty] = js.native
}

object CSSProperties {
  @scala.inline
  def apply(
    ObsoleteProperties: ObsoleteProperties[Double | String] = null,
    StandardLonghandProperties: StandardLonghandProperties[Double | String] = null,
    StandardShorthandProperties: StandardShorthandProperties[Double | String] = null,
    StringDictionary: // Allow pseudo selectors and media queries
  /* k */ StringDictionary[
      js.UndefOr[
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 493 */ js.Any
      ]
    ] = null,
    VendorLonghandProperties: VendorLonghandProperties[Double | String] = null,
    VendorShorthandProperties: VendorShorthandProperties[Double | String] = null,
    alignmentBaseline: AlignmentBaselineProperty = null,
    baselineShift: BaselineShiftProperty[Double | String] = null,
    clipRule: ClipRuleProperty = null,
    colorInterpolation: ColorInterpolationProperty = null,
    colorRendering: ColorRenderingProperty = null,
    dominantBaseline: DominantBaselineProperty = null,
    fill: FillProperty = null,
    fillOpacity: GlobalsNumber = null,
    fillRule: FillRuleProperty = null,
    floodColor: FloodColorProperty = null,
    floodOpacity: GlobalsNumber = null,
    glyphOrientationVertical: GlyphOrientationVerticalProperty = null,
    lightingColor: LightingColorProperty = null,
    marker: MarkerProperty = null,
    markerEnd: MarkerEndProperty = null,
    markerMid: MarkerMidProperty = null,
    markerStart: MarkerStartProperty = null,
    shapeRendering: ShapeRenderingProperty = null,
    stopColor: StopColorProperty = null,
    stopOpacity: GlobalsNumber = null,
    stroke: StrokeProperty = null,
    strokeDasharray: StrokeDasharrayProperty[Double | String] = null,
    strokeDashoffset: StrokeDashoffsetProperty[Double | String] = null,
    strokeLinecap: StrokeLinecapProperty = null,
    strokeLinejoin: StrokeLinejoinProperty = null,
    strokeMiterlimit: GlobalsNumber = null,
    strokeOpacity: GlobalsNumber = null,
    strokeWidth: StrokeWidthProperty[Double | String] = null,
    textAnchor: TextAnchorProperty = null,
    vectorEffect: VectorEffectProperty = null
  ): CSSProperties = {
    val __obj = js.Dynamic.literal()
    if (ObsoleteProperties != null) js.Dynamic.global.Object.assign(__obj, ObsoleteProperties)
    if (StandardLonghandProperties != null) js.Dynamic.global.Object.assign(__obj, StandardLonghandProperties)
    if (StandardShorthandProperties != null) js.Dynamic.global.Object.assign(__obj, StandardShorthandProperties)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (VendorLonghandProperties != null) js.Dynamic.global.Object.assign(__obj, VendorLonghandProperties)
    if (VendorShorthandProperties != null) js.Dynamic.global.Object.assign(__obj, VendorShorthandProperties)
    if (alignmentBaseline != null) __obj.updateDynamic("alignmentBaseline")(alignmentBaseline.asInstanceOf[js.Any])
    if (baselineShift != null) __obj.updateDynamic("baselineShift")(baselineShift.asInstanceOf[js.Any])
    if (clipRule != null) __obj.updateDynamic("clipRule")(clipRule.asInstanceOf[js.Any])
    if (colorInterpolation != null) __obj.updateDynamic("colorInterpolation")(colorInterpolation.asInstanceOf[js.Any])
    if (colorRendering != null) __obj.updateDynamic("colorRendering")(colorRendering.asInstanceOf[js.Any])
    if (dominantBaseline != null) __obj.updateDynamic("dominantBaseline")(dominantBaseline.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (fillRule != null) __obj.updateDynamic("fillRule")(fillRule.asInstanceOf[js.Any])
    if (floodColor != null) __obj.updateDynamic("floodColor")(floodColor.asInstanceOf[js.Any])
    if (floodOpacity != null) __obj.updateDynamic("floodOpacity")(floodOpacity.asInstanceOf[js.Any])
    if (glyphOrientationVertical != null) __obj.updateDynamic("glyphOrientationVertical")(glyphOrientationVertical.asInstanceOf[js.Any])
    if (lightingColor != null) __obj.updateDynamic("lightingColor")(lightingColor.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (markerEnd != null) __obj.updateDynamic("markerEnd")(markerEnd.asInstanceOf[js.Any])
    if (markerMid != null) __obj.updateDynamic("markerMid")(markerMid.asInstanceOf[js.Any])
    if (markerStart != null) __obj.updateDynamic("markerStart")(markerStart.asInstanceOf[js.Any])
    if (shapeRendering != null) __obj.updateDynamic("shapeRendering")(shapeRendering.asInstanceOf[js.Any])
    if (stopColor != null) __obj.updateDynamic("stopColor")(stopColor.asInstanceOf[js.Any])
    if (stopOpacity != null) __obj.updateDynamic("stopOpacity")(stopOpacity.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (textAnchor != null) __obj.updateDynamic("textAnchor")(textAnchor.asInstanceOf[js.Any])
    if (vectorEffect != null) __obj.updateDynamic("vectorEffect")(vectorEffect.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSProperties]
  }
}

