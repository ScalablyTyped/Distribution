package typings.jestUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluralizeMod {
  
  @JSImport("jest-util/build/pluralize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(word: String, count: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(word.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[String]
}
