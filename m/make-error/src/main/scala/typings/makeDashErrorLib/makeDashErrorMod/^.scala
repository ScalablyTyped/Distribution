package typings
package makeDashErrorLib.makeDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("make-error", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(name: java.lang.String): Constructor[BaseError] = js.native
  /**
    * Set the constructor prototype to `BaseError`.
    */
  def apply[T /* <: stdLib.Error */](super_ : makeDashErrorLib.Anon_Args[T]): Constructor[T with BaseError] = js.native
  /**
    * Create a specialized error instance.
    */
  def apply[T /* <: stdLib.Error */, K](name: java.lang.String | js.Function, super_ : K): K with SpecializedConstructor[T] = js.native
}

