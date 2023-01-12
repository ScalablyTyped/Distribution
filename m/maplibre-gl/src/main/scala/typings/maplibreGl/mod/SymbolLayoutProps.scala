package typings.maplibreGl.mod

import typings.maplibreGl.maplibreGlStrings.`bottom-left`
import typings.maplibreGl.maplibreGlStrings.`bottom-right`
import typings.maplibreGl.maplibreGlStrings.`line-center`
import typings.maplibreGl.maplibreGlStrings.`top-left`
import typings.maplibreGl.maplibreGlStrings.`top-right`
import typings.maplibreGl.maplibreGlStrings.`viewport-glyph`
import typings.maplibreGl.maplibreGlStrings.`viewport-y`
import typings.maplibreGl.maplibreGlStrings.always
import typings.maplibreGl.maplibreGlStrings.auto
import typings.maplibreGl.maplibreGlStrings.both
import typings.maplibreGl.maplibreGlStrings.bottom
import typings.maplibreGl.maplibreGlStrings.center
import typings.maplibreGl.maplibreGlStrings.cooperative
import typings.maplibreGl.maplibreGlStrings.height
import typings.maplibreGl.maplibreGlStrings.horizontal
import typings.maplibreGl.maplibreGlStrings.left
import typings.maplibreGl.maplibreGlStrings.line
import typings.maplibreGl.maplibreGlStrings.lowercase
import typings.maplibreGl.maplibreGlStrings.map
import typings.maplibreGl.maplibreGlStrings.never
import typings.maplibreGl.maplibreGlStrings.none
import typings.maplibreGl.maplibreGlStrings.point_
import typings.maplibreGl.maplibreGlStrings.right
import typings.maplibreGl.maplibreGlStrings.source_
import typings.maplibreGl.maplibreGlStrings.top
import typings.maplibreGl.maplibreGlStrings.uppercase
import typings.maplibreGl.maplibreGlStrings.vertical
import typings.maplibreGl.maplibreGlStrings.viewport
import typings.maplibreGl.maplibreGlStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SymbolLayoutProps extends StObject {
  
  var `icon-allow-overlap`: DataConstantProperty[Boolean]
  
  var `icon-anchor`: DataDrivenProperty[
    center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
  ]
  
  var `icon-ignore-placement`: DataConstantProperty[Boolean]
  
  var `icon-image`: DataDrivenProperty[ResolvedImage]
  
  var `icon-keep-upright`: DataConstantProperty[Boolean]
  
  var `icon-offset`: DataDrivenProperty[js.Tuple2[Double, Double]]
  
  var `icon-optional`: DataConstantProperty[Boolean]
  
  var `icon-overlap`: DataConstantProperty[never | always | cooperative]
  
  var `icon-padding`: DataDrivenProperty[Padding]
  
  var `icon-pitch-alignment`: DataConstantProperty[map | viewport | auto]
  
  var `icon-rotate`: DataDrivenProperty[Double]
  
  var `icon-rotation-alignment`: DataConstantProperty[map | viewport | auto]
  
  var `icon-size`: DataDrivenProperty[Double]
  
  var `icon-text-fit`: DataConstantProperty[none | width | height | both]
  
  var `icon-text-fit-padding`: DataConstantProperty[js.Tuple4[Double, Double, Double, Double]]
  
  var `symbol-avoid-edges`: DataConstantProperty[Boolean]
  
  var `symbol-placement`: DataConstantProperty[point_ | line | `line-center`]
  
  var `symbol-sort-key`: DataDrivenProperty[Double]
  
  var `symbol-spacing`: DataConstantProperty[Double]
  
  var `symbol-z-order`: DataConstantProperty[auto | `viewport-y` | source_]
  
  var `text-allow-overlap`: DataConstantProperty[Boolean]
  
  var `text-anchor`: DataDrivenProperty[
    center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
  ]
  
  var `text-field`: DataDrivenProperty[Formatted]
  
  var `text-font`: DataDrivenProperty[js.Array[String]]
  
  var `text-ignore-placement`: DataConstantProperty[Boolean]
  
  var `text-justify`: DataDrivenProperty[auto | left | center | right]
  
  var `text-keep-upright`: DataConstantProperty[Boolean]
  
  var `text-letter-spacing`: DataDrivenProperty[Double]
  
  var `text-line-height`: DataConstantProperty[Double]
  
  var `text-max-angle`: DataConstantProperty[Double]
  
  var `text-max-width`: DataDrivenProperty[Double]
  
  var `text-offset`: DataDrivenProperty[js.Tuple2[Double, Double]]
  
  var `text-optional`: DataConstantProperty[Boolean]
  
  var `text-overlap`: DataConstantProperty[never | always | cooperative]
  
  var `text-padding`: DataConstantProperty[Double]
  
  var `text-pitch-alignment`: DataConstantProperty[map | viewport | auto]
  
  var `text-radial-offset`: DataDrivenProperty[Double]
  
  var `text-rotate`: DataDrivenProperty[Double]
  
  var `text-rotation-alignment`: DataConstantProperty[map | viewport | `viewport-glyph` | auto]
  
  var `text-size`: DataDrivenProperty[Double]
  
  var `text-transform`: DataDrivenProperty[none | uppercase | lowercase]
  
  var `text-variable-anchor`: DataConstantProperty[
    js.Array[
      center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
    ]
  ]
  
  var `text-writing-mode`: DataConstantProperty[js.Array[horizontal | vertical]]
}
object SymbolLayoutProps {
  
