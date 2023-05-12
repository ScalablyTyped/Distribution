package typings.khanacademySimpleMarkdown.distMod

import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlOutputRule extends StObject {
  
  val html: HtmlNodeOutput | Null
}
object HtmlOutputRule {
  
  inline def apply(): HtmlOutputRule = {
    val __obj = js.Dynamic.literal(html = null)
    __obj.asInstanceOf[HtmlOutputRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlOutputRule] (val x: Self) extends AnyVal {
    
    inline def setHtml(value: (/* node */ SingleASTNode, /* nestedOutput */ Output[String], /* state */ State) => String): Self = StObject.set(x, "html", js.Any.fromFunction3(value))
    
    inline def setHtmlNull: Self = StObject.set(x, "html", null)
  }
}
