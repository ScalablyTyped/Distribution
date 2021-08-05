package typings.isUpperCase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-upper-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUpperCase(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUpperCase")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
