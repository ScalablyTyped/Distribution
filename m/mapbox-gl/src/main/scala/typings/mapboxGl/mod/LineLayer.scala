package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineLayer
  extends LayerBase
     with Layer {
  
  var layout: js.UndefOr[LineLayout] = js.native
  
  var paint: js.UndefOr[LinePaint] = js.native
  
  var `type`: line = js.native
}
object LineLayer {
  
  @scala.inline
  def apply(id: String, `type`: line): LineLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineLayer]
  }
  
  @scala.inline
  implicit class LineLayerOps[Self <: LineLayer] (val x: Self) extends AnyVal {
    
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
    def setType(value: line): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayout(value: LineLayout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setPaint(value: LinePaint): Self = this.set("paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaint: Self = this.set("paint", js.undefined)
  }
}
