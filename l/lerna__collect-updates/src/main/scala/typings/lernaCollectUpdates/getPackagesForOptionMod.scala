package typings.lernaCollectUpdates

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getPackagesForOptionMod {
  
  @JSImport("@lerna/collect-updates/lib/get-packages-for-option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPackagesForOption(option: String): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackagesForOption")(option.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  inline def getPackagesForOption(option: js.Array[String]): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackagesForOption")(option.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
  inline def getPackagesForOption(option: Boolean): Set[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackagesForOption")(option.asInstanceOf[js.Any]).asInstanceOf[Set[String]]
}
