package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A holder for any type of filter.
  */
@js.native
trait SchemaFilter extends js.Object {
  /**
    * A composite filter.
    */
  var compositeFilter: js.UndefOr[SchemaCompositeFilter] = js.native
  /**
    * A filter on a property.
    */
  var propertyFilter: js.UndefOr[SchemaPropertyFilter] = js.native
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
    def setPropertyFilter(value: SchemaPropertyFilter): Self = this.set("propertyFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePropertyFilter: Self = this.set("propertyFilter", js.undefined)
  }
  
}

