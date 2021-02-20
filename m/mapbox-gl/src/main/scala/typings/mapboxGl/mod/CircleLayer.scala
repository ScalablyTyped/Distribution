package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CircleLayer
  extends LayerBase
     with Layer {
  
  var layout: js.UndefOr[CircleLayout] = js.native
  
  var paint: js.UndefOr[CirclePaint] = js.native
  
  var `type`: circle = js.native
}
object CircleLayer {
  
  @scala.inline
  def apply(id: String, `type`: circle): CircleLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleLayer]
  }
  
  @scala.inline
  implicit class CircleLayerMutableBuilder[Self <: CircleLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: CircleLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setPaint(value: CirclePaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    @scala.inline
    def setType(value: circle): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
