package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.Data
import typings.knuddelsUserappsApi.mod.KnuddelsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * @see https://developer.knuddels.de/docs/classes/Client.html
	 */
@JSGlobal("Client")
@js.native
class Client () extends StObject
/**
	 * @see https://developer.knuddels.de/docs/classes/Client.Color.html
	 */
/**
	 * @see https://developer.knuddels.de/docs/classes/Client.Event.html
	 */
/**
	 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html
	 */
object Client {
  
  @JSGlobal("Client")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Client.Color")
  @js.native
  class Color () extends StObject {
    
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_asHexString
    			 */
    def asHexString(): java.lang.String = js.native
    
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
    @scala.inline
    def fromHexString(colorString: java.lang.String): typings.knuddelsUserappsApi.mod.global.Client.Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHexString")(colorString.asInstanceOf[js.Any]).asInstanceOf[typings.knuddelsUserappsApi.mod.global.Client.Color]
    
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_fromRGB
    			 */
    /* static member */
    @scala.inline
    def fromRGB(red: Double, green: Double, blue: Double): typings.knuddelsUserappsApi.mod.global.Client.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("fromRGB")(red.asInstanceOf[js.Any], green.asInstanceOf[js.Any], blue.asInstanceOf[js.Any])).asInstanceOf[typings.knuddelsUserappsApi.mod.global.Client.Color]
  }
  
  @JSGlobal("Client.Event")
  @js.native
  class Event protected () extends StObject {
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Event.html#method_Event
    			 */
    def this(`type`: java.lang.String, data: KnuddelsEvent) = this()
  }
  
  @JSGlobal("Client.HostFrame")
  @js.native
  class HostFrame () extends StObject {
    
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_focus
    			 * @since Applet: 9.0bwj, AppServer: 84904
    			 */
    def focus(): Unit = js.native
    
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_getAppViewMode
    			 * @since Applet: 9.0byl
    			 */
    def getAppViewMode(): java.lang.String = js.native
    
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_getBrowserType
    			 * @since Applet: 9.0bzp
    			 */
    def getBrowserType(): java.lang.String = js.native
    
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setBackgroundColor
    			 */
    def setBackgroundColor(newColor: typings.knuddelsUserappsApi.mod.global.Client.Color): Unit = js.native
    def setBackgroundColor(newColor: typings.knuddelsUserappsApi.mod.global.Client.Color, durationMillis: Double): Unit = js.native
    
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setIcons
    			 * @since Applet: 9.0bwj, AppServer: 84904
    			 */
    def setIcons(path: java.lang.String*): Unit = js.native
    
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
    def setTitle(newTitle: java.lang.String): Unit = js.native
  }
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_addConnectionTypeChangeListener
  		 */
  /* static member */
  @scala.inline
  def addConnectionTypeChangeListener(callback: js.Function1[/* type */ java.lang.String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addConnectionTypeChangeListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_addEventListener
  		 */
  /* static member */
  @scala.inline
  def addEventListener(`type`: java.lang.String, callback: js.Function1[/* event */ Data, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addEventListener")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_close
  		 */
  /* static member */
  @scala.inline
  def close(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("close")().asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_dispatchEvent
  		 */
  /* static member */
  @scala.inline
  def dispatchEvent(event: typings.std.Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispatchEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_executeSlashCommand
  		 */
  /* static member */
  @scala.inline
  def executeSlashCommand(command: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("executeSlashCommand")(command.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_freeSound
  		 */
  /* static member */
  @scala.inline
  def freeSound(fileName: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("freeSound")(fileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getCacheInvalidationId
  		 */
  /* static member */
  @scala.inline
  def getCacheInvalidationId(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCacheInvalidationId")().asInstanceOf[java.lang.String]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getClientType
  		 */
  /* static member */
  @scala.inline
  def getClientType(): ClientType = ^.asInstanceOf[js.Dynamic].applyDynamic("getClientType")().asInstanceOf[ClientType]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getDirectConnection
  		 */
  /* static member */
  @scala.inline
  def getDirectConnection(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectConnection")().asInstanceOf[js.Promise[Unit]]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getHostFrame
  		 */
  /* static member */
  @scala.inline
  def getHostFrame(): HostFrame = ^.asInstanceOf[js.Dynamic].applyDynamic("getHostFrame")().asInstanceOf[HostFrame]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getNick
  		 */
  /* static member */
  @scala.inline
  def getNick(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getNick")().asInstanceOf[java.lang.String]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_includeCSS
  		 */
  /* static member */
  @scala.inline
  def includeCSS(files: java.lang.String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("includeCSS")(files.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_includeJS
  		 */
  /* static member */
  @scala.inline
  def includeJS(files: java.lang.String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("includeJS")(files.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#property_pageData
  		 */
  /* static member */
  @JSGlobal("Client.pageData")
  @js.native
  def pageData: Json = js.native
  @scala.inline
  def pageData_=(x: Json): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pageData")(x.asInstanceOf[js.Any])
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_playSound
  		 */
  /* static member */
  @scala.inline
  def playSound(fileName: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("playSound")(fileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_prefetchSound
  		 */
  /* static member */
  @scala.inline
  def prefetchSound(fileName: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prefetchSound")(fileName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_removeConnectionTypeChangeListener
  		 */
  /* static member */
  @scala.inline
  def removeConnectionTypeChangeListener(callback: js.Function1[/* type */ java.lang.String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeConnectionTypeChangeListener")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_removeEventListener
  		 */
  /* static member */
  @scala.inline
  def removeEventListener(`type`: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def removeEventListener(`type`: java.lang.String, callback: js.Function1[/* event */ Data, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeEventListener")(`type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_sendEvent
  		 */
  /* static member */
  @scala.inline
  def sendEvent(`type`: java.lang.String, data: KnuddelsEvent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sendEvent")(`type`.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
