package typings.karmaSpecReporter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Failure extends StObject {
    
    var failure: js.UndefOr[String] = js.undefined
    
    var skipped: js.UndefOr[String] = js.undefined
    
    var success: js.UndefOr[String] = js.undefined
  }
  object Failure {
    
    @scala.inline
    def apply(): Failure = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Failure]
    }
    
    @scala.inline
    implicit class FailureMutableBuilder[Self <: Failure] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFailure(value: String): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
      
      @scala.inline
      def setSkipped(value: String): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkippedUndefined: Self = StObject.set(x, "skipped", js.undefined)
      
      @scala.inline
      def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    }
  }
}
