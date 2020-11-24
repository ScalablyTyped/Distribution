package typings.jsforce.describeResultMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordTypeInfo extends js.Object {
  
  var available: Boolean = js.native
  
  var defaultRecordTypeMapping: Boolean = js.native
  
  var developerName: js.UndefOr[maybe[String]] = js.native
  
  var master: Boolean = js.native
  
  var name: String = js.native
  
  var recordTypeId: String = js.native
  
  var urls: Record[String, String] = js.native
}
object RecordTypeInfo {
  
  @scala.inline
  def apply(
    available: Boolean,
    defaultRecordTypeMapping: Boolean,
    master: Boolean,
    name: String,
    recordTypeId: String,
    urls: Record[String, String]
  ): RecordTypeInfo = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], defaultRecordTypeMapping = defaultRecordTypeMapping.asInstanceOf[js.Any], master = master.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], recordTypeId = recordTypeId.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordTypeInfo]
  }
  
  @scala.inline
  implicit class RecordTypeInfoOps[Self <: RecordTypeInfo] (val x: Self) extends AnyVal {
    
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
    def setAvailable(value: Boolean): Self = this.set("available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRecordTypeMapping(value: Boolean): Self = this.set("defaultRecordTypeMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaster(value: Boolean): Self = this.set("master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTypeId(value: String): Self = this.set("recordTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrls(value: Record[String, String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperName(value: maybe[String]): Self = this.set("developerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeveloperName: Self = this.set("developerName", js.undefined)
    
    @scala.inline
    def setDeveloperNameNull: Self = this.set("developerName", null)
  }
}
