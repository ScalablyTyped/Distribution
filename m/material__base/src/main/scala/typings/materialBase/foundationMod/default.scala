package typings.materialBase.foundationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material/base/foundation", JSImport.Default)
@js.native
class default[A] protected () extends MDCFoundation[A] {
  def this(adapter: A) = this()
  // Subclasses should override this method to perform de-initialization routines (de-registering events, etc.)
  /* CompleteClass */
  override def destroy(): Unit = js.native
  // Subclasses should override this method to perform initialization routines (registering events, etc.)
  /* CompleteClass */
  override def init(): Unit = js.native
}

/* static members */
@JSImport("@material/base/foundation", JSImport.Default)
@js.native
object default extends js.Object {
  val cssClasses: MDCStrings = js.native
  val defaultAdapter: js.Any = js.native
  val numbers: MDCNumbers = js.native
  val strings: MDCStrings = js.native
}

