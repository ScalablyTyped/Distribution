package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountStatusExampleItem extends StObject {
  
  var itemId: js.UndefOr[String] = js.undefined
  
  var link: js.UndefOr[String] = js.undefined
  
  var submittedValue: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var valueOnLandingPage: js.UndefOr[String] = js.undefined
}
object SchemaAccountStatusExampleItem {
  
  @scala.inline
  def apply(): SchemaAccountStatusExampleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusExampleItem]
  }
  
  @scala.inline
  implicit class SchemaAccountStatusExampleItemMutableBuilder[Self <: SchemaAccountStatusExampleItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setSubmittedValue(value: String): Self = StObject.set(x, "submittedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedValueUndefined: Self = StObject.set(x, "submittedValue", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setValueOnLandingPage(value: String): Self = StObject.set(x, "valueOnLandingPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueOnLandingPageUndefined: Self = StObject.set(x, "valueOnLandingPage", js.undefined)
  }
}
