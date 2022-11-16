package typings.knuddelsWebappFrontendApi

import org.scalablytyped.runtime.StringDictionary
import typings.knuddelsWebappFrontendApi.anon.Data
import typings.knuddelsWebappFrontendApi.mod.global.Json
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // API
  object global {
    
    /**
      * @see https://developer.knuddels.de/docs/classes/Client.html
      */
    @JSGlobal("Client")
    @js.native
    open class Client () extends StObject
    object Client {
      
      @JSGlobal("Client")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.Color.html
        */
      @JSGlobal("Client.Color")
      @js.native
      open class Color () extends StObject {
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_asHexString
          */
        def asHexString(): String = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_getBlue
          */
        def getBlue(): Double = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_getGreen
          */
        def getGreen(): Double = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_getRed
          */
        def getRed(): Double = js.native
      }
      object Color {
        
        @JSGlobal("Client.Color")
        @js.native
        val ^ : js.Any = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_fromHexString
          */
        /* static member */
        inline def fromHexString(colorString: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHexString")(colorString.asInstanceOf[js.Any]).asInstanceOf[Color]
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_fromRGB
          */
        /* static member */
        inline def fromRGB(red: Double, green: Double, blue: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRGB")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[Color]
      }
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.Event.html
        */
      // tslint:disable-next-line:no-unnecessary-class
      @JSGlobal("Client.Event")
      @js.native
      open class Event protected () extends StObject {
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.Event.html#method_Event
          */
        def this(`type`: String, data: KnuddelsEvent) = this()
      }
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html
        */
      @JSGlobal("Client.HostFrame")
      @js.native
      open class HostFrame () extends StObject {
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_focus
          * @since Applet: 9.0bwj, AppServer: 84904
          */
        def focus(): Unit = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_getAppViewMode
          * @since Applet: 9.0byl
          */
        def getAppViewMode(): String = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_getBrowserType
          * @since Applet: 9.0bzp
          */
        def getBrowserType(): String = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_getBrowserVersion
          * @since STAPP: b210331
          */
        def getBrowserVersion(): String = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setBackgroundColor
          */
        def setBackgroundColor(newColor: Color): Unit = js.native
        def setBackgroundColor(newColor: Color, durationMillis: Double): Unit = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setIcons
          * @since Applet: 9.0bwj, AppServer: 84904
          */
        def setIcons(path: String*): Unit = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setMaxSize
          */
        def setMaxSize(width: Double, height: Double): Unit = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setMinSize
          */
        def setMinSize(width: Double, height: Double): Unit = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setResizable
          */
        def setResizable(resizable: Boolean): Unit = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setSize
          * @since Applet: 9.0bwj, AppServer: 84516
          */
        def setSize(width: Double, height: Double): Unit = js.native
        
        /**
          * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setTitle
          */
        def setTitle(newTitle: String): Unit = js.native
      }
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_addConnectionTypeChangeListener
        */
      inline def addConnectionTypeChangeListener(callback: js.Function1[/* type */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addConnectionTypeChangeListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_addEventListener
        */
      inline def addEventListener(`type`: String, callback: js.Function1[/* event */ Data, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_close
        */
      inline def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_dispatchEvent
        */
      inline def dispatchEvent(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_executeSlashCommand
        */
      inline def executeSlashCommand(command: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("executeSlashCommand")(command.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_freeSound
        */
      inline def freeSound(fileName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeSound")(fileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_getCacheInvalidationId
        */
      inline def getCacheInvalidationId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheInvalidationId")().asInstanceOf[String]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_getClientType
        */
      inline def getClientType(): ClientType = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientType")().asInstanceOf[ClientType]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_getDirectConnection
        */
      inline def getDirectConnection(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectConnection")().asInstanceOf[js.Promise[Unit]]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_getHostFrame
        */
      inline def getHostFrame(): HostFrame = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostFrame")().asInstanceOf[HostFrame]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_getNick
        */
      inline def getNick(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNick")().asInstanceOf[String]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_includeCSS
        */
      inline def includeCSS(files: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("includeCSS")(files.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_includeJS
        */
      inline def includeJS(files: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("includeJS")(files.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_isK3Client
        */
      inline def isK3Client(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isK3Client")().asInstanceOf[Boolean]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#property_pageData
        */
      @JSGlobal("Client.pageData")
      @js.native
      val pageData: Json = js.native
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_playSound
        */
      inline def playSound(fileName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playSound")(fileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_prefetchSound
        */
      inline def prefetchSound(fileName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prefetchSound")(fileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_removeConnectionTypeChangeListener
        */
      inline def removeConnectionTypeChangeListener(callback: js.Function1[/* type */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeConnectionTypeChangeListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_removeEventListener
        */
      inline def removeEventListener(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def removeEventListener(`type`: String, callback: js.Function1[/* event */ Data, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * @see https://developer.knuddels.de/docs/classes/Client.html#method_sendEvent
        */
      inline def sendEvent(`type`: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sendEvent")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
      inline def sendEvent(`type`: String, data: KnuddelsEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEvent")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /**
      * @see https://developer.knuddels.de/docs/classes/ClientType.html
      */
    @JSGlobal("ClientType")
    @js.native
    open class ClientType () extends StObject
    object ClientType {
      
      /**
        * @see https://developer.knuddels.de/docs/classes/ClientType.html#property_Android
        */
      @JSGlobal("ClientType.Android")
      @js.native
      val Android: ClientType = js.native
      
      /**
        * @see https://developer.knuddels.de/docs/classes/ClientType.html#property_Applet
        */
      @JSGlobal("ClientType.Applet")
      @js.native
      val Applet: ClientType = js.native
      
      /**
        * @see https://developer.knuddels.de/docs/classes/ClientType.html#property_Browser
        */
      @JSGlobal("ClientType.Browser")
      @js.native
      val Browser: ClientType = js.native
      
      /**
        * @see https://developer.knuddels.de/docs/classes/ClientType.html#property_IOS
        */
      @JSGlobal("ClientType.IOS")
      @js.native
      val IOS: ClientType = js.native
      
      /**
        * @see https://developer.knuddels.de/docs/classes/ClientType.html#property_MobileWeb
        */
      @JSGlobal("ClientType.MobileWeb")
      @js.native
      val MobileWeb: ClientType = js.native
      
      /**
        * @see https://developer.knuddels.de/docs/classes/ClientType.html#property_Offline
        */
      @JSGlobal("ClientType.Offline")
      @js.native
      val Offline: ClientType = js.native
      
      /**
        * @see https://developer.knuddels.de/docs/classes/ClientType.html#property_Web
        */
      @JSGlobal("ClientType.Web")
      @js.native
      val Web: ClientType = js.native
    }
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type Json = {[x: string] : knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.JsonData | undefined}
    }}}
    to avoid circular code involving: 
    - knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.<global>.Json
    - knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.<global>.JsonArray
    - knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.<global>.KnuddelsEventArray
    - knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.JsonData
    - knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.KnuddelsEvent
    */
    trait Json
      extends StObject
         with /* x */ StringDictionary[js.UndefOr[JsonData]]
    object Json {
      
      inline def apply(): Json = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Json]
      }
    }
    
    type JsonArray = js.Array[JsonData]
    
    /** 
    NOTE: Rewritten from type alias:
    {{{
    type KnuddelsEventArray = std.Array<string | knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.<global>.Json | knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.<global>.KnuddelsEventArray>
    }}}
    to avoid circular code involving: 
    - knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.<global>.KnuddelsEventArray
    */
    @js.native
    trait KnuddelsEventArray
      extends StObject
         with Array[String | Json | KnuddelsEventArray]
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type JsonData = string | number | boolean | std.Date | knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.<global>.Json | knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.<global>.JsonArray | undefined
  }}}
  to avoid circular code involving: 
  - knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.<global>.JsonArray
  - knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.JsonData
  */
  type JsonData = js.UndefOr[String | Double | Boolean | js.Date | Json | Any]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type KnuddelsEvent = string | knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.<global>.Json | knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.<global>.KnuddelsEventArray
  }}}
  to avoid circular code involving: 
  - knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.<global>.KnuddelsEventArray
  - knuddels-webapp-frontend-api.knuddels-webapp-frontend-api.KnuddelsEvent
  */
  type KnuddelsEvent = String | Json | Any
}
