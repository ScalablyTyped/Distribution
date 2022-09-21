package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.`line-center`
import typings.mapboxGl.mapboxGlStrings.`viewport-y`
import typings.mapboxGl.mapboxGlStrings.auto
import typings.mapboxGl.mapboxGlStrings.both
import typings.mapboxGl.mapboxGlStrings.center
import typings.mapboxGl.mapboxGlStrings.height
import typings.mapboxGl.mapboxGlStrings.horizontal
import typings.mapboxGl.mapboxGlStrings.left
import typings.mapboxGl.mapboxGlStrings.line
import typings.mapboxGl.mapboxGlStrings.lowercase
import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.none
import typings.mapboxGl.mapboxGlStrings.point
import typings.mapboxGl.mapboxGlStrings.right
import typings.mapboxGl.mapboxGlStrings.source_
import typings.mapboxGl.mapboxGlStrings.uppercase
import typings.mapboxGl.mapboxGlStrings.vertical
import typings.mapboxGl.mapboxGlStrings.viewport
import typings.mapboxGl.mapboxGlStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolLayout
  extends StObject
     with Layout
     with _AnyLayout {
  
  var `icon-allow-overlap`: js.UndefOr[Boolean | StyleFunction | Expression] = js.undefined
  
  var `icon-anchor`: js.UndefOr[Anchor | StyleFunction | Expression] = js.undefined
  
  var `icon-ignore-placement`: js.UndefOr[Boolean | Expression] = js.undefined
  
  var `icon-image`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  
  var `icon-keep-upright`: js.UndefOr[Boolean] = js.undefined
  
  var `icon-offset`: js.UndefOr[js.Array[Double] | StyleFunction | Expression] = js.undefined
  
  var `icon-optional`: js.UndefOr[Boolean] = js.undefined
  
  var `icon-padding`: js.UndefOr[Double | Expression] = js.undefined
  
  var `icon-pitch-alignment`: js.UndefOr[map | viewport | auto] = js.undefined
  
  var `icon-rotate`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `icon-rotation-alignment`: js.UndefOr[map | viewport | auto] = js.undefined
  
  var `icon-size`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `icon-text-fit`: js.UndefOr[none | both | width | height] = js.undefined
  
  var `icon-text-fit-padding`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  
  var `symbol-avoid-edges`: js.UndefOr[Boolean] = js.undefined
  
  var `symbol-placement`: js.UndefOr[point | line | `line-center`] = js.undefined
  
  var `symbol-sort-key`: js.UndefOr[Double | Expression] = js.undefined
  
  var `symbol-spacing`: js.UndefOr[Double | Expression] = js.undefined
  
  var `symbol-z-order`: js.UndefOr[`viewport-y` | source_] = js.undefined
  
  var `text-allow-overlap`: js.UndefOr[Boolean] = js.undefined
  
  var `text-anchor`: js.UndefOr[Anchor | StyleFunction | Expression] = js.undefined
  
  var `text-field`: js.UndefOr[String | StyleFunction | Expression] = js.undefined
  
  var `text-font`: js.UndefOr[js.Array[String] | Expression] = js.undefined
  
  var `text-ignore-placement`: js.UndefOr[Boolean] = js.undefined
  
  var `text-justify`: js.UndefOr[auto | left | center | right | Expression] = js.undefined
  
  var `text-keep-upright`: js.UndefOr[Boolean] = js.undefined
  
  var `text-letter-spacing`: js.UndefOr[Double | Expression] = js.undefined
  
  var `text-line-height`: js.UndefOr[Double | Expression] = js.undefined
  
  var `text-max-angle`: js.UndefOr[Double | Expression] = js.undefined
  
  var `text-max-width`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `text-offset`: js.UndefOr[js.Array[Double] | Expression] = js.undefined
  
  var `text-optional`: js.UndefOr[Boolean] = js.undefined
  
  var `text-padding`: js.UndefOr[Double | Expression] = js.undefined
  
  var `text-pitch-alignment`: js.UndefOr[map | viewport | auto] = js.undefined
  
  var `text-radial-offset`: js.UndefOr[Double | Expression] = js.undefined
  
  var `text-rotate`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `text-rotation-alignment`: js.UndefOr[map | viewport | auto] = js.undefined
  
  var `text-size`: js.UndefOr[Double | StyleFunction | Expression] = js.undefined
  
  var `text-transform`: js.UndefOr[none | uppercase | lowercase | StyleFunction | Expression] = js.undefined
  
  var `text-variable-anchor`: js.UndefOr[js.Array[Anchor]] = js.undefined
  
  var `text-writing-mode`: js.UndefOr[js.Array[horizontal | vertical]] = js.undefined
}
object SymbolLayout {
  
