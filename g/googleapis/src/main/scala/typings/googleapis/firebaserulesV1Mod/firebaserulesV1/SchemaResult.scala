package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible result values from the function mock invocation.
  */
@js.native
trait SchemaResult extends js.Object {
  /**
    * The result is undefined, meaning the result could not be computed.
    */
  var undefined: js.UndefOr[SchemaEmpty] = js.native
  /**
    * The result is an actual value. The type of the value must match that of
    * the type declared by the service.
    */
  var value: js.UndefOr[js.Any] = js.native
}

object SchemaResult {
  @scala.inline
  def apply(): SchemaResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResult]
  }
  @scala.inline
  implicit class SchemaResultOps[Self <: SchemaResult] (val x: Self) extends AnyVal {
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
    def setUndefined(value: SchemaEmpty): Self = this.set("undefined", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUndefined: Self = this.set("undefined", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

