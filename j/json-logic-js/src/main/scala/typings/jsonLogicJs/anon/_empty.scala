package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty
  extends StObject
     with _RulesLogic {
  
  @JSName("==")
  var EqualssignEqualssign: js.Tuple2[js.Any, js.Any]
}
object _empty {
  
  inline def apply(EqualssignEqualssign: js.Tuple2[js.Any, js.Any]): _empty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("==")(EqualssignEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  
  extension [Self <: _empty](x: Self) {
    
    inline def setEqualssignEqualssign(value: js.Tuple2[js.Any, js.Any]): Self = StObject.set(x, "==", value.asInstanceOf[js.Any])
  }
}
