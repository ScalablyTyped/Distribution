package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Label to provide extra metadata for the web detection.
  */
trait SchemaGoogleCloudVisionV1p2beta1WebDetectionWebLabel extends StObject {
  
  /**
    * Label for extra metadata.
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The BCP-47 language code for `label`, such as &quot;en-US&quot; or
    * &quot;sr-Latn&quot;. For more information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier.
    */
  var languageCode: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudVisionV1p2beta1WebDetectionWebLabel {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p2beta1WebDetectionWebLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1WebDetectionWebLabel]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p2beta1WebDetectionWebLabelMutableBuilder[Self <: SchemaGoogleCloudVisionV1p2beta1WebDetectionWebLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
  }
}
