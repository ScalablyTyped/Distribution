package typings.isAlphanumerical

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-alphanumerical", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAlphanumerical(character: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphanumerical")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isAlphanumerical(character: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAlphanumerical")(character.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
