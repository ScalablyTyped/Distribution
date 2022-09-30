package typings.leafletGeosearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatestWkid extends StObject {
  
  var latestWkid: Double
  
  var wkid: Double
}
object LatestWkid {
  
  inline def apply(latestWkid: Double, wkid: Double): LatestWkid = {
    val __obj = js.Dynamic.literal(latestWkid = latestWkid.asInstanceOf[js.Any], wkid = wkid.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatestWkid]
  }
  
  extension [Self <: LatestWkid](x: Self) {
    
    inline def setLatestWkid(value: Double): Self = StObject.set(x, "latestWkid", value.asInstanceOf[js.Any])
    
    inline def setWkid(value: Double): Self = StObject.set(x, "wkid", value.asInstanceOf[js.Any])
  }
}
