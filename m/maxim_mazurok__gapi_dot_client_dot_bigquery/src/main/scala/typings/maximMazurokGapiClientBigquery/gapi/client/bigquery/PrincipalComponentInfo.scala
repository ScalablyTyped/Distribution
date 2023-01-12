package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrincipalComponentInfo extends StObject {
  
  /** The explained_variance is pre-ordered in the descending order to compute the cumulative explained variance ratio. */
  var cumulativeExplainedVarianceRatio: js.UndefOr[Double] = js.undefined
  
  /** Explained variance by this principal component, which is simply the eigenvalue. */
  var explainedVariance: js.UndefOr[Double] = js.undefined
  
  /** Explained_variance over the total explained variance. */
  var explainedVarianceRatio: js.UndefOr[Double] = js.undefined
  
  /** Id of the principal component. */
  var principalComponentId: js.UndefOr[String] = js.undefined
}
object PrincipalComponentInfo {
  
  inline def apply(): PrincipalComponentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrincipalComponentInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrincipalComponentInfo] (val x: Self) extends AnyVal {
    
    inline def setCumulativeExplainedVarianceRatio(value: Double): Self = StObject.set(x, "cumulativeExplainedVarianceRatio", value.asInstanceOf[js.Any])
    
    inline def setCumulativeExplainedVarianceRatioUndefined: Self = StObject.set(x, "cumulativeExplainedVarianceRatio", js.undefined)
    
    inline def setExplainedVariance(value: Double): Self = StObject.set(x, "explainedVariance", value.asInstanceOf[js.Any])
    
    inline def setExplainedVarianceRatio(value: Double): Self = StObject.set(x, "explainedVarianceRatio", value.asInstanceOf[js.Any])
    
    inline def setExplainedVarianceRatioUndefined: Self = StObject.set(x, "explainedVarianceRatio", js.undefined)
    
    inline def setExplainedVarianceUndefined: Self = StObject.set(x, "explainedVariance", js.undefined)
    
    inline def setPrincipalComponentId(value: String): Self = StObject.set(x, "principalComponentId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalComponentIdUndefined: Self = StObject.set(x, "principalComponentId", js.undefined)
  }
}
