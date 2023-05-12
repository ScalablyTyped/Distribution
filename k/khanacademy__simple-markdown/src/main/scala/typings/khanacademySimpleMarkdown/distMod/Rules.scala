package typings.khanacademySimpleMarkdown.distMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rules[OutputRule]
  extends StObject
     with /* type */ StringDictionary[ParserRule & OutputRule] {
  
  val Array: js.UndefOr[ArrayRule] = js.undefined
}
object Rules {
  
  inline def apply[OutputRule](): Rules[OutputRule] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rules[OutputRule]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Rules[?], OutputRule] (val x: Self & Rules[OutputRule]) extends AnyVal {
    
    inline def setArray(value: ArrayRule): Self = StObject.set(x, "Array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "Array", js.undefined)
  }
}