  inline def apply(): SymbolLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolLayout]
  }
  
  extension [Self <: SymbolLayout](x: Self) {
    
    inline def `setIcon-allow-overlap`(value: Boolean | StyleFunction | Expression): Self = StObject.set(x, "icon-allow-overlap", value.asInstanceOf[js.Any])
    
    inline def `setIcon-allow-overlapUndefined`: Self = StObject.set(x, "icon-allow-overlap", js.undefined)
    
    inline def `setIcon-anchor`(value: Anchor | StyleFunction | Expression): Self = StObject.set(x, "icon-anchor", value.asInstanceOf[js.Any])
    
    inline def `setIcon-anchorUndefined`: Self = StObject.set(x, "icon-anchor", js.undefined)
    
    inline def `setIcon-ignore-placement`(value: Boolean | Expression): Self = StObject.set(x, "icon-ignore-placement", value.asInstanceOf[js.Any])
    
    inline def `setIcon-ignore-placementUndefined`: Self = StObject.set(x, "icon-ignore-placement", js.undefined)
    
    inline def `setIcon-image`(value: String | StyleFunction | Expression): Self = StObject.set(x, "icon-image", value.asInstanceOf[js.Any])
    
    inline def `setIcon-imageUndefined`: Self = StObject.set(x, "icon-image", js.undefined)
    
    inline def `setIcon-keep-upright`(value: Boolean): Self = StObject.set(x, "icon-keep-upright", value.asInstanceOf[js.Any])
    
    inline def `setIcon-keep-uprightUndefined`: Self = StObject.set(x, "icon-keep-upright", js.undefined)
    
    inline def `setIcon-offset`(value: js.Array[Double] | StyleFunction | Expression): Self = StObject.set(x, "icon-offset", value.asInstanceOf[js.Any])
    
    inline def `setIcon-offsetUndefined`: Self = StObject.set(x, "icon-offset", js.undefined)
    
    inline def `setIcon-offsetVarargs`(value: Double*): Self = StObject.set(x, "icon-offset", js.Array(value*))
    
    inline def `setIcon-optional`(value: Boolean): Self = StObject.set(x, "icon-optional", value.asInstanceOf[js.Any])
    
    inline def `setIcon-optionalUndefined`: Self = StObject.set(x, "icon-optional", js.undefined)
    
    inline def `setIcon-padding`(value: Double | Expression): Self = StObject.set(x, "icon-padding", value.asInstanceOf[js.Any])
    
    inline def `setIcon-paddingUndefined`: Self = StObject.set(x, "icon-padding", js.undefined)
    
    inline def `setIcon-pitch-alignment`(value: map | viewport | auto): Self = StObject.set(x, "icon-pitch-alignment", value.asInstanceOf[js.Any])
    
    inline def `setIcon-pitch-alignmentUndefined`: Self = StObject.set(x, "icon-pitch-alignment", js.undefined)
    
    inline def `setIcon-rotate`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "icon-rotate", value.asInstanceOf[js.Any])
    
    inline def `setIcon-rotateUndefined`: Self = StObject.set(x, "icon-rotate", js.undefined)
    
    inline def `setIcon-rotation-alignment`(value: map | viewport | auto): Self = StObject.set(x, "icon-rotation-alignment", value.asInstanceOf[js.Any])
    
    inline def `setIcon-rotation-alignmentUndefined`: Self = StObject.set(x, "icon-rotation-alignment", js.undefined)
    
    inline def `setIcon-size`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "icon-size", value.asInstanceOf[js.Any])
    
    inline def `setIcon-sizeUndefined`: Self = StObject.set(x, "icon-size", js.undefined)
    
    inline def `setIcon-text-fit`(value: none | both | width | height): Self = StObject.set(x, "icon-text-fit", value.asInstanceOf[js.Any])
    
    inline def `setIcon-text-fit-padding`(value: js.Array[Double] | Expression): Self = StObject.set(x, "icon-text-fit-padding", value.asInstanceOf[js.Any])
    
    inline def `setIcon-text-fit-paddingUndefined`: Self = StObject.set(x, "icon-text-fit-padding", js.undefined)
    
    inline def `setIcon-text-fit-paddingVarargs`(value: Double*): Self = StObject.set(x, "icon-text-fit-padding", js.Array(value*))
    
    inline def `setIcon-text-fitUndefined`: Self = StObject.set(x, "icon-text-fit", js.undefined)
    
    inline def `setSymbol-avoid-edges`(value: Boolean): Self = StObject.set(x, "symbol-avoid-edges", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-avoid-edgesUndefined`: Self = StObject.set(x, "symbol-avoid-edges", js.undefined)
    
    inline def `setSymbol-placement`(value: point | line | `line-center`): Self = StObject.set(x, "symbol-placement", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-placementUndefined`: Self = StObject.set(x, "symbol-placement", js.undefined)
    
    inline def `setSymbol-sort-key`(value: Double | Expression): Self = StObject.set(x, "symbol-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-sort-keyUndefined`: Self = StObject.set(x, "symbol-sort-key", js.undefined)
    
    inline def `setSymbol-spacing`(value: Double | Expression): Self = StObject.set(x, "symbol-spacing", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-spacingUndefined`: Self = StObject.set(x, "symbol-spacing", js.undefined)
    
    inline def `setSymbol-z-order`(value: `viewport-y` | source_): Self = StObject.set(x, "symbol-z-order", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-z-orderUndefined`: Self = StObject.set(x, "symbol-z-order", js.undefined)
    
    inline def `setText-allow-overlap`(value: Boolean): Self = StObject.set(x, "text-allow-overlap", value.asInstanceOf[js.Any])
    
    inline def `setText-allow-overlapUndefined`: Self = StObject.set(x, "text-allow-overlap", js.undefined)
    
    inline def `setText-anchor`(value: Anchor | StyleFunction | Expression): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
    
    inline def `setText-field`(value: String | StyleFunction | Expression): Self = StObject.set(x, "text-field", value.asInstanceOf[js.Any])
    
    inline def `setText-fieldUndefined`: Self = StObject.set(x, "text-field", js.undefined)
    
    inline def `setText-font`(value: js.Array[String] | Expression): Self = StObject.set(x, "text-font", value.asInstanceOf[js.Any])
    
    inline def `setText-fontUndefined`: Self = StObject.set(x, "text-font", js.undefined)
    
    inline def `setText-fontVarargs`(value: String*): Self = StObject.set(x, "text-font", js.Array(value*))
    
    inline def `setText-ignore-placement`(value: Boolean): Self = StObject.set(x, "text-ignore-placement", value.asInstanceOf[js.Any])
    
    inline def `setText-ignore-placementUndefined`: Self = StObject.set(x, "text-ignore-placement", js.undefined)
    
    inline def `setText-justify`(value: auto | left | center | right | Expression): Self = StObject.set(x, "text-justify", value.asInstanceOf[js.Any])
    
    inline def `setText-justifyUndefined`: Self = StObject.set(x, "text-justify", js.undefined)
    
    inline def `setText-keep-upright`(value: Boolean): Self = StObject.set(x, "text-keep-upright", value.asInstanceOf[js.Any])
    
    inline def `setText-keep-uprightUndefined`: Self = StObject.set(x, "text-keep-upright", js.undefined)
    
    inline def `setText-letter-spacing`(value: Double | Expression): Self = StObject.set(x, "text-letter-spacing", value.asInstanceOf[js.Any])
    
    inline def `setText-letter-spacingUndefined`: Self = StObject.set(x, "text-letter-spacing", js.undefined)
    
    inline def `setText-line-height`(value: Double | Expression): Self = StObject.set(x, "text-line-height", value.asInstanceOf[js.Any])
    
    inline def `setText-line-heightUndefined`: Self = StObject.set(x, "text-line-height", js.undefined)
    
    inline def `setText-max-angle`(value: Double | Expression): Self = StObject.set(x, "text-max-angle", value.asInstanceOf[js.Any])
    
    inline def `setText-max-angleUndefined`: Self = StObject.set(x, "text-max-angle", js.undefined)
    
    inline def `setText-max-width`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "text-max-width", value.asInstanceOf[js.Any])
    
    inline def `setText-max-widthUndefined`: Self = StObject.set(x, "text-max-width", js.undefined)
    
    inline def `setText-offset`(value: js.Array[Double] | Expression): Self = StObject.set(x, "text-offset", value.asInstanceOf[js.Any])
    
    inline def `setText-offsetUndefined`: Self = StObject.set(x, "text-offset", js.undefined)
    
    inline def `setText-offsetVarargs`(value: Double*): Self = StObject.set(x, "text-offset", js.Array(value*))
    
    inline def `setText-optional`(value: Boolean): Self = StObject.set(x, "text-optional", value.asInstanceOf[js.Any])
    
    inline def `setText-optionalUndefined`: Self = StObject.set(x, "text-optional", js.undefined)
    
    inline def `setText-padding`(value: Double | Expression): Self = StObject.set(x, "text-padding", value.asInstanceOf[js.Any])
    
    inline def `setText-paddingUndefined`: Self = StObject.set(x, "text-padding", js.undefined)
    
    inline def `setText-pitch-alignment`(value: map | viewport | auto): Self = StObject.set(x, "text-pitch-alignment", value.asInstanceOf[js.Any])
    
    inline def `setText-pitch-alignmentUndefined`: Self = StObject.set(x, "text-pitch-alignment", js.undefined)
    
    inline def `setText-radial-offset`(value: Double | Expression): Self = StObject.set(x, "text-radial-offset", value.asInstanceOf[js.Any])
    
    inline def `setText-radial-offsetUndefined`: Self = StObject.set(x, "text-radial-offset", js.undefined)
    
    inline def `setText-rotate`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "text-rotate", value.asInstanceOf[js.Any])
    
    inline def `setText-rotateUndefined`: Self = StObject.set(x, "text-rotate", js.undefined)
    
    inline def `setText-rotation-alignment`(value: map | viewport | auto): Self = StObject.set(x, "text-rotation-alignment", value.asInstanceOf[js.Any])
    
    inline def `setText-rotation-alignmentUndefined`: Self = StObject.set(x, "text-rotation-alignment", js.undefined)
    
    inline def `setText-size`(value: Double | StyleFunction | Expression): Self = StObject.set(x, "text-size", value.asInstanceOf[js.Any])
    
    inline def `setText-sizeUndefined`: Self = StObject.set(x, "text-size", js.undefined)
    
    inline def `setText-transform`(value: none | uppercase | lowercase | StyleFunction | Expression): Self = StObject.set(x, "text-transform", value.asInstanceOf[js.Any])
    
    inline def `setText-transformUndefined`: Self = StObject.set(x, "text-transform", js.undefined)
    
    inline def `setText-variable-anchor`(value: js.Array[Anchor]): Self = StObject.set(x, "text-variable-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-variable-anchorUndefined`: Self = StObject.set(x, "text-variable-anchor", js.undefined)
    
    inline def `setText-variable-anchorVarargs`(value: Anchor*): Self = StObject.set(x, "text-variable-anchor", js.Array(value*))
    
    inline def `setText-writing-mode`(value: js.Array[horizontal | vertical]): Self = StObject.set(x, "text-writing-mode", value.asInstanceOf[js.Any])
    
    inline def `setText-writing-modeUndefined`: Self = StObject.set(x, "text-writing-mode", js.undefined)
    
    inline def `setText-writing-modeVarargs`(value: (horizontal | vertical)*): Self = StObject.set(x, "text-writing-mode", js.Array(value*))
  }
}
