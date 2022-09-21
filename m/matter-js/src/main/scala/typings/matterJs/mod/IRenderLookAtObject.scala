package typings.matterJs.mod

import typings.matterJs.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRenderLookAtObject extends StObject {
  
  var bounds: js.UndefOr[Bounds] = js.undefined
  
  var max: js.UndefOr[X] = js.undefined
  
  var min: js.UndefOr[X] = js.undefined
  
  var position: js.UndefOr[X] = js.undefined
}
object IRenderLookAtObject {
  
  inline def apply(): IRenderLookAtObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRenderLookAtObject]
  }
  
  extension [Self <: IRenderLookAtObject](x: Self) {
    
    inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setMax(value: X): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: X): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPosition(value: X): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
