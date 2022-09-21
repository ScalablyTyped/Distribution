package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContainer extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Container ID uniquely identifies the GTM Container.
    */
  var containerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional list of domain names associated with the Container. @mutable tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
    */
  var domainName: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * List of enabled built-in variables. Valid values include: pageUrl, pageHostname, pagePath, referrer, event, clickElement, clickClasses, clickId, clickTarget, clickUrl, clickText, formElement, formClasses, formId, formTarget, formUrl, formText, errorMessage, errorUrl, errorLine, newHistoryFragment, oldHistoryFragment, newHistoryState, oldHistoryState, historySource, containerVersion, debugMode, randomNumber, containerId. @mutable tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
    */
  var enabledBuiltInVariable: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The fingerprint of the GTM Container as computed at storage time. This value is recomputed whenever the account is modified.
    */
  var fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Container display name. @mutable tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Container Notes. @mutable tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
    */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Container Public ID.
    */
  var publicId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Container Country ID. @mutable tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
    */
  var timeZoneCountryId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Container Time Zone ID. @mutable tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
    */
  var timeZoneId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of Usage Contexts for the Container. Valid values include: web, android, ios. @mutable tagmanager.accounts.containers.create @mutable tagmanager.accounts.containers.update
    */
  var usageContext: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaContainer {
  
  inline def apply(): SchemaContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainer]
  }
  
  extension [Self <: SchemaContainer](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdNull: Self = StObject.set(x, "containerId", null)
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setDomainName(value: js.Array[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameNull: Self = StObject.set(x, "domainName", null)
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setDomainNameVarargs(value: String*): Self = StObject.set(x, "domainName", js.Array(value*))
    
    inline def setEnabledBuiltInVariable(value: js.Array[String]): Self = StObject.set(x, "enabledBuiltInVariable", value.asInstanceOf[js.Any])
    
    inline def setEnabledBuiltInVariableNull: Self = StObject.set(x, "enabledBuiltInVariable", null)
    
    inline def setEnabledBuiltInVariableUndefined: Self = StObject.set(x, "enabledBuiltInVariable", js.undefined)
    
    inline def setEnabledBuiltInVariableVarargs(value: String*): Self = StObject.set(x, "enabledBuiltInVariable", js.Array(value*))
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    inline def setPublicIdNull: Self = StObject.set(x, "publicId", null)
    
    inline def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
    
    inline def setTimeZoneCountryId(value: String): Self = StObject.set(x, "timeZoneCountryId", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneCountryIdNull: Self = StObject.set(x, "timeZoneCountryId", null)
    
    inline def setTimeZoneCountryIdUndefined: Self = StObject.set(x, "timeZoneCountryId", js.undefined)
    
    inline def setTimeZoneId(value: String): Self = StObject.set(x, "timeZoneId", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneIdNull: Self = StObject.set(x, "timeZoneId", null)
    
    inline def setTimeZoneIdUndefined: Self = StObject.set(x, "timeZoneId", js.undefined)
    
    inline def setUsageContext(value: js.Array[String]): Self = StObject.set(x, "usageContext", value.asInstanceOf[js.Any])
    
    inline def setUsageContextNull: Self = StObject.set(x, "usageContext", null)
    
    inline def setUsageContextUndefined: Self = StObject.set(x, "usageContext", js.undefined)
    
    inline def setUsageContextVarargs(value: String*): Self = StObject.set(x, "usageContext", js.Array(value*))
  }
}
