package typings.isPathInside

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-path-inside", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(childPath: String, parentPath: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(childPath.asInstanceOf[js.Any], parentPath.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
