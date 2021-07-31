package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Explanation extends StObject {
  
  /** Attribution of feature. */
  var attribution: js.UndefOr[Double] = js.undefined
  
  /** Full name of the feature. For non-numerical features, will be formatted like .. Overall size of feature name will always be truncated to first 120 characters. */
  var featureName: js.UndefOr[String] = js.undefined
}
object Explanation {
  
  @scala.inline
  def apply(): Explanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Explanation]
  }
  
  @scala.inline
  implicit class ExplanationMutableBuilder[Self <: Explanation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribution(value: Double): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    @scala.inline
    def setFeatureName(value: String): Self = StObject.set(x, "featureName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureNameUndefined: Self = StObject.set(x, "featureName", js.undefined)
  }
}
