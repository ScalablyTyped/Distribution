package typings.listr2.anon

import typings.listr2.mod.ListrEvent
import typings.listr2.mod.ListrEventType.MESSAGE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataType
  extends StObject
     with ListrEvent {
  
  var data: Duration
  
  var `type`: MESSAGE
}
object DataType {
  
  inline def apply(data: Duration, `type`: MESSAGE): DataType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataType] (val x: Self) extends AnyVal {
    
    inline def setData(value: Duration): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: MESSAGE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
