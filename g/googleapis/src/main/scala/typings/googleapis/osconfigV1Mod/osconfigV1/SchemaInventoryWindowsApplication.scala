package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventoryWindowsApplication extends StObject {
  
  /**
    * The name of the application or product.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the product or application in string format.
    */
  var displayVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The internet address for technical support.
    */
  var helpLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last time this product received service. The value of this property is replaced each time a patch is applied or removed from the product or the command-line option is used to repair the product.
    */
  var installDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The name of the manufacturer for the product or application.
    */
  var publisher: js.UndefOr[String | Null] = js.undefined
}
object SchemaInventoryWindowsApplication {
  
  inline def apply(): SchemaInventoryWindowsApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventoryWindowsApplication]
  }
  
  extension [Self <: SchemaInventoryWindowsApplication](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDisplayVersion(value: String): Self = StObject.set(x, "displayVersion", value.asInstanceOf[js.Any])
    
    inline def setDisplayVersionNull: Self = StObject.set(x, "displayVersion", null)
    
    inline def setDisplayVersionUndefined: Self = StObject.set(x, "displayVersion", js.undefined)
    
    inline def setHelpLink(value: String): Self = StObject.set(x, "helpLink", value.asInstanceOf[js.Any])
    
    inline def setHelpLinkNull: Self = StObject.set(x, "helpLink", null)
    
    inline def setHelpLinkUndefined: Self = StObject.set(x, "helpLink", js.undefined)
    
    inline def setInstallDate(value: SchemaDate): Self = StObject.set(x, "installDate", value.asInstanceOf[js.Any])
    
    inline def setInstallDateUndefined: Self = StObject.set(x, "installDate", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherNull: Self = StObject.set(x, "publisher", null)
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
  }
}
