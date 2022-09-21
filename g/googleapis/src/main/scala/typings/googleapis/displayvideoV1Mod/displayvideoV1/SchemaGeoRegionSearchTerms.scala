package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGeoRegionSearchTerms extends StObject {
  
  /**
    * The search query for the desired geo region. The query can be a prefix, e.g. "New Yor", "Seattle", "USA", etc.
    */
  var geoRegionQuery: js.UndefOr[String | Null] = js.undefined
}
object SchemaGeoRegionSearchTerms {
  
  inline def apply(): SchemaGeoRegionSearchTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGeoRegionSearchTerms]
  }
  
  extension [Self <: SchemaGeoRegionSearchTerms](x: Self) {
    
    inline def setGeoRegionQuery(value: String): Self = StObject.set(x, "geoRegionQuery", value.asInstanceOf[js.Any])
    
    inline def setGeoRegionQueryNull: Self = StObject.set(x, "geoRegionQuery", null)
    
    inline def setGeoRegionQueryUndefined: Self = StObject.set(x, "geoRegionQuery", js.undefined)
  }
}
