package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaliciousEntity extends js.Object {
  
  /** The header from display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** The actor who triggered a gmail phishing alert. */
  var entity: js.UndefOr[User] = js.native
  
  /** The sender email address. */
  var fromHeader: js.UndefOr[String] = js.native
}
object MaliciousEntity {
  
  @scala.inline
  def apply(): MaliciousEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaliciousEntity]
  }
  
  @scala.inline
  implicit class MaliciousEntityOps[Self <: MaliciousEntity] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEntity(value: User): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntity: Self = this.set("entity", js.undefined)
    
    @scala.inline
    def setFromHeader(value: String): Self = this.set("fromHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromHeader: Self = this.set("fromHeader", js.undefined)
  }
}
