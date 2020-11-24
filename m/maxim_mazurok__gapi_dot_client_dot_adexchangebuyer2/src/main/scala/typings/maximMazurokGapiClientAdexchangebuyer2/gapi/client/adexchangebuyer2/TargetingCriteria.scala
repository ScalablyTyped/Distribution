package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetingCriteria extends js.Object {
  
  /** The list of values to exclude from targeting. Each value is AND'd together. */
  var exclusions: js.UndefOr[js.Array[TargetingValue]] = js.native
  
  /** The list of value to include as part of the targeting. Each value is OR'd together. */
  var inclusions: js.UndefOr[js.Array[TargetingValue]] = js.native
  
  /**
    * The key representing the shared targeting criterion. Targeting criteria defined by Google ad servers will begin with GOOG_. Third parties may define their own keys. A list of
    * permissible keys along with the acceptable values will be provided as part of the external documentation.
    */
  var key: js.UndefOr[String] = js.native
}
object TargetingCriteria {
  
  @scala.inline
  def apply(): TargetingCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetingCriteria]
  }
  
  @scala.inline
  implicit class TargetingCriteriaOps[Self <: TargetingCriteria] (val x: Self) extends AnyVal {
    
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
    def setExclusionsVarargs(value: TargetingValue*): Self = this.set("exclusions", js.Array(value :_*))
    
    @scala.inline
    def setExclusions(value: js.Array[TargetingValue]): Self = this.set("exclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusions: Self = this.set("exclusions", js.undefined)
    
    @scala.inline
    def setInclusionsVarargs(value: TargetingValue*): Self = this.set("inclusions", js.Array(value :_*))
    
    @scala.inline
    def setInclusions(value: js.Array[TargetingValue]): Self = this.set("inclusions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclusions: Self = this.set("inclusions", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
}
