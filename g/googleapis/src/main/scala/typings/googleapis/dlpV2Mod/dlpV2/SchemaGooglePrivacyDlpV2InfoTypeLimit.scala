package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Max findings configuration per infoType, per content item or long running
  * DlpJob.
  */
trait SchemaGooglePrivacyDlpV2InfoTypeLimit extends StObject {
  
  /**
    * Type of information the findings limit applies to. Only one limit per
    * info_type should be provided. If InfoTypeLimit does not have an
    * info_type, the DLP API applies the limit against all info_types that are
    * found but not specified in another InfoTypeLimit.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.undefined
  
  /**
    * Max findings limit for the given infoType.
    */
  var maxFindings: js.UndefOr[Double] = js.undefined
}
object SchemaGooglePrivacyDlpV2InfoTypeLimit {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoTypeLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeLimit]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeLimitMutableBuilder[Self <: SchemaGooglePrivacyDlpV2InfoTypeLimit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = StObject.set(x, "infoType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypeUndefined: Self = StObject.set(x, "infoType", js.undefined)
    
    @scala.inline
    def setMaxFindings(value: Double): Self = StObject.set(x, "maxFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFindingsUndefined: Self = StObject.set(x, "maxFindings", js.undefined)
  }
}
