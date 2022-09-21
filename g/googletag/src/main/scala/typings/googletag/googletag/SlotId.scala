package typings.googletag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object of slot id information.
  */
trait SlotId extends StObject {
  
  def getAdUnitPath(): String
  
  def getDomId(): String
  
  def getId(): String
  
  def getName(): String
}
object SlotId {
  
  inline def apply(getAdUnitPath: () => String, getDomId: () => String, getId: () => String, getName: () => String): SlotId = {
    val __obj = js.Dynamic.literal(getAdUnitPath = js.Any.fromFunction0(getAdUnitPath), getDomId = js.Any.fromFunction0(getDomId), getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName))
    __obj.asInstanceOf[SlotId]
  }
  
  extension [Self <: SlotId](x: Self) {
    
    inline def setGetAdUnitPath(value: () => String): Self = StObject.set(x, "getAdUnitPath", js.Any.fromFunction0(value))
    
    inline def setGetDomId(value: () => String): Self = StObject.set(x, "getDomId", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
  }
}