  inline def apply(
    `icon-allow-overlap`: DataConstantProperty[Boolean],
    `icon-anchor`: DataDrivenProperty[
      center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
    ],
    `icon-ignore-placement`: DataConstantProperty[Boolean],
    `icon-image`: DataDrivenProperty[ResolvedImage],
    `icon-keep-upright`: DataConstantProperty[Boolean],
    `icon-offset`: DataDrivenProperty[js.Tuple2[Double, Double]],
    `icon-optional`: DataConstantProperty[Boolean],
    `icon-overlap`: DataConstantProperty[never | always | cooperative],
    `icon-padding`: DataDrivenProperty[Padding],
    `icon-pitch-alignment`: DataConstantProperty[map | viewport | auto],
    `icon-rotate`: DataDrivenProperty[Double],
    `icon-rotation-alignment`: DataConstantProperty[map | viewport | auto],
    `icon-size`: DataDrivenProperty[Double],
    `icon-text-fit`: DataConstantProperty[none | width | height | both],
    `icon-text-fit-padding`: DataConstantProperty[js.Tuple4[Double, Double, Double, Double]],
    `symbol-avoid-edges`: DataConstantProperty[Boolean],
    `symbol-placement`: DataConstantProperty[point_ | line | `line-center`],
    `symbol-sort-key`: DataDrivenProperty[Double],
    `symbol-spacing`: DataConstantProperty[Double],
    `symbol-z-order`: DataConstantProperty[auto | `viewport-y` | source_],
    `text-allow-overlap`: DataConstantProperty[Boolean],
    `text-anchor`: DataDrivenProperty[
      center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
    ],
    `text-field`: DataDrivenProperty[Formatted],
    `text-font`: DataDrivenProperty[js.Array[String]],
    `text-ignore-placement`: DataConstantProperty[Boolean],
    `text-justify`: DataDrivenProperty[auto | left | center | right],
    `text-keep-upright`: DataConstantProperty[Boolean],
    `text-letter-spacing`: DataDrivenProperty[Double],
    `text-line-height`: DataConstantProperty[Double],
    `text-max-angle`: DataConstantProperty[Double],
    `text-max-width`: DataDrivenProperty[Double],
    `text-offset`: DataDrivenProperty[js.Tuple2[Double, Double]],
    `text-optional`: DataConstantProperty[Boolean],
    `text-overlap`: DataConstantProperty[never | always | cooperative],
    `text-padding`: DataConstantProperty[Double],
    `text-pitch-alignment`: DataConstantProperty[map | viewport | auto],
    `text-radial-offset`: DataDrivenProperty[Double],
    `text-rotate`: DataDrivenProperty[Double],
    `text-rotation-alignment`: DataConstantProperty[map | viewport | `viewport-glyph` | auto],
    `text-size`: DataDrivenProperty[Double],
    `text-transform`: DataDrivenProperty[none | uppercase | lowercase],
    `text-variable-anchor`: DataConstantProperty[
      js.Array[
        center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
      ]
    ],
    `text-writing-mode`: DataConstantProperty[js.Array[horizontal | vertical]]
  ): SymbolLayoutProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("icon-allow-overlap")(`icon-allow-overlap`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-anchor")(`icon-anchor`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-ignore-placement")(`icon-ignore-placement`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-image")(`icon-image`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-keep-upright")(`icon-keep-upright`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-offset")(`icon-offset`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-optional")(`icon-optional`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-overlap")(`icon-overlap`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-padding")(`icon-padding`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-pitch-alignment")(`icon-pitch-alignment`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-rotate")(`icon-rotate`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-rotation-alignment")(`icon-rotation-alignment`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-size")(`icon-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-text-fit")(`icon-text-fit`.asInstanceOf[js.Any])
    __obj.updateDynamic("icon-text-fit-padding")(`icon-text-fit-padding`.asInstanceOf[js.Any])
    __obj.updateDynamic("symbol-avoid-edges")(`symbol-avoid-edges`.asInstanceOf[js.Any])
    __obj.updateDynamic("symbol-placement")(`symbol-placement`.asInstanceOf[js.Any])
    __obj.updateDynamic("symbol-sort-key")(`symbol-sort-key`.asInstanceOf[js.Any])
    __obj.updateDynamic("symbol-spacing")(`symbol-spacing`.asInstanceOf[js.Any])
    __obj.updateDynamic("symbol-z-order")(`symbol-z-order`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-allow-overlap")(`text-allow-overlap`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-anchor")(`text-anchor`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-field")(`text-field`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-font")(`text-font`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-ignore-placement")(`text-ignore-placement`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-justify")(`text-justify`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-keep-upright")(`text-keep-upright`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-letter-spacing")(`text-letter-spacing`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-line-height")(`text-line-height`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-max-angle")(`text-max-angle`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-max-width")(`text-max-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-offset")(`text-offset`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-optional")(`text-optional`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-overlap")(`text-overlap`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-padding")(`text-padding`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-pitch-alignment")(`text-pitch-alignment`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-radial-offset")(`text-radial-offset`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-rotate")(`text-rotate`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-rotation-alignment")(`text-rotation-alignment`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-size")(`text-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-transform")(`text-transform`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-variable-anchor")(`text-variable-anchor`.asInstanceOf[js.Any])
    __obj.updateDynamic("text-writing-mode")(`text-writing-mode`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolLayoutProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SymbolLayoutProps] (val x: Self) extends AnyVal {
    
    inline def `setIcon-allow-overlap`(value: DataConstantProperty[Boolean]): Self = StObject.set(x, "icon-allow-overlap", value.asInstanceOf[js.Any])
    
    inline def `setIcon-anchor`(
      value: DataDrivenProperty[
          center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
        ]
    ): Self = StObject.set(x, "icon-anchor", value.asInstanceOf[js.Any])
    
    inline def `setIcon-ignore-placement`(value: DataConstantProperty[Boolean]): Self = StObject.set(x, "icon-ignore-placement", value.asInstanceOf[js.Any])
    
    inline def `setIcon-image`(value: DataDrivenProperty[ResolvedImage]): Self = StObject.set(x, "icon-image", value.asInstanceOf[js.Any])
    
    inline def `setIcon-keep-upright`(value: DataConstantProperty[Boolean]): Self = StObject.set(x, "icon-keep-upright", value.asInstanceOf[js.Any])
    
    inline def `setIcon-offset`(value: DataDrivenProperty[js.Tuple2[Double, Double]]): Self = StObject.set(x, "icon-offset", value.asInstanceOf[js.Any])
    
    inline def `setIcon-optional`(value: DataConstantProperty[Boolean]): Self = StObject.set(x, "icon-optional", value.asInstanceOf[js.Any])
    
    inline def `setIcon-overlap`(value: DataConstantProperty[never | always | cooperative]): Self = StObject.set(x, "icon-overlap", value.asInstanceOf[js.Any])
    
    inline def `setIcon-padding`(value: DataDrivenProperty[Padding]): Self = StObject.set(x, "icon-padding", value.asInstanceOf[js.Any])
    
    inline def `setIcon-pitch-alignment`(value: DataConstantProperty[map | viewport | auto]): Self = StObject.set(x, "icon-pitch-alignment", value.asInstanceOf[js.Any])
    
    inline def `setIcon-rotate`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "icon-rotate", value.asInstanceOf[js.Any])
    
    inline def `setIcon-rotation-alignment`(value: DataConstantProperty[map | viewport | auto]): Self = StObject.set(x, "icon-rotation-alignment", value.asInstanceOf[js.Any])
    
    inline def `setIcon-size`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "icon-size", value.asInstanceOf[js.Any])
    
