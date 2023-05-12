package typings.khanacademySimpleMarkdown.distMod

import typings.khanacademySimpleMarkdown.distTroublesomeTypesMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonNullHtmlOutputRule extends StObject {
  
  val html: HtmlNodeOutput
}
object NonNullHtmlOutputRule {
  
  inline def apply(html: (/* node */ SingleASTNode, /* nestedOutput */ Output[String], /* state */ State) => String): NonNullHtmlOutputRule = {
    val __obj = js.Dynamic.literal(html = js.Any.fromFunction3(html))
    __obj.asInstanceOf[NonNullHtmlOutputRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonNullHtmlOutputRule] (val x: Self) extends AnyVal {
    
    inline def setHtml(value: (/* node */ SingleASTNode, /* nestedOutput */ Output[String], /* state */ State) => String): Self = StObject.set(x, "html", js.Any.fromFunction3(value))
  }
}
