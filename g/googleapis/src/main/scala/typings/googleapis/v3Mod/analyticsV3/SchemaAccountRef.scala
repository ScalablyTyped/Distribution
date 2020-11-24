package typings.googleapis.v3Mod.analyticsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for a linked account.
  */
@js.native
trait SchemaAccountRef extends js.Object {
  
  /**
    * Link for this account.
    */
  var href: js.UndefOr[String] = js.native
  
  /**
    * Account ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Analytics account reference.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Account name.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaAccountRef {
  
  @scala.inline
  def apply(): SchemaAccountRef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountRef]
  }
  
  @scala.inline
  implicit class SchemaAccountRefOps[Self <: SchemaAccountRef] (val x: Self) extends AnyVal {
    
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    
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
  }
}
