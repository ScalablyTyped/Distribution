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
  
  inline def apply(): SchemaAccountStatusExampleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountStatusExampleItem]
  }
  
  extension [Self <: SchemaAccountStatusExampleItem](x: Self) {
    
    inline def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setSubmittedValue(value: String): Self = StObject.set(x, "submittedValue", value.asInstanceOf[js.Any])
    
    inline def setSubmittedValueUndefined: Self = StObject.set(x, "submittedValue", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setValueOnLandingPage(value: String): Self = StObject.set(x, "valueOnLandingPage", value.asInstanceOf[js.Any])
    
    inline def setValueOnLandingPageUndefined: Self = StObject.set(x, "valueOnLandingPage", js.undefined)
  }
}
