package typings.interactjsTypes.anon

import typings.interactjsTypes.coreTypesMod.FullRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Corrected extends StObject {
  
  var corrected: FullRect
  
  var delta: FullRect
  
  var previous: FullRect
  
  var start: FullRect
}
object Corrected {
  
  inline def apply(corrected: FullRect, delta: FullRect, previous: FullRect, start: FullRect): Corrected = {
    val __obj = js.Dynamic.literal(corrected = corrected.asInstanceOf[js.Any], delta = delta.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Corrected]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Corrected] (val x: Self) extends AnyVal {
    
    inline def setCorrected(value: FullRect): Self = StObject.set(x, "corrected", value.asInstanceOf[js.Any])
    
    inline def setDelta(value: FullRect): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: FullRect): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setStart(value: FullRect): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
