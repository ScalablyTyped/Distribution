package typings.grumblerScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object karmaConfMod {
  
  @JSImport("grumbler-scripts/config/karma.conf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(karma: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(karma.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def getKarmaConfig(karma: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getKarmaConfig")(karma.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  inline def getKarmaConfig(karma: js.Object, cfg: js.Object): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("getKarmaConfig")(karma.asInstanceOf[js.Any], cfg.asInstanceOf[js.Any])).asInstanceOf[js.Object]
}
