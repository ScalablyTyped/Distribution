package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLandingPage extends StObject {
  
  /**
    * Advertiser ID of this landing page. This is a required field.
    */
  var advertiserId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this landing page has been archived.
    */
  var archived: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Links that will direct the user to a mobile app, if installed.
    */
  var deepLinks: js.UndefOr[js.Array[SchemaDeepLink]] = js.undefined
  
  /**
    * ID of this landing page. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#landingPage".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Name of this landing page. This is a required field. It must be less than 256 characters long.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL of this landing page. This is a required field.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaLandingPage {
  
  inline def apply(): SchemaLandingPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLandingPage]
  }
  
  extension [Self <: SchemaLandingPage](x: Self) {
    
    inline def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    inline def setAdvertiserIdNull: Self = StObject.set(x, "advertiserId", null)
    
    inline def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedNull: Self = StObject.set(x, "archived", null)
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setDeepLinks(value: js.Array[SchemaDeepLink]): Self = StObject.set(x, "deepLinks", value.asInstanceOf[js.Any])
    
    inline def setDeepLinksUndefined: Self = StObject.set(x, "deepLinks", js.undefined)
    
    inline def setDeepLinksVarargs(value: SchemaDeepLink*): Self = StObject.set(x, "deepLinks", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
