package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedPropertyBundle extends js.Object {
  
  /** The list of managed properties. */
  var managedProperty: js.UndefOr[js.Array[ManagedProperty]] = js.native
}
object ManagedPropertyBundle {
  
  @scala.inline
  def apply(): ManagedPropertyBundle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedPropertyBundle]
  }
  
  @scala.inline
  implicit class ManagedPropertyBundleOps[Self <: ManagedPropertyBundle] (val x: Self) extends AnyVal {
    
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
    def setManagedPropertyVarargs(value: ManagedProperty*): Self = this.set("managedProperty", js.Array(value :_*))
    
    @scala.inline
    def setManagedProperty(value: js.Array[ManagedProperty]): Self = this.set("managedProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagedProperty: Self = this.set("managedProperty", js.undefined)
  }
}
