package typings.matrixAppserviceBridge.anon

import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.none
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.per_room
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var `type`: none | single | per_room
}
object `0` {
  
  @scala.inline
  def apply(`type`: none | single | per_room): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: none | single | per_room): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
