package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.folder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderObject
  extends StObject
     with BaseObject
     with AnyObject {
  
  // Nothing is set in stone here, so start with allowing every property
  @JSName("common")
  var common_FolderObject: OtherCommon
  
  @JSName("type")
  var type_FolderObject: folder
}
object FolderObject {
  
  inline def apply(_id: String, common: OtherCommon, native: Record[String, js.Any]): FolderObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("folder")
    __obj.asInstanceOf[FolderObject]
  }
  
  extension [Self <: FolderObject](x: Self) {
    
    inline def setCommon(value: OtherCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setType(value: folder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
