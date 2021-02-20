package typings.markdownDraftJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Close extends StObject {
    
    def close(): String = js.native
    def close(
      entity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ js.Any
    ): String = js.native
    
    def open(): String = js.native
    def open(
      entity: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Entity */ js.Any
    ): String = js.native
  }
  
  @js.native
  trait Open extends StObject {
    
    def close(): String = js.native
    
    def open(): String = js.native
  }
  object Open {
    
    @scala.inline
    def apply(close: () => String, open: () => String): Open = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
      __obj.asInstanceOf[Open]
    }
    
    @scala.inline
    implicit class OpenMutableBuilder[Self <: Open] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => String): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpen(value: () => String): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    }
  }
}
