package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An incident reported by Google Operations for a G Suite application.
  */
@js.native
trait SchemaGoogleOperations extends js.Object {
  
  /**
    * The list of emails which correspond to the users directly affected by the
    * incident.
    */
  var affectedUserEmails: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. Application-specific data for an incident, provided when the G
    * Suite application which reported the incident cannot be completely
    * restored to a valid state.
    */
  var attachmentData: js.UndefOr[SchemaAttachment] = js.native
  
  /**
    * A detailed, freeform incident description.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * A one-line incident description.
    */
  var title: js.UndefOr[String] = js.native
}
object SchemaGoogleOperations {
  
  @scala.inline
  def apply(): SchemaGoogleOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleOperations]
  }
  
  @scala.inline
  implicit class SchemaGoogleOperationsOps[Self <: SchemaGoogleOperations] (val x: Self) extends AnyVal {
    
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
    def setAffectedUserEmailsVarargs(value: String*): Self = this.set("affectedUserEmails", js.Array(value :_*))
    
    @scala.inline
    def setAffectedUserEmails(value: js.Array[String]): Self = this.set("affectedUserEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffectedUserEmails: Self = this.set("affectedUserEmails", js.undefined)
    
    @scala.inline
    def setAttachmentData(value: SchemaAttachment): Self = this.set("attachmentData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentData: Self = this.set("attachmentData", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
