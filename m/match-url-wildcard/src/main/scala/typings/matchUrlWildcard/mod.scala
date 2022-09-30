package typings.matchUrlWildcard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("match-url-wildcard", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(url: String, rules: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(url: String, rules: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(url: String, rules: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(url.asInstanceOf[js.Any], rules.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
