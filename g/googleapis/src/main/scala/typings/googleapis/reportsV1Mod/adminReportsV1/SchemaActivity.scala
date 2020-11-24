package typings.googleapis.reportsV1Mod.adminReportsV1

import typings.googleapis.anon.ApplicationName
import typings.googleapis.anon.CallerType
import typings.googleapis.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for the activity resource.
  */
@js.native
trait SchemaActivity extends js.Object {
  
  /**
    * User doing the action.
    */
  var actor: js.UndefOr[CallerType] = js.native
  
  /**
    * ETag of the entry.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * Activity events.
    */
  var events: js.UndefOr[js.Array[Name]] = js.native
  
  /**
    * Unique identifier for each activity record.
    */
  var id: js.UndefOr[ApplicationName] = js.native
  
  /**
    * IP Address of the user doing the action.
    */
  var ipAddress: js.UndefOr[String] = js.native
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Domain of source customer.
    */
  var ownerDomain: js.UndefOr[String] = js.native
}
object SchemaActivity {
  
  @scala.inline
  def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  
  @scala.inline
  implicit class SchemaActivityOps[Self <: SchemaActivity] (val x: Self) extends AnyVal {
    
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
    def setActor(value: CallerType): Self = this.set("actor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Name*): Self = this.set("events", js.Array(value :_*))
    
    @scala.inline
    def setEvents(value: js.Array[Name]): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setId(value: ApplicationName): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("ipAddress", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setOwnerDomain(value: String): Self = this.set("ownerDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerDomain: Self = this.set("ownerDomain", js.undefined)
  }
}
