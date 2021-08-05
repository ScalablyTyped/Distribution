package typings.ionicReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devMod {
  
  @JSImport("@ionic/react/dist/types/components/utils/dev", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deprecationWarning(key: String, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deprecationWarning")(key.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isDevMode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDevMode")().asInstanceOf[Boolean]
}
