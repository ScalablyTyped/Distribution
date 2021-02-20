package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A reference to a file.
  */
@js.native
trait SchemaFileReference extends StObject {
  
  /**
    * The URI of a file stored in Google Cloud Storage.  For example:
    * http://storage.googleapis.com/mybucket/path/to/test.xml or in gsutil
    * format: gs://mybucket/path/to/test.xml with version-specific info,
    * gs://mybucket/path/to/test.xml#1360383693690000  An INVALID_ARGUMENT
    * error will be returned if the URI format is not supported.  - In
    * response: always set - In create/update request: always set
    */
  var fileUri: js.UndefOr[String] = js.native
}
object SchemaFileReference {
  
  @scala.inline
  def apply(): SchemaFileReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileReference]
  }
  
  @scala.inline
  implicit class SchemaFileReferenceMutableBuilder[Self <: SchemaFileReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileUri(value: String): Self = StObject.set(x, "fileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUriUndefined: Self = StObject.set(x, "fileUri", js.undefined)
  }
}
