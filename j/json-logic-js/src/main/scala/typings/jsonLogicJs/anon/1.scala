package typings.jsonLogicJs.anon

import typings.jsonLogicJs.mod._RulesLogic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends _RulesLogic {
  
  @JSName("!=")
  var ExclamationmarkEqualssign: js.Tuple2[_, _] = js.native
}
object `1` {
  
  @scala.inline
  def apply(ExclamationmarkEqualssign: js.Tuple2[_, _]): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("!=")(ExclamationmarkEqualssign.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclamationmarkEqualssign(value: js.Tuple2[_, _]): Self = StObject.set(x, "!=", value.asInstanceOf[js.Any])
  }
}
