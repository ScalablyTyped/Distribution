package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.ExpressionSpecification
import typings.maplibreGl.maplibreGlStrings.`bottom-left`
import typings.maplibreGl.maplibreGlStrings.`bottom-right`
import typings.maplibreGl.maplibreGlStrings.`geometry-type`
import typings.maplibreGl.maplibreGlStrings.`heatmap-density`
import typings.maplibreGl.maplibreGlStrings.`line-center`
import typings.maplibreGl.maplibreGlStrings.`line-progress`
import typings.maplibreGl.maplibreGlStrings.`top-left`
import typings.maplibreGl.maplibreGlStrings.`top-right`
import typings.maplibreGl.maplibreGlStrings.`viewport-glyph`
import typings.maplibreGl.maplibreGlStrings.`viewport-y`
import typings.maplibreGl.maplibreGlStrings.accumulated
import typings.maplibreGl.maplibreGlStrings.always
import typings.maplibreGl.maplibreGlStrings.auto
import typings.maplibreGl.maplibreGlStrings.both
import typings.maplibreGl.maplibreGlStrings.bottom
import typings.maplibreGl.maplibreGlStrings.center
import typings.maplibreGl.maplibreGlStrings.cooperative
import typings.maplibreGl.maplibreGlStrings.height
import typings.maplibreGl.maplibreGlStrings.horizontal
import typings.maplibreGl.maplibreGlStrings.id
import typings.maplibreGl.maplibreGlStrings.left
import typings.maplibreGl.maplibreGlStrings.line
import typings.maplibreGl.maplibreGlStrings.ln2
import typings.maplibreGl.maplibreGlStrings.lowercase
import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.never
import typings.maplibreGl.maplibreGlStrings.none
import typings.maplibreGl.maplibreGlStrings.pi
import typings.maplibreGl.maplibreGlStrings.point_
import typings.maplibreGl.maplibreGlStrings.properties
import typings.maplibreGl.maplibreGlStrings.right
import typings.maplibreGl.maplibreGlStrings.source_
import typings.maplibreGl.maplibreGlStrings.top
import typings.maplibreGl.maplibreGlStrings.uppercase
import typings.maplibreGl.maplibreGlStrings.vertical
import typings.maplibreGl.maplibreGlStrings.viewport
import typings.maplibreGl.maplibreGlStrings.visible
import typings.maplibreGl.maplibreGlStrings.width
import typings.maplibreGl.maplibreGlStrings.zoom
import typings.maplibreGl.mod.DataDrivenPropertyValueSpecification
import typings.maplibreGl.mod.FormattedSpecification
import typings.maplibreGl.mod.PaddingSpecification
import typings.maplibreGl.mod.PropertyValueSpecification
import typings.maplibreGl.mod.ResolvedImageSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iconallowoverlap extends StObject {
  
  var `icon-allow-overlap`: js.UndefOr[PropertyValueSpecification[Boolean]] = js.undefined
  
  var `icon-anchor`: js.UndefOr[
    DataDrivenPropertyValueSpecification[
      center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
    ]
  ] = js.undefined
  
  var `icon-ignore-placement`: js.UndefOr[PropertyValueSpecification[Boolean]] = js.undefined
  
  var `icon-image`: js.UndefOr[DataDrivenPropertyValueSpecification[ResolvedImageSpecification]] = js.undefined
  
  var `icon-keep-upright`: js.UndefOr[PropertyValueSpecification[Boolean]] = js.undefined
  
  var `icon-offset`: js.UndefOr[DataDrivenPropertyValueSpecification[js.Tuple2[Double, Double]]] = js.undefined
  
  var `icon-optional`: js.UndefOr[PropertyValueSpecification[Boolean]] = js.undefined
  
  var `icon-overlap`: js.UndefOr[PropertyValueSpecification[never | always | cooperative]] = js.undefined
  
  var `icon-padding`: js.UndefOr[DataDrivenPropertyValueSpecification[PaddingSpecification]] = js.undefined
  
  var `icon-pitch-alignment`: js.UndefOr[PropertyValueSpecification[map | viewport | auto]] = js.undefined
  
  var `icon-rotate`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `icon-rotation-alignment`: js.UndefOr[PropertyValueSpecification[map | viewport | auto]] = js.undefined
  
  var `icon-size`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `icon-text-fit`: js.UndefOr[PropertyValueSpecification[none | width | height | both]] = js.undefined
  
  var `icon-text-fit-padding`: js.UndefOr[PropertyValueSpecification[js.Tuple4[Double, Double, Double, Double]]] = js.undefined
  
  var `symbol-avoid-edges`: js.UndefOr[PropertyValueSpecification[Boolean]] = js.undefined
  
  var `symbol-placement`: js.UndefOr[PropertyValueSpecification[point_ | line | `line-center`]] = js.undefined
  
  var `symbol-sort-key`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `symbol-spacing`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `symbol-z-order`: js.UndefOr[PropertyValueSpecification[auto | `viewport-y` | source_]] = js.undefined
  
  var `text-allow-overlap`: js.UndefOr[PropertyValueSpecification[Boolean]] = js.undefined
  
  var `text-anchor`: js.UndefOr[
    DataDrivenPropertyValueSpecification[
      center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
    ]
  ] = js.undefined
  
  var `text-field`: js.UndefOr[DataDrivenPropertyValueSpecification[FormattedSpecification]] = js.undefined
  
  var `text-font`: js.UndefOr[DataDrivenPropertyValueSpecification[js.Array[String]]] = js.undefined
  
  var `text-ignore-placement`: js.UndefOr[PropertyValueSpecification[Boolean]] = js.undefined
  
  var `text-justify`: js.UndefOr[DataDrivenPropertyValueSpecification[auto | left | center | right]] = js.undefined
  
  var `text-keep-upright`: js.UndefOr[PropertyValueSpecification[Boolean]] = js.undefined
  
  var `text-letter-spacing`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `text-line-height`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `text-max-angle`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `text-max-width`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `text-offset`: js.UndefOr[DataDrivenPropertyValueSpecification[js.Tuple2[Double, Double]]] = js.undefined
  
  var `text-optional`: js.UndefOr[PropertyValueSpecification[Boolean]] = js.undefined
  
  var `text-overlap`: js.UndefOr[PropertyValueSpecification[never | always | cooperative]] = js.undefined
  
  var `text-padding`: js.UndefOr[PropertyValueSpecification[Double]] = js.undefined
  
  var `text-pitch-alignment`: js.UndefOr[PropertyValueSpecification[map | viewport | auto]] = js.undefined
  
  var `text-radial-offset`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `text-rotate`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `text-rotation-alignment`: js.UndefOr[PropertyValueSpecification[map | viewport | `viewport-glyph` | auto]] = js.undefined
  
  var `text-size`: js.UndefOr[DataDrivenPropertyValueSpecification[Double]] = js.undefined
  
  var `text-transform`: js.UndefOr[DataDrivenPropertyValueSpecification[none | uppercase | lowercase]] = js.undefined
  
  var `text-variable-anchor`: js.UndefOr[
    PropertyValueSpecification[
      js.Array[
        center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
      ]
    ]
  ] = js.undefined
  
  var `text-writing-mode`: js.UndefOr[PropertyValueSpecification[js.Array[horizontal | vertical]]] = js.undefined
  
  var visibility: js.UndefOr[visible | none] = js.undefined
}
object Iconallowoverlap {
  
