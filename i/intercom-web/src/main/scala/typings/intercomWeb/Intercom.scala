package typings.intercomWeb

import org.scalablytyped.runtime.StringDictionary
import typings.intercomWeb.intercomWebStrings.avatar
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Intercom {
  
  trait IntercomAvatar extends StObject {
    
    var image_url: String
    
    var `type`: avatar
  }
  object IntercomAvatar {
    
    inline def apply(image_url: String): IntercomAvatar = {
      val __obj = js.Dynamic.literal(image_url = image_url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("avatar")
      __obj.asInstanceOf[IntercomAvatar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntercomAvatar] (val x: Self) extends AnyVal {
      
      inline def setImage_url(value: String): Self = StObject.set(x, "image_url", value.asInstanceOf[js.Any])
      
      inline def setType(value: avatar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof intercom-web.Intercom_.IntercomCommandSignature */ /* Rewritten from type alias, can be one of: 
    - typings.intercomWeb.intercomWebStrings.boot
    - typings.intercomWeb.intercomWebStrings.shutdown
    - typings.intercomWeb.intercomWebStrings.update
    - typings.intercomWeb.intercomWebStrings.hide
    - typings.intercomWeb.intercomWebStrings.show
    - typings.intercomWeb.intercomWebStrings.showMessages
    - typings.intercomWeb.intercomWebStrings.showNewMessage
    - typings.intercomWeb.intercomWebStrings.onHide
    - typings.intercomWeb.intercomWebStrings.onShow
    - typings.intercomWeb.intercomWebStrings.onUnreadCountChange
    - typings.intercomWeb.intercomWebStrings.onActivatorClick
    - typings.intercomWeb.intercomWebStrings.trackEvent
    - typings.intercomWeb.intercomWebStrings.getVisitorId
    - typings.intercomWeb.intercomWebStrings.startTour
    - typings.intercomWeb.intercomWebStrings.showArticle
    - typings.intercomWeb.intercomWebStrings.startSurvey
    - typings.intercomWeb.intercomWebStrings.reattach_activator
    - typings.intercomWeb.intercomWebStrings.showSpace
  */
  trait IntercomCommand extends StObject
  
  @js.native
  trait IntercomCommandSignature extends StObject {
    
    def boot(settings: IntercomSettings): Unit = js.native
    
    def getVisitorId(): String = js.native
    
    def hide(): Unit = js.native
    
    def onActivatorClick(callback: js.Function0[Unit]): Unit = js.native
    
    def onHide(callback: js.Function0[Unit]): Unit = js.native
    
    def onShow(callback: js.Function0[Unit]): Unit = js.native
    
    def onUnreadCountChange(callback: js.Function1[/* unreadCount */ Double, Unit]): Unit = js.native
    
    def reattach_activator(): Unit = js.native
    
    def show(): Unit = js.native
    
    def showArticle(articleId: Double): Unit = js.native
    
    def showMessages(): Unit = js.native
    
    def showNewMessage(): Unit = js.native
    def showNewMessage(prepopulateMessage: String): Unit = js.native
    
    def showSpace(space: String): Unit = js.native
    
    def shutdown(): Unit = js.native
    
    def startSurvey(surveyId: Double): Unit = js.native
    
    def startTour(tourId: Double): Unit = js.native
    
    def trackEvent(): Unit = js.native
    def trackEvent(tag: String): Unit = js.native
    def trackEvent(tag: String, metadata: Any): Unit = js.native
    def trackEvent(tag: Unit, metadata: Any): Unit = js.native
    
    def update(): Unit = js.native
    def update(settings: IntercomSettings): Unit = js.native
  }
  
  trait IntercomCompany
    extends StObject
       with /* custom_attribute */ StringDictionary[IntercomCustomAttribute] {
    
    var company_id: js.UndefOr[String | Double] = js.undefined
    
    var created_at: js.UndefOr[Double] = js.undefined
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var industry: js.UndefOr[String] = js.undefined
    
    var monthly_spend: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var plan: js.UndefOr[String] = js.undefined
    
    var remote_created_at: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var user_count: js.UndefOr[Double] = js.undefined
    
    var website: js.UndefOr[String] = js.undefined
  }
  object IntercomCompany {
    
    inline def apply(name: String): IntercomCompany = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntercomCompany]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntercomCompany] (val x: Self) extends AnyVal {
      
      inline def setCompany_id(value: String | Double): Self = StObject.set(x, "company_id", value.asInstanceOf[js.Any])
      
      inline def setCompany_idUndefined: Self = StObject.set(x, "company_id", js.undefined)
      
      inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndustry(value: String): Self = StObject.set(x, "industry", value.asInstanceOf[js.Any])
      
      inline def setIndustryUndefined: Self = StObject.set(x, "industry", js.undefined)
      
      inline def setMonthly_spend(value: Double): Self = StObject.set(x, "monthly_spend", value.asInstanceOf[js.Any])
      
      inline def setMonthly_spendUndefined: Self = StObject.set(x, "monthly_spend", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPlan(value: String): Self = StObject.set(x, "plan", value.asInstanceOf[js.Any])
      
      inline def setPlanUndefined: Self = StObject.set(x, "plan", js.undefined)
      
      inline def setRemote_created_at(value: Double): Self = StObject.set(x, "remote_created_at", value.asInstanceOf[js.Any])
      
      inline def setRemote_created_atUndefined: Self = StObject.set(x, "remote_created_at", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setUser_count(value: Double): Self = StObject.set(x, "user_count", value.asInstanceOf[js.Any])
      
      inline def setUser_countUndefined: Self = StObject.set(x, "user_count", js.undefined)
      
      inline def setWebsite(value: String): Self = StObject.set(x, "website", value.asInstanceOf[js.Any])
      
      inline def setWebsiteUndefined: Self = StObject.set(x, "website", js.undefined)
    }
  }
  
  type IntercomCustomAttribute = js.UndefOr[String | Double | Boolean | Null]
  
  trait IntercomSettings
    extends StObject
       with // Custom attributes
  /* custom_attribute */ StringDictionary[
          IntercomCompany | js.Array[IntercomCompany] | IntercomAvatar | IntercomCustomAttribute
        ] {
    
    var action_color: js.UndefOr[String] = js.undefined
    
    var alignment: js.UndefOr[String] = js.undefined
    
    var api_base: js.UndefOr[String] = js.undefined
    
    // Messenger attributes
    var app_id: js.UndefOr[String] = js.undefined
    
    var avatar: js.UndefOr[IntercomAvatar] = js.undefined
    
    var background_color: js.UndefOr[String] = js.undefined
    
    var companies: js.UndefOr[js.Array[IntercomCompany]] = js.undefined
    
    var company: js.UndefOr[IntercomCompany] = js.undefined
    
    var created_at: js.UndefOr[Double] = js.undefined
    
    var custom_launcher_selector: js.UndefOr[String] = js.undefined
    
    // Data attributes
    var email: js.UndefOr[String] = js.undefined
    
    var hide_default_launcher: js.UndefOr[Boolean] = js.undefined
    
    var horizontal_padding: js.UndefOr[Double] = js.undefined
    
    var language_override: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var phone: js.UndefOr[String] = js.undefined
    
    var session_duration: js.UndefOr[Double] = js.undefined
    
    var unsubscribed_from_emails: js.UndefOr[Boolean] = js.undefined
    
    var user_hash: js.UndefOr[String] = js.undefined
    
    var user_id: js.UndefOr[String] = js.undefined
    
    var utm_campaign: js.UndefOr[String] = js.undefined
    
    var utm_content: js.UndefOr[String] = js.undefined
    
    var utm_medium: js.UndefOr[String] = js.undefined
    
    var utm_source: js.UndefOr[String] = js.undefined
    
    var utm_term: js.UndefOr[String] = js.undefined
    
    var vertical_padding: js.UndefOr[Double] = js.undefined
  }
  object IntercomSettings {
    
    inline def apply(): IntercomSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntercomSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IntercomSettings] (val x: Self) extends AnyVal {
      
      inline def setAction_color(value: String): Self = StObject.set(x, "action_color", value.asInstanceOf[js.Any])
      
      inline def setAction_colorUndefined: Self = StObject.set(x, "action_color", js.undefined)
      
      inline def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setApi_base(value: String): Self = StObject.set(x, "api_base", value.asInstanceOf[js.Any])
      
      inline def setApi_baseUndefined: Self = StObject.set(x, "api_base", js.undefined)
      
      inline def setApp_id(value: String): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
      
      inline def setApp_idUndefined: Self = StObject.set(x, "app_id", js.undefined)
      
      inline def setAvatar(value: IntercomAvatar): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setBackground_color(value: String): Self = StObject.set(x, "background_color", value.asInstanceOf[js.Any])
      
      inline def setBackground_colorUndefined: Self = StObject.set(x, "background_color", js.undefined)
      
      inline def setCompanies(value: js.Array[IntercomCompany]): Self = StObject.set(x, "companies", value.asInstanceOf[js.Any])
      
      inline def setCompaniesUndefined: Self = StObject.set(x, "companies", js.undefined)
      
      inline def setCompaniesVarargs(value: IntercomCompany*): Self = StObject.set(x, "companies", js.Array(value*))
      
      inline def setCompany(value: IntercomCompany): Self = StObject.set(x, "company", value.asInstanceOf[js.Any])
      
      inline def setCompanyUndefined: Self = StObject.set(x, "company", js.undefined)
      
      inline def setCreated_at(value: Double): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
      
      inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
      
      inline def setCustom_launcher_selector(value: String): Self = StObject.set(x, "custom_launcher_selector", value.asInstanceOf[js.Any])
      
      inline def setCustom_launcher_selectorUndefined: Self = StObject.set(x, "custom_launcher_selector", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setHide_default_launcher(value: Boolean): Self = StObject.set(x, "hide_default_launcher", value.asInstanceOf[js.Any])
      
      inline def setHide_default_launcherUndefined: Self = StObject.set(x, "hide_default_launcher", js.undefined)
      
      inline def setHorizontal_padding(value: Double): Self = StObject.set(x, "horizontal_padding", value.asInstanceOf[js.Any])
      
      inline def setHorizontal_paddingUndefined: Self = StObject.set(x, "horizontal_padding", js.undefined)
      
      inline def setLanguage_override(value: String): Self = StObject.set(x, "language_override", value.asInstanceOf[js.Any])
      
      inline def setLanguage_overrideUndefined: Self = StObject.set(x, "language_override", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setSession_duration(value: Double): Self = StObject.set(x, "session_duration", value.asInstanceOf[js.Any])
      
      inline def setSession_durationUndefined: Self = StObject.set(x, "session_duration", js.undefined)
      
      inline def setUnsubscribed_from_emails(value: Boolean): Self = StObject.set(x, "unsubscribed_from_emails", value.asInstanceOf[js.Any])
      
      inline def setUnsubscribed_from_emailsUndefined: Self = StObject.set(x, "unsubscribed_from_emails", js.undefined)
      
      inline def setUser_hash(value: String): Self = StObject.set(x, "user_hash", value.asInstanceOf[js.Any])
      
      inline def setUser_hashUndefined: Self = StObject.set(x, "user_hash", js.undefined)
      
      inline def setUser_id(value: String): Self = StObject.set(x, "user_id", value.asInstanceOf[js.Any])
      
      inline def setUser_idUndefined: Self = StObject.set(x, "user_id", js.undefined)
      
      inline def setUtm_campaign(value: String): Self = StObject.set(x, "utm_campaign", value.asInstanceOf[js.Any])
      
      inline def setUtm_campaignUndefined: Self = StObject.set(x, "utm_campaign", js.undefined)
      
      inline def setUtm_content(value: String): Self = StObject.set(x, "utm_content", value.asInstanceOf[js.Any])
      
      inline def setUtm_contentUndefined: Self = StObject.set(x, "utm_content", js.undefined)
      
      inline def setUtm_medium(value: String): Self = StObject.set(x, "utm_medium", value.asInstanceOf[js.Any])
      
      inline def setUtm_mediumUndefined: Self = StObject.set(x, "utm_medium", js.undefined)
      
      inline def setUtm_source(value: String): Self = StObject.set(x, "utm_source", value.asInstanceOf[js.Any])
      
      inline def setUtm_sourceUndefined: Self = StObject.set(x, "utm_source", js.undefined)
      
      inline def setUtm_term(value: String): Self = StObject.set(x, "utm_term", value.asInstanceOf[js.Any])
      
      inline def setUtm_termUndefined: Self = StObject.set(x, "utm_term", js.undefined)
      
      inline def setVertical_padding(value: Double): Self = StObject.set(x, "vertical_padding", value.asInstanceOf[js.Any])
      
      inline def setVertical_paddingUndefined: Self = StObject.set(x, "vertical_padding", js.undefined)
    }
  }
  
  @js.native
  trait IntercomStatic extends StObject {
    
    def apply[Command /* <: IntercomCommand */](
      command: Command,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type Parameters<IntercomCommandSignature[Command]> is not an array type */ params: Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: intercom-web.Intercom_.IntercomCommandSignature[Command] */ js.Any
        ]
    ): ReturnType[
        /* import warning: importer.ImportType#apply Failed type conversion: intercom-web.Intercom_.IntercomCommandSignature[Command] */ js.Any
      ] = js.native
    
    var booted: Boolean = js.native
  }
}
