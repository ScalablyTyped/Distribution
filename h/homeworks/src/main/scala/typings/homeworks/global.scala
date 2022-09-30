package typings.homeworks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object homeworks {
    
    @JSGlobal("homeworks")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @since 1.0.44
      */
    inline def disableHook(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableHook")().asInstanceOf[Unit]
  }
  
  /**
    * @since 1.0.44
    */
  inline def notification(title: String, content: String, url: String): Unit = (js.Dynamic.global.applyDynamic("notification")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def notification(title: String, content: String, url: String, status: String): Unit = (js.Dynamic.global.applyDynamic("notification")(title.asInstanceOf[js.Any], content.asInstanceOf[js.Any], url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @since 1.0.44
    */
  inline def toast(message: Any): Unit = js.Dynamic.global.applyDynamic("toast")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
