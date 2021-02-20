package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Container.
  */
@js.native
trait SchemaContainer extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * The Container ID uniquely identifies the GTM Container.
    */
  var containerId: js.UndefOr[String] = js.native
  
  /**
    * Optional list of domain names associated with the Container.
    */
  var domainName: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * List of enabled built-in variables. Valid values include: pageUrl,
    * pageHostname, pagePath, referrer, event, clickElement, clickClasses,
    * clickId, clickTarget, clickUrl, clickText, formElement, formClasses,
    * formId, formTarget, formUrl, formText, errorMessage, errorUrl, errorLine,
    * newHistoryFragment, oldHistoryFragment, newHistoryState, oldHistoryState,
    * historySource, containerVersion, debugMode, randomNumber, containerId.
    */
  var enabledBuiltInVariable: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The fingerprint of the GTM Container as computed at storage time. This
    * value is recomputed whenever the account is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * Container display name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Container Notes.
    */
  var notes: js.UndefOr[String] = js.native
  
  /**
    * Container Public ID.
    */
  var publicId: js.UndefOr[String] = js.native
  
  /**
    * Container Country ID.
    */
  var timeZoneCountryId: js.UndefOr[String] = js.native
  
  /**
    * Container Time Zone ID.
    */
  var timeZoneId: js.UndefOr[String] = js.native
  
  /**
    * List of Usage Contexts for the Container. Valid values include: web,
    * android, ios.
    */
  var usageContext: js.UndefOr[js.Array[String]] = js.native
}
object SchemaContainer {
  
  @scala.inline
  def apply(): SchemaContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContainer]
  }
  
  @scala.inline
  implicit class SchemaContainerMutableBuilder[Self <: SchemaContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setDomainName(value: js.Array[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setDomainNameVarargs(value: String*): Self = StObject.set(x, "domainName", js.Array(value :_*))
    
    @scala.inline
    def setEnabledBuiltInVariable(value: js.Array[String]): Self = StObject.set(x, "enabledBuiltInVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledBuiltInVariableUndefined: Self = StObject.set(x, "enabledBuiltInVariable", js.undefined)
    
    @scala.inline
    def setEnabledBuiltInVariableVarargs(value: String*): Self = StObject.set(x, "enabledBuiltInVariable", js.Array(value :_*))
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIdUndefined: Self = StObject.set(x, "publicId", js.undefined)
    
    @scala.inline
    def setTimeZoneCountryId(value: String): Self = StObject.set(x, "timeZoneCountryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneCountryIdUndefined: Self = StObject.set(x, "timeZoneCountryId", js.undefined)
    
    @scala.inline
    def setTimeZoneId(value: String): Self = StObject.set(x, "timeZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneIdUndefined: Self = StObject.set(x, "timeZoneId", js.undefined)
    
    @scala.inline
    def setUsageContext(value: js.Array[String]): Self = StObject.set(x, "usageContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageContextUndefined: Self = StObject.set(x, "usageContext", js.undefined)
    
    @scala.inline
    def setUsageContextVarargs(value: String*): Self = StObject.set(x, "usageContext", js.Array(value :_*))
  }
}
