package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A filter.
  */
@js.native
trait SchemaFilter extends js.Object {
  /**
    * A composite filter.
    */
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.native
  /**
    * A filter on a document field.
    */
  var fieldFilter: js.UndefOr[SchemaFieldFilter] = js.native
  /**
    * A filter that takes exactly one argument.
    */
  var unaryFilter: js.UndefOr[SchemaUnaryFilter] = js.native
}

object SchemaFilter {
  @scala.inline
  def apply(): SchemaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilter]
  }
  @scala.inline
  implicit class SchemaFilterOps[Self <: SchemaFilter] (val x: Self) extends AnyVal {
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
    def setCompositeFilter(value: SchemaCompositeFilter): Self = this.set("compositeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompositeFilter: Self = this.set("compositeFilter", js.undefined)
    @scala.inline
    def setFieldFilter(value: SchemaFieldFilter): Self = this.set("fieldFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldFilter: Self = this.set("fieldFilter", js.undefined)
    @scala.inline
    def setUnaryFilter(value: SchemaUnaryFilter): Self = this.set("unaryFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnaryFilter: Self = this.set("unaryFilter", js.undefined)
  }
  
}

