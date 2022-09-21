package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSitesVersionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The site in which to create the version, in the format: sites/ SITE_ID
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaVersion] = js.undefined
  
  /**
    * The self-reported size of the version. This value is used for a pre-emptive quota check for legacy version uploads.
    */
  var sizeBytes: js.UndefOr[String] = js.undefined
  
  /**
    * A unique id for the new version. This is was only specified for legacy version creations, and should be blank.
    */
  var versionId: js.UndefOr[String] = js.undefined
}
object ParamsResourceSitesVersionsCreate {
  
  inline def apply(): ParamsResourceSitesVersionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesVersionsCreate]
  }
  
  extension [Self <: ParamsResourceSitesVersionsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaVersion): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSizeBytes(value: String): Self = StObject.set(x, "sizeBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeBytesUndefined: Self = StObject.set(x, "sizeBytes", js.undefined)
    
    inline def setVersionId(value: String): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
  }
}
