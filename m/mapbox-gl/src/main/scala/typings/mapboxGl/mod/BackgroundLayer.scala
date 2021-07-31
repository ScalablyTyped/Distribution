package typings.mapboxGl.mod

import typings.mapboxGl.mapboxGlStrings.background
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundLayer
  extends StObject
     with LayerBase
     with Layer {
  
  var layout: js.UndefOr[BackgroundLayout] = js.undefined
  
  var paint: js.UndefOr[BackgroundPaint] = js.undefined
  
  var `type`: background
}
object BackgroundLayer {
  
  @scala.inline
  def apply(id: String): BackgroundLayer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("background")
    __obj.asInstanceOf[BackgroundLayer]
  }
  
  @scala.inline
  implicit class BackgroundLayerMutableBuilder[Self <: BackgroundLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: BackgroundLayout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setPaint(value: BackgroundPaint): Self = StObject.set(x, "paint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaintUndefined: Self = StObject.set(x, "paint", js.undefined)
    
    @scala.inline
    def setType(value: background): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
