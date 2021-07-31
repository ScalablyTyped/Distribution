package typings.iobroker.objectsMod.global.ioBroker

import typings.iobroker.iobrokerStrings.adapter
import typings.iobroker.iobrokerStrings.chart
import typings.iobroker.iobrokerStrings.config
import typings.iobroker.iobrokerStrings.info
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherObject
  extends StObject
     with BaseObject
     with AnyObject {
  
  @JSName("common")
  var common_OtherObject: OtherCommon
  
  @JSName("type")
  var type_OtherObject: adapter | config | info | chart
}
object OtherObject {
  
  @scala.inline
  def apply(
    _id: String,
    common: OtherCommon,
    native: Record[String, js.Any],
    `type`: adapter | config | info | chart
  ): OtherObject = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], native = native.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherObject]
  }
  
  @scala.inline
  implicit class OtherObjectMutableBuilder[Self <: OtherObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommon(value: OtherCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: adapter | config | info | chart): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
