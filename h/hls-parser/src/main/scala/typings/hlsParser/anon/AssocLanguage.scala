package typings.hlsParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssocLanguage[T] extends js.Object {
  
  var assocLanguage: js.UndefOr[String] = js.native
  
  var autoselect: js.UndefOr[Boolean] = js.native
  
  var channels: js.UndefOr[String] = js.native
  
  var characteristics: js.UndefOr[String] = js.native
  
  var forced: js.UndefOr[Boolean] = js.native
  
  var groupId: String = js.native
  
  var instreamId: js.UndefOr[String] = js.native
  
  var isDefault: js.UndefOr[Boolean] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var `type`: T = js.native
  
  var uri: js.UndefOr[String] = js.native
}
object AssocLanguage {
  
  @scala.inline
  def apply[T](groupId: String, name: String, `type`: T): AssocLanguage[T] = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssocLanguage[T]]
  }
  
  @scala.inline
  implicit class AssocLanguageOps[Self <: AssocLanguage[_], T] (val x: Self with AssocLanguage[T]) extends AnyVal {
    
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
    def setGroupId(value: String): Self = this.set("groupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: T): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssocLanguage(value: String): Self = this.set("assocLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssocLanguage: Self = this.set("assocLanguage", js.undefined)
    
    @scala.inline
    def setAutoselect(value: Boolean): Self = this.set("autoselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoselect: Self = this.set("autoselect", js.undefined)
    
    @scala.inline
    def setChannels(value: String): Self = this.set("channels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    
    @scala.inline
    def setCharacteristics(value: String): Self = this.set("characteristics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCharacteristics: Self = this.set("characteristics", js.undefined)
    
    @scala.inline
    def setForced(value: Boolean): Self = this.set("forced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForced: Self = this.set("forced", js.undefined)
    
    @scala.inline
    def setInstreamId(value: String): Self = this.set("instreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstreamId: Self = this.set("instreamId", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
