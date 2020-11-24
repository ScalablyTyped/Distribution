package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CriteriaTargeting extends js.Object {
  
  /** A list of numeric IDs to be excluded. */
  var excludedCriteriaIds: js.UndefOr[js.Array[String]] = js.native
  
  /** A list of numeric IDs to be included. */
  var targetedCriteriaIds: js.UndefOr[js.Array[String]] = js.native
}
object CriteriaTargeting {
  
  @scala.inline
  def apply(): CriteriaTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CriteriaTargeting]
  }
  
  @scala.inline
  implicit class CriteriaTargetingOps[Self <: CriteriaTargeting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExcludedCriteriaIdsVarargs(value: String*): Self = this.set("excludedCriteriaIds", js.Array(value :_*))
    
    @scala.inline
    def setExcludedCriteriaIds(value: js.Array[String]): Self = this.set("excludedCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedCriteriaIds: Self = this.set("excludedCriteriaIds", js.undefined)
    
    @scala.inline
    def setTargetedCriteriaIdsVarargs(value: String*): Self = this.set("targetedCriteriaIds", js.Array(value :_*))
    
    @scala.inline
    def setTargetedCriteriaIds(value: js.Array[String]): Self = this.set("targetedCriteriaIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetedCriteriaIds: Self = this.set("targetedCriteriaIds", js.undefined)
  }
}
