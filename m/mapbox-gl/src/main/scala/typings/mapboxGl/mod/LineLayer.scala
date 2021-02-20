package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.line
import org.scalablytyped.runtime.StObject
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
  implicit class LineLayerMutableBuilder[Self <: LineLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: LineLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setPaint(value: LinePaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    @scala.inline
    def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
