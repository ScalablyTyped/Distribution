package typings.httpsnippet

import typings.httpsnippet.mod.TargetInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Info[C /* <: String */] extends StObject {
    
    var info: TargetInfo[C]
  }
  object Info {
    
    @scala.inline
    def apply[C /* <: String */](info: TargetInfo[C]): Info[C] = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info[C]]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info[?], C /* <: String */] (val x: Self & Info[C]) extends AnyVal {
      
      @scala.inline
      def setInfo(value: TargetInfo[C]): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    }
  }
}
