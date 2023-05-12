package typings.khanacademySimpleMarkdown.distMod

import org.scalablytyped.runtime.StringDictionary
import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayRule
  extends StObject
     with /* key */ StringDictionary[ArrayNodeOutput[Any]] {
  
  val html: js.UndefOr[ArrayNodeOutput[String]] = js.undefined
  
  val react: js.UndefOr[ArrayNodeOutput[ReactElements]] = js.undefined
}
object ArrayRule {
  
  inline def apply(): ArrayRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayRule] (val x: Self) extends AnyVal {
    
    inline def setHtml(
      value: (/* node */ js.Array[SingleASTNode], /* nestedOutput */ Output[String], /* state */ State) => String
    ): Self = StObject.set(x, "html", js.Any.fromFunction3(value))
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setReact(
      value: (/* node */ js.Array[SingleASTNode], /* nestedOutput */ Output[ReactElements], /* state */ State) => ReactElements
    ): Self = StObject.set(x, "react", js.Any.fromFunction3(value))
    
    inline def setReactUndefined: Self = StObject.set(x, "react", js.undefined)
  }
}
