package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslPoliciesListAvailableFeaturesResponse extends StObject {
  
  var features: js.UndefOr[js.Array[String]] = js.undefined
}
object SslPoliciesListAvailableFeaturesResponse {
  
  @scala.inline
  def apply(): SslPoliciesListAvailableFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslPoliciesListAvailableFeaturesResponse]
  }
  
  @scala.inline
  implicit class SslPoliciesListAvailableFeaturesResponseMutableBuilder[Self <: SslPoliciesListAvailableFeaturesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
  }
}
