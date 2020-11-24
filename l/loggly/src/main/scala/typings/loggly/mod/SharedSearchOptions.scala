package typings.loggly.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharedSearchOptions extends js.Object {
  
  var from: js.UndefOr[String] = js.native
  
  var rows: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var until: js.UndefOr[String] = js.native
}
object SharedSearchOptions {
  
  @scala.inline
  def apply(): SharedSearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedSearchOptions]
  }
  
  @scala.inline
  implicit class SharedSearchOptionsOps[Self <: SharedSearchOptions] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUntil(value: String): Self = this.set("until", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUntil: Self = this.set("until", js.undefined)
  }
}
