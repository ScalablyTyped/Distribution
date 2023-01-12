package typings.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsApplication extends StObject {
  
  /** The name of the application or product. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The version of the product or application in string format. */
  var displayVersion: js.UndefOr[String] = js.undefined
  
  /** The internet address for technical support. */
  var helpLink: js.UndefOr[String] = js.undefined
  
  /**
    * The last time this product received service. The value of this property is replaced each time a patch is applied or removed from the product or the command-line option is used to
    * repair the product.
    */
  var installDate: js.UndefOr[Date] = js.undefined
  
  /** The name of the manufacturer for the product or application. */
  var publisher: js.UndefOr[String] = js.undefined
}
object WindowsApplication {
  
  inline def apply(): WindowsApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsApplication]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsApplication] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setDisplayVersion(value: String): Self = StObject.set(x, "displayVersion", value.asInstanceOf[js.Any])
    
    inline def setDisplayVersionUndefined: Self = StObject.set(x, "displayVersion", js.undefined)
    
    inline def setHelpLink(value: String): Self = StObject.set(x, "helpLink", value.asInstanceOf[js.Any])
    
    inline def setHelpLinkUndefined: Self = StObject.set(x, "helpLink", js.undefined)
    
    inline def setInstallDate(value: Date): Self = StObject.set(x, "installDate", value.asInstanceOf[js.Any])
    
    inline def setInstallDateUndefined: Self = StObject.set(x, "installDate", js.undefined)
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
  }
}
