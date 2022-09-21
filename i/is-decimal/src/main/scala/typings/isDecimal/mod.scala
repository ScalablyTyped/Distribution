package typings.isDecimal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-decimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDecimal(character: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isDecimal(character: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDecimal")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
