package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.folder
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderObject
  extends BaseObject
     with AnyObject {
  
  // Nothing is set in stone here, so start with allowing every property
  @JSName("common")
  var common_FolderObject: OtherCommon = js.native
  
  @JSName("type")
  var type_FolderObject: folder = js.native
}
object FolderObject {
  
  @scala.inline
  def apply(_id: String, common: OtherCommon, native: Record[String, _], `type`: folder): FolderObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FolderObject]
  }
  
  @scala.inline
  implicit class FolderObjectMutableBuilder[Self <: FolderObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: OtherCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: folder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
