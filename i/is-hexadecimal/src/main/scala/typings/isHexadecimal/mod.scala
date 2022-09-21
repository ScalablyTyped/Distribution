package typings.isHexadecimal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-hexadecimal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isHexadecimal(character: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexadecimal")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isHexadecimal(character: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHexadecimal")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
