package typings.jotai.anon

import typings.jotai.jotaiStrings.hasData
import typings.jotai.vanillaUtilsLoadableMod.Loadable_
import typings.std.Awaited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[Value]
  extends StObject
     with Loadable_[Value] {
  
  var data: Awaited[Value]
  
  var state: hasData
}
object Data {
  
  inline def apply[Value](data: Awaited[Value]): Data[Value] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], state = "hasData")
    __obj.asInstanceOf[Data[Value]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data[?], Value] (val x: Self & Data[Value]) extends AnyVal {
    
    inline def setData(value: Awaited[Value]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setState(value: hasData): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