  inline def apply(): Iconallowoverlap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Iconallowoverlap]
  }
  
  extension [Self <: Iconallowoverlap](x: Self) {
    
    inline def `setIcon-allow-overlap`(value: PropertyValueSpecification[Boolean]): Self = StObject.set(x, "icon-allow-overlap", value.asInstanceOf[js.Any])
    
    inline def `setIcon-allow-overlapUndefined`: Self = StObject.set(x, "icon-allow-overlap", js.undefined)
    
    inline def `setIcon-anchor`(
      value: DataDrivenPropertyValueSpecification[
          center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
        ]
    ): Self = StObject.set(x, "icon-anchor", value.asInstanceOf[js.Any])
    
    inline def `setIcon-anchorUndefined`: Self = StObject.set(x, "icon-anchor", js.undefined)
    
    inline def `setIcon-anchorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "icon-anchor", js.Array(value*))
    
    inline def `setIcon-ignore-placement`(value: PropertyValueSpecification[Boolean]): Self = StObject.set(x, "icon-ignore-placement", value.asInstanceOf[js.Any])
    
    inline def `setIcon-ignore-placementUndefined`: Self = StObject.set(x, "icon-ignore-placement", js.undefined)
    
    inline def `setIcon-image`(value: DataDrivenPropertyValueSpecification[ResolvedImageSpecification]): Self = StObject.set(x, "icon-image", value.asInstanceOf[js.Any])
    
    inline def `setIcon-imageUndefined`: Self = StObject.set(x, "icon-image", js.undefined)
    
    inline def `setIcon-imageVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "icon-image", js.Array(value*))
    
    inline def `setIcon-keep-upright`(value: PropertyValueSpecification[Boolean]): Self = StObject.set(x, "icon-keep-upright", value.asInstanceOf[js.Any])
    
    inline def `setIcon-keep-uprightUndefined`: Self = StObject.set(x, "icon-keep-upright", js.undefined)
    
    inline def `setIcon-offset`(value: DataDrivenPropertyValueSpecification[js.Tuple2[Double, Double]]): Self = StObject.set(x, "icon-offset", value.asInstanceOf[js.Any])
    
    inline def `setIcon-offsetUndefined`: Self = StObject.set(x, "icon-offset", js.undefined)
    
    inline def `setIcon-offsetVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "icon-offset", js.Array(value*))
    
    inline def `setIcon-optional`(value: PropertyValueSpecification[Boolean]): Self = StObject.set(x, "icon-optional", value.asInstanceOf[js.Any])
    
    inline def `setIcon-optionalUndefined`: Self = StObject.set(x, "icon-optional", js.undefined)
    
    inline def `setIcon-overlap`(value: PropertyValueSpecification[never | always | cooperative]): Self = StObject.set(x, "icon-overlap", value.asInstanceOf[js.Any])
    
    inline def `setIcon-overlapUndefined`: Self = StObject.set(x, "icon-overlap", js.undefined)
    
    inline def `setIcon-padding`(value: DataDrivenPropertyValueSpecification[PaddingSpecification]): Self = StObject.set(x, "icon-padding", value.asInstanceOf[js.Any])
    
    inline def `setIcon-paddingUndefined`: Self = StObject.set(x, "icon-padding", js.undefined)
    
    inline def `setIcon-paddingVarargs`(
      value: (Double | ExpressionSpecification | accumulated | `geometry-type` | `heatmap-density` | id | `line-progress` | ln2 | pi | properties | zoom)*
    ): Self = StObject.set(x, "icon-padding", js.Array(value*))
    
    inline def `setIcon-pitch-alignment`(value: PropertyValueSpecification[map | viewport | auto]): Self = StObject.set(x, "icon-pitch-alignment", value.asInstanceOf[js.Any])
    
    inline def `setIcon-pitch-alignmentUndefined`: Self = StObject.set(x, "icon-pitch-alignment", js.undefined)
    
    inline def `setIcon-rotate`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "icon-rotate", value.asInstanceOf[js.Any])
    
    inline def `setIcon-rotateUndefined`: Self = StObject.set(x, "icon-rotate", js.undefined)
    
    inline def `setIcon-rotateVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "icon-rotate", js.Array(value*))
    
    inline def `setIcon-rotation-alignment`(value: PropertyValueSpecification[map | viewport | auto]): Self = StObject.set(x, "icon-rotation-alignment", value.asInstanceOf[js.Any])
    
    inline def `setIcon-rotation-alignmentUndefined`: Self = StObject.set(x, "icon-rotation-alignment", js.undefined)
    
    inline def `setIcon-size`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "icon-size", value.asInstanceOf[js.Any])
    
    inline def `setIcon-sizeUndefined`: Self = StObject.set(x, "icon-size", js.undefined)
    
    inline def `setIcon-sizeVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "icon-size", js.Array(value*))
    
    inline def `setIcon-text-fit`(value: PropertyValueSpecification[none | width | height | both]): Self = StObject.set(x, "icon-text-fit", value.asInstanceOf[js.Any])
    
    inline def `setIcon-text-fit-padding`(value: PropertyValueSpecification[js.Tuple4[Double, Double, Double, Double]]): Self = StObject.set(x, "icon-text-fit-padding", value.asInstanceOf[js.Any])
    
    inline def `setIcon-text-fit-paddingUndefined`: Self = StObject.set(x, "icon-text-fit-padding", js.undefined)
    
    inline def `setIcon-text-fitUndefined`: Self = StObject.set(x, "icon-text-fit", js.undefined)
    
    inline def `setSymbol-avoid-edges`(value: PropertyValueSpecification[Boolean]): Self = StObject.set(x, "symbol-avoid-edges", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-avoid-edgesUndefined`: Self = StObject.set(x, "symbol-avoid-edges", js.undefined)
    
    inline def `setSymbol-placement`(value: PropertyValueSpecification[point_ | line | `line-center`]): Self = StObject.set(x, "symbol-placement", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-placementUndefined`: Self = StObject.set(x, "symbol-placement", js.undefined)
    
    inline def `setSymbol-sort-key`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "symbol-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-sort-keyUndefined`: Self = StObject.set(x, "symbol-sort-key", js.undefined)
    
    inline def `setSymbol-sort-keyVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "symbol-sort-key", js.Array(value*))
    
    inline def `setSymbol-spacing`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "symbol-spacing", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-spacingUndefined`: Self = StObject.set(x, "symbol-spacing", js.undefined)
    
    inline def `setSymbol-z-order`(value: PropertyValueSpecification[auto | `viewport-y` | source_]): Self = StObject.set(x, "symbol-z-order", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-z-orderUndefined`: Self = StObject.set(x, "symbol-z-order", js.undefined)
    
    inline def `setText-allow-overlap`(value: PropertyValueSpecification[Boolean]): Self = StObject.set(x, "text-allow-overlap", value.asInstanceOf[js.Any])
    
    inline def `setText-allow-overlapUndefined`: Self = StObject.set(x, "text-allow-overlap", js.undefined)
    
    inline def `setText-anchor`(
      value: DataDrivenPropertyValueSpecification[
          center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
        ]
    ): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-anchorUndefined`: Self = StObject.set(x, "text-anchor", js.undefined)
    
    inline def `setText-anchorVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-anchor", js.Array(value*))
    
    inline def `setText-field`(value: DataDrivenPropertyValueSpecification[FormattedSpecification]): Self = StObject.set(x, "text-field", value.asInstanceOf[js.Any])
    
    inline def `setText-fieldUndefined`: Self = StObject.set(x, "text-field", js.undefined)
    
    inline def `setText-fieldVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-field", js.Array(value*))
    
    inline def `setText-font`(value: DataDrivenPropertyValueSpecification[js.Array[String]]): Self = StObject.set(x, "text-font", value.asInstanceOf[js.Any])
    
    inline def `setText-fontUndefined`: Self = StObject.set(x, "text-font", js.undefined)
    
    inline def `setText-fontVarargs`(
      value: (ExpressionSpecification | String | accumulated | `geometry-type` | `heatmap-density` | id | `line-progress` | ln2 | pi | properties | zoom)*
    ): Self = StObject.set(x, "text-font", js.Array(value*))
    
    inline def `setText-ignore-placement`(value: PropertyValueSpecification[Boolean]): Self = StObject.set(x, "text-ignore-placement", value.asInstanceOf[js.Any])
    
    inline def `setText-ignore-placementUndefined`: Self = StObject.set(x, "text-ignore-placement", js.undefined)
    
    inline def `setText-justify`(value: DataDrivenPropertyValueSpecification[auto | left | center | right]): Self = StObject.set(x, "text-justify", value.asInstanceOf[js.Any])
    
    inline def `setText-justifyUndefined`: Self = StObject.set(x, "text-justify", js.undefined)
    
    inline def `setText-justifyVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-justify", js.Array(value*))
    
    inline def `setText-keep-upright`(value: PropertyValueSpecification[Boolean]): Self = StObject.set(x, "text-keep-upright", value.asInstanceOf[js.Any])
    
    inline def `setText-keep-uprightUndefined`: Self = StObject.set(x, "text-keep-upright", js.undefined)
    
    inline def `setText-letter-spacing`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "text-letter-spacing", value.asInstanceOf[js.Any])
    
    inline def `setText-letter-spacingUndefined`: Self = StObject.set(x, "text-letter-spacing", js.undefined)
    
    inline def `setText-letter-spacingVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-letter-spacing", js.Array(value*))
    
    inline def `setText-line-height`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "text-line-height", value.asInstanceOf[js.Any])
    
    inline def `setText-line-heightUndefined`: Self = StObject.set(x, "text-line-height", js.undefined)
    
    inline def `setText-max-angle`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "text-max-angle", value.asInstanceOf[js.Any])
    
    inline def `setText-max-angleUndefined`: Self = StObject.set(x, "text-max-angle", js.undefined)
    
    inline def `setText-max-width`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "text-max-width", value.asInstanceOf[js.Any])
    
    inline def `setText-max-widthUndefined`: Self = StObject.set(x, "text-max-width", js.undefined)
    
    inline def `setText-max-widthVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-max-width", js.Array(value*))
    
    inline def `setText-offset`(value: DataDrivenPropertyValueSpecification[js.Tuple2[Double, Double]]): Self = StObject.set(x, "text-offset", value.asInstanceOf[js.Any])
    
    inline def `setText-offsetUndefined`: Self = StObject.set(x, "text-offset", js.undefined)
    
    inline def `setText-offsetVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-offset", js.Array(value*))
    
    inline def `setText-optional`(value: PropertyValueSpecification[Boolean]): Self = StObject.set(x, "text-optional", value.asInstanceOf[js.Any])
    
    inline def `setText-optionalUndefined`: Self = StObject.set(x, "text-optional", js.undefined)
    
    inline def `setText-overlap`(value: PropertyValueSpecification[never | always | cooperative]): Self = StObject.set(x, "text-overlap", value.asInstanceOf[js.Any])
    
    inline def `setText-overlapUndefined`: Self = StObject.set(x, "text-overlap", js.undefined)
    
    inline def `setText-padding`(value: PropertyValueSpecification[Double]): Self = StObject.set(x, "text-padding", value.asInstanceOf[js.Any])
    
    inline def `setText-paddingUndefined`: Self = StObject.set(x, "text-padding", js.undefined)
    
    inline def `setText-pitch-alignment`(value: PropertyValueSpecification[map | viewport | auto]): Self = StObject.set(x, "text-pitch-alignment", value.asInstanceOf[js.Any])
    
    inline def `setText-pitch-alignmentUndefined`: Self = StObject.set(x, "text-pitch-alignment", js.undefined)
    
    inline def `setText-radial-offset`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "text-radial-offset", value.asInstanceOf[js.Any])
    
    inline def `setText-radial-offsetUndefined`: Self = StObject.set(x, "text-radial-offset", js.undefined)
    
    inline def `setText-radial-offsetVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-radial-offset", js.Array(value*))
    
    inline def `setText-rotate`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "text-rotate", value.asInstanceOf[js.Any])
    
    inline def `setText-rotateUndefined`: Self = StObject.set(x, "text-rotate", js.undefined)
    
    inline def `setText-rotateVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-rotate", js.Array(value*))
    
    inline def `setText-rotation-alignment`(value: PropertyValueSpecification[map | viewport | `viewport-glyph` | auto]): Self = StObject.set(x, "text-rotation-alignment", value.asInstanceOf[js.Any])
    
    inline def `setText-rotation-alignmentUndefined`: Self = StObject.set(x, "text-rotation-alignment", js.undefined)
    
    inline def `setText-size`(value: DataDrivenPropertyValueSpecification[Double]): Self = StObject.set(x, "text-size", value.asInstanceOf[js.Any])
    
    inline def `setText-sizeUndefined`: Self = StObject.set(x, "text-size", js.undefined)
    
    inline def `setText-sizeVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-size", js.Array(value*))
    
    inline def `setText-transform`(value: DataDrivenPropertyValueSpecification[none | uppercase | lowercase]): Self = StObject.set(x, "text-transform", value.asInstanceOf[js.Any])
    
    inline def `setText-transformUndefined`: Self = StObject.set(x, "text-transform", js.undefined)
    
    inline def `setText-transformVarargs`(
      value: (accumulated | `geometry-type` | id | `line-progress` | properties | ExpressionSpecification | ln2 | pi | zoom | `heatmap-density`)*
    ): Self = StObject.set(x, "text-transform", js.Array(value*))
    
    inline def `setText-variable-anchor`(
      value: PropertyValueSpecification[
          js.Array[
            center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
          ]
        ]
    ): Self = StObject.set(x, "text-variable-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-variable-anchorUndefined`: Self = StObject.set(x, "text-variable-anchor", js.undefined)
    
    inline def `setText-variable-anchorVarargs`(
      value: (center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`)*
    ): Self = StObject.set(x, "text-variable-anchor", js.Array(value*))
    
    inline def `setText-writing-mode`(value: PropertyValueSpecification[js.Array[horizontal | vertical]]): Self = StObject.set(x, "text-writing-mode", value.asInstanceOf[js.Any])
    
    inline def `setText-writing-modeUndefined`: Self = StObject.set(x, "text-writing-mode", js.undefined)
    
    inline def `setText-writing-modeVarargs`(value: (horizontal | vertical)*): Self = StObject.set(x, "text-writing-mode", js.Array(value*))
    
    inline def setVisibility(value: visible | none): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    
    inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
  }
}
