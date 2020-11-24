package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics WebPropertySummary. WebPropertySummary
  * returns basic information (i.e., summary) for a web property.
  */
@js.native
trait SchemaWebPropertySummary extends js.Object {
  
  /**
    * Web property ID of the form UA-XXXXX-YY.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Internal ID for this web property.
    */
  var internalWebPropertyId: js.UndefOr[String] = js.native
  
  /**
    * Resource type for Analytics WebPropertySummary.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Level for this web property. Possible values are STANDARD or PREMIUM.
    */
  var level: js.UndefOr[String] = js.native
  
  /**
    * Web property name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * List of profiles under this web property.
    */
  var profiles: js.UndefOr[js.Array[SchemaProfileSummary]] = js.native
  
  /**
    * Indicates whether this web property is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.native
  
  /**
    * Website url for this web property.
    */
  var websiteUrl: js.UndefOr[String] = js.native
}
object SchemaWebPropertySummary {
  
  @scala.inline
  def apply(): SchemaWebPropertySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebPropertySummary]
  }
  
  @scala.inline
  implicit class SchemaWebPropertySummaryOps[Self <: SchemaWebPropertySummary] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInternalWebPropertyId(value: String): Self = this.set("internalWebPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInternalWebPropertyId: Self = this.set("internalWebPropertyId", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProfilesVarargs(value: SchemaProfileSummary*): Self = this.set("profiles", js.Array(value :_*))
    
    @scala.inline
    def setProfiles(value: js.Array[SchemaProfileSummary]): Self = this.set("profiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfiles: Self = this.set("profiles", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = this.set("starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarred: Self = this.set("starred", js.undefined)
    
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
}
