package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tuple of values for the quasi-identifier columns.
  */
@js.native
trait SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues extends StObject {
  
  /**
    * The estimated anonymity for these quasi-identifier values.
    */
  var estimatedAnonymity: js.UndefOr[String] = js.native
  
  /**
    * The quasi-identifier values.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
}
object SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValuesMutableBuilder[Self <: SchemaGooglePrivacyDlpV2KMapEstimationQuasiIdValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedAnonymity(value: String): Self = StObject.set(x, "estimatedAnonymity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedAnonymityUndefined: Self = StObject.set(x, "estimatedAnonymity", js.undefined)
    
    @scala.inline
    def setQuasiIdsValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = StObject.set(x, "quasiIdsValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasiIdsValuesUndefined: Self = StObject.set(x, "quasiIdsValues", js.undefined)
    
    @scala.inline
    def setQuasiIdsValuesVarargs(value: SchemaGooglePrivacyDlpV2Value*): Self = StObject.set(x, "quasiIdsValues", js.Array(value :_*))
  }
}
