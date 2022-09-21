package typings.kakaoJsSdk

import typings.kakaoJsSdk.Kakao.API.ApiResponse
import typings.kakaoJsSdk.Kakao.Auth.AuthStatusObject
import typings.kakaoJsSdk.Kakao.Link.DefaultSettings
import typings.kakaoJsSdk.Kakao.Link.ImageInfos
import typings.kakaoJsSdk.anon.Always
import typings.kakaoJsSdk.anon.Callback
import typings.kakaoJsSdk.anon.ChannelPublicId
import typings.kakaoJsSdk.anon.Color
import typings.kakaoJsSdk.anon.Container
import typings.kakaoJsSdk.anon.CoordType
import typings.kakaoJsSdk.anon.Fail
import typings.kakaoJsSdk.anon.File
import typings.kakaoJsSdk.anon.Id
import typings.kakaoJsSdk.anon.ImageUrl
import typings.kakaoJsSdk.anon.Install
import typings.kakaoJsSdk.anon.InstallTalk
import typings.kakaoJsSdk.anon.Name
import typings.kakaoJsSdk.anon.PersistAccessToken
import typings.kakaoJsSdk.anon.Prompts
import typings.kakaoJsSdk.anon.RequestUrl
import typings.kakaoJsSdk.anon.ServerCallbackArgs
import typings.kakaoJsSdk.anon.Size
import typings.kakaoJsSdk.anon.Text
import typings.kakaoJsSdk.anon.Url
import typings.kakaoJsSdk.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Kakao {
    
    @JSGlobal("Kakao")
    @js.native
    val ^ : js.Any = js.native
    
    object API {
      
      @JSGlobal("Kakao.API")
      @js.native
      val ^ : js.Any = js.native
      
      // api responses
      inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
      
      /**
        * request Kakao API
        * API Referehce: https://developers.kakao.com/docs/latest/ko/reference/rest-api-reference
        */
      inline def request(settings: Always): js.Promise[ApiResponse] = ^.asInstanceOf[js.Dynamic].applyDynamic("request")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ApiResponse]]
    }
    
    object Auth {
      
      @JSGlobal("Kakao.Auth")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * version 1.39.16,
        * if autoLogin is true and user agent has not string 'KAKAOTALK', return false
        * but authorize function has not other return, so return type set void
        */
      inline def authorize(settings: Prompts): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("authorize")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
      
      inline def createLoginButton(settings: Container): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoginButton")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def getAccessToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccessToken")().asInstanceOf[String]
      
      inline def getAppKey(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAppKey")().asInstanceOf[String]
      
      /**
        * @deprecated
        */
      inline def getRefreshToken(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getRefreshToken")().asInstanceOf[Unit]
      
      inline def getStatusInfo(callback: js.Function1[/* object */ AuthStatusObject, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getStatusInfo")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def login(settings: Fail): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("login")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def loginForm(settings: PersistAccessToken): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loginForm")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * logout function callback param is always true
        * but reference writen just function
        * so callback typing void function: () => void
        */
      inline def logout(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def setAccessToken(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccessToken")().asInstanceOf[Unit]
      inline def setAccessToken(token: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setAccessToken")(token.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def setAccessToken(token: String, persist: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAccessToken")(token.asInstanceOf[js.Any], persist.asInstanceOf[js.Any])).asInstanceOf[Unit]
      inline def setAccessToken(token: Null, persist: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAccessToken")(token.asInstanceOf[js.Any], persist.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      // persist default true
      /**
        * @deprecated
        */
      inline def setRefreshToken(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setRefreshToken")().asInstanceOf[Unit]
    }
    
    object Channel {
      
      @JSGlobal("Kakao.Channel")
      @js.native
      val ^ : js.Any = js.native
      
      inline def addChannel(settings: ChannelPublicId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addChannel")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def chat(settings: ChannelPublicId): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chat")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
      
      inline def createAddChannelButton(settings: Size): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createAddChannelButton")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def createChatButton(settings: Color): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createChatButton")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    object Link {
      
      @JSGlobal("Kakao.Link")
      @js.native
      val ^ : js.Any = js.native
      
      inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
      
      inline def createCustomButton(settings: Callback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createCustomButton")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def createDefaultButton(settings: `0` & DefaultSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultButton")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def createScrapButton(settings: InstallTalk): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createScrapButton")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def deleteImage(settings: ImageUrl): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteImage")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
      
      inline def scrapImage(settings: ImageUrl): js.Promise[ImageInfos] = ^.asInstanceOf[js.Dynamic].applyDynamic("scrapImage")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageInfos]]
      
      inline def sendCustom(settings: ServerCallbackArgs): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendCustom")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def sendDefault(settings: DefaultSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendDefault")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def sendScrap(settings: RequestUrl): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendScrap")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def uploadImage(settings: File): js.Promise[ImageInfos] = ^.asInstanceOf[js.Dynamic].applyDynamic("uploadImage")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ImageInfos]]
    }
    
    object Navi {
      
      @JSGlobal("Kakao.Navi")
      @js.native
      val ^ : js.Any = js.native
      
      inline def share(settings: CoordType): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("share")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      // Reference: https://developers.kakao.com/sdk/reference/js/release/Kakao.Navi.html#.start
      inline def start(settings: Name): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    object Story {
      
      @JSGlobal("Kakao.Story")
      @js.native
      val ^ : js.Any = js.native
      
      inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
      
      inline def createFollowButton(settings: Id): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createFollowButton")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def createShareButton(settings: Text): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("createShareButton")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def open(settings: Install): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      inline def share(settings: Url): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("share")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSGlobal("Kakao.VERSION")
    @js.native
    val VERSION: String = js.native
    
    inline def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
    
    inline def init(appKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(appKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def isInitialized(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInitialized")().asInstanceOf[Boolean]
  }
}
