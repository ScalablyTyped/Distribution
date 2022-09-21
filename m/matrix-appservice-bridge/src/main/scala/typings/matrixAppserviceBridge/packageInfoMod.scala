package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageInfoMod {
  
  @JSImport("matrix-appservice-bridge/lib/utils/package-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBridgeVersion(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBridgeVersion")().asInstanceOf[String]
  inline def getBridgeVersion(packageJsonPath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBridgeVersion")(packageJsonPath.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def setBridgeVersion(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setBridgeVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
