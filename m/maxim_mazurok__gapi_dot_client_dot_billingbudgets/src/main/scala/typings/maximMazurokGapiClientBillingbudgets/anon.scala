package typings.maximMazurokGapiClientBillingbudgets

import typings.maximMazurokGapiClientBillingbudgets.gapi.client.billingbudgets.GoogleCloudBillingBudgetsV1Budget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accesstoken extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Required. The name of the billing account to create the budget in. Values are of the form `billingAccounts/{billingAccountId}`. */
    var parent: String
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Request body */
    var resource: GoogleCloudBillingBudgetsV1Budget
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Accesstoken {
    
    @scala.inline
    def apply(parent: String, resource: GoogleCloudBillingBudgetsV1Budget): Accesstoken = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accesstoken]
    }
    
    @scala.inline
    implicit class AccesstokenMutableBuilder[Self <: Accesstoken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setResource(value: GoogleCloudBillingBudgetsV1Budget): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  trait Alt extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Required. The name of the billing account to create the budget in. Values are of the form `billingAccounts/{billingAccountId}`. */
    var parent: String
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Alt {
    
    @scala.inline
    def apply(parent: String): Alt = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Alt]
    }
    
    @scala.inline
    implicit class AltMutableBuilder[Self <: Alt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  trait Callback extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** Required. Name of budget to get. Values are of the form `billingAccounts/{billingAccountId}/budgets/{budgetId}`. */
    var name: String
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Callback {
    
    @scala.inline
    def apply(name: String): Callback = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback]
    }
    
    @scala.inline
    implicit class CallbackMutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Optional. The maximum number of budgets to return per page. The default and maximum value are 100. */
    var pageSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional. The value returned by the last `ListBudgetsResponse` which indicates that this is a continuation of a prior `ListBudgets` call, and that the system should return the
      * next page of data.
      */
    var pageToken: js.UndefOr[String] = js.undefined
    
    /** Required. Name of billing account to list budgets under. Values are of the form `billingAccounts/{billingAccountId}`. */
    var parent: String
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Fields {
    
    @scala.inline
    def apply(parent: String): Fields = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
      
      @scala.inline
      def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
      
      @scala.inline
      def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** Output only. Resource name of the budget. The resource name implies the scope of a budget. Values are of the form `billingAccounts/{billingAccountId}/budgets/{budgetId}`. */
    var name: String
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /** Request body */
    var resource: GoogleCloudBillingBudgetsV1Budget
    
    /**
      * Optional. Indicates which fields in the provided budget to update. Read-only fields (such as `name`) cannot be changed. If this is not provided, then only fields with
      * non-default values from the request are updated. See https://developers.google.com/protocol-buffers/docs/proto3#default for more details about default values.
      */
    var updateMask: js.UndefOr[String] = js.undefined
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Key {
    
    @scala.inline
    def apply(name: String, resource: GoogleCloudBillingBudgetsV1Budget): Key = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setResource(value: GoogleCloudBillingBudgetsV1Budget): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    /** V1 error format. */
    @JSName("$.xgafv")
    var $Dotxgafv: js.UndefOr[String] = js.undefined
    
    /** OAuth access token. */
    var access_token: js.UndefOr[String] = js.undefined
    
    /** Data format for response. */
    var alt: js.UndefOr[String] = js.undefined
    
    /** JSONP */
    var callback: js.UndefOr[String] = js.undefined
    
    /** Selector specifying which fields to include in a partial response. */
    var fields: js.UndefOr[String] = js.undefined
    
    /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
    var key: js.UndefOr[String] = js.undefined
    
    /** Output only. Resource name of the budget. The resource name implies the scope of a budget. Values are of the form `billingAccounts/{billingAccountId}/budgets/{budgetId}`. */
    var name: String
    
    /** OAuth 2.0 token for the current user. */
    var oauth_token: js.UndefOr[String] = js.undefined
    
    /** Returns response with indentations and line breaks. */
    var prettyPrint: js.UndefOr[Boolean] = js.undefined
    
    /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
    var quotaUser: js.UndefOr[String] = js.undefined
    
    /**
      * Optional. Indicates which fields in the provided budget to update. Read-only fields (such as `name`) cannot be changed. If this is not provided, then only fields with
      * non-default values from the request are updated. See https://developers.google.com/protocol-buffers/docs/proto3#default for more details about default values.
      */
    var updateMask: js.UndefOr[String] = js.undefined
    
    /** Legacy upload protocol for media (e.g. "media", "multipart"). */
    var uploadType: js.UndefOr[String] = js.undefined
    
    /** Upload protocol for media (e.g. "raw", "multipart"). */
    var upload_protocol: js.UndefOr[String] = js.undefined
  }
  object Name {
    
    @scala.inline
    def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$Dotxgafv(value: String): Self = StObject.set(x, "$.xgafv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$DotxgafvUndefined: Self = StObject.set(x, "$.xgafv", js.undefined)
      
      @scala.inline
      def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def setCallback(value: String): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_token(value: String): Self = StObject.set(x, "oauth_token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOauth_tokenUndefined: Self = StObject.set(x, "oauth_token", js.undefined)
      
      @scala.inline
      def setPrettyPrint(value: Boolean): Self = StObject.set(x, "prettyPrint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyPrintUndefined: Self = StObject.set(x, "prettyPrint", js.undefined)
      
      @scala.inline
      def setQuotaUser(value: String): Self = StObject.set(x, "quotaUser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaUserUndefined: Self = StObject.set(x, "quotaUser", js.undefined)
      
      @scala.inline
      def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
      
      @scala.inline
      def setUploadType(value: String): Self = StObject.set(x, "uploadType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadTypeUndefined: Self = StObject.set(x, "uploadType", js.undefined)
      
      @scala.inline
      def setUpload_protocol(value: String): Self = StObject.set(x, "upload_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpload_protocolUndefined: Self = StObject.set(x, "upload_protocol", js.undefined)
    }
  }
}
