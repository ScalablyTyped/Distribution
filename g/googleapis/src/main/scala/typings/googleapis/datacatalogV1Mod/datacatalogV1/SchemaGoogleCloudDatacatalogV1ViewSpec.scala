package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1ViewSpec extends StObject {
  
  /**
    * Output only. The query that defines the table view.
    */
  var viewQuery: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1ViewSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1ViewSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1ViewSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1ViewSpec](x: Self) {
    
    inline def setViewQuery(value: String): Self = StObject.set(x, "viewQuery", value.asInstanceOf[js.Any])
    
    inline def setViewQueryNull: Self = StObject.set(x, "viewQuery", null)
    
    inline def setViewQueryUndefined: Self = StObject.set(x, "viewQuery", js.undefined)
  }
}
