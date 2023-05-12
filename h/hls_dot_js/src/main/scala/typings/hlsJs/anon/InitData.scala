package typings.hlsJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitData extends StObject {
  
  var initData: js.typedarray.ArrayBuffer | Null
  
  var initDataType: String
}
object InitData {
  
  inline def apply(initDataType: String): InitData = {
    val __obj = js.Dynamic.literal(initDataType = initDataType.asInstanceOf[js.Any], initData = null)
    __obj.asInstanceOf[InitData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InitData] (val x: Self) extends AnyVal {
    
    inline def setInitData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "initData", value.asInstanceOf[js.Any])
    
    inline def setInitDataNull: Self = StObject.set(x, "initData", null)
    
    inline def setInitDataType(value: String): Self = StObject.set(x, "initDataType", value.asInstanceOf[js.Any])
  }
}
