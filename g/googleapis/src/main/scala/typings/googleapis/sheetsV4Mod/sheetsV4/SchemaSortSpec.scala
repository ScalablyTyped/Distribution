package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A sort order associated with a specific column or row.
  */
@js.native
trait SchemaSortSpec extends js.Object {
  
  /**
    * The dimension the sort should be applied to.
    */
  var dimensionIndex: js.UndefOr[Double] = js.native
  
  /**
    * The order data should be sorted.
    */
  var sortOrder: js.UndefOr[String] = js.native
}
object SchemaSortSpec {
  
  @scala.inline
  def apply(): SchemaSortSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSortSpec]
  }
  
  @scala.inline
  implicit class SchemaSortSpecOps[Self <: SchemaSortSpec] (val x: Self) extends AnyVal {
    
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
    def setDimensionIndex(value: Double): Self = this.set("dimensionIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensionIndex: Self = this.set("dimensionIndex", js.undefined)
    
    @scala.inline
    def setSortOrder(value: String): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortOrder: Self = this.set("sortOrder", js.undefined)
  }
}
