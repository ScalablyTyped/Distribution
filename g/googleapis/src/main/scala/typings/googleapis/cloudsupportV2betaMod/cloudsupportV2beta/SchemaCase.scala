package typings.googleapis.cloudsupportV2betaMod.cloudsupportV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCase extends StObject {
  
  /**
    * The issue classification applicable to this case.
    */
  var classification: js.UndefOr[SchemaCaseClassification] = js.undefined
  
  /**
    * Output only. The time this case was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The user who created the case. Note: The name and email will be obfuscated if the case was created by Google Support.
    */
  var creator: js.UndefOr[SchemaActor] = js.undefined
  
  /**
    * A broad description of the issue.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The short summary of the issue reported in this case.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the case is currently escalated.
    */
  var escalated: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The resource name for the case.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The priority of this case. If this is set, do not set severity.
    */
  var priority: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The severity of this case. Deprecated. Use priority instead.
    */
  var severity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The current status of the support case.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The email addresses to receive updates on this case.
    */
  var subscriberEmailAddresses: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Whether this case was created for internal API testing and should not be acted on by the support team.
    */
  var testCase: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The timezone of the user who created the support case. It should be in a format IANA recognizes: https://www.iana.org/time-zones. There is no additional validation done by the API.
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time this case was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaCase {
  
  inline def apply(): SchemaCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCase]
  }
  
  extension [Self <: SchemaCase](x: Self) {
    
    inline def setClassification(value: SchemaCaseClassification): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: SchemaActor): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEscalated(value: Boolean): Self = StObject.set(x, "escalated", value.asInstanceOf[js.Any])
    
    inline def setEscalatedNull: Self = StObject.set(x, "escalated", null)
    
    inline def setEscalatedUndefined: Self = StObject.set(x, "escalated", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSeverity(value: String): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityNull: Self = StObject.set(x, "severity", null)
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSubscriberEmailAddresses(value: js.Array[String]): Self = StObject.set(x, "subscriberEmailAddresses", value.asInstanceOf[js.Any])
    
    inline def setSubscriberEmailAddressesNull: Self = StObject.set(x, "subscriberEmailAddresses", null)
    
    inline def setSubscriberEmailAddressesUndefined: Self = StObject.set(x, "subscriberEmailAddresses", js.undefined)
    
    inline def setSubscriberEmailAddressesVarargs(value: String*): Self = StObject.set(x, "subscriberEmailAddresses", js.Array(value*))
    
    inline def setTestCase(value: Boolean): Self = StObject.set(x, "testCase", value.asInstanceOf[js.Any])
    
    inline def setTestCaseNull: Self = StObject.set(x, "testCase", null)
    
    inline def setTestCaseUndefined: Self = StObject.set(x, "testCase", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
