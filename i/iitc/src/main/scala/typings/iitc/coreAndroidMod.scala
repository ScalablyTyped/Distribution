package typings.iitc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreAndroidMod {
  
  object global {
    
    @JSGlobal("Android")
    @js.native
    open class Android_ () extends StObject {
      
      def addPane(id: String, label: String): Unit = js.native
      def addPane(id: String, label: String, icon: String): Unit = js.native
      
      def addPortalHighlighter(name: String): Unit = js.native
      
      def copy(text: String): Unit = js.native
      
      def dialogFocused(id: String): Unit = js.native
      
      def dialogOpened(id: String, open: Boolean): Unit = js.native
      
      def getFileRequestUrlPrefix(): String = js.native
      
      def getVersionCode(): Double = js.native
      
      def getVersionName(): String = js.native
      
      // open dialog to send geo intent for navigation apps like gmaps or waze etc...
      def intentPosLink(lat: Double, lng: Double, zoom: Double, title: String, isPortal: Boolean): Unit = js.native
      
      def reloadIITC(): Unit = js.native
      def reloadIITC(clearCache: Boolean): Unit = js.native
      
      def saveFile(filename: String, mime: String, content: String): Unit = js.native
      
      def setActiveHighlighter(name: String): Unit = js.native
      
      def setFollowMode(follow: Boolean): Unit = js.native
      
      def setLayers(base_layer: String, overlay_layer: String): Unit = js.native
      
      def setPermalink(href: String): Unit = js.native
      
      def setProgress(progress: Double): Unit = js.native
      
      // share a string to the IITC share activity. only uses the share tab.
      def shareString(text: String): Unit = js.native
      
      def showZoom(): Boolean = js.native
      
      // disable javascript injection while spinner is enabled prevent the spinner from closing automatically
      def spinnerEnabled(enable: Boolean): Unit = js.native
      
      def switchToPane(id: String): Unit = js.native
      
      // IITC-Version check plugin
      def updateIitc(fileUrl: String): Unit = js.native
    }
    
    @JSGlobal("android")
    @js.native
    def android: Android_ = js.native
    inline def android_=(x: Android_): Unit = js.Dynamic.global.updateDynamic("android")(x.asInstanceOf[js.Any])
  }
}
