package typings.isCoreModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(x: String): Boolean = ^.asInstanceOf[js.Dynamic].apply(x.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def apply(x: String, nodeVersion: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(x.asInstanceOf[js.Any], nodeVersion.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("is-core-module", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
