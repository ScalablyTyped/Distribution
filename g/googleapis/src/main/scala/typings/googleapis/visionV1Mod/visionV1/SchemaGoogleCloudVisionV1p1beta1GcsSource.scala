package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Google Cloud Storage location where the input will be read from.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1GcsSource extends StObject {
  
  /**
    * Google Cloud Storage URI for the input file. This must only be a Google
    * Cloud Storage object. Wildcards are not currently supported.
    */
  var uri: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVisionV1p1beta1GcsSource {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1GcsSource]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1GcsSourceMutableBuilder[Self <: SchemaGoogleCloudVisionV1p1beta1GcsSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
