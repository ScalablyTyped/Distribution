package typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_

import typings.knuddelsDashUserappsDashApi.Anon_Data
import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod.KnuddelsEvent
import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.Client.Event
import typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.Client.HostFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/Client.html
	 */
@JSGlobal("Client")
@js.native
class Client () extends js.Object

/* static members */
/**
	 * @see https://developer.knuddels.de/docs/classes/Client.Color.html
	 */
/**
	 * @see https://developer.knuddels.de/docs/classes/Client.Event.html
	 */
/**
	 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html
	 */
@JSGlobal("Client")
@js.native
object Client extends js.Object {
  @js.native
  class Color () extends js.Object {
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
  
  @js.native
  class Event protected () extends js.Object {
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Event.html#method_Event
    			 */
    def this(`type`: java.lang.String, data: KnuddelsEvent) = this()
  }
  
  @js.native
  class HostFrame () extends js.Object {
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
    def setBackgroundColor(newColor: typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.Client.Color): Unit = js.native
    def setBackgroundColor(
      newColor: typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.Client.Color,
      durationMillis: Double
    ): Unit = js.native
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
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#property_pageData
  		 */
  var pageData: Json = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_addConnectionTypeChangeListener
  		 */
  def addConnectionTypeChangeListener(callback: js.Function1[/* type */ java.lang.String, Unit]): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_addEventListener
  		 */
  def addEventListener(`type`: java.lang.String, callback: js.Function1[/* event */ Anon_Data, Unit]): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_close
  		 */
  def close(): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_dispatchEvent
  		 */
  def dispatchEvent(event: Event): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_executeSlashCommand
  		 */
  def executeSlashCommand(command: java.lang.String): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_freeSound
  		 */
  def freeSound(fileName: java.lang.String): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getCacheInvalidationId
  		 */
  def getCacheInvalidationId(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getClientType
  		 */
  def getClientType(): ClientType = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getDirectConnection
  		 */
  def getDirectConnection(): js.Promise[Unit] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getHostFrame
  		 */
  def getHostFrame(): HostFrame = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_getNick
  		 */
  def getNick(): java.lang.String = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_includeCSS
  		 */
  def includeCSS(files: java.lang.String*): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_includeJS
  		 */
  def includeJS(files: java.lang.String*): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_playSound
  		 */
  def playSound(fileName: java.lang.String): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_prefetchSound
  		 */
  def prefetchSound(fileName: java.lang.String): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_removeConnectionTypeChangeListener
  		 */
  def removeConnectionTypeChangeListener(callback: js.Function1[/* type */ java.lang.String, Unit]): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_removeEventListener
  		 */
  def removeEventListener(`type`: java.lang.String): Unit = js.native
  def removeEventListener(`type`: java.lang.String, callback: js.Function1[/* event */ Anon_Data, Unit]): Unit = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/Client.html#method_sendEvent
  		 */
  def sendEvent(`type`: java.lang.String, data: KnuddelsEvent): Unit = js.native
  /* static members */
  @js.native
  object Color extends js.Object {
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_fromHexString
    			 */
    def fromHexString(colorString: java.lang.String): typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.Client.Color = js.native
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_fromRGB
    			 */
    def fromRGB(red: Double, green: Double, blue: Double): typings.knuddelsDashUserappsDashApi.knuddelsDashUserappsDashApiMod._Global_.Client.Color = js.native
  }
  
}

