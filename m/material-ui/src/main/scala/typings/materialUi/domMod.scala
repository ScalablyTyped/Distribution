package typings.materialUi

import typings.materialUi.MaterialUI.Utils.Dom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("material-ui/utils/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("material-ui/utils/dom", JSImport.Default)
  @js.native
  def default: Dom = js.native
  
  @JSImport("material-ui/utils/dom", "Dom")
  @js.native
  def Dom: typings.materialUi.MaterialUI.Utils.Dom = js.native
  inline def Dom_=(x: Dom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Dom")(x.asInstanceOf[js.Any])
  
  inline def default_=(x: Dom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
}
