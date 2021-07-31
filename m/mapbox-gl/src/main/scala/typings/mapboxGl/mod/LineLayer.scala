package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineLayer
  extends StObject
     with LayerBase
     with Layer {
  
  var layout: js.UndefOr[LineLayout] = js.undefined
  
  var paint: js.UndefOr[LinePaint] = js.undefined
  
  var `type`: line
}
object LineLayer {
  
  @scala.inline
  def apply(id: String): LineLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("line")
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
