package typings.historyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait HashChange extends StObject {
    
    var hashChange: js.UndefOr[js.Any] = js.native
    
    var pushState: js.UndefOr[js.Any] = js.native
  }
  object HashChange {
    
    @scala.inline
    def apply(): HashChange = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashChange]
    }
    
    @scala.inline
    implicit class HashChangeMutableBuilder[Self <: HashChange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHashChange(value: js.Any): Self = StObject.set(x, "hashChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashChangeUndefined: Self = StObject.set(x, "hashChange", js.undefined)
      
      @scala.inline
      def setPushState(value: js.Any): Self = StObject.set(x, "pushState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushStateUndefined: Self = StObject.set(x, "pushState", js.undefined)
    }
  }
}
