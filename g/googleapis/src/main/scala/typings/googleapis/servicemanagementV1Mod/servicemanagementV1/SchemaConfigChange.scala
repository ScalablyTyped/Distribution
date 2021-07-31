package typings.googleapis.servicemanagementV1Mod.servicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Output generated from semantically comparing two versions of a service
  * configuration.  Includes detailed information about a field that have
  * changed with applicable advice about potential consequences for the change,
  * such as backwards-incompatibility.
  */
trait SchemaConfigChange extends StObject {
  
  /**
    * Collection of advice provided for this change, useful for determining the
    * possible impact of this change.
    */
  var advices: js.UndefOr[js.Array[SchemaAdvice]] = js.undefined
  
  /**
    * The type for this change, either ADDED, REMOVED, or MODIFIED.
    */
  var changeType: js.UndefOr[String] = js.undefined
  
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
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the changed object in the new Service configuration, in JSON
    * format. This field will not be populated if ChangeType == REMOVED.
    */
  var newValue: js.UndefOr[String] = js.undefined
  
  /**
    * Value of the changed object in the old Service configuration, in JSON
    * format. This field will not be populated if ChangeType == ADDED.
    */
  var oldValue: js.UndefOr[String] = js.undefined
}
object SchemaConfigChange {
  
  @scala.inline
  def apply(): SchemaConfigChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigChange]
  }
  
  @scala.inline
  implicit class SchemaConfigChangeMutableBuilder[Self <: SchemaConfigChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvices(value: js.Array[SchemaAdvice]): Self = StObject.set(x, "advices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvicesUndefined: Self = StObject.set(x, "advices", js.undefined)
    
    @scala.inline
    def setAdvicesVarargs(value: SchemaAdvice*): Self = StObject.set(x, "advices", js.Array(value :_*))
    
    @scala.inline
    def setChangeType(value: String): Self = StObject.set(x, "changeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeTypeUndefined: Self = StObject.set(x, "changeType", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    @scala.inline
    def setOldValue(value: String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
  }
}
