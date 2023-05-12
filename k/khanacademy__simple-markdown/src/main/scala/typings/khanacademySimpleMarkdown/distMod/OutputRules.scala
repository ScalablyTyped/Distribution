package typings.khanacademySimpleMarkdown.distMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputRules[Rule]
  extends StObject
     with /* type */ StringDictionary[Rule] {
  
  val Array: js.UndefOr[ArrayRule] = js.undefined
}
object OutputRules {
  
  inline def apply[Rule](): OutputRules[Rule] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputRules[Rule]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputRules[?], Rule] (val x: Self & OutputRules[Rule]) extends AnyVal {
    
    inline def setArray(value: ArrayRule): Self = StObject.set(x, "Array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "Array", js.undefined)
  }
}
