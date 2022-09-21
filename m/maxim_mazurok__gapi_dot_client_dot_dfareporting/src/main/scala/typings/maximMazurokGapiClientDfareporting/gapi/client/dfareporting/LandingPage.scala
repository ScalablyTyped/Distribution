package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LandingPage extends StObject {
  
  /** Advertiser ID of this landing page. This is a required field. */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /** Whether this landing page has been archived. */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  /** Links that will direct the user to a mobile app, if installed. */
  var deepLinks: js.UndefOr[js.Array[DeepLink]] = js.undefined
  
  /** ID of this landing page. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#landingPage". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** Name of this landing page. This is a required field. It must be less than 256 characters long. */
  var name: js.UndefOr[String] = js.undefined
  
  /** URL of this landing page. This is a required field. */
  var url: js.UndefOr[String] = js.undefined
}
object LandingPage {
  
  inline def apply(): LandingPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LandingPage]
  }
  
  extension [Self <: LandingPage](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setDeepLinks(value: js.Array[DeepLink]): Self = StObject.set(x, "deepLinks", value.asInstanceOf[js.Any])
    
    inline def setDeepLinksUndefined: Self = StObject.set(x, "deepLinks", js.undefined)
    
    inline def setDeepLinksVarargs(value: DeepLink*): Self = StObject.set(x, "deepLinks", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
