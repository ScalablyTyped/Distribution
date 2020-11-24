package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.search
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHistoryRequestSearch extends js.Object {
  
  var hist_access_type: search = js.native
  
  var n: Double = js.native
  
  var output: Boolean = js.native
  
  var pattern: String = js.native
  
  var raw: Boolean = js.native
  
  var unique: Boolean = js.native
}
object IHistoryRequestSearch {
  
  @scala.inline
  def apply(
    hist_access_type: search,
    n: Double,
    output: Boolean,
    pattern: String,
    raw: Boolean,
    unique: Boolean
  ): IHistoryRequestSearch = {
    val __obj = js.Dynamic.literal(hist_access_type = hist_access_type.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], unique = unique.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryRequestSearch]
  }
  
  @scala.inline
  implicit class IHistoryRequestSearchOps[Self <: IHistoryRequestSearch] (val x: Self) extends AnyVal {
    
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
    def setHist_access_type(value: search): Self = this.set("hist_access_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: Boolean): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
  }
}
