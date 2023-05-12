package typings.jotai.anon

import typings.jotai.jotaiStrings.insert
import typings.jotai.vanillaAtomMod.PrimitiveAtom
import typings.jotai.vanillaUtilsSplitAtomMod.SplitAtomAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Before[Item]
  extends StObject
     with SplitAtomAction[Item] {
  
  var before: js.UndefOr[PrimitiveAtom[Item]] = js.undefined
  
  var `type`: insert
  
  var value: Item
}
object Before {
  
  inline def apply[Item](value: Item): Before[Item] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("insert")
    __obj.asInstanceOf[Before[Item]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Before[?], Item] (val x: Self & Before[Item]) extends AnyVal {
    
    inline def setBefore(value: PrimitiveAtom[Item]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setType(value: insert): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Item): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
