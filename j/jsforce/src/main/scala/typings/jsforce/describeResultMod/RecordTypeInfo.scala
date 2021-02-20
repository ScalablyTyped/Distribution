package typings.jsforce.describeResultMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecordTypeInfo extends StObject {
  
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
  implicit class RecordTypeInfoMutableBuilder[Self <: RecordTypeInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRecordTypeMapping(value: Boolean): Self = StObject.set(x, "defaultRecordTypeMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperName(value: maybe[String]): Self = StObject.set(x, "developerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeveloperNameNull: Self = StObject.set(x, "developerName", null)
    
    @scala.inline
    def setDeveloperNameUndefined: Self = StObject.set(x, "developerName", js.undefined)
    
    @scala.inline
    def setMaster(value: Boolean): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTypeId(value: String): Self = StObject.set(x, "recordTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrls(value: Record[String, String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
  }
}
