package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CriteriaTargeting extends StObject {
  
  /** A list of numeric IDs to be excluded. */
  var excludedCriteriaIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A list of numeric IDs to be included. */
  var targetedCriteriaIds: js.UndefOr[js.Array[String]] = js.undefined
}
object CriteriaTargeting {
  
  @scala.inline
  def apply(): CriteriaTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CriteriaTargeting]
  }
  
  @scala.inline
  implicit class CriteriaTargetingMutableBuilder[Self <: CriteriaTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExcludedCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "excludedCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedCriteriaIdsUndefined: Self = StObject.set(x, "excludedCriteriaIds", js.undefined)
    
    @scala.inline
    def setExcludedCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "excludedCriteriaIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetedCriteriaIds(value: js.Array[String]): Self = StObject.set(x, "targetedCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetedCriteriaIdsUndefined: Self = StObject.set(x, "targetedCriteriaIds", js.undefined)
    
    @scala.inline
    def setTargetedCriteriaIdsVarargs(value: String*): Self = StObject.set(x, "targetedCriteriaIds", js.Array(value :_*))
  }
}
