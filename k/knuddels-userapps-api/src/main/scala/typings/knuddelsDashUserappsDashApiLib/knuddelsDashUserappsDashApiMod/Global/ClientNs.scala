package typings
package knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
object ClientNs extends js.Object {
  @js.native
  class Color () extends js.Object {
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_asHexString
    			 */
    def asHexString(): java.lang.String = js.native
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_getBlue
    			 */
    def getBlue(): scala.Double = js.native
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_getGreen
    			 */
    def getGreen(): scala.Double = js.native
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_getRed
    			 */
    def getRed(): scala.Double = js.native
  }
  
  @js.native
  class Event protected () extends js.Object {
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Event.html#method_Event
    			 */
    def this(`type`: java.lang.String, data: knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.KnuddelsEvent) = this()
  }
  
  @js.native
  class HostFrame () extends js.Object {
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_focus
    			 * @since Applet: 9.0bwj, AppServer: 84904
    			 */
    def focus(): scala.Unit = js.native
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
    def setBackgroundColor(newColor: Color): scala.Unit = js.native
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setBackgroundColor
    			 */
    def setBackgroundColor(newColor: Color, durationMillis: scala.Double): scala.Unit = js.native
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setIcons
    			 * @since Applet: 9.0bwj, AppServer: 84904
    			 */
    def setIcons(path: java.lang.String*): scala.Unit = js.native
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setResizable
    			 */
    def setResizable(resizable: scala.Boolean): scala.Unit = js.native
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setSize
    			 * @since Applet: 9.0bwj, AppServer: 84516
    			 */
    def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.HostFrame.html#method_setTitle
    			 */
    def setTitle(newTitle: java.lang.String): scala.Unit = js.native
  }
  
  @js.native
  object Color extends js.Object {
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_fromHexString
    			 */
    def fromHexString(colorString: java.lang.String): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ClientNs.Color = js.native
    /**
    			 * @see https://developer.knuddels.de/docs/classes/Client.Color.html#method_fromRGB
    			 */
    def fromRGB(red: scala.Double, green: scala.Double, blue: scala.Double): knuddelsDashUserappsDashApiLib.knuddelsDashUserappsDashApiMod.Global.ClientNs.Color = js.native
  }
  
}

