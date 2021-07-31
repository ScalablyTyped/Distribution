package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about where a user&#39;s browser is taken after the
  * user clicks an ad.
  */
trait SchemaLandingPage extends StObject {
  
  /**
    * Advertiser ID of this landing page. This is a required field.
    */
  var advertiserId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether this landing page has been archived.
    */
  var archived: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Links that will direct the user to a mobile app, if installed.
    */
  var deepLinks: js.UndefOr[js.Array[SchemaDeepLink]] = js.undefined
  
  /**
    * ID of this landing page. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#landingPage&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Name of this landing page. This is a required field. It must be less than
    * 256 characters long.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * URL of this landing page. This is a required field.
    */
  var url: js.UndefOr[String] = js.undefined
}
object SchemaLandingPage {
  
  @scala.inline
  def apply(): SchemaLandingPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLandingPage]
  }
  
  @scala.inline
  implicit class SchemaLandingPageMutableBuilder[Self <: SchemaLandingPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertiserId(value: String): Self = StObject.set(x, "advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertiserIdUndefined: Self = StObject.set(x, "advertiserId", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    @scala.inline
    def setDeepLinks(value: js.Array[SchemaDeepLink]): Self = StObject.set(x, "deepLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeepLinksUndefined: Self = StObject.set(x, "deepLinks", js.undefined)
    
    @scala.inline
    def setDeepLinksVarargs(value: SchemaDeepLink*): Self = StObject.set(x, "deepLinks", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
