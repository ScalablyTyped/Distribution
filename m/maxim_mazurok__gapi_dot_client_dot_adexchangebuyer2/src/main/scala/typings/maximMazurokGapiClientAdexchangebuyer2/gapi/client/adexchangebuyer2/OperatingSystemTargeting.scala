package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatingSystemTargeting extends StObject {
  
  /** IDs of operating systems to be included/excluded. */
  var operatingSystemCriteria: js.UndefOr[CriteriaTargeting] = js.undefined
  
  /** IDs of operating system versions to be included/excluded. */
  var operatingSystemVersionCriteria: js.UndefOr[CriteriaTargeting] = js.undefined
}
object OperatingSystemTargeting {
  
  @scala.inline
  def apply(): OperatingSystemTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperatingSystemTargeting]
  }
  
  @scala.inline
  implicit class OperatingSystemTargetingMutableBuilder[Self <: OperatingSystemTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatingSystemCriteria(value: CriteriaTargeting): Self = StObject.set(x, "operatingSystemCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemCriteriaUndefined: Self = StObject.set(x, "operatingSystemCriteria", js.undefined)
    
    @scala.inline
    def setOperatingSystemVersionCriteria(value: CriteriaTargeting): Self = StObject.set(x, "operatingSystemVersionCriteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatingSystemVersionCriteriaUndefined: Self = StObject.set(x, "operatingSystemVersionCriteria", js.undefined)
  }
}
