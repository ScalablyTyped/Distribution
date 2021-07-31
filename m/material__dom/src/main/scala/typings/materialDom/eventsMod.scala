package typings.materialDom

import typings.std.EventListenerOptions
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("@material/dom/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def applyPassive(): Boolean | EventListenerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("applyPassive")().asInstanceOf[Boolean | EventListenerOptions]
  @scala.inline
  def applyPassive(globalObj: Window): Boolean | EventListenerOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("applyPassive")(globalObj.asInstanceOf[js.Any]).asInstanceOf[Boolean | EventListenerOptions]
}
