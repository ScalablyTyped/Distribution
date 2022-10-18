package typings.interactjsTypes.coreTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoordsSetMember extends StObject {
  
  var client: Point
  
  var page: Point
  
  var timeStamp: Double
}
object CoordsSetMember {
  
  inline def apply(client: Point, page: Point, timeStamp: Double): CoordsSetMember = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoordsSetMember]
  }
  
  extension [Self <: CoordsSetMember](x: Self) {
    
    inline def setClient(value: Point): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setPage(value: Point): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
