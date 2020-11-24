package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreLayout extends js.Object {
  
  /**
    * The ID of the store page to be used as the homepage. The homepage is the first page shown in the managed Google Play Store. Not specifying a homepage is equivalent to setting the
    * store layout type to "basic".
    */
  var homepageId: js.UndefOr[String] = js.native
  
  /**
    * The store layout type. By default, this value is set to "basic" if the homepageId field is not set, and to "custom" otherwise. If set to "basic", the layout will consist of all
    * approved apps that have been whitelisted for the user.
    */
  var storeLayoutType: js.UndefOr[String] = js.native
}
object StoreLayout {
  
  @scala.inline
  def apply(): StoreLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreLayout]
  }
  
  @scala.inline
  implicit class StoreLayoutOps[Self <: StoreLayout] (val x: Self) extends AnyVal {
    
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
    def setHomepageId(value: String): Self = this.set("homepageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHomepageId: Self = this.set("homepageId", js.undefined)
    
    @scala.inline
    def setStoreLayoutType(value: String): Self = this.set("storeLayoutType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreLayoutType: Self = this.set("storeLayoutType", js.undefined)
  }
}
