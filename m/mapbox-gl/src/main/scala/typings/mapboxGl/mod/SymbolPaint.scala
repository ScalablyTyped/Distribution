package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.map
import typings.mapboxGl.mapboxGlStrings.viewport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymbolPaint extends AnyPaint {
  
  var `icon-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `icon-color-transition`: js.UndefOr[Transition] = js.native
  
  var `icon-halo-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `icon-halo-blur-transition`: js.UndefOr[Transition] = js.native
  
  var `icon-halo-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `icon-halo-color-transition`: js.UndefOr[Transition] = js.native
  
  var `icon-halo-width`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `icon-halo-width-transition`: js.UndefOr[Transition] = js.native
  
  var `icon-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `icon-opacity-transition`: js.UndefOr[Transition] = js.native
  
  var `icon-translate`: js.UndefOr[js.Array[Double] | Expression] = js.native
  
  var `icon-translate-anchor`: js.UndefOr[map | viewport] = js.native
  
  var `icon-translate-transition`: js.UndefOr[Transition] = js.native
  
  var `text-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `text-color-transition`: js.UndefOr[Transition] = js.native
  
  var `text-halo-blur`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `text-halo-blur-transition`: js.UndefOr[Transition] = js.native
  
  var `text-halo-color`: js.UndefOr[String | StyleFunction | Expression] = js.native
  
  var `text-halo-color-transition`: js.UndefOr[Transition] = js.native
  
  var `text-halo-width`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `text-halo-width-transition`: js.UndefOr[Transition] = js.native
  
  var `text-opacity`: js.UndefOr[Double | StyleFunction | Expression] = js.native
  
  var `text-opacity-transition`: js.UndefOr[Transition] = js.native
  
  var `text-translate`: js.UndefOr[js.Array[Double] | Expression] = js.native
  
  var `text-translate-anchor`: js.UndefOr[map | viewport] = js.native
  
  var `text-translate-transition`: js.UndefOr[Transition] = js.native
}
object SymbolPaint {
  
  @scala.inline
  def apply(): SymbolPaint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SymbolPaint]
  }
  
  @scala.inline
  implicit class SymbolPaintOps[Self <: SymbolPaint] (val x: Self) extends AnyVal {
    
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
    def `setIcon-color`(value: String | StyleFunction | Expression): Self = this.set("icon-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-color`: Self = this.set("icon-color", js.undefined)
    
    @scala.inline
    def `setIcon-color-transition`(value: Transition): Self = this.set("icon-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-color-transition`: Self = this.set("icon-color-transition", js.undefined)
    
    @scala.inline
    def `setIcon-halo-blur`(value: Double | StyleFunction | Expression): Self = this.set("icon-halo-blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-halo-blur`: Self = this.set("icon-halo-blur", js.undefined)
    
    @scala.inline
    def `setIcon-halo-blur-transition`(value: Transition): Self = this.set("icon-halo-blur-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-halo-blur-transition`: Self = this.set("icon-halo-blur-transition", js.undefined)
    
    @scala.inline
    def `setIcon-halo-color`(value: String | StyleFunction | Expression): Self = this.set("icon-halo-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-halo-color`: Self = this.set("icon-halo-color", js.undefined)
    
    @scala.inline
    def `setIcon-halo-color-transition`(value: Transition): Self = this.set("icon-halo-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-halo-color-transition`: Self = this.set("icon-halo-color-transition", js.undefined)
    
    @scala.inline
    def `setIcon-halo-width`(value: Double | StyleFunction | Expression): Self = this.set("icon-halo-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-halo-width`: Self = this.set("icon-halo-width", js.undefined)
    
    @scala.inline
    def `setIcon-halo-width-transition`(value: Transition): Self = this.set("icon-halo-width-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-halo-width-transition`: Self = this.set("icon-halo-width-transition", js.undefined)
    
    @scala.inline
    def `setIcon-opacity`(value: Double | StyleFunction | Expression): Self = this.set("icon-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-opacity`: Self = this.set("icon-opacity", js.undefined)
    
    @scala.inline
    def `setIcon-opacity-transition`(value: Transition): Self = this.set("icon-opacity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-opacity-transition`: Self = this.set("icon-opacity-transition", js.undefined)
    
    @scala.inline
    def `setIcon-translateVarargs`(value: Double*): Self = this.set("icon-translate", js.Array(value :_*))
    
    @scala.inline
    def `setIcon-translate`(value: js.Array[Double] | Expression): Self = this.set("icon-translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-translate`: Self = this.set("icon-translate", js.undefined)
    
    @scala.inline
    def `setIcon-translate-anchor`(value: map | viewport): Self = this.set("icon-translate-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-translate-anchor`: Self = this.set("icon-translate-anchor", js.undefined)
    
    @scala.inline
    def `setIcon-translate-transition`(value: Transition): Self = this.set("icon-translate-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteIcon-translate-transition`: Self = this.set("icon-translate-transition", js.undefined)
    
    @scala.inline
    def `setText-color`(value: String | StyleFunction | Expression): Self = this.set("text-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-color`: Self = this.set("text-color", js.undefined)
    
    @scala.inline
    def `setText-color-transition`(value: Transition): Self = this.set("text-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-color-transition`: Self = this.set("text-color-transition", js.undefined)
    
    @scala.inline
    def `setText-halo-blur`(value: Double | StyleFunction | Expression): Self = this.set("text-halo-blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-halo-blur`: Self = this.set("text-halo-blur", js.undefined)
    
    @scala.inline
    def `setText-halo-blur-transition`(value: Transition): Self = this.set("text-halo-blur-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-halo-blur-transition`: Self = this.set("text-halo-blur-transition", js.undefined)
    
    @scala.inline
    def `setText-halo-color`(value: String | StyleFunction | Expression): Self = this.set("text-halo-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-halo-color`: Self = this.set("text-halo-color", js.undefined)
    
    @scala.inline
    def `setText-halo-color-transition`(value: Transition): Self = this.set("text-halo-color-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-halo-color-transition`: Self = this.set("text-halo-color-transition", js.undefined)
    
    @scala.inline
    def `setText-halo-width`(value: Double | StyleFunction | Expression): Self = this.set("text-halo-width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-halo-width`: Self = this.set("text-halo-width", js.undefined)
    
    @scala.inline
    def `setText-halo-width-transition`(value: Transition): Self = this.set("text-halo-width-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-halo-width-transition`: Self = this.set("text-halo-width-transition", js.undefined)
    
    @scala.inline
    def `setText-opacity`(value: Double | StyleFunction | Expression): Self = this.set("text-opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-opacity`: Self = this.set("text-opacity", js.undefined)
    
    @scala.inline
    def `setText-opacity-transition`(value: Transition): Self = this.set("text-opacity-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-opacity-transition`: Self = this.set("text-opacity-transition", js.undefined)
    
    @scala.inline
    def `setText-translateVarargs`(value: Double*): Self = this.set("text-translate", js.Array(value :_*))
    
    @scala.inline
    def `setText-translate`(value: js.Array[Double] | Expression): Self = this.set("text-translate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-translate`: Self = this.set("text-translate", js.undefined)
    
    @scala.inline
    def `setText-translate-anchor`(value: map | viewport): Self = this.set("text-translate-anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-translate-anchor`: Self = this.set("text-translate-anchor", js.undefined)
    
    @scala.inline
    def `setText-translate-transition`(value: Transition): Self = this.set("text-translate-transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteText-translate-transition`: Self = this.set("text-translate-transition", js.undefined)
  }
}
