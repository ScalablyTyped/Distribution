package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcsTokenLink extends StObject {
  
  /** URL to retrieve ACS token for pdf download. (In LITE projection.) */
  var acsTokenLink: js.UndefOr[String] = js.undefined
  
  /** URL to download pdf. (In LITE projection.) */
  var downloadLink: js.UndefOr[String] = js.undefined
  
  /** Is a scanned image pdf available either as public domain or for purchase. (In LITE projection.) */
  var isAvailable: js.UndefOr[Boolean] = js.undefined
}
object AcsTokenLink {
  
  inline def apply(): AcsTokenLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcsTokenLink]
  }
  
  extension [Self <: AcsTokenLink](x: Self) {
    
    inline def setAcsTokenLink(value: String): Self = StObject.set(x, "acsTokenLink", value.asInstanceOf[js.Any])
    
    inline def setAcsTokenLinkUndefined: Self = StObject.set(x, "acsTokenLink", js.undefined)
    
    inline def setDownloadLink(value: String): Self = StObject.set(x, "downloadLink", value.asInstanceOf[js.Any])
    
    inline def setDownloadLinkUndefined: Self = StObject.set(x, "downloadLink", js.undefined)
    
    inline def setIsAvailable(value: Boolean): Self = StObject.set(x, "isAvailable", value.asInstanceOf[js.Any])
    
    inline def setIsAvailableUndefined: Self = StObject.set(x, "isAvailable", js.undefined)
  }
}
