package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaApplianceVersion extends StObject {
  
  /**
    * Determine whether it's critical to upgrade the appliance to this version.
    */
  var critical: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Link to a page that contains the version release notes.
    */
  var releaseNotesUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link for downloading the version.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The appliance version.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaApplianceVersion {
  
  inline def apply(): SchemaApplianceVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplianceVersion]
  }
  
  extension [Self <: SchemaApplianceVersion](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalNull: Self = StObject.set(x, "critical", null)
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setReleaseNotesUri(value: String): Self = StObject.set(x, "releaseNotesUri", value.asInstanceOf[js.Any])
    
    inline def setReleaseNotesUriNull: Self = StObject.set(x, "releaseNotesUri", null)
    
    inline def setReleaseNotesUriUndefined: Self = StObject.set(x, "releaseNotesUri", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
