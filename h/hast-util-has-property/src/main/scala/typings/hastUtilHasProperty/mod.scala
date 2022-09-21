package typings.hastUtilHasProperty

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-has-property", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasProperty(node: Any, name: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasProperty")(node.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
