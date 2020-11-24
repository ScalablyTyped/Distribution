package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An entry for an Access Control list.
  */
@js.native
trait SchemaAclEntry extends js.Object {
  
  /**
    * The time when this access control entry expires in RFC 3339 format, for
    * example 2012-11-15T16:19:00.094Z.
    */
  var expirationTime: js.UndefOr[String] = js.native
  
  /**
    * This is always sql#aclEntry.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * An optional label to identify this entry.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The whitelisted value for the access control list.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaAclEntry {
  
  @scala.inline
  def apply(): SchemaAclEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAclEntry]
  }
  
  @scala.inline
  implicit class SchemaAclEntryOps[Self <: SchemaAclEntry] (val x: Self) extends AnyVal {
    
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
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
