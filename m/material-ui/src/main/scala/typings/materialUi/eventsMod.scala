package typings.materialUi

import typings.materialUi.MaterialUI.Utils.Events
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("material-ui/utils/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("material-ui/utils/events", JSImport.Default)
  @js.native
  def default: Events = js.native
  
  @JSImport("material-ui/utils/events", "Events")
  @js.native
  def Events: typings.materialUi.MaterialUI.Utils.Events = js.native
  @scala.inline
  def Events_=(x: Events): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Events")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def default_=(x: Events): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
