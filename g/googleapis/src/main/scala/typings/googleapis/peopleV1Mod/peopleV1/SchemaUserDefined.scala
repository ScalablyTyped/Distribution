package typings.googleapis.peopleV1Mod.peopleV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Arbitrary user data that is populated by the end users.
  */
@js.native
trait SchemaUserDefined extends js.Object {
  /**
    * The end user specified key of the user defined data.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Metadata about the user defined data.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.native
  /**
    * The end user specified value of the user defined data.
    */
  var value: js.UndefOr[String] = js.native
}

object SchemaUserDefined {
  @scala.inline
  def apply(): SchemaUserDefined = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserDefined]
  }
  @scala.inline
  implicit class SchemaUserDefinedOps[Self <: SchemaUserDefined] (val x: Self) extends AnyVal {
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMetadata(value: SchemaFieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

