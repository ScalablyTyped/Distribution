package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPoiSearchTerms extends StObject {
  
  /**
    * The search query for the desired POI name, street address, or coordinate of the desired POI. The query can be a prefix, e.g. "Times squar", "40.7505045,-73.99562", "315 W 44th St", etc.
    */
  var poiQuery: js.UndefOr[String | Null] = js.undefined
}
object SchemaPoiSearchTerms {
  
  inline def apply(): SchemaPoiSearchTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPoiSearchTerms]
  }
  
  extension [Self <: SchemaPoiSearchTerms](x: Self) {
    
    inline def setPoiQuery(value: String): Self = StObject.set(x, "poiQuery", value.asInstanceOf[js.Any])
    
    inline def setPoiQueryNull: Self = StObject.set(x, "poiQuery", null)
    
    inline def setPoiQueryUndefined: Self = StObject.set(x, "poiQuery", js.undefined)
  }
}
