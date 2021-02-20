package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Google Cloud Storage location where the output will be written to.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1GcsDestination extends StObject {
  
  /**
    * Google Cloud Storage URI where the results will be stored. Results will
    * be in JSON format and preceded by its corresponding input URI. This field
    * can either represent a single file, or a prefix for multiple outputs.
    * Prefixes must end in a `/`.  Examples:  *    File:
    * gs://bucket-name/filename.json *    Prefix: gs://bucket-name/prefix/here/
    * *    File: gs://bucket-name/prefix/here  If multiple outputs, each
    * response is still AnnotateFileResponse, each of which contains some
    * subset of the full list of AnnotateImageResponse. Multiple outputs can
    * happen if, for example, the output JSON is too large and overflows into
    * multiple sharded files.
    */
  var uri: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVisionV1p3beta1GcsDestination {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1GcsDestination]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1GcsDestinationMutableBuilder[Self <: SchemaGoogleCloudVisionV1p3beta1GcsDestination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
