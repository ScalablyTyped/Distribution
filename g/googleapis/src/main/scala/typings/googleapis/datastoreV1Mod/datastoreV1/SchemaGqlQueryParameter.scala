package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A binding parameter for a GQL query.
  */
@js.native
trait SchemaGqlQueryParameter extends js.Object {
  /**
    * A query cursor. Query cursors are returned in query result batches.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * A value parameter.
    */
  var value: js.UndefOr[SchemaValue] = js.native
}

object SchemaGqlQueryParameter {
  @scala.inline
  def apply(): SchemaGqlQueryParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGqlQueryParameter]
  }
  @scala.inline
  implicit class SchemaGqlQueryParameterOps[Self <: SchemaGqlQueryParameter] (val x: Self) extends AnyVal {
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
    def setCursor(value: String): Self = this.set("cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    @scala.inline
    def setValue(value: SchemaValue): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

