package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The projection of document&#39;s fields to return.
  */
@js.native
trait SchemaProjection extends js.Object {
  /**
    * The fields to return.  If empty, all fields are returned. To only return
    * the name of the document, use `[&#39;__name__&#39;]`.
    */
  var fields: js.UndefOr[js.Array[SchemaFieldReference]] = js.native
}

object SchemaProjection {
  @scala.inline
  def apply(): SchemaProjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjection]
  }
  @scala.inline
  implicit class SchemaProjectionOps[Self <: SchemaProjection] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: SchemaFieldReference*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[SchemaFieldReference]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
  }
  
}

