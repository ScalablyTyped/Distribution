package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output generated from semantically comparing two versions of a service
  * configuration.  Includes detailed information about a field that have
  * changed with applicable advice about potential consequences for the change,
  * such as backwards-incompatibility.
  */
@js.native
trait SchemaConfigChange extends js.Object {
  
  /**
    * Collection of advice provided for this change, useful for determining the
    * possible impact of this change.
    */
  var advices: js.UndefOr[js.Array[SchemaAdvice]] = js.native
  
  /**
    * The type for this change, either ADDED, REMOVED, or MODIFIED.
    */
  var changeType: js.UndefOr[String] = js.native
  
  /**
    * Object hierarchy path to the change, with levels separated by a
    * &#39;.&#39; character. For repeated fields, an applicable unique
    * identifier field is used for the index (usually selector, name, or id).
    * For maps, the term &#39;key&#39; is used. If the field has no unique
    * identifier, the numeric index is used. ## Examples:
    * visibility.rules[selector==&quot;google.LibraryService.CreateBook&quot;].restriction
    * -
    * quota.metric_rules[selector==&quot;google&quot;].metric_costs[key==&quot;reads&quot;].value
    * - logging.producer_destinations[0]
    */
  var element: js.UndefOr[String] = js.native
  
  /**
    * Value of the changed object in the new Service configuration, in JSON
    * format. This field will not be populated if ChangeType == REMOVED.
    */
  var newValue: js.UndefOr[String] = js.native
  
  /**
    * Value of the changed object in the old Service configuration, in JSON
    * format. This field will not be populated if ChangeType == ADDED.
    */
  var oldValue: js.UndefOr[String] = js.native
}
object SchemaConfigChange {
  
  @scala.inline
  def apply(): SchemaConfigChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigChange]
  }
  
  @scala.inline
  implicit class SchemaConfigChangeOps[Self <: SchemaConfigChange] (val x: Self) extends AnyVal {
    
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
    def setAdvicesVarargs(value: SchemaAdvice*): Self = this.set("advices", js.Array(value :_*))
    
    @scala.inline
    def setAdvices(value: js.Array[SchemaAdvice]): Self = this.set("advices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvices: Self = this.set("advices", js.undefined)
    
    @scala.inline
    def setChangeType(value: String): Self = this.set("changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeType: Self = this.set("changeType", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setNewValue(value: String): Self = this.set("newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewValue: Self = this.set("newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: String): Self = this.set("oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldValue: Self = this.set("oldValue", js.undefined)
  }
}
