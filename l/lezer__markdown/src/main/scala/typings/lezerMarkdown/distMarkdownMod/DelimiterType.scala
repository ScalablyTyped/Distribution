package typings.lezerMarkdown.distMarkdownMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelimiterType extends StObject {
  
  var mark: js.UndefOr[String] = js.undefined
  
  var resolve: js.UndefOr[String] = js.undefined
}
object DelimiterType {
  
  inline def apply(): DelimiterType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DelimiterType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DelimiterType] (val x: Self) extends AnyVal {
    
    inline def setMark(value: String): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    inline def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    inline def setResolve(value: String): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
  }
}
