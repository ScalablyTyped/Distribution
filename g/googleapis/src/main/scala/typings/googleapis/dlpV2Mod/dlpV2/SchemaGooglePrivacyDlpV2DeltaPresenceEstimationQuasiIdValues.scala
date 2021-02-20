package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A tuple of values for the quasi-identifier columns.
  */
@js.native
trait SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues extends StObject {
  
  /**
    * The estimated probability that a given individual sharing these
    * quasi-identifier values is in the dataset. This value, typically called
    * δ, is the ratio between the number of records in the dataset with these
    * quasi-identifier values, and the total number of individuals (inside
    * *and* outside the dataset) with these quasi-identifier values. For
    * example, if there are 15 individuals in the dataset who share the same
    * quasi-identifier values, and an estimated 100 people in the entire
    * population with these values, then δ is 0.15.
    */
  var estimatedProbability: js.UndefOr[Double] = js.native
  
  /**
    * The quasi-identifier values.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
}
object SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValuesMutableBuilder[Self <: SchemaGooglePrivacyDlpV2DeltaPresenceEstimationQuasiIdValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEstimatedProbability(value: Double): Self = StObject.set(x, "estimatedProbability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEstimatedProbabilityUndefined: Self = StObject.set(x, "estimatedProbability", js.undefined)
    
    @scala.inline
    def setQuasiIdsValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = StObject.set(x, "quasiIdsValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuasiIdsValuesUndefined: Self = StObject.set(x, "quasiIdsValues", js.undefined)
    
    @scala.inline
    def setQuasiIdsValuesVarargs(value: SchemaGooglePrivacyDlpV2Value*): Self = StObject.set(x, "quasiIdsValues", js.Array(value :_*))
  }
}
