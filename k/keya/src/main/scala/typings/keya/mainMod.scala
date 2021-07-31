package typings.keya

import typings.keya.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mainMod {
  
  @JSImport("keya/out/browser/main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def store[T](name: String): js.Promise[default[T] | typings.keya.localhostMod.default[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("store")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default[T] | typings.keya.localhostMod.default[T]]]
  
  @scala.inline
  def stores(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stores")().asInstanceOf[js.Promise[js.Array[String]]]
}
