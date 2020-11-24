package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqlAclEntry extends js.Object {
  
  /** The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example: `2012-11-15T16:19:00.094Z`. */
  var expireTime: js.UndefOr[String] = js.native
  
  /** A label to identify this entry. */
  var label: js.UndefOr[String] = js.native
  
  /** Input only. The time-to-leave of this access control entry. */
  var ttl: js.UndefOr[String] = js.native
  
  /** The allowlisted value for the access control list. */
  var value: js.UndefOr[String] = js.native
}
object SqlAclEntry {
  
  @scala.inline
  def apply(): SqlAclEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlAclEntry]
  }
  
  @scala.inline
  implicit class SqlAclEntryOps[Self <: SqlAclEntry] (val x: Self) extends AnyVal {
    
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
    def setExpireTime(value: String): Self = this.set("expireTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireTime: Self = this.set("expireTime", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setTtl(value: String): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
