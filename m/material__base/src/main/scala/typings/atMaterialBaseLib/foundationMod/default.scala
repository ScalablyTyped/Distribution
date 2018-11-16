package typings
package atMaterialBaseLib.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/base/foundation", JSImport.Default)
@js.native
class default[A] protected () extends MDCFoundation[A] {
  def this(adapter: A) = this()
  // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  // Subclasses should override this method to perform initialization routines (registering events, etc.)
  /* CompleteClass */
  override def init(): scala.Unit = js.native
}

@JSImport("@material/base/foundation", JSImport.Default)
@js.native
object default extends js.Object {
  val cssClasses: atMaterialBaseLib.foundationMod.MDCStrings = js.native
  val defaultAdapter: js.Any = js.native
  val numbers: atMaterialBaseLib.foundationMod.MDCNumbers = js.native
  val strings: atMaterialBaseLib.foundationMod.MDCStrings = js.native
}

