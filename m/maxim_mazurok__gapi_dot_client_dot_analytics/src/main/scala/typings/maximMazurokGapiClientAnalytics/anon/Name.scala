package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  /** The name of the variation. This field is required when creating an experiment. This field may not be changed for an experiment whose status is ENDED. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Status of the variation. Possible values: "ACTIVE", "INACTIVE". INACTIVE variations are not served. This field may not be changed for an experiment whose status is ENDED. */
  var status: js.UndefOr[String] = js.undefined
  
  /** The URL of the variation. This field may not be changed for an experiment whose status is RUNNING or ENDED. */
  var url: js.UndefOr[String] = js.undefined
  
  /** Weight that this variation should receive. Only present if the experiment is running. This field is read-only. */
  var weight: js.UndefOr[Double] = js.undefined
  
  /** True if the experiment has ended and this variation performed (statistically) significantly better than the original. This field is read-only. */
  var won: js.UndefOr[Boolean] = js.undefined
}
object Name {
  
  @scala.inline
  def apply(): Name = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    
    @scala.inline
    def setWon(value: Boolean): Self = StObject.set(x, "won", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWonUndefined: Self = StObject.set(x, "won", js.undefined)
  }
}
