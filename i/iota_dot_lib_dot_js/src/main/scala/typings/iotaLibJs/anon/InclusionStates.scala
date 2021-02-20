package typings.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InclusionStates extends StObject {
  
  var end: js.UndefOr[Double] = js.native
  
  var inclusionStates: js.UndefOr[Boolean] = js.native
  
  var security: js.UndefOr[typings.iotaLibJs.mod.Security] = js.native
  
  var start: js.UndefOr[Double] = js.native
}
object InclusionStates {
  
  @scala.inline
  def apply(): InclusionStates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InclusionStates]
  }
  
  @scala.inline
  implicit class InclusionStatesMutableBuilder[Self <: InclusionStates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setInclusionStates(value: Boolean): Self = StObject.set(x, "inclusionStates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusionStatesUndefined: Self = StObject.set(x, "inclusionStates", js.undefined)
    
    @scala.inline
    def setSecurity(value: typings.iotaLibJs.mod.Security): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
