package typings.isLowerCase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-lower-case", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLowerCase(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLowerCase")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
