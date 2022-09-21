package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatacatalogV1beta1ViewSpec extends StObject {
  
  /**
    * Output only. The query that defines the table view.
    */
  var viewQuery: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatacatalogV1beta1ViewSpec {
  
  inline def apply(): SchemaGoogleCloudDatacatalogV1beta1ViewSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatacatalogV1beta1ViewSpec]
  }
  
  extension [Self <: SchemaGoogleCloudDatacatalogV1beta1ViewSpec](x: Self) {
    
    inline def setViewQuery(value: String): Self = StObject.set(x, "viewQuery", value.asInstanceOf[js.Any])
    
    inline def setViewQueryNull: Self = StObject.set(x, "viewQuery", null)
    
    inline def setViewQueryUndefined: Self = StObject.set(x, "viewQuery", js.undefined)
  }
}
