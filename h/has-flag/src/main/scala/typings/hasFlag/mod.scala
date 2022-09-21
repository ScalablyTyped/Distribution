package typings.hasFlag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("has-flag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(flag: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(flag.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(flag: String, argv: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(flag.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
