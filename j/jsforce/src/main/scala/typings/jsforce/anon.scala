package typings.jsforce

import typings.jsforce.connectionMod.Callback
import typings.jsforce.describeResultMod.DescribeGlobalResult
import typings.jsforce.describeResultMod.DescribeSObjectOptions
import typings.jsforce.describeResultMod.DescribeSObjectResult
import typings.jsforce.salesforceIdMod.SalesforceId
import typings.jsforce.salesforceObjectMod.ApprovalLayoutInfo
import typings.jsforce.salesforceObjectMod.CompactLayoutInfo
import typings.jsforce.salesforceObjectMod.LayoutInfo
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Body extends StObject {
    
    var body: String | Null
    
    var created_date: Date | Null
  }
  object Body {
    
    @scala.inline
    def apply(): Body = {
      val __obj = js.Dynamic.literal(body = null, created_date = null)
      __obj.asInstanceOf[Body]
    }
    
    @scala.inline
    implicit class BodyMutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setCreated_date(value: Date): Self = StObject.set(x, "created_date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreated_dateNull: Self = StObject.set(x, "created_date", null)
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    /** Returns a value from the cache if it exists, otherwise calls Connection.describe */
    def apply(`type`: String): DescribeSObjectResult = js.native
    def apply(`type`: String, callback: js.Function2[/* err */ Error, /* result */ DescribeSObjectResult, Unit]): DescribeSObjectResult = js.native
    def apply(`type`: DescribeSObjectOptions): DescribeSObjectResult = js.native
    def apply(
      `type`: DescribeSObjectOptions,
      callback: js.Function2[/* err */ Error, /* result */ DescribeSObjectResult, Unit]
    ): DescribeSObjectResult = js.native
    
    def clear(): Unit = js.native
  }
  
  @js.native
  trait CallCallback extends StObject {
    
    /** Returns a value from the cache if it exists, otherwise calls SObject.compactLayouts */
    def apply(): CompactLayoutInfo = js.native
    def apply(callback: Callback[CompactLayoutInfo]): CompactLayoutInfo = js.native
    
    def clear(): Unit = js.native
  }
  
  @js.native
  trait CallCallbackClear extends StObject {
    
    /** Returns a value from the cache if it exists, otherwise calls SObject.describe */
    def apply(): DescribeSObjectResult = js.native
    def apply(callback: Callback[DescribeSObjectResult]): DescribeSObjectResult = js.native
    
    def clear(): Unit = js.native
  }
  
  @js.native
  trait CallClear extends StObject {
    
    /** Returns a value from the cache if it exists, otherwise calls SObject.approvalLayouts */
    def apply(): ApprovalLayoutInfo = js.native
    def apply(callback: Callback[ApprovalLayoutInfo]): ApprovalLayoutInfo = js.native
    
    def clear(): Unit = js.native
  }
  
  @js.native
  trait CallLayoutNameCallback extends StObject {
    
    def apply(): LayoutInfo = js.native
    def apply(layoutName: String): LayoutInfo = js.native
    def apply(layoutName: String, callback: Callback[LayoutInfo]): LayoutInfo = js.native
    def apply(layoutName: Unit, callback: Callback[LayoutInfo]): LayoutInfo = js.native
    
    def clear(): Unit = js.native
  }
  
  @js.native
  trait Clear extends StObject {
    
    /** Returns a value from the cache if it exists, otherwise calls Connection.describeGlobal */
    def apply(): DescribeGlobalResult = js.native
    def apply(callback: js.Function2[/* err */ Error, /* result */ DescribeGlobalResult, Unit]): DescribeGlobalResult = js.native
    
    def clear(): Unit = js.native
  }
  
  trait CreatedDate extends StObject {
    
    var createdDate: String
    
    var replayId: js.UndefOr[Double] = js.undefined
    
    var `type`: String
  }
  object CreatedDate {
    
    @scala.inline
    def apply(createdDate: String, `type`: String): CreatedDate = {
      val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreatedDate]
    }
    
    @scala.inline
    implicit class CreatedDateMutableBuilder[Self <: CreatedDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplayId(value: Double): Self = StObject.set(x, "replayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplayIdUndefined: Self = StObject.set(x, "replayId", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Customdomain extends StObject {
    
    var custom_domain: js.UndefOr[String] = js.undefined
    
    var enterprise: String
    
    var feed_elements: String
    
    var feed_items: String
    
    var feeds: String
    
    var groups: String
    
    var metadata: String
    
    var partner: String
    
    var profile: String
    
    var query: String
    
    var recent: String
    
    var rest: String
    
    var search: String
    
    var sobjects: String
    
    var tooling_rest: String
    
    var tooling_soap: String
    
    var users: String
  }
  object Customdomain {
    
    @scala.inline
    def apply(
      enterprise: String,
      feed_elements: String,
      feed_items: String,
      feeds: String,
      groups: String,
      metadata: String,
      partner: String,
      profile: String,
      query: String,
      recent: String,
      rest: String,
      search: String,
      sobjects: String,
      tooling_rest: String,
      tooling_soap: String,
      users: String
    ): Customdomain = {
      val __obj = js.Dynamic.literal(enterprise = enterprise.asInstanceOf[js.Any], feed_elements = feed_elements.asInstanceOf[js.Any], feed_items = feed_items.asInstanceOf[js.Any], feeds = feeds.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], partner = partner.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], recent = recent.asInstanceOf[js.Any], rest = rest.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], sobjects = sobjects.asInstanceOf[js.Any], tooling_rest = tooling_rest.asInstanceOf[js.Any], tooling_soap = tooling_soap.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
      __obj.asInstanceOf[Customdomain]
    }
    
    @scala.inline
    implicit class CustomdomainMutableBuilder[Self <: Customdomain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustom_domain(value: String): Self = StObject.set(x, "custom_domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustom_domainUndefined: Self = StObject.set(x, "custom_domain", js.undefined)
      
      @scala.inline
      def setEnterprise(value: String): Self = StObject.set(x, "enterprise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeed_elements(value: String): Self = StObject.set(x, "feed_elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeed_items(value: String): Self = StObject.set(x, "feed_items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeeds(value: String): Self = StObject.set(x, "feeds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroups(value: String): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPartner(value: String): Self = StObject.set(x, "partner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecent(value: String): Self = StObject.set(x, "recent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRest(value: String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSobjects(value: String): Self = StObject.set(x, "sobjects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooling_rest(value: String): Self = StObject.set(x, "tooling_rest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooling_soap(value: String): Self = StObject.set(x, "tooling_soap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsers(value: String): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtIdField extends StObject {
    
    var extIdField: js.UndefOr[String] = js.undefined
  }
  object ExtIdField {
    
    @scala.inline
    def apply(): ExtIdField = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtIdField]
    }
    
    @scala.inline
    implicit class ExtIdFieldMutableBuilder[Self <: ExtIdField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtIdField(value: String): Self = StObject.set(x, "extIdField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtIdFieldUndefined: Self = StObject.set(x, "extIdField", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var Id: js.UndefOr[SalesforceId] = js.undefined
  }
  object Id {
    
    @scala.inline
    def apply(): Id = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: SalesforceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    }
  }
  
  /* Inlined std.Partial<jsforce.jsforce/connection.PartialOAuth2Options> */
  trait PartialPartialOAuth2Optio extends StObject {
    
    var authzServiceUrl: js.UndefOr[String] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var loginUrl: js.UndefOr[String] = js.undefined
    
    var redirectUri: js.UndefOr[String] = js.undefined
    
    var tokenServiceUrl: js.UndefOr[String] = js.undefined
  }
  object PartialPartialOAuth2Optio {
    
    @scala.inline
    def apply(): PartialPartialOAuth2Optio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialPartialOAuth2Optio]
    }
    
    @scala.inline
    implicit class PartialPartialOAuth2OptioMutableBuilder[Self <: PartialPartialOAuth2Optio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthzServiceUrl(value: String): Self = StObject.set(x, "authzServiceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthzServiceUrlUndefined: Self = StObject.set(x, "authzServiceUrl", js.undefined)
      
      @scala.inline
      def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      @scala.inline
      def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      @scala.inline
      def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoginUrlUndefined: Self = StObject.set(x, "loginUrl", js.undefined)
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      @scala.inline
      def setTokenServiceUrl(value: String): Self = StObject.set(x, "tokenServiceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenServiceUrlUndefined: Self = StObject.set(x, "tokenServiceUrl", js.undefined)
    }
  }
  
  trait Picture extends StObject {
    
    var picture: String
    
    var thumbnail: String
  }
  object Picture {
    
    @scala.inline
    def apply(picture: String, thumbnail: String): Picture = {
      val __obj = js.Dynamic.literal(picture = picture.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
      __obj.asInstanceOf[Picture]
    }
    
    @scala.inline
    implicit class PictureMutableBuilder[Self <: Picture] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPicture(value: String): Self = StObject.set(x, "picture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scope extends StObject {
    
    var scope: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object Scope {
    
    @scala.inline
    def apply(): Scope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scope]
    }
    
    @scala.inline
    implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
