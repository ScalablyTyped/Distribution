package typings.isPathInCwd

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-path-in-cwd", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
