package typings.khanacademySimpleMarkdown.distMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParserRules
  extends StObject
     with /* type */ StringDictionary[ParserRule] {
  
  val Array: js.UndefOr[ArrayRule] = js.undefined
}
object ParserRules {
  
  inline def apply(): ParserRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParserRules] (val x: Self) extends AnyVal {
    
    inline def setArray(value: ArrayRule): Self = StObject.set(x, "Array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "Array", js.undefined)
  }
}
