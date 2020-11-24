package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaAccountStatusExampleItem extends js.Object {
  
  var itemId: js.UndefOr[String] = js.native
  
  var link: js.UndefOr[String] = js.native
  
  var submittedValue: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var valueOnLandingPage: js.UndefOr[String] = js.native
}
object SchemaAccountStatusExampleItem {
  
  @scala.inline
  def apply(): SchemaAccountStatusExampleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusExampleItem]
  }
  
  @scala.inline
  implicit class SchemaAccountStatusExampleItemOps[Self <: SchemaAccountStatusExampleItem] (val x: Self) extends AnyVal {
    
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
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemId: Self = this.set("itemId", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setSubmittedValue(value: String): Self = this.set("submittedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubmittedValue: Self = this.set("submittedValue", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setValueOnLandingPage(value: String): Self = this.set("valueOnLandingPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueOnLandingPage: Self = this.set("valueOnLandingPage", js.undefined)
  }
}
