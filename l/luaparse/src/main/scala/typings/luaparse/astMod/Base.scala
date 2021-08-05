package typings.luaparse.astMod

import typings.luaparse.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base[TType /* <: String */] extends StObject {
  
  var loc: js.UndefOr[End] = js.undefined
  
  var `type`: TType
}
object Base {
  
  inline def apply[TType /* <: String */](`type`: TType): Base[TType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base[TType]]
  }
  
  extension [Self <: Base[?], TType /* <: String */](x: Self & Base[TType]) {
    
    inline def setLoc(value: End): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
