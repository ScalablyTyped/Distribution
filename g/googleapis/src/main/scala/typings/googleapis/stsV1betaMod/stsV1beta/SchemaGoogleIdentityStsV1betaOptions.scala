package typings.googleapis.stsV1betaMod.stsV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityStsV1betaOptions extends StObject {
  
  /**
    * An access boundary that defines the upper bound of permissions the credential may have. The value should be a JSON object of AccessBoundary. The access boundary can include up to 10 rules. The size of the parameter value should not exceed 2048 characters.
    */
  var accessBoundary: js.UndefOr[SchemaGoogleIdentityStsV1betaAccessBoundary] = js.undefined
  
  /**
    * The intended audience(s) of the credential. The audience value(s) should be the name(s) of services intended to receive the credential. Example: `["https://pubsub.googleapis.com/", "https://storage.googleapis.com/"]`. A maximum of 5 audiences can be included. For each provided audience, the maximum length is 262 characters.
    */
  var audiences: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A Google project used for quota and billing purposes when the credential is used to access Google APIs. The provided project overrides the project bound to the credential. The value must be a project number or a project ID. Example: `my-sample-project-191923`. The maximum length is 32 characters.
    */
  var userProject: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleIdentityStsV1betaOptions {
  
  inline def apply(): SchemaGoogleIdentityStsV1betaOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityStsV1betaOptions]
  }
  
  extension [Self <: SchemaGoogleIdentityStsV1betaOptions](x: Self) {
    
    inline def setAccessBoundary(value: SchemaGoogleIdentityStsV1betaAccessBoundary): Self = StObject.set(x, "accessBoundary", value.asInstanceOf[js.Any])
    
    inline def setAccessBoundaryUndefined: Self = StObject.set(x, "accessBoundary", js.undefined)
    
    inline def setAudiences(value: js.Array[String]): Self = StObject.set(x, "audiences", value.asInstanceOf[js.Any])
    
    inline def setAudiencesNull: Self = StObject.set(x, "audiences", null)
    
    inline def setAudiencesUndefined: Self = StObject.set(x, "audiences", js.undefined)
    
    inline def setAudiencesVarargs(value: String*): Self = StObject.set(x, "audiences", js.Array(value*))
    
    inline def setUserProject(value: String): Self = StObject.set(x, "userProject", value.asInstanceOf[js.Any])
    
    inline def setUserProjectNull: Self = StObject.set(x, "userProject", null)
    
    inline def setUserProjectUndefined: Self = StObject.set(x, "userProject", js.undefined)
  }
}
