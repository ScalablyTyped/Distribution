package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains information about where a user&#39;s browser is taken after the
  * user clicks an ad.
  */
@js.native
trait SchemaLandingPage extends js.Object {
  
  /**
    * Advertiser ID of this landing page. This is a required field.
    */
  var advertiserId: js.UndefOr[String] = js.native
  
  /**
    * Whether this landing page has been archived.
    */
  var archived: js.UndefOr[Boolean] = js.native
  
  /**
    * Links that will direct the user to a mobile app, if installed.
    */
  var deepLinks: js.UndefOr[js.Array[SchemaDeepLink]] = js.native
  
  /**
    * ID of this landing page. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#landingPage&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of this landing page. This is a required field. It must be less than
    * 256 characters long.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * URL of this landing page. This is a required field.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaLandingPage {
  
  @scala.inline
  def apply(): SchemaLandingPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLandingPage]
  }
  
  @scala.inline
  implicit class SchemaLandingPageOps[Self <: SchemaLandingPage] (val x: Self) extends AnyVal {
    
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
    def setAdvertiserId(value: String): Self = this.set("advertiserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertiserId: Self = this.set("advertiserId", js.undefined)
    
    @scala.inline
    def setArchived(value: Boolean): Self = this.set("archived", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArchived: Self = this.set("archived", js.undefined)
    
    @scala.inline
    def setDeepLinksVarargs(value: SchemaDeepLink*): Self = this.set("deepLinks", js.Array(value :_*))
    
    @scala.inline
    def setDeepLinks(value: js.Array[SchemaDeepLink]): Self = this.set("deepLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeepLinks: Self = this.set("deepLinks", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
