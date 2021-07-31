package typings.koaRequestid

import typings.koaRequestid.koaRequestidBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Expose extends StObject {
    
    var expose: js.UndefOr[String | `false`] = js.undefined
    
    var header: js.UndefOr[String | `false`] = js.undefined
    
    var query: js.UndefOr[String | `false`] = js.undefined
  }
  object Expose {
    
    @scala.inline
    def apply(): Expose = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Expose]
    }
    
    @scala.inline
    implicit class ExposeMutableBuilder[Self <: Expose] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpose(value: String | `false`): Self = StObject.set(x, "expose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposeUndefined: Self = StObject.set(x, "expose", js.undefined)
      
      @scala.inline
      def setHeader(value: String | `false`): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setQuery(value: String | `false`): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    }
  }
}
