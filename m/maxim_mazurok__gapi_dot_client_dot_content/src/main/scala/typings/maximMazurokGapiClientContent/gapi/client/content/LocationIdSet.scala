package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationIdSet extends StObject {
  
  /** A non-empty list of location IDs. They must all be of the same location type (e.g., state). */
  var locationIds: js.UndefOr[js.Array[String]] = js.undefined
}
object LocationIdSet {
  
  inline def apply(): LocationIdSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationIdSet]
  }
  
  extension [Self <: LocationIdSet](x: Self) {
    
    inline def setLocationIds(value: js.Array[String]): Self = StObject.set(x, "locationIds", value.asInstanceOf[js.Any])
    
    inline def setLocationIdsUndefined: Self = StObject.set(x, "locationIds", js.undefined)
    
    inline def setLocationIdsVarargs(value: String*): Self = StObject.set(x, "locationIds", js.Array(value :_*))
  }
}
