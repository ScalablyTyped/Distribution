package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The data included in a domain or series.
  */
@js.native
trait SchemaChartData extends js.Object {
  
  /**
    * The source ranges of the data.
    */
  var sourceRange: js.UndefOr[SchemaChartSourceRange] = js.native
}
object SchemaChartData {
  
  @scala.inline
  def apply(): SchemaChartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChartData]
  }
  
  @scala.inline
  implicit class SchemaChartDataOps[Self <: SchemaChartData] (val x: Self) extends AnyVal {
    
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
    def setSourceRange(value: SchemaChartSourceRange): Self = this.set("sourceRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRange: Self = this.set("sourceRange", js.undefined)
  }
}