    inline def `setIcon-text-fit`(value: DataConstantProperty[none | width | height | both]): Self = StObject.set(x, "icon-text-fit", value.asInstanceOf[js.Any])
    
    inline def `setIcon-text-fit-padding`(value: DataConstantProperty[js.Tuple4[Double, Double, Double, Double]]): Self = StObject.set(x, "icon-text-fit-padding", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-avoid-edges`(value: DataConstantProperty[Boolean]): Self = StObject.set(x, "symbol-avoid-edges", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-placement`(value: DataConstantProperty[point_ | line | `line-center`]): Self = StObject.set(x, "symbol-placement", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-sort-key`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "symbol-sort-key", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-spacing`(value: DataConstantProperty[Double]): Self = StObject.set(x, "symbol-spacing", value.asInstanceOf[js.Any])
    
    inline def `setSymbol-z-order`(value: DataConstantProperty[auto | `viewport-y` | source_]): Self = StObject.set(x, "symbol-z-order", value.asInstanceOf[js.Any])
    
    inline def `setText-allow-overlap`(value: DataConstantProperty[Boolean]): Self = StObject.set(x, "text-allow-overlap", value.asInstanceOf[js.Any])
    
    inline def `setText-anchor`(
      value: DataDrivenProperty[
          center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
        ]
    ): Self = StObject.set(x, "text-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-field`(value: DataDrivenProperty[Formatted]): Self = StObject.set(x, "text-field", value.asInstanceOf[js.Any])
    
    inline def `setText-font`(value: DataDrivenProperty[js.Array[String]]): Self = StObject.set(x, "text-font", value.asInstanceOf[js.Any])
    
    inline def `setText-ignore-placement`(value: DataConstantProperty[Boolean]): Self = StObject.set(x, "text-ignore-placement", value.asInstanceOf[js.Any])
    
    inline def `setText-justify`(value: DataDrivenProperty[auto | left | center | right]): Self = StObject.set(x, "text-justify", value.asInstanceOf[js.Any])
    
    inline def `setText-keep-upright`(value: DataConstantProperty[Boolean]): Self = StObject.set(x, "text-keep-upright", value.asInstanceOf[js.Any])
    
    inline def `setText-letter-spacing`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "text-letter-spacing", value.asInstanceOf[js.Any])
    
    inline def `setText-line-height`(value: DataConstantProperty[Double]): Self = StObject.set(x, "text-line-height", value.asInstanceOf[js.Any])
    
    inline def `setText-max-angle`(value: DataConstantProperty[Double]): Self = StObject.set(x, "text-max-angle", value.asInstanceOf[js.Any])
    
    inline def `setText-max-width`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "text-max-width", value.asInstanceOf[js.Any])
    
    inline def `setText-offset`(value: DataDrivenProperty[js.Tuple2[Double, Double]]): Self = StObject.set(x, "text-offset", value.asInstanceOf[js.Any])
    
    inline def `setText-optional`(value: DataConstantProperty[Boolean]): Self = StObject.set(x, "text-optional", value.asInstanceOf[js.Any])
    
    inline def `setText-overlap`(value: DataConstantProperty[never | always | cooperative]): Self = StObject.set(x, "text-overlap", value.asInstanceOf[js.Any])
    
    inline def `setText-padding`(value: DataConstantProperty[Double]): Self = StObject.set(x, "text-padding", value.asInstanceOf[js.Any])
    
    inline def `setText-pitch-alignment`(value: DataConstantProperty[map | viewport | auto]): Self = StObject.set(x, "text-pitch-alignment", value.asInstanceOf[js.Any])
    
    inline def `setText-radial-offset`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "text-radial-offset", value.asInstanceOf[js.Any])
    
    inline def `setText-rotate`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "text-rotate", value.asInstanceOf[js.Any])
    
    inline def `setText-rotation-alignment`(value: DataConstantProperty[map | viewport | `viewport-glyph` | auto]): Self = StObject.set(x, "text-rotation-alignment", value.asInstanceOf[js.Any])
    
    inline def `setText-size`(value: DataDrivenProperty[Double]): Self = StObject.set(x, "text-size", value.asInstanceOf[js.Any])
    
    inline def `setText-transform`(value: DataDrivenProperty[none | uppercase | lowercase]): Self = StObject.set(x, "text-transform", value.asInstanceOf[js.Any])
    
    inline def `setText-variable-anchor`(
      value: DataConstantProperty[
          js.Array[
            center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
          ]
        ]
    ): Self = StObject.set(x, "text-variable-anchor", value.asInstanceOf[js.Any])
    
    inline def `setText-writing-mode`(value: DataConstantProperty[js.Array[horizontal | vertical]]): Self = StObject.set(x, "text-writing-mode", value.asInstanceOf[js.Any])
  }
}
