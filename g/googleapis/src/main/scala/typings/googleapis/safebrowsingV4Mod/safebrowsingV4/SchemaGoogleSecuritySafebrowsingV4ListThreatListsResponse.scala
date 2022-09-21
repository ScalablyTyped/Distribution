package typings.googleapis.safebrowsingV4Mod.safebrowsingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse extends StObject {
  
  /**
    * The lists available for download by the client.
    */
  var threatLists: js.UndefOr[js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatListDescriptor]] = js.undefined
}
object SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse {
  
  inline def apply(): SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse]
  }
  
  extension [Self <: SchemaGoogleSecuritySafebrowsingV4ListThreatListsResponse](x: Self) {
    
    inline def setThreatLists(value: js.Array[SchemaGoogleSecuritySafebrowsingV4ThreatListDescriptor]): Self = StObject.set(x, "threatLists", value.asInstanceOf[js.Any])
    
    inline def setThreatListsUndefined: Self = StObject.set(x, "threatLists", js.undefined)
    
    inline def setThreatListsVarargs(value: SchemaGoogleSecuritySafebrowsingV4ThreatListDescriptor*): Self = StObject.set(x, "threatLists", js.Array(value*))
  }
}
