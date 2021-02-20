package typings.jshamcrest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AttachAssertions extends StObject {
    
    var attachAssertions: js.UndefOr[Boolean] = js.native
    
    var scope: js.UndefOr[js.Object] = js.native
  }
  object AttachAssertions {
    
    @scala.inline
    def apply(): AttachAssertions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AttachAssertions]
    }
    
    @scala.inline
    implicit class AttachAssertionsMutableBuilder[Self <: AttachAssertions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttachAssertions(value: Boolean): Self = StObject.set(x, "attachAssertions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttachAssertionsUndefined: Self = StObject.set(x, "attachAssertions", js.undefined)
      
      @scala.inline
      def setScope(value: js.Object): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  @js.native
  trait Scope extends StObject {
    
    var scope: js.UndefOr[js.Object] = js.native
  }
  object Scope {
    
    @scala.inline
    def apply(): Scope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scope]
    }
    
    @scala.inline
    implicit class ScopeMutableBuilder[Self <: Scope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setScope(value: js.Object): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
}
