package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Correction extends StObject {
  
  /** The contexts for the correction. */
  var contexts: js.UndefOr[js.Array[ServingContext]] = js.native
  
  /** Additional details about what was corrected. */
  var details: js.UndefOr[js.Array[String]] = js.native
  
  /** The type of correction that was applied to the creative. */
  var `type`: js.UndefOr[String] = js.native
}
object Correction {
  
  @scala.inline
  def apply(): Correction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Correction]
  }
  
  @scala.inline
  implicit class CorrectionMutableBuilder[Self <: Correction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[ServingContext]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    @scala.inline
    def setContextsVarargs(value: ServingContext*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setDetails(value: js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value :_*))
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
