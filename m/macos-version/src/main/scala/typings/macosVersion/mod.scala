package typings.macosVersion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("macos-version", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assertMacOS(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMacOS")().asInstanceOf[Unit]
  
  inline def assertMacOSVersion(semverRange: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMacOSVersion")(semverRange.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def assertMacOSVersionGreaterThanOrEqualTo(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertMacOSVersionGreaterThanOrEqualTo")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("macos-version", "isMacOS")
  @js.native
  val isMacOS: Boolean = js.native
  
  inline def isMacOSVersion(semverRange: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacOSVersion")(semverRange.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMacOSVersionGreaterThanOrEqualTo(version: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMacOSVersionGreaterThanOrEqualTo")(version.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def macOSVersion(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("macOSVersion")().asInstanceOf[js.UndefOr[String]]
}
