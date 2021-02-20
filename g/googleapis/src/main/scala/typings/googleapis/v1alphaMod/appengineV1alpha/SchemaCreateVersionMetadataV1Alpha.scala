package typings.googleapis.v1alphaMod.appengineV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for the given google.longrunning.Operation during a
  * google.appengine.v1alpha.CreateVersionRequest.
  */
@js.native
trait SchemaCreateVersionMetadataV1Alpha extends StObject {
  
  /**
    * The Cloud Build ID if one was created as part of the version create.
    * @OutputOnly
    */
  var cloudBuildId: js.UndefOr[String] = js.native
}
object SchemaCreateVersionMetadataV1Alpha {
  
  @scala.inline
  def apply(): SchemaCreateVersionMetadataV1Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateVersionMetadataV1Alpha]
  }
  
  @scala.inline
  implicit class SchemaCreateVersionMetadataV1AlphaMutableBuilder[Self <: SchemaCreateVersionMetadataV1Alpha] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudBuildId(value: String): Self = StObject.set(x, "cloudBuildId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudBuildIdUndefined: Self = StObject.set(x, "cloudBuildId", js.undefined)
  }
}
