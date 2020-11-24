package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result count information
  */
@js.native
trait SchemaResultCounts extends js.Object {
  
  /**
    * Result count information for each source with results.
    */
  var sourceResultCounts: js.UndefOr[js.Array[SchemaSourceResultCount]] = js.native
}
object SchemaResultCounts {
  
  @scala.inline
  def apply(): SchemaResultCounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResultCounts]
  }
  
  @scala.inline
  implicit class SchemaResultCountsOps[Self <: SchemaResultCounts] (val x: Self) extends AnyVal {
    
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
    def setSourceResultCountsVarargs(value: SchemaSourceResultCount*): Self = this.set("sourceResultCounts", js.Array(value :_*))
    
    @scala.inline
    def setSourceResultCounts(value: js.Array[SchemaSourceResultCount]): Self = this.set("sourceResultCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceResultCounts: Self = this.set("sourceResultCounts", js.undefined)
  }
}
