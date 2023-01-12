package typings.ionicons.distTypesStencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VNodeData
  extends StObject
     with /* prop */ StringDictionary[Any] {
  
  var `class`: js.UndefOr[StringDictionary[Boolean]] = js.undefined
  
  var style: js.UndefOr[Any] = js.undefined
}
object VNodeData {
  
  inline def apply(): VNodeData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VNodeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VNodeData] (val x: Self) extends AnyVal {
    
    inline def setClass(value: StringDictionary[Boolean]): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
