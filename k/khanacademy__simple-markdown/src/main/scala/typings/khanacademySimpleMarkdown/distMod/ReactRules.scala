package typings.khanacademySimpleMarkdown.distMod

import org.scalablytyped.runtime.StringDictionary
import typings.khanacademySimpleMarkdown.anon.React
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReactRules
  extends StObject
     with /* type */ StringDictionary[ParserRule & ReactOutputRule] {
  
  val Array: js.UndefOr[React] = js.undefined
}
object ReactRules {
  
  inline def apply(): ReactRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReactRules] (val x: Self) extends AnyVal {
    
    inline def setArray(value: React): Self = StObject.set(x, "Array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "Array", js.undefined)
  }
}
