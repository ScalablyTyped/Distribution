package typings.jpm

import typings.jpm.jpmStrings.OverQuota
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Lets an add-on store data so that it's retained across Firefox restarts
  */
object simpleStorageMod {
  
  @JSImport("sdk/simple-storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def on_OverQuota(event: OverQuota, handler: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(event.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("sdk/simple-storage", "quotaUsage")
  @js.native
  val quotaUsage: Double = js.native
  
  @JSImport("sdk/simple-storage", "storage")
  @js.native
  val storage: js.Any = js.native
}
