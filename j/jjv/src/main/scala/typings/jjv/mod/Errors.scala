package typings.jjv.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jjv.anon.Required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends js.Object {
  var validation: StringDictionary[Required] = js.native
}

object Errors {
  @scala.inline
  def apply(validation: StringDictionary[Required]): Errors = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  @scala.inline
  implicit class ErrorsOps[Self <: Errors] (val x: Self) extends AnyVal {
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
    def setValidation(value: StringDictionary[Required]): Self = this.set("validation", value.asInstanceOf[js.Any])
  }
  
}

