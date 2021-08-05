package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuToggleUtilMod {
  
  @JSImport("@ionic/core/dist/types/components/menu-toggle/menu-toggle-util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def updateVisibility(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateVisibility")().asInstanceOf[js.Promise[Boolean]]
  inline def updateVisibility(menu: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("updateVisibility")(menu.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
}
