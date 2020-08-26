package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Criteria for showing/hiding rows in a filter or filter view.
  */
@js.native
trait SchemaFilterCriteria extends js.Object {
  /**
    * A condition that must be true for values to be shown. (This does not
    * override hiddenValues -- if a value is listed there,  it will still be
    * hidden.)
    */
  var condition: js.UndefOr[SchemaBooleanCondition] = js.native
  /**
    * Values that should be hidden.
    */
  var hiddenValues: js.UndefOr[js.Array[String]] = js.native
}

object SchemaFilterCriteria {
  @scala.inline
  def apply(): SchemaFilterCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFilterCriteria]
  }
  @scala.inline
  implicit class SchemaFilterCriteriaOps[Self <: SchemaFilterCriteria] (val x: Self) extends AnyVal {
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
    def setCondition(value: SchemaBooleanCondition): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setHiddenValuesVarargs(value: String*): Self = this.set("hiddenValues", js.Array(value :_*))
    @scala.inline
    def setHiddenValues(value: js.Array[String]): Self = this.set("hiddenValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenValues: Self = this.set("hiddenValues", js.undefined)
  }
  
}

