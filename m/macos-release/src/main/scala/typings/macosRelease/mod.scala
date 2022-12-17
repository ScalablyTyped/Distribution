package typings.macosRelease

import typings.macosRelease.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("macos-release", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Name = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Name]
  inline def default(release: String): js.UndefOr[Name] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(release.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Name]]
}
