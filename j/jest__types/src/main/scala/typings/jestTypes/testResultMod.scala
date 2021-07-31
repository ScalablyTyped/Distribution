package typings.jestTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testResultMod {
  
  trait AssertionResult extends StObject {
    
    var ancestorTitles: js.Array[String]
    
    var duration: js.UndefOr[Milliseconds | Null] = js.undefined
    
    var failureDetails: js.Array[js.Any]
    
    var failureMessages: js.Array[String]
    
    var fullName: String
    
    var invocations: js.UndefOr[Double] = js.undefined
    
    var location: js.UndefOr[Callsite | Null] = js.undefined
    
    var numPassingAsserts: Double
    
    var status: Status
    
    var title: String
  }
  object AssertionResult {
    
    @scala.inline
    def apply(
      ancestorTitles: js.Array[String],
      failureDetails: js.Array[js.Any],
      failureMessages: js.Array[String],
      fullName: String,
      numPassingAsserts: Double,
      status: Status,
      title: String
    ): AssertionResult = {
      val __obj = js.Dynamic.literal(ancestorTitles = ancestorTitles.asInstanceOf[js.Any], failureDetails = failureDetails.asInstanceOf[js.Any], failureMessages = failureMessages.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], numPassingAsserts = numPassingAsserts.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssertionResult]
    }
    
    @scala.inline
    implicit class AssertionResultMutableBuilder[Self <: AssertionResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAncestorTitles(value: js.Array[String]): Self = StObject.set(x, "ancestorTitles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAncestorTitlesVarargs(value: String*): Self = StObject.set(x, "ancestorTitles", js.Array(value :_*))
      
      @scala.inline
      def setDuration(value: Milliseconds): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationNull: Self = StObject.set(x, "duration", null)
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFailureDetails(value: js.Array[js.Any]): Self = StObject.set(x, "failureDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureDetailsVarargs(value: js.Any*): Self = StObject.set(x, "failureDetails", js.Array(value :_*))
      
      @scala.inline
      def setFailureMessages(value: js.Array[String]): Self = StObject.set(x, "failureMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailureMessagesVarargs(value: String*): Self = StObject.set(x, "failureMessages", js.Array(value :_*))
      
      @scala.inline
      def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocations(value: Double): Self = StObject.set(x, "invocations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvocationsUndefined: Self = StObject.set(x, "invocations", js.undefined)
      
      @scala.inline
      def setLocation(value: Callsite): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationNull: Self = StObject.set(x, "location", null)
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setNumPassingAsserts(value: Double): Self = StObject.set(x, "numPassingAsserts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Callsite extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object Callsite {
    
    @scala.inline
    def apply(column: Double, line: Double): Callsite = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callsite]
    }
    
    @scala.inline
    implicit class CallsiteMutableBuilder[Self <: Callsite] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  type Milliseconds = Double
  
  trait SerializableError extends StObject {
    
    var code: js.UndefOr[js.Any] = js.undefined
    
    var message: String
    
    var stack: js.UndefOr[String | Null] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SerializableError {
    
    @scala.inline
    def apply(message: String): SerializableError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[SerializableError]
    }
    
    @scala.inline
    implicit class SerializableErrorMutableBuilder[Self <: SerializableError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: js.Any): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackNull: Self = StObject.set(x, "stack", null)
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jestTypes.jestTypesStrings.passed
    - typings.jestTypes.jestTypesStrings.failed
    - typings.jestTypes.jestTypesStrings.skipped
    - typings.jestTypes.jestTypesStrings.pending
    - typings.jestTypes.jestTypesStrings.todo
    - typings.jestTypes.jestTypesStrings.disabled
  */
  trait Status extends StObject
  object Status {
    
    @scala.inline
    def disabled: typings.jestTypes.jestTypesStrings.disabled = "disabled".asInstanceOf[typings.jestTypes.jestTypesStrings.disabled]
    
    @scala.inline
    def failed: typings.jestTypes.jestTypesStrings.failed = "failed".asInstanceOf[typings.jestTypes.jestTypesStrings.failed]
    
    @scala.inline
    def passed: typings.jestTypes.jestTypesStrings.passed = "passed".asInstanceOf[typings.jestTypes.jestTypesStrings.passed]
    
    @scala.inline
    def pending: typings.jestTypes.jestTypesStrings.pending = "pending".asInstanceOf[typings.jestTypes.jestTypesStrings.pending]
    
    @scala.inline
    def skipped: typings.jestTypes.jestTypesStrings.skipped = "skipped".asInstanceOf[typings.jestTypes.jestTypesStrings.skipped]
    
    @scala.inline
    def todo: typings.jestTypes.jestTypesStrings.todo = "todo".asInstanceOf[typings.jestTypes.jestTypesStrings.todo]
  }
}
