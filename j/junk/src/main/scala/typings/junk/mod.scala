package typings.junk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("junk", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isJunk(filename: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isJunk")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNotJunk(filename: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotJunk")(filename.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @JSImport("junk", "junkRegex")
  @js.native
  val junkRegex: js.RegExp = js.native
}
