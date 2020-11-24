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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolLayout
  extends Layout
     with _AnyLayout {
  
  var `icon-allow-overlap`: js.UndefOr[Boolean | StyleFunction | Expression] = js.native
  
  var `icon-anchor`: js.UndefOr[Anchor | StyleFunction | Expression] = js.native
  
  var `icon-ignore-placement`: js.UndefOr[Boolean] = js.native
  
  var `icon-image`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `icon-keep-upright`: js.UndefOr[Boolean] = js.native
  
  var `icon-offset`: js.UndefOr[js.Array[Double] | StyleFunction | Expression] = js.native
  
  var `icon-optional`: js.UndefOr[Boolean] = js.native
  
  var `icon-padding`: js.UndefOr[Double | Expression] = js.native
  
  var `icon-pitch-alignment`: js.UndefOr[map | viewport | auto] = js.native
  
  var `icon-rotate`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `icon-rotation-alignment`: js.UndefOr[map | viewport | auto] = js.native
  
  var `icon-size`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `icon-text-fit`: js.UndefOr[none | both | width | height] = js.native
  
  var `icon-text-fit-padding`: js.UndefOr[js.Array[Double] | Expression] = js.native
  
  var `symbol-avoid-edges`: js.UndefOr[Boolean] = js.native
  
  var `symbol-placement`: js.UndefOr[point | line | `line-center`] = js.native
  
  var `symbol-sort-key`: js.UndefOr[Double | Expression] = js.native
  
  var `symbol-spacing`: js.UndefOr[Double | Expression] = js.native
  
  var `symbol-z-order`: js.UndefOr[`viewport-y` | source_] = js.native
  
  var `text-allow-overlap`: js.UndefOr[Boolean] = js.native
  
  var `text-anchor`: js.UndefOr[Anchor | StyleFunction | Expression] = js.native
  
  var `text-field`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `text-font`: js.UndefOr[String | js.Array[String] | Expression] = js.native
  
  var `text-ignore-placement`: js.UndefOr[Boolean] = js.native
  
  var `text-justify`: js.UndefOr[left | center | right | Expression] = js.native
  
  var `text-keep-upright`: js.UndefOr[Boolean] = js.native
  
  var `text-letter-spacing`: js.UndefOr[Double | Expression] = js.native
  
  var `text-line-height`: js.UndefOr[Double | Expression] = js.native
  
  var `text-max-angle`: js.UndefOr[Double | Expression] = js.native
  
  var `text-max-width`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `text-offset`: js.UndefOr[js.Array[Double] | Expression] = js.native
  
  var `text-optional`: js.UndefOr[Boolean] = js.native
  
  var `text-padding`: js.UndefOr[Double | Expression] = js.native
  
  var `text-pitch-alignment`: js.UndefOr[map | viewport | auto] = js.native
  
  var `text-radial-offset`: js.UndefOr[Double | Expression] = js.native
  
  var `text-rotate`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `text-rotation-alignment`: js.UndefOr[map | viewport | auto] = js.native
  
  var `text-size`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `text-transform`: js.UndefOr[none | uppercase | lowercase | StyleFunction | Expression] = js.native
  
  var `text-variable-anchor`: js.UndefOr[js.Array[Anchor]] = js.native
  
  var `text-writing-mode`: js.UndefOr[js.Array[horizontal | vertical]] = js.native
}
object SymbolLayout {
  
