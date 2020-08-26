package typings.graphql.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.valuesMod.CoercedVariableValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends CoercedVariableValues {
  var coerced: StringDictionary[js.Any] = js.native
  var errors: js.UndefOr[scala.Nothing] = js.native
}

object Errors {
  @scala.inline
  def apply(coerced: StringDictionary[js.Any]): Errors = {
    val __obj = js.Dynamic.literal(coerced = coerced.asInstanceOf[js.Any])
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
    def setCoerced(value: StringDictionary[js.Any]): Self = this.set("coerced", value.asInstanceOf[js.Any])
  }
  
}

