package typings.isAlphabetical

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-alphabetical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAlphabetical(character: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetical")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isAlphabetical(character: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphabetical")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
