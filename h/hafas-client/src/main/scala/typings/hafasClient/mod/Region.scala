package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.region
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A region is a group of stations, for example a metropolitan area or a geographical or cultural region.
  */
trait Region extends StObject {
  
  var id: String
  
  var name: String
  
  /** station ids */
  var stations: js.Array[String]
  
  var `type`: region
}
object Region {
  
  inline def apply(id: String, name: String, stations: js.Array[String]): Region = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stations = stations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("region")
    __obj.asInstanceOf[Region]
  }
  
  extension [Self <: Region](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStations(value: js.Array[String]): Self = StObject.set(x, "stations", value.asInstanceOf[js.Any])
    
    inline def setStationsVarargs(value: String*): Self = StObject.set(x, "stations", js.Array(value*))
    
    inline def setType(value: region): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
