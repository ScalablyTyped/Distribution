package typings.marko

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesMod {
  
  @JSImport("marko/src/compiler/modules", "deresolve")
  @js.native
  def deresolve(targetFilename: String, from: String): String = js.native
  
  @JSImport("marko/src/compiler/modules", "require")
  @js.native
  def require(path: String): js.Any = js.native
  
  @JSImport("marko/src/compiler/modules", "resolve")
  @js.native
  def resolve(path: String): String = js.native
  
  @JSImport("marko/src/compiler/modules", "resolveFrom")
  @js.native
  def resolveFrom(from: String, target: String): String | Null = js.native
}
