package typings.googleapis.v1beta2Mod.cloudfunctionsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response of `GenerateDownloadUrl` method.
  */
@js.native
trait SchemaGenerateDownloadUrlResponse extends StObject {
  
  /**
    * The generated Google Cloud Storage signed URL that should be used for
    * function source code download.
    */
  var downloadUrl: js.UndefOr[String] = js.native
}
object SchemaGenerateDownloadUrlResponse {
  
  @scala.inline
  def apply(): SchemaGenerateDownloadUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateDownloadUrlResponse]
  }
  
  @scala.inline
  implicit class SchemaGenerateDownloadUrlResponseMutableBuilder[Self <: SchemaGenerateDownloadUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDownloadUrl(value: String): Self = StObject.set(x, "downloadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadUrlUndefined: Self = StObject.set(x, "downloadUrl", js.undefined)
  }
}
