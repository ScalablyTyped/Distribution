package typings.intlMessageformatParser.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  var end: LocationDetails
  
  var start: LocationDetails
}
object Location {
  
  @scala.inline
  def apply(end: LocationDetails, start: LocationDetails): Location = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: LocationDetails): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: LocationDetails): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
