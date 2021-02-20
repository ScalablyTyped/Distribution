package typings.knuddelsUserappsApi.mod.global

import typings.knuddelsUserappsApi.anon.Data
import typings.knuddelsUserappsApi.mod.KnuddelsEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_fromHexString
    			 */
    /* static member */
    @JSGlobal("Client.Color.fromHexString")
    @js.native
    def fromHexString(colorString: java.lang.String): typings.knuddelsUserappsApi.mod.global.Client.Color = js.native
    
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_fromRGB
    			 */
    /* static member */
    @JSGlobal("Client.Color.fromRGB")
    @js.native
    def fromRGB(red: Double, green: Double, blue: Double): typings.knuddelsUserappsApi.mod.global.Client.Color = js.native
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
  @JSGlobal("Client.addConnectionTypeChangeListener")
  @js.native
  def addConnectionTypeChangeListener(callback: js.Function1[/* type */ java.lang.String, Unit]): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_addEventListener
  		 */
  /* static member */
  @JSGlobal("Client.addEventListener")
  @js.native
  def addEventListener(`type`: java.lang.String, callback: js.Function1[/* event */ Data, Unit]): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_close
  		 */
  /* static member */
  @JSGlobal("Client.close")
  @js.native
  def close(): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_dispatchEvent
  		 */
  /* static member */
  @JSGlobal("Client.dispatchEvent")
  @js.native
  def dispatchEvent(event: typings.std.Event): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_executeSlashCommand
  		 */
  /* static member */
  @JSGlobal("Client.executeSlashCommand")
  @js.native
  def executeSlashCommand(command: java.lang.String): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_freeSound
  		 */
  /* static member */
  @JSGlobal("Client.freeSound")
  @js.native
  def freeSound(fileName: java.lang.String): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getCacheInvalidationId
  		 */
  /* static member */
  @JSGlobal("Client.getCacheInvalidationId")
  @js.native
  def getCacheInvalidationId(): java.lang.String = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getClientType
  		 */
  /* static member */
  @JSGlobal("Client.getClientType")
  @js.native
  def getClientType(): ClientType = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getDirectConnection
  		 */
  /* static member */
  @JSGlobal("Client.getDirectConnection")
  @js.native
  def getDirectConnection(): js.Promise[Unit] = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getHostFrame
  		 */
  /* static member */
  @JSGlobal("Client.getHostFrame")
  @js.native
  def getHostFrame(): HostFrame = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getNick
  		 */
  /* static member */
  @JSGlobal("Client.getNick")
  @js.native
  def getNick(): java.lang.String = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_includeCSS
  		 */
  /* static member */
  @JSGlobal("Client.includeCSS")
  @js.native
  def includeCSS(files: java.lang.String*): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_includeJS
  		 */
  /* static member */
  @JSGlobal("Client.includeJS")
  @js.native
  def includeJS(files: java.lang.String*): Unit = js.native
  
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
  @JSGlobal("Client.playSound")
  @js.native
  def playSound(fileName: java.lang.String): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_prefetchSound
  		 */
  /* static member */
  @JSGlobal("Client.prefetchSound")
  @js.native
  def prefetchSound(fileName: java.lang.String): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_removeConnectionTypeChangeListener
  		 */
  /* static member */
  @JSGlobal("Client.removeConnectionTypeChangeListener")
  @js.native
  def removeConnectionTypeChangeListener(callback: js.Function1[/* type */ java.lang.String, Unit]): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_removeEventListener
  		 */
  /* static member */
  @JSGlobal("Client.removeEventListener")
  @js.native
  def removeEventListener(`type`: java.lang.String): Unit = js.native
  @JSGlobal("Client.removeEventListener")
  @js.native
  def removeEventListener(`type`: java.lang.String, callback: js.Function1[/* event */ Data, Unit]): Unit = js.native
  
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_sendEvent
  		 */
  /* static member */
  @JSGlobal("Client.sendEvent")
  @js.native
  def sendEvent(`type`: java.lang.String, data: KnuddelsEvent): Unit = js.native
}