  @scala.inline
  def apply(): SymbolLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolLayout]
  }
  
  @scala.inline
  implicit class SymbolLayoutOps[Self <: SymbolLayout] (val x: Self) extends AnyVal {
    
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
    def `setIcon-allow-overlap`(value: Boolean | StyleFunction | Expression): Self = this.set("icon-allow-overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-allow-overlap`: Self = this.set("icon-allow-overlap", js.undefined)
    
    @scala.inline
    def `setIcon-anchor`(value: Anchor | StyleFunction | Expression): Self = this.set("icon-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-anchor`: Self = this.set("icon-anchor", js.undefined)
    
    @scala.inline
    def `setIcon-ignore-placement`(value: Boolean): Self = this.set("icon-ignore-placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-ignore-placement`: Self = this.set("icon-ignore-placement", js.undefined)
    
    @scala.inline
    def `setIcon-image`(value: String | StyleFunction | Expression): Self = this.set("icon-image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-image`: Self = this.set("icon-image", js.undefined)
    
    @scala.inline
    def `setIcon-keep-upright`(value: Boolean): Self = this.set("icon-keep-upright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-keep-upright`: Self = this.set("icon-keep-upright", js.undefined)
    
    @scala.inline
    def `setIcon-offsetVarargs`(value: Double*): Self = this.set("icon-offset", js.Array(value :_*))
    
    @scala.inline
    def `setIcon-offset`(value: js.Array[Double] | StyleFunction | Expression): Self = this.set("icon-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-offset`: Self = this.set("icon-offset", js.undefined)
    
    @scala.inline
    def `setIcon-optional`(value: Boolean): Self = this.set("icon-optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-optional`: Self = this.set("icon-optional", js.undefined)
    
    @scala.inline
    def `setIcon-padding`(value: Double | Expression): Self = this.set("icon-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-padding`: Self = this.set("icon-padding", js.undefined)
    
    @scala.inline
    def `setIcon-pitch-alignment`(value: map | viewport | auto): Self = this.set("icon-pitch-alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-pitch-alignment`: Self = this.set("icon-pitch-alignment", js.undefined)
    
    @scala.inline
    def `setIcon-rotate`(value: Double | StyleFunction | Expression): Self = this.set("icon-rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-rotate`: Self = this.set("icon-rotate", js.undefined)
    
    @scala.inline
    def `setIcon-rotation-alignment`(value: map | viewport | auto): Self = this.set("icon-rotation-alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-rotation-alignment`: Self = this.set("icon-rotation-alignment", js.undefined)
    
    @scala.inline
    def `setIcon-size`(value: Double | StyleFunction | Expression): Self = this.set("icon-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-size`: Self = this.set("icon-size", js.undefined)
    
    @scala.inline
    def `setIcon-text-fit`(value: none | both | width | height): Self = this.set("icon-text-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-text-fit`: Self = this.set("icon-text-fit", js.undefined)
    
    @scala.inline
    def `setIcon-text-fit-paddingVarargs`(value: Double*): Self = this.set("icon-text-fit-padding", js.Array(value :_*))
    
    @scala.inline
    def `setIcon-text-fit-padding`(value: js.Array[Double] | Expression): Self = this.set("icon-text-fit-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-text-fit-padding`: Self = this.set("icon-text-fit-padding", js.undefined)
    
    @scala.inline
    def `setSymbol-avoid-edges`(value: Boolean): Self = this.set("symbol-avoid-edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSymbol-avoid-edges`: Self = this.set("symbol-avoid-edges", js.undefined)
    
    @scala.inline
    def `setSymbol-placement`(value: point | line | `line-center`): Self = this.set("symbol-placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSymbol-placement`: Self = this.set("symbol-placement", js.undefined)
    
    @scala.inline
    def `setSymbol-sort-key`(value: Double | Expression): Self = this.set("symbol-sort-key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSymbol-sort-key`: Self = this.set("symbol-sort-key", js.undefined)
    
    @scala.inline
    def `setSymbol-spacing`(value: Double | Expression): Self = this.set("symbol-spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSymbol-spacing`: Self = this.set("symbol-spacing", js.undefined)
    
    @scala.inline
    def `setSymbol-z-order`(value: `viewport-y` | source_): Self = this.set("symbol-z-order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteSymbol-z-order`: Self = this.set("symbol-z-order", js.undefined)
    
    @scala.inline
    def `setText-allow-overlap`(value: Boolean): Self = this.set("text-allow-overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-allow-overlap`: Self = this.set("text-allow-overlap", js.undefined)
    
    @scala.inline
    def `setText-anchor`(value: Anchor | StyleFunction | Expression): Self = this.set("text-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-anchor`: Self = this.set("text-anchor", js.undefined)
    
    @scala.inline
    def `setText-field`(value: String | StyleFunction | Expression): Self = this.set("text-field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-field`: Self = this.set("text-field", js.undefined)
    
    @scala.inline
    def `setText-fontVarargs`(value: String*): Self = this.set("text-font", js.Array(value :_*))
    
    @scala.inline
    def `setText-font`(value: String | js.Array[String] | Expression): Self = this.set("text-font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-font`: Self = this.set("text-font", js.undefined)
    
    @scala.inline
    def `setText-ignore-placement`(value: Boolean): Self = this.set("text-ignore-placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-ignore-placement`: Self = this.set("text-ignore-placement", js.undefined)
    
    @scala.inline
    def `setText-justify`(value: left | center | right | Expression): Self = this.set("text-justify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-justify`: Self = this.set("text-justify", js.undefined)
    
    @scala.inline
    def `setText-keep-upright`(value: Boolean): Self = this.set("text-keep-upright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-keep-upright`: Self = this.set("text-keep-upright", js.undefined)
    
    @scala.inline
    def `setText-letter-spacing`(value: Double | Expression): Self = this.set("text-letter-spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-letter-spacing`: Self = this.set("text-letter-spacing", js.undefined)
    
    @scala.inline
    def `setText-line-height`(value: Double | Expression): Self = this.set("text-line-height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-line-height`: Self = this.set("text-line-height", js.undefined)
    
    @scala.inline
    def `setText-max-angle`(value: Double | Expression): Self = this.set("text-max-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-max-angle`: Self = this.set("text-max-angle", js.undefined)
    
    @scala.inline
    def `setText-max-width`(value: Double | StyleFunction | Expression): Self = this.set("text-max-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-max-width`: Self = this.set("text-max-width", js.undefined)
    
    @scala.inline
    def `setText-offsetVarargs`(value: Double*): Self = this.set("text-offset", js.Array(value :_*))
    
    @scala.inline
    def `setText-offset`(value: js.Array[Double] | Expression): Self = this.set("text-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-offset`: Self = this.set("text-offset", js.undefined)
    
    @scala.inline
    def `setText-optional`(value: Boolean): Self = this.set("text-optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-optional`: Self = this.set("text-optional", js.undefined)
    
    @scala.inline
    def `setText-padding`(value: Double | Expression): Self = this.set("text-padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-padding`: Self = this.set("text-padding", js.undefined)
    
    @scala.inline
    def `setText-pitch-alignment`(value: map | viewport | auto): Self = this.set("text-pitch-alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-pitch-alignment`: Self = this.set("text-pitch-alignment", js.undefined)
    
    @scala.inline
    def `setText-radial-offset`(value: Double | Expression): Self = this.set("text-radial-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-radial-offset`: Self = this.set("text-radial-offset", js.undefined)
    
    @scala.inline
    def `setText-rotate`(value: Double | StyleFunction | Expression): Self = this.set("text-rotate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-rotate`: Self = this.set("text-rotate", js.undefined)
    
    @scala.inline
    def `setText-rotation-alignment`(value: map | viewport | auto): Self = this.set("text-rotation-alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-rotation-alignment`: Self = this.set("text-rotation-alignment", js.undefined)
    
    @scala.inline
    def `setText-size`(value: Double | StyleFunction | Expression): Self = this.set("text-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-size`: Self = this.set("text-size", js.undefined)
    
    @scala.inline
    def `setText-transform`(value: none | uppercase | lowercase | StyleFunction | Expression): Self = this.set("text-transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-transform`: Self = this.set("text-transform", js.undefined)
    
    @scala.inline
    def `setText-variable-anchorVarargs`(value: Anchor*): Self = this.set("text-variable-anchor", js.Array(value :_*))
    
    @scala.inline
    def `setText-variable-anchor`(value: js.Array[Anchor]): Self = this.set("text-variable-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-variable-anchor`: Self = this.set("text-variable-anchor", js.undefined)
    
    @scala.inline
    def `setText-writing-modeVarargs`(value: (horizontal | vertical)*): Self = this.set("text-writing-mode", js.Array(value :_*))
    
    @scala.inline
    def `setText-writing-mode`(value: js.Array[horizontal | vertical]): Self = this.set("text-writing-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-writing-mode`: Self = this.set("text-writing-mode", js.undefined)
  }
}
