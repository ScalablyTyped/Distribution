package typings.knuddelsUserappBackendApi.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html
  * @since AppServer 20210803-133329
  */
@JSGlobal("GlobalAppConfig")
@js.native
open class GlobalAppConfig protected () extends StObject {
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_GlobalAppConfig
    */
  def this(
    globalAppId: java.lang.String,
    displayName: java.lang.String,
    openRequestHandler: js.Function2[/* user */ User, /* globalAppInstance */ GlobalAppInstance, AppContent]
  ) = this()
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getAllowedGenders
    */
  def getAllowedGenders(): js.Array[Gender] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getAllowedUserIds
    */
  def getAllowedUserIds(): js.Array[Double] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getBlockedUserIds
    */
  def getBlockedUserIds(): js.Array[Double] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getCategories
    */
  def getCategories(): js.Array[GlobalAppCategory] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getDisplayName
    */
  def getDisplayName(): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getFeaturedCardColor
    */
  def getFeaturedCardColor(): Color = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getFeaturedImagePath
    */
  def getFeaturedImagePath(): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getId
    */
  def getId(): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getImagePath
    */
  def getImagePath(): java.lang.String = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getMaxAge
    */
  def getMaxAge(): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getMinAge
    */
  def getMinAge(): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getMinRegDays
    */
  def getMinRegDays(): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getMinStatus
    */
  def getMinStatus(): UserStatus = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getOpenRequestHandler
    */
  def getOpenRequestHandler(): js.UndefOr[
    js.Function2[/* user */ User, /* globalAppInstance */ GlobalAppInstance, AppContent]
  ] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getSessionOpenedCallback
    */
  def getSessionOpenedCallback(): js.UndefOr[js.Function1[/* appContentSession */ AppContentSession, Unit]] = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_getShowDeveloper
    */
  def getShowDeveloper(): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_isRestrictToOneIp
    */
  def isRestrictToOneIp(): Boolean = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setAllowedGenders
    */
  def setAllowedGenders(allowedGenders: js.Array[Gender]*): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setAllowedUserIds
    */
  def setAllowedUserIds(allowedUserIds: js.Array[Double]): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setBlockedUserIds
    */
  def setBlockedUserIds(blockedUserIds: js.Array[Double]): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setCategories
    */
  def setCategories(categories: GlobalAppCategory*): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setDisplayName
    */
  def setDisplayName(displayName: java.lang.String): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setFeaturedCardColor
    */
  def setFeaturedCardColor(featuredCardColor: Color): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setFeaturedImagePath
    */
  def setFeaturedImagePath(): Unit = js.native
  def setFeaturedImagePath(featuredImagePath: java.lang.String): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setImagePath
    */
  def setImagePath(): Unit = js.native
  def setImagePath(imagePath: java.lang.String): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setMaxAge
    */
  def setMaxAge(maxAge: Double): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setMinAge
    */
  def setMinAge(minAge: Double): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setMinRegDays
    */
  def setMinRegDays(minRegDays: Double): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setMinStatus
    */
  def setMinStatus(minStatus: UserStatus): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setOpenRequestHandler
    */
  def setOpenRequestHandler(
    openRequestHandler: js.Function2[/* user */ User, /* globalAppInstance */ GlobalAppInstance, AppContent]
  ): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setRestrictToOneIp
    */
  def setRestrictToOneIp(restrictToOneIp: Boolean): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setSessionOpenedCallback
    */
  def setSessionOpenedCallback(): Unit = js.native
  def setSessionOpenedCallback(sessionOpenedCallback: js.Function1[/* appContentSession */ AppContentSession, Unit]): Unit = js.native
  
  /**
    * @see https://developer.knuddels.de/docs/classes/GlobalAppConfig.html#method_setShowDeveloper
    */
  def setShowDeveloper(): Unit = js.native
  def setShowDeveloper(showDeveloper: Boolean): Unit = js.native
}
