package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for instant messenger of an user.
  */
@js.native
trait SchemaUserIm extends js.Object {
  
  /**
    * Custom protocol.
    */
  var customProtocol: js.UndefOr[String] = js.native
  
  /**
    * Custom type.
    */
  var customType: js.UndefOr[String] = js.native
  
  /**
    * Instant messenger id.
    */
  var im: js.UndefOr[String] = js.native
  
  /**
    * If this is user&#39;s primary im. Only one entry could be marked as
    * primary.
    */
  var primary: js.UndefOr[Boolean] = js.native
  
  /**
    * Protocol used in the instant messenger. It should be one of the values
    * from ImProtocolTypes map. Similar to type, it can take a CUSTOM value and
    * specify the custom name in customProtocol field.
    */
  var protocol: js.UndefOr[String] = js.native
  
  /**
    * Each entry can have a type which indicates standard types of that entry.
    * For example instant messengers could be of home, work etc. In addition to
    * the standard type, an entry can have a custom type and can take any
    * value. Such types should have the CUSTOM value as type and also have a
    * customType value.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaUserIm {
  
  @scala.inline
  def apply(): SchemaUserIm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserIm]
  }
  
  @scala.inline
  implicit class SchemaUserImOps[Self <: SchemaUserIm] (val x: Self) extends AnyVal {
    
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
    def setCustomProtocol(value: String): Self = this.set("customProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomProtocol: Self = this.set("customProtocol", js.undefined)
    
    @scala.inline
    def setCustomType(value: String): Self = this.set("customType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomType: Self = this.set("customType", js.undefined)
    
    @scala.inline
    def setIm(value: String): Self = this.set("im", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIm: Self = this.set("im", js.undefined)
    
    @scala.inline
    def setPrimary(value: Boolean): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
