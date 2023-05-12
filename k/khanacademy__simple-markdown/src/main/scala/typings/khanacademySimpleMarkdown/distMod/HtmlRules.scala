package typings.khanacademySimpleMarkdown.distMod

import org.scalablytyped.runtime.StringDictionary
import typings.khanacademySimpleMarkdown.anon.HtmlArrayNodeOutput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlRules
  extends StObject
     with /* type */ StringDictionary[ParserRule & HtmlOutputRule] {
  
  val Array: js.UndefOr[HtmlArrayNodeOutput] = js.undefined
}
object HtmlRules {
  
  inline def apply(): HtmlRules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlRules]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlRules] (val x: Self) extends AnyVal {
    
    inline def setArray(value: HtmlArrayNodeOutput): Self = StObject.set(x, "Array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "Array", js.undefined)
  }
}
