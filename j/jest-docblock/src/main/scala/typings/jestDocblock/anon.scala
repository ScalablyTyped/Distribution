package typings.jestDocblock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Comments extends StObject {
    
    var comments: String = js.native
    
    var pragmas: typings.jestDocblock.mod.Pragmas = js.native
  }
  object Comments {
    
    @scala.inline
    def apply(comments: String, pragmas: typings.jestDocblock.mod.Pragmas): Comments = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], pragmas = pragmas.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comments]
    }
    
    @scala.inline
    implicit class CommentsMutableBuilder[Self <: Comments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPragmas(value: typings.jestDocblock.mod.Pragmas): Self = StObject.set(x, "pragmas", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Pragmas extends StObject {
    
    var comments: js.UndefOr[String] = js.native
    
    var pragmas: js.UndefOr[typings.jestDocblock.mod.Pragmas] = js.native
  }
  object Pragmas {
    
    @scala.inline
    def apply(): Pragmas = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pragmas]
    }
    
    @scala.inline
    implicit class PragmasMutableBuilder[Self <: Pragmas] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: String): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setPragmas(value: typings.jestDocblock.mod.Pragmas): Self = StObject.set(x, "pragmas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPragmasUndefined: Self = StObject.set(x, "pragmas", js.undefined)
    }
  }
}
