package typings.jsforce

import typings.jsforce.connectionMod.Callback
import typings.jsforce.connectionMod.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiSoapMod {
  
  @JSImport("jsforce/api/soap", "SoapApi")
  @js.native
  open class SoapApi protected () extends StObject {
    def this(conn: Connection) = this()
    
    def convertLead(leadConverts: js.Array[LeadConvert]): js.Promise[LeadConvertResult | js.Array[LeadConvertResult]] = js.native
    def convertLead(
      leadConverts: js.Array[LeadConvert],
      callback: Callback[LeadConvertResult | js.Array[LeadConvertResult]]
    ): js.Promise[LeadConvertResult | js.Array[LeadConvertResult]] = js.native
    def convertLead(leadConverts: LeadConvert): js.Promise[LeadConvertResult | js.Array[LeadConvertResult]] = js.native
    def convertLead(leadConverts: LeadConvert, callback: Callback[LeadConvertResult | js.Array[LeadConvertResult]]): js.Promise[LeadConvertResult | js.Array[LeadConvertResult]] = js.native
    
    def create(sObjects: js.Array[js.Object]): js.Promise[SoapSaveResult] = js.native
    def create(sObjects: js.Array[js.Object], callback: Callback[SoapSaveResult]): js.Promise[SoapSaveResult] = js.native
    
    def delete(ids: js.Array[js.Object]): js.Promise[SoapDeleteResult] = js.native
    def delete(ids: js.Array[js.Object], callback: Callback[SoapDeleteResult]): js.Promise[SoapDeleteResult] = js.native
    
    def describeTabs(): js.Promise[js.Array[DescribeTabSetResult]] = js.native
    def describeTabs(callback: Callback[js.Array[DescribeTabSetResult]]): js.Promise[js.Array[DescribeTabSetResult]] = js.native
    
    def emptyRecycleBin(ids: js.Array[String]): js.Promise[js.Array[EmptyRecycleBinResult]] = js.native
    def emptyRecycleBin(ids: js.Array[String], callback: Callback[js.Array[EmptyRecycleBinResult]]): js.Promise[js.Array[EmptyRecycleBinResult]] = js.native
    
    def getServerTimestamp(): js.Promise[ServerTimestampResult] = js.native
    def getServerTimestamp(callback: Callback[ServerTimestampResult]): js.Promise[ServerTimestampResult] = js.native
    
    def getUserInfo(): js.Promise[UserInfoResult] = js.native
    def getUserInfo(callback: Callback[UserInfoResult]): js.Promise[UserInfoResult] = js.native
    
    def merge(mergeRequests: js.Array[MergeRequest]): js.Promise[MergeResult | js.Array[MergeResult]] = js.native
    def merge(mergeRequests: js.Array[MergeRequest], callback: Callback[MergeResult | js.Array[MergeResult]]): js.Promise[MergeResult | js.Array[MergeResult]] = js.native
    def merge(mergeRequests: MergeRequest): js.Promise[MergeResult | js.Array[MergeResult]] = js.native
    def merge(mergeRequests: MergeRequest, callback: Callback[MergeResult | js.Array[MergeResult]]): js.Promise[MergeResult | js.Array[MergeResult]] = js.native
    
    def setPassword(userId: String, password: String): js.Promise[ResetPasswordResult] = js.native
    def setPassword(userId: String, password: String, callback: Callback[String]): js.Promise[ResetPasswordResult] = js.native
    
    def update(sObjects: js.Array[js.Object]): js.Promise[SoapSaveResult] = js.native
    def update(sObjects: js.Array[js.Object], callback: Callback[SoapSaveResult]): js.Promise[SoapSaveResult] = js.native
    
    def upsert(externalIdFieldName: String, sObjects: js.Array[js.Object]): js.Promise[SoapUpsertResult] = js.native
    def upsert(externalIdFieldName: String, sObjects: js.Array[js.Object], callback: Callback[SoapUpsertResult]): js.Promise[SoapUpsertResult] = js.native
  }
  
  trait DescribeTab extends StObject {
    
    var colors: js.Array[js.Object]
    
    var custom: Boolean
    
    var iconUrl: js.Array[js.Object]
    
    var icons: js.Array[js.Object]
    
    var label: String
    
    var miniIconUrl: String
    
    var name: String
    
    var sobjectName: String
    
    var url: String
  }
  object DescribeTab {
    
    inline def apply(
      colors: js.Array[js.Object],
      custom: Boolean,
      iconUrl: js.Array[js.Object],
      icons: js.Array[js.Object],
      label: String,
      miniIconUrl: String,
      name: String,
      sobjectName: String,
      url: String
    ): DescribeTab = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], custom = custom.asInstanceOf[js.Any], iconUrl = iconUrl.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], miniIconUrl = miniIconUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sobjectName = sobjectName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeTab]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DescribeTab] (val x: Self) extends AnyVal {
      
      inline def setColors(value: js.Array[js.Object]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: js.Object*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setCustom(value: Boolean): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
      
      inline def setIconUrl(value: js.Array[js.Object]): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setIconUrlVarargs(value: js.Object*): Self = StObject.set(x, "iconUrl", js.Array(value*))
      
      inline def setIcons(value: js.Array[js.Object]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setIconsVarargs(value: js.Object*): Self = StObject.set(x, "icons", js.Array(value*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMiniIconUrl(value: String): Self = StObject.set(x, "miniIconUrl", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSobjectName(value: String): Self = StObject.set(x, "sobjectName", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait DescribeTabSetResult extends StObject {
    
    var label: String
    
    var logoUrl: String
    
    var namespace: String
    
    var selected: Boolean
    
    var tabs: js.Array[DescribeTab]
  }
  object DescribeTabSetResult {
    
    inline def apply(label: String, logoUrl: String, namespace: String, selected: Boolean, tabs: js.Array[DescribeTab]): DescribeTabSetResult = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], logoUrl = logoUrl.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[DescribeTabSetResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DescribeTabSetResult] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLogoUrl(value: String): Self = StObject.set(x, "logoUrl", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setTabs(value: js.Array[DescribeTab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsVarargs(value: DescribeTab*): Self = StObject.set(x, "tabs", js.Array(value*))
    }
  }
  
  trait EmptyRecycleBinResult extends StObject {
    
    var errors: js.Array[js.Object]
    
    var id: String
    
    var success: Boolean
  }
  object EmptyRecycleBinResult {
    
    inline def apply(errors: js.Array[js.Object], id: String, success: Boolean): EmptyRecycleBinResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmptyRecycleBinResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmptyRecycleBinResult] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[js.Object]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: js.Object*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait LeadConvert extends StObject {
    
    var accountId: js.UndefOr[String] = js.undefined
    
    var contactId: js.UndefOr[String] = js.undefined
    
    var convertedStatus: String
    
    var doNotCreateOpportunity: js.UndefOr[Boolean] = js.undefined
    
    var leadId: String
    
    var opportunityName: js.UndefOr[String] = js.undefined
    
    var overwriteLeadSource: js.UndefOr[Boolean] = js.undefined
    
    var ownerId: js.UndefOr[String] = js.undefined
    
    var sendNotificationEmail: js.UndefOr[Boolean] = js.undefined
  }
  object LeadConvert {
    
    inline def apply(convertedStatus: String, leadId: String): LeadConvert = {
      val __obj = js.Dynamic.literal(convertedStatus = convertedStatus.asInstanceOf[js.Any], leadId = leadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeadConvert]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LeadConvert] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
      
      inline def setContactIdUndefined: Self = StObject.set(x, "contactId", js.undefined)
      
      inline def setConvertedStatus(value: String): Self = StObject.set(x, "convertedStatus", value.asInstanceOf[js.Any])
      
      inline def setDoNotCreateOpportunity(value: Boolean): Self = StObject.set(x, "doNotCreateOpportunity", value.asInstanceOf[js.Any])
      
      inline def setDoNotCreateOpportunityUndefined: Self = StObject.set(x, "doNotCreateOpportunity", js.undefined)
      
      inline def setLeadId(value: String): Self = StObject.set(x, "leadId", value.asInstanceOf[js.Any])
      
      inline def setOpportunityName(value: String): Self = StObject.set(x, "opportunityName", value.asInstanceOf[js.Any])
      
      inline def setOpportunityNameUndefined: Self = StObject.set(x, "opportunityName", js.undefined)
      
      inline def setOverwriteLeadSource(value: Boolean): Self = StObject.set(x, "overwriteLeadSource", value.asInstanceOf[js.Any])
      
      inline def setOverwriteLeadSourceUndefined: Self = StObject.set(x, "overwriteLeadSource", js.undefined)
      
      inline def setOwnerId(value: String): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      inline def setSendNotificationEmail(value: Boolean): Self = StObject.set(x, "sendNotificationEmail", value.asInstanceOf[js.Any])
      
      inline def setSendNotificationEmailUndefined: Self = StObject.set(x, "sendNotificationEmail", js.undefined)
    }
  }
  
  trait LeadConvertResult extends StObject {
    
    var accountId: js.UndefOr[String] = js.undefined
    
    var contactId: js.UndefOr[String] = js.undefined
    
    var errors: js.Array[js.Object]
    
    var leadId: String
    
    var opportunityId: js.UndefOr[String] = js.undefined
    
    var success: Boolean
  }
  object LeadConvertResult {
    
    inline def apply(errors: js.Array[js.Object], leadId: String, success: Boolean): LeadConvertResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], leadId = leadId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[LeadConvertResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LeadConvertResult] (val x: Self) extends AnyVal {
      
      inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
      
      inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
      
      inline def setContactId(value: String): Self = StObject.set(x, "contactId", value.asInstanceOf[js.Any])
      
      inline def setContactIdUndefined: Self = StObject.set(x, "contactId", js.undefined)
      
      inline def setErrors(value: js.Array[js.Object]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: js.Object*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setLeadId(value: String): Self = StObject.set(x, "leadId", value.asInstanceOf[js.Any])
      
      inline def setOpportunityId(value: String): Self = StObject.set(x, "opportunityId", value.asInstanceOf[js.Any])
      
      inline def setOpportunityIdUndefined: Self = StObject.set(x, "opportunityId", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait MergeRequest extends StObject {
    
    var masterRecord: js.Object
    
    var recordToMergeIds: js.Array[String]
  }
  object MergeRequest {
    
    inline def apply(masterRecord: js.Object, recordToMergeIds: js.Array[String]): MergeRequest = {
      val __obj = js.Dynamic.literal(masterRecord = masterRecord.asInstanceOf[js.Any], recordToMergeIds = recordToMergeIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeRequest]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MergeRequest] (val x: Self) extends AnyVal {
      
      inline def setMasterRecord(value: js.Object): Self = StObject.set(x, "masterRecord", value.asInstanceOf[js.Any])
      
      inline def setRecordToMergeIds(value: js.Array[String]): Self = StObject.set(x, "recordToMergeIds", value.asInstanceOf[js.Any])
      
      inline def setRecordToMergeIdsVarargs(value: String*): Self = StObject.set(x, "recordToMergeIds", js.Array(value*))
    }
  }
  
  trait MergeResult extends StObject {
    
    var errors: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var id: String
    
    var mergedRecordIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var success: Boolean
    
    var updatedRelatedIds: js.UndefOr[js.Array[String]] = js.undefined
  }
  object MergeResult {
    
    inline def apply(id: String, success: Boolean): MergeResult = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[MergeResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MergeResult] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[js.Object]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setErrorsVarargs(value: js.Object*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMergedRecordIds(value: js.Array[String]): Self = StObject.set(x, "mergedRecordIds", value.asInstanceOf[js.Any])
      
      inline def setMergedRecordIdsUndefined: Self = StObject.set(x, "mergedRecordIds", js.undefined)
      
      inline def setMergedRecordIdsVarargs(value: String*): Self = StObject.set(x, "mergedRecordIds", js.Array(value*))
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setUpdatedRelatedIds(value: js.Array[String]): Self = StObject.set(x, "updatedRelatedIds", value.asInstanceOf[js.Any])
      
      inline def setUpdatedRelatedIdsUndefined: Self = StObject.set(x, "updatedRelatedIds", js.undefined)
      
      inline def setUpdatedRelatedIdsVarargs(value: String*): Self = StObject.set(x, "updatedRelatedIds", js.Array(value*))
    }
  }
  
  trait ResetPasswordResult extends StObject {
    
    var password: String
  }
  object ResetPasswordResult {
    
    inline def apply(password: String): ResetPasswordResult = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResetPasswordResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResetPasswordResult] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerTimestampResult extends StObject {
    
    var timestamp: String
  }
  object ServerTimestampResult {
    
    inline def apply(timestamp: String): ServerTimestampResult = {
      val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerTimestampResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerTimestampResult] (val x: Self) extends AnyVal {
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait SoapDeleteResult extends StObject {
    
    var errors: js.Array[js.Object]
    
    var id: String
    
    var success: Boolean
  }
  object SoapDeleteResult {
    
    inline def apply(errors: js.Array[js.Object], id: String, success: Boolean): SoapDeleteResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[SoapDeleteResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SoapDeleteResult] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[js.Object]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: js.Object*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait SoapSaveResult extends StObject {
    
    var errors: js.Array[js.Object]
    
    var id: String
    
    var success: Boolean
  }
  object SoapSaveResult {
    
    inline def apply(errors: js.Array[js.Object], id: String, success: Boolean): SoapSaveResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[SoapSaveResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SoapSaveResult] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[js.Object]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: js.Object*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait SoapUpsertResult extends StObject {
    
    var created: Boolean
    
    var errors: js.Array[js.Object]
    
    var id: String
    
    var success: Boolean
  }
  object SoapUpsertResult {
    
    inline def apply(created: Boolean, errors: js.Array[js.Object], id: String, success: Boolean): SoapUpsertResult = {
      val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[SoapUpsertResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SoapUpsertResult] (val x: Self) extends AnyVal {
      
      inline def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[js.Object]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: js.Object*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserInfoResult extends StObject {
    
    var accessibilityMode: Boolean
    
    var currencySymbol: String
    
    var orgAttachmentFileSizeLimit: Double
    
    var orgDefaultCurrencyIsoCode: String
    
    var orgDisallowHtmlAttachments: String
    
    var orgHasPersonAccounts: Boolean
    
    var organizationId: String
    
    var organizationMultiCurrency: Boolean
    
    var organizationName: String
    
    var profileId: String
    
    var roleId: String
    
    var sessionSecondsValid: Double
    
    var userDefaultCurrencyIsoCode: String
    
    var userEmail: String
    
    var userFullName: String
    
    var userId: String
    
    var userLanguage: String
    
    var userLocale: String
    
    var userName: String
    
    var userTimeZone: String
    
    var userType: String
    
    var userUiSkin: String
  }
  object UserInfoResult {
    
    inline def apply(
      accessibilityMode: Boolean,
      currencySymbol: String,
      orgAttachmentFileSizeLimit: Double,
      orgDefaultCurrencyIsoCode: String,
      orgDisallowHtmlAttachments: String,
      orgHasPersonAccounts: Boolean,
      organizationId: String,
      organizationMultiCurrency: Boolean,
      organizationName: String,
      profileId: String,
      roleId: String,
      sessionSecondsValid: Double,
      userDefaultCurrencyIsoCode: String,
      userEmail: String,
      userFullName: String,
      userId: String,
      userLanguage: String,
      userLocale: String,
      userName: String,
      userTimeZone: String,
      userType: String,
      userUiSkin: String
    ): UserInfoResult = {
      val __obj = js.Dynamic.literal(accessibilityMode = accessibilityMode.asInstanceOf[js.Any], currencySymbol = currencySymbol.asInstanceOf[js.Any], orgAttachmentFileSizeLimit = orgAttachmentFileSizeLimit.asInstanceOf[js.Any], orgDefaultCurrencyIsoCode = orgDefaultCurrencyIsoCode.asInstanceOf[js.Any], orgDisallowHtmlAttachments = orgDisallowHtmlAttachments.asInstanceOf[js.Any], orgHasPersonAccounts = orgHasPersonAccounts.asInstanceOf[js.Any], organizationId = organizationId.asInstanceOf[js.Any], organizationMultiCurrency = organizationMultiCurrency.asInstanceOf[js.Any], organizationName = organizationName.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any], roleId = roleId.asInstanceOf[js.Any], sessionSecondsValid = sessionSecondsValid.asInstanceOf[js.Any], userDefaultCurrencyIsoCode = userDefaultCurrencyIsoCode.asInstanceOf[js.Any], userEmail = userEmail.asInstanceOf[js.Any], userFullName = userFullName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any], userLanguage = userLanguage.asInstanceOf[js.Any], userLocale = userLocale.asInstanceOf[js.Any], userName = userName.asInstanceOf[js.Any], userTimeZone = userTimeZone.asInstanceOf[js.Any], userType = userType.asInstanceOf[js.Any], userUiSkin = userUiSkin.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserInfoResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UserInfoResult] (val x: Self) extends AnyVal {
      
      inline def setAccessibilityMode(value: Boolean): Self = StObject.set(x, "accessibilityMode", value.asInstanceOf[js.Any])
      
      inline def setCurrencySymbol(value: String): Self = StObject.set(x, "currencySymbol", value.asInstanceOf[js.Any])
      
      inline def setOrgAttachmentFileSizeLimit(value: Double): Self = StObject.set(x, "orgAttachmentFileSizeLimit", value.asInstanceOf[js.Any])
      
      inline def setOrgDefaultCurrencyIsoCode(value: String): Self = StObject.set(x, "orgDefaultCurrencyIsoCode", value.asInstanceOf[js.Any])
      
      inline def setOrgDisallowHtmlAttachments(value: String): Self = StObject.set(x, "orgDisallowHtmlAttachments", value.asInstanceOf[js.Any])
      
      inline def setOrgHasPersonAccounts(value: Boolean): Self = StObject.set(x, "orgHasPersonAccounts", value.asInstanceOf[js.Any])
      
      inline def setOrganizationId(value: String): Self = StObject.set(x, "organizationId", value.asInstanceOf[js.Any])
      
      inline def setOrganizationMultiCurrency(value: Boolean): Self = StObject.set(x, "organizationMultiCurrency", value.asInstanceOf[js.Any])
      
      inline def setOrganizationName(value: String): Self = StObject.set(x, "organizationName", value.asInstanceOf[js.Any])
      
      inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
      
      inline def setRoleId(value: String): Self = StObject.set(x, "roleId", value.asInstanceOf[js.Any])
      
      inline def setSessionSecondsValid(value: Double): Self = StObject.set(x, "sessionSecondsValid", value.asInstanceOf[js.Any])
      
      inline def setUserDefaultCurrencyIsoCode(value: String): Self = StObject.set(x, "userDefaultCurrencyIsoCode", value.asInstanceOf[js.Any])
      
      inline def setUserEmail(value: String): Self = StObject.set(x, "userEmail", value.asInstanceOf[js.Any])
      
      inline def setUserFullName(value: String): Self = StObject.set(x, "userFullName", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserLanguage(value: String): Self = StObject.set(x, "userLanguage", value.asInstanceOf[js.Any])
      
      inline def setUserLocale(value: String): Self = StObject.set(x, "userLocale", value.asInstanceOf[js.Any])
      
      inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      inline def setUserTimeZone(value: String): Self = StObject.set(x, "userTimeZone", value.asInstanceOf[js.Any])
      
      inline def setUserType(value: String): Self = StObject.set(x, "userType", value.asInstanceOf[js.Any])
      
      inline def setUserUiSkin(value: String): Self = StObject.set(x, "userUiSkin", value.asInstanceOf[js.Any])
    }
  }
}
