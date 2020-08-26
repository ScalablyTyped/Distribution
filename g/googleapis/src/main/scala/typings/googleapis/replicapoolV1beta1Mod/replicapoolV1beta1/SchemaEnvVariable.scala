package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An environment variable to set for an action.
  */
@js.native
trait SchemaEnvVariable extends js.Object {
  /**
    * Deprecated, do not use.
    */
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * The name of the environment variable.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The value of the variable.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaEnvVariable {
  @scala.inline
  def apply(): SchemaEnvVariable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvVariable]
  }
  @scala.inline
  implicit class SchemaEnvVariableOps[Self <: SchemaEnvVariable] (val x: Self) extends AnyVal {
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
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

