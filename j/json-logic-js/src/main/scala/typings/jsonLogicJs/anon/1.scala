package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`
  extends StObject
     with _RulesLogic {
  
  @JSName("!=")
  var ExclamationmarkEqualssign: js.Tuple2[js.Any, js.Any]
}
object `1` {
  
  inline def apply(ExclamationmarkEqualssign: js.Tuple2[js.Any, js.Any]): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!=")(ExclamationmarkEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setExclamationmarkEqualssign(value: js.Tuple2[js.Any, js.Any]): Self = StObject.set(x, "!=", value.asInstanceOf[js.Any])
  }
}
