package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MinimumOrderValueTableStoreCodeSetWithMov extends js.Object {
  
  /** A list of unique store codes or empty for the catch all. */
  var storeCodes: js.UndefOr[js.Array[String]] = js.native
  
  /** The minimum order value for the given stores. */
  var value: js.UndefOr[Price] = js.native
}
object MinimumOrderValueTableStoreCodeSetWithMov {
  
  @scala.inline
  def apply(): MinimumOrderValueTableStoreCodeSetWithMov = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinimumOrderValueTableStoreCodeSetWithMov]
  }
  
  @scala.inline
  implicit class MinimumOrderValueTableStoreCodeSetWithMovOps[Self <: MinimumOrderValueTableStoreCodeSetWithMov] (val x: Self) extends AnyVal {
    
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
    def setStoreCodesVarargs(value: String*): Self = this.set("storeCodes", js.Array(value :_*))
    
    @scala.inline
    def setStoreCodes(value: js.Array[String]): Self = this.set("storeCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreCodes: Self = this.set("storeCodes", js.undefined)
    
    @scala.inline
    def setValue(value: Price): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
