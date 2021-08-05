package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconSequence extends StObject {
  
  var fixedRotation: js.UndefOr[Boolean] = js.undefined
  
  // tslint:disable-next-line:no-unnecessary-qualifier
  var icon: js.UndefOr[Symbol] = js.undefined
  
  var offset: js.UndefOr[String] = js.undefined
  
  var repeat: js.UndefOr[String] = js.undefined
}
object IconSequence {
  
  inline def apply(): IconSequence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconSequence]
  }
  
  extension [Self <: IconSequence](x: Self) {
    
    inline def setFixedRotation(value: Boolean): Self = StObject.set(x, "fixedRotation", value.asInstanceOf[js.Any])
    
    inline def setFixedRotationUndefined: Self = StObject.set(x, "fixedRotation", js.undefined)
    
    inline def setIcon(value: Symbol): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setRepeat(value: String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
  }
}
