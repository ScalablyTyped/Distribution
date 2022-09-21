package typings.humanNumber

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(n: Double): String = ^.asInstanceOf[js.Dynamic].apply(n.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(n: Double, mapper: js.Function1[/* n */ Double, String]): String = (^.asInstanceOf[js.Dynamic].apply(n.asInstanceOf[js.Any], mapper.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("human-number", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
