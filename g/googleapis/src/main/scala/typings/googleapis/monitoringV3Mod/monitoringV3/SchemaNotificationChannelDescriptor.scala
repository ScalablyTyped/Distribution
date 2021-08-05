package typings.googleapis.monitoringV3Mod.monitoringV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A description of a notification channel. The descriptor includes the
  * properties of the channel and the set of labels or fields that must be
  * specified to configure channels of a given type.
  */
trait SchemaNotificationChannelDescriptor extends StObject {
  
  /**
    * A human-readable description of the notification channel type. The
    * description may include a description of the properties of the channel
    * and pointers to external documentation.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * A human-readable name for the notification channel type. This form of the
    * name is suitable for a user interface.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The set of labels that must be defined to identify a particular channel
    * of the corresponding type. Each label includes a description for how that
    * field should be populated.
    */
  var labels: js.UndefOr[js.Array[SchemaLabelDescriptor]] = js.undefined
  
  /**
    * The full REST resource name for this descriptor. The syntax is:
    * projects/[PROJECT_ID]/notificationChannelDescriptors/[TYPE] In the above,
    * [TYPE] is the value of the type field.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The tiers that support this notification channel; the project service
    * tier must be one of the supported_tiers.
    */
  var supportedTiers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The type of notification channel, such as &quot;email&quot;,
    * &quot;sms&quot;, etc. Notification channel types are globally unique.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaNotificationChannelDescriptor {
  
  inline def apply(): SchemaNotificationChannelDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationChannelDescriptor]
  }
  
  extension [Self <: SchemaNotificationChannelDescriptor](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLabels(value: js.Array[SchemaLabelDescriptor]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: SchemaLabelDescriptor*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSupportedTiers(value: js.Array[String]): Self = StObject.set(x, "supportedTiers", value.asInstanceOf[js.Any])
    
    inline def setSupportedTiersUndefined: Self = StObject.set(x, "supportedTiers", js.undefined)
    
    inline def setSupportedTiersVarargs(value: String*): Self = StObject.set(x, "supportedTiers", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
