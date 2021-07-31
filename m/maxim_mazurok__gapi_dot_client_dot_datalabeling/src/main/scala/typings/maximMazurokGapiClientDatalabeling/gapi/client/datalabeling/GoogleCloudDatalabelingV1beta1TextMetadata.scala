package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1TextMetadata extends StObject {
  
  /** The language of this text, as a [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt). Default value is en-US. */
  var languageCode: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1TextMetadata {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1TextMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1TextMetadata]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1TextMetadataMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1TextMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
