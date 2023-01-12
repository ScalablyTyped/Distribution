package typings.jsforce.describeResultMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordTypeInfo extends StObject {
  
  var available: Boolean
  
  var defaultRecordTypeMapping: Boolean
  
  var developerName: js.UndefOr[maybe[String]] = js.undefined
  
  var master: Boolean
  
  var name: String
  
  var recordTypeId: String
  
  var urls: Record[String, String]
}
object RecordTypeInfo {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: RecordTypeInfo] (val x: Self) extends AnyVal {
    
    inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
    
    inline def setDefaultRecordTypeMapping(value: Boolean): Self = StObject.set(x, "defaultRecordTypeMapping", value.asInstanceOf[js.Any])
    
    inline def setDeveloperName(value: maybe[String]): Self = StObject.set(x, "developerName", value.asInstanceOf[js.Any])
    
    inline def setDeveloperNameNull: Self = StObject.set(x, "developerName", null)
    
    inline def setDeveloperNameUndefined: Self = StObject.set(x, "developerName", js.undefined)
    
    inline def setMaster(value: Boolean): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRecordTypeId(value: String): Self = StObject.set(x, "recordTypeId", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: Record[String, String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
  }
}
