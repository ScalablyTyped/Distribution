package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Sorts data in rows based on a sort order per column.
  */
@js.native
trait SchemaSortRangeRequest extends js.Object {
  
  /**
    * The range to sort.
    */
  var range: js.UndefOr[SchemaGridRange] = js.native
  
  /**
    * The sort order per column. Later specifications are used when values are
    * equal in the earlier specifications.
    */
  var sortSpecs: js.UndefOr[js.Array[SchemaSortSpec]] = js.native
}
object SchemaSortRangeRequest {
  
  @scala.inline
  def apply(): SchemaSortRangeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSortRangeRequest]
  }
  
  @scala.inline
  implicit class SchemaSortRangeRequestOps[Self <: SchemaSortRangeRequest] (val x: Self) extends AnyVal {
    
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
