package typings.linkifyMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("linkify-markdown", "linkify")
  @js.native
  def linkify(source: String): String = js.native
  @JSImport("linkify-markdown", "linkify")
  @js.native
  def linkify(source: String, options: LinkifyOptions): String = js.native
  
  @js.native
  trait LinkifyOptions extends StObject {
    
    var repository: js.UndefOr[String] = js.native
    
    var strong: js.UndefOr[Boolean] = js.native
  }
  object LinkifyOptions {
    
    @scala.inline
    def apply(): LinkifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkifyOptions]
    }
    
    @scala.inline
    implicit class LinkifyOptionsMutableBuilder[Self <: LinkifyOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setStrong(value: Boolean): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongUndefined: Self = StObject.set(x, "strong", js.undefined)
    }
  }
}
