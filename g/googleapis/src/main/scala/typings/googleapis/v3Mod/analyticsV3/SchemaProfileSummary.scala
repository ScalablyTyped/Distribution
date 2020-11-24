package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for an Analytics ProfileSummary. ProfileSummary returns basic
  * information (i.e., summary) for a profile.
  */
@js.native
trait SchemaProfileSummary extends js.Object {
  
  /**
    * View (profile) ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Resource type for Analytics ProfileSummary.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * View (profile) name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether this view (profile) is starred or not.
    */
  var starred: js.UndefOr[Boolean] = js.native
  
  /**
    * View (Profile) type. Supported types: WEB or APP.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaProfileSummary {
  
  @scala.inline
  def apply(): SchemaProfileSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProfileSummary]
  }
  
  @scala.inline
  implicit class SchemaProfileSummaryOps[Self <: SchemaProfileSummary] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setStarred(value: Boolean): Self = this.set("starred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStarred: Self = this.set("starred", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
