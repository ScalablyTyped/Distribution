package typings.i18nextSprintfPostprocessor

import typings.i18nextSprintfPostprocessor.i18nextSprintfPostprocessorStrings.sprintf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait PostProcess extends StObject {
    
    var postProcess: sprintf
    
    var sprintf: js.Array[String]
  }
  object PostProcess {
    
    @scala.inline
    def apply(sprintf: js.Array[String]): PostProcess = {
      val __obj = js.Dynamic.literal(postProcess = "sprintf", sprintf = sprintf.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostProcess]
    }
    
    @scala.inline
    implicit class PostProcessMutableBuilder[Self <: PostProcess] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostProcess(value: sprintf): Self = StObject.set(x, "postProcess", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSprintf(value: js.Array[String]): Self = StObject.set(x, "sprintf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSprintfVarargs(value: String*): Self = StObject.set(x, "sprintf", js.Array(value :_*))
    }
  }
}
