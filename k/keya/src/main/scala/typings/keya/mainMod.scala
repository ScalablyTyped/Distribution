package typings.keya

import typings.keya.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainMod {
  
  @JSImport("keya/out/browser/main", "store")
  @js.native
  def store[T](name: String): js.Promise[default[T] | typings.keya.localhostMod.default[T]] = js.native
  
  @JSImport("keya/out/browser/main", "stores")
  @js.native
  def stores(): js.Promise[js.Array[String]] = js.native
}
