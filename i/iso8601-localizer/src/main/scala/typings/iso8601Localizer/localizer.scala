package typings.iso8601Localizer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait localizer extends StObject {
  
  def localize(): String
  
  def returnAs(as: String): localizer
  
  def to(offset: Double): localizer
}
object localizer {
  
  inline def apply(localize: () => String, returnAs: String => localizer, to: Double => localizer): localizer = {
    val __obj = js.Dynamic.literal(localize = js.Any.fromFunction0(localize), returnAs = js.Any.fromFunction1(returnAs), to = js.Any.fromFunction1(to))
    __obj.asInstanceOf[localizer]
  }
  
  extension [Self <: localizer](x: Self) {
    
    inline def setLocalize(value: () => String): Self = StObject.set(x, "localize", js.Any.fromFunction0(value))
    
    inline def setReturnAs(value: String => localizer): Self = StObject.set(x, "returnAs", js.Any.fromFunction1(value))
    
    inline def setTo(value: Double => localizer): Self = StObject.set(x, "to", js.Any.fromFunction1(value))
  }
}
