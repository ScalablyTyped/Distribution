package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Container.
  */
@js.native
trait SchemaContainer extends js.Object {
  
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
  implicit class SchemaContainerOps[Self <: SchemaContainer] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setDomainNameVarargs(value: String*): Self = this.set("domainName", js.Array(value :_*))
    
    @scala.inline
    def setDomainName(value: js.Array[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setEnabledBuiltInVariableVarargs(value: String*): Self = this.set("enabledBuiltInVariable", js.Array(value :_*))
    
    @scala.inline
    def setEnabledBuiltInVariable(value: js.Array[String]): Self = this.set("enabledBuiltInVariable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledBuiltInVariable: Self = this.set("enabledBuiltInVariable", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setPublicId(value: String): Self = this.set("publicId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicId: Self = this.set("publicId", js.undefined)
    
    @scala.inline
    def setTimeZoneCountryId(value: String): Self = this.set("timeZoneCountryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneCountryId: Self = this.set("timeZoneCountryId", js.undefined)
    
    @scala.inline
    def setTimeZoneId(value: String): Self = this.set("timeZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneId: Self = this.set("timeZoneId", js.undefined)
    
    @scala.inline
    def setUsageContextVarargs(value: String*): Self = this.set("usageContext", js.Array(value :_*))
    
    @scala.inline
    def setUsageContext(value: js.Array[String]): Self = this.set("usageContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsageContext: Self = this.set("usageContext", js.undefined)
  }
}
