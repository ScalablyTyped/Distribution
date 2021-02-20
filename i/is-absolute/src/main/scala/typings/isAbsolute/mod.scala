package typings.isAbsolute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-absolute", JSImport.Namespace)
  @js.native
  def apply(path: String): Boolean = js.native
  
  @JSImport("is-absolute", "posix")
  @js.native
  def posix(path: String): Boolean = js.native
  
  @JSImport("is-absolute", "win32")
  @js.native
  def win32(path: String): Boolean = js.native
}
