package typings.googleapis.datatransferV1Mod.adminDatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for application transfer parameters.
  */
@js.native
trait SchemaApplicationTransferParam extends js.Object {
  /**
    * The type of the transfer parameter. eg: &#39;PRIVACY_LEVEL&#39;
    */
  var key: js.UndefOr[String] = js.native
  /**
    * The value of the coressponding transfer parameter. eg: &#39;PRIVATE&#39;
    * or &#39;SHARED&#39;
    */
  var value: js.UndefOr[js.Array[String]] = js.native
}

object SchemaApplicationTransferParam {
  @scala.inline
  def apply(): SchemaApplicationTransferParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApplicationTransferParam]
  }
  @scala.inline
  implicit class SchemaApplicationTransferParamOps[Self <: SchemaApplicationTransferParam] (val x: Self) extends AnyVal {
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
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

