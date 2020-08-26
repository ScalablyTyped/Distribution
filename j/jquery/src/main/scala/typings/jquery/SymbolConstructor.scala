package typings.jquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SymbolConstructor extends js.Object {
  /**
    * A String value that is used in the creation of the default string description of an object.
    * Called by the built-in method Object.prototype.toString.
    */
  val toStringTag: js.Symbol = js.native
}

object SymbolConstructor {
  @scala.inline
  def apply(toStringTag: js.Symbol): SymbolConstructor = {
    val __obj = js.Dynamic.literal(toStringTag = toStringTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolConstructor]
  }
  @scala.inline
  implicit class SymbolConstructorOps[Self <: SymbolConstructor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setToStringTag(value: js.Symbol): Self = this.set("toStringTag", value.asInstanceOf[js.Any])
  }
  
}

