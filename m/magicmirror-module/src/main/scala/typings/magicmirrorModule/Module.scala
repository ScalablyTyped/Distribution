package typings.magicmirrorModule

import org.scalablytyped.runtime.StringDictionary
import typings.magicmirrorModule.anon.Classes
import typings.magicmirrorModule.anon.Force
import typings.magicmirrorModule.anon.LockString
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Module {
  
  @js.native
  trait ModuleProperties[T]
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var config: T = js.native
    
    val data: Classes = js.native
    
    var defaults: T = js.native
    
    // Instance methods
    def file(filename: String): String = js.native
    
    def getDom(): HTMLElement = js.native
    
    def getHeader(): String = js.native
    
    def getScripts(): js.Array[String] = js.native
    
    def getStyles(): js.Array[String] = js.native
    
    def getTemplate(): String = js.native
    
    def getTemplateData(): Any = js.native
    
    def getTranslations(): StringDictionary[String] = js.native
    
    val hidden: Boolean = js.native
    
    def hide(): Unit = js.native
    def hide(speed: Double): Unit = js.native
    def hide(speed: Double, callback: js.Function0[Unit]): Unit = js.native
    def hide(speed: Double, callback: js.Function0[Unit], options: LockString): Unit = js.native
    def hide(speed: Double, callback: Unit, options: LockString): Unit = js.native
    def hide(speed: Unit, callback: js.Function0[Unit]): Unit = js.native
    def hide(speed: Unit, callback: js.Function0[Unit], options: LockString): Unit = js.native
    def hide(speed: Unit, callback: Unit, options: LockString): Unit = js.native
    
    val identifier: String = js.native
    
    // Subclassable methods
    def init(): Unit = js.native
    
    def loaded(): Unit = js.native
    def loaded(callback: js.Function0[Unit]): Unit = js.native
    
    val lockStrings: js.Array[String] = js.native
    
    val name: String = js.native
    
    def notificationReceived(notification: String, payload: Any, sender: ModuleProperties[Any]): Unit = js.native
    
    var requiresVersion: String = js.native
    
    def resume(): Unit = js.native
    
    def sendNotification(notification: String, payload: Any): Unit = js.native
    
    def sendSocketNotification(notification: String, payload: Any): Unit = js.native
    
    def show(): Unit = js.native
    def show(speed: Double): Unit = js.native
    def show(speed: Double, callback: js.Function0[Unit]): Unit = js.native
    def show(speed: Double, callback: js.Function0[Unit], options: Force): Unit = js.native
    def show(speed: Double, callback: Unit, options: Force): Unit = js.native
    def show(speed: Unit, callback: js.Function0[Unit]): Unit = js.native
    def show(speed: Unit, callback: js.Function0[Unit], options: Force): Unit = js.native
    def show(speed: Unit, callback: Unit, options: Force): Unit = js.native
    
    def socketNotificationReceived(notification: String, payload: Any): Unit = js.native
    
    def start(): Unit = js.native
    
    def suspend(): Unit = js.native
    
    def translate(identifier: String): String = js.native
    def translate(identifier: String, variables: Any): String = js.native
    
    def updateDom(): Unit = js.native
    def updateDom(speed: Double): Unit = js.native
  }
}
