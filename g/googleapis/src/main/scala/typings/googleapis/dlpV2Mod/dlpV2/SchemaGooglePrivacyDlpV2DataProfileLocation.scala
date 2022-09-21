package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DataProfileLocation extends StObject {
  
  /**
    * The ID of the Folder within an organization to scan.
    */
  var folderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of an organization to scan.
    */
  var organizationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGooglePrivacyDlpV2DataProfileLocation {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DataProfileLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DataProfileLocation]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DataProfileLocation](x: Self) {
    
    inline def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    inline def setFolderIdNull: Self = StObject.set(x, "folderId", null)
    
    inline def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
    
    inline def setOrganizationId(value: String): Self = StObject.set(x, "organizationId", value.asInstanceOf[js.Any])
    
    inline def setOrganizationIdNull: Self = StObject.set(x, "organizationId", null)
    
    inline def setOrganizationIdUndefined: Self = StObject.set(x, "organizationId", js.undefined)
  }
}
