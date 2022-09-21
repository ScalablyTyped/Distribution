package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGalleryReference extends StObject {
  
  /**
    * The name of the host for the community gallery template.
    */
  var host: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If a user has manually edited the community gallery template.
    */
  var isModified: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The name of the owner for the community gallery template.
    */
  var owner: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the repository for the community gallery template.
    */
  var repository: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The signature of the community gallery template as computed at import time. This value is recomputed whenever the template is updated from the gallery.
    */
  var signature: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the community gallery template.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaGalleryReference {
  
  inline def apply(): SchemaGalleryReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGalleryReference]
  }
  
  extension [Self <: SchemaGalleryReference](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostNull: Self = StObject.set(x, "host", null)
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setIsModified(value: Boolean): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
    
    inline def setIsModifiedNull: Self = StObject.set(x, "isModified", null)
    
    inline def setIsModifiedUndefined: Self = StObject.set(x, "isModified", js.undefined)
    
    inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerNull: Self = StObject.set(x, "owner", null)
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNull: Self = StObject.set(x, "repository", null)
    
    inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
