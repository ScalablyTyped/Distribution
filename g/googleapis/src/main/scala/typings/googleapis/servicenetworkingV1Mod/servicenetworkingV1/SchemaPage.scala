package typings.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPage extends StObject {
  
  /**
    * The Markdown content of the page. You can use (== include {path\} ==) to include content from a Markdown file. The content can be used to produce the documentation page such as HTML format page.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Subpages of this page. The order of subpages specified here will be honored in the generated docset.
    */
  var subpages: js.UndefOr[js.Array[SchemaPage]] = js.undefined
}
object SchemaPage {
  
  inline def apply(): SchemaPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPage]
  }
  
  extension [Self <: SchemaPage](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSubpages(value: js.Array[SchemaPage]): Self = StObject.set(x, "subpages", value.asInstanceOf[js.Any])
    
    inline def setSubpagesUndefined: Self = StObject.set(x, "subpages", js.undefined)
    
    inline def setSubpagesVarargs(value: SchemaPage*): Self = StObject.set(x, "subpages", js.Array(value*))
  }
}
