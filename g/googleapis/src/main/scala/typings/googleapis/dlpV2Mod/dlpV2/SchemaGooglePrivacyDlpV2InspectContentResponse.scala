package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Results of inspecting an item.
  */
trait SchemaGooglePrivacyDlpV2InspectContentResponse extends StObject {
  
  /**
    * The findings.
    */
  var result: js.UndefOr[SchemaGooglePrivacyDlpV2InspectResult] = js.undefined
}
object SchemaGooglePrivacyDlpV2InspectContentResponse {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectContentResponse]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectContentResponseMutableBuilder[Self <: SchemaGooglePrivacyDlpV2InspectContentResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: SchemaGooglePrivacyDlpV2InspectResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
