package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The default filter associated with a sheet.
  */
@js.native
trait SchemaBasicFilter extends js.Object {
  /**
    * The criteria for showing/hiding values per column. The map&#39;s key is
    * the column index, and the value is the criteria for that column.
    */
  var criteria: js.UndefOr[StringDictionary[SchemaFilterCriteria]] = js.native
  /**
    * The range the filter covers.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SchemaSortSpec]] = js.native
}

object SchemaBasicFilter {
  @scala.inline
  def apply(): SchemaBasicFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBasicFilter]
  }
  @scala.inline
  implicit class SchemaBasicFilterOps[Self <: SchemaBasicFilter] (val x: Self) extends AnyVal {
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
    def setCriteria(value: StringDictionary[SchemaFilterCriteria]): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    @scala.inline
    def setRange(value: SchemaGridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    @scala.inline
    def setSortSpecsVarargs(value: SchemaSortSpec*): Self = this.set("sortSpecs", js.Array(value :_*))
    @scala.inline
    def setSortSpecs(value: js.Array[SchemaSortSpec]): Self = this.set("sortSpecs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortSpecs: Self = this.set("sortSpecs", js.undefined)
  }
  
}

