package typings.listr2.anon

import typings.listr2.listr2Strings.DATA
import typings.listr2.listr2Strings.MESSAGE
import typings.listr2.mod.ListrEvent
import typings.listr2.mod.ListrEventType
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data
  extends StObject
     with ListrEvent {
  
  var data: js.UndefOr[String | Boolean] = js.undefined
  
  var `type`: Exclude[ListrEventType, MESSAGE | DATA]
}
object Data {
  
  inline def apply(`type`: Exclude[ListrEventType, MESSAGE | DATA]): Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: String | Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setType(value: Exclude[ListrEventType, MESSAGE | DATA]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
