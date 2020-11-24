package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimumOrderValueTable extends js.Object {
  
  var storeCodeSetWithMovs: js.UndefOr[js.Array[MinimumOrderValueTableStoreCodeSetWithMov]] = js.native
}
object MinimumOrderValueTable {
  
  @scala.inline
  def apply(): MinimumOrderValueTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumOrderValueTable]
  }
  
  @scala.inline
  implicit class MinimumOrderValueTableOps[Self <: MinimumOrderValueTable] (val x: Self) extends AnyVal {
    
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
    def setStoreCodeSetWithMovsVarargs(value: MinimumOrderValueTableStoreCodeSetWithMov*): Self = this.set("storeCodeSetWithMovs", js.Array(value :_*))
    
    @scala.inline
    def setStoreCodeSetWithMovs(value: js.Array[MinimumOrderValueTableStoreCodeSetWithMov]): Self = this.set("storeCodeSetWithMovs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreCodeSetWithMovs: Self = this.set("storeCodeSetWithMovs", js.undefined)
  }
}
