package typings.inquirer.mod

import org.scalablytyped.runtime.Instantiable3
import typings.inquirer.anon.Choices
import typings.inquirer.inquirerBooleans.`false`
import typings.inquirer.inquirerBooleans.`true`
import typings.inquirer.inquirerStrings.answered
import typings.inquirer.inquirerStrings.done
import typings.inquirer.inquirerStrings.idle
import typings.inquirer.inquirerStrings.loading
import typings.inquirer.inquirerStrings.pending
import typings.node.readlineMod.Interface
import typings.rxjs.mod.Observable_
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides components for the prompts.
  */
object prompts {
  
  /**
    * Provides data about the failed state of a prompt.
    */
  @js.native
  trait FailedPromptStateData extends PromptStateData {
    
    /**
      * @inheritdoc
      */
    @JSName("isValid")
    var isValid_FailedPromptStateData: `false` | String = js.native
  }
  object FailedPromptStateData {
    
    @scala.inline
    def apply(isValid: `false` | String): FailedPromptStateData = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FailedPromptStateData]
    }
    
    @scala.inline
    implicit class FailedPromptStateDataMutableBuilder[Self <: FailedPromptStateData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsValid(value: `false` | String): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Represents a prompt.
    */
  @js.native
  trait PromptBase extends StObject {
    
    /**
      * Runs the prompt.
      *
      * @returns
      * The result of the prompt.
      */
    def run(): js.Promise[_] = js.native
    
    /**
      * Gets or sets a string which represents the state of the prompt.
      */
    var status: PromptState = js.native
  }
  object PromptBase {
    
    @scala.inline
    def apply(run: () => js.Promise[_], status: PromptState): PromptBase = {
      val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run), status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptBase]
    }
    
    @scala.inline
    implicit class PromptBaseMutableBuilder[Self <: PromptBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRun(value: () => js.Promise[_]): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStatus(value: PromptState): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides a set of prompt-constructors.
    */
  type PromptCollection = Record[String, PromptConstructor]
  
  /**
    * Provides the functionality to initialize new prompts.
    */
  @js.native
  trait PromptConstructor
    extends /**
    * Initializes a new instance of a prompt.
    *
    * @param question
    * The question to prompt.
    *
    * @param readLine
    * An object for reading from the command-line.
    *
    * @param answers
    * The answers provided by the user.
    */
  Instantiable3[/* question */ js.Any, /* readLine */ Interface, /* answers */ Answers, PromptBase]
  
  /**
    * Provides pipes for handling events of a prompt.
    *
    * @param T
    * The type of the answer.
    */
  @js.native
  trait PromptEventPipes[T] extends StObject {
    
    /**
      * An object representing an error.
      */
    var error: Observable_[FailedPromptStateData] = js.native
    
    /**
      * A pypeline for succesful inputs.
      */
    var success: Observable_[SuccessfulPromptStateData[T]] = js.native
  }
  object PromptEventPipes {
    
    @scala.inline
    def apply[T](error: Observable_[FailedPromptStateData], success: Observable_[SuccessfulPromptStateData[T]]): PromptEventPipes[T] = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptEventPipes[T]]
    }
    
    @scala.inline
    implicit class PromptEventPipesMutableBuilder[Self <: PromptEventPipes[_], T] (val x: Self with PromptEventPipes[T]) extends AnyVal {
      
      @scala.inline
      def setError(value: Observable_[FailedPromptStateData]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuccess(value: Observable_[SuccessfulPromptStateData[T]]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides a base for and prompt-options.
    *
    * @template T
    * The type of the answers.
    */
  type PromptOptions[T /* <: Question[Answers] */] = T with Choices
  
  /**
    * Represents the state of a prompt.
    */
  type PromptState = LiteralUnion[pending | idle | loading | answered | done, String]
  
  /**
    * Provides data about the state of a prompt.
    */
  @js.native
  trait PromptStateData extends StObject {
    
    /**
      * Either a string which describes the error of the prompt or a boolean indicating whether the prompt-value is valid.
      */
    var isValid: String | Boolean = js.native
  }
  object PromptStateData {
    
    @scala.inline
    def apply(isValid: String | Boolean): PromptStateData = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptStateData]
    }
    
    @scala.inline
    implicit class PromptStateDataMutableBuilder[Self <: PromptStateData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsValid(value: String | Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides data about the successful state of a prompt.
    *
    * @param T
    * The type of the answer.
    */
  @js.native
  trait SuccessfulPromptStateData[T] extends PromptStateData {
    
    /**
      * @inheritdoc
      */
    @JSName("isValid")
    var isValid_SuccessfulPromptStateData: `true` = js.native
    
    /**
      * The value of the prompt.
      */
    var value: T = js.native
  }
  object SuccessfulPromptStateData {
    
    @scala.inline
    def apply[T](isValid: `true`, value: T): SuccessfulPromptStateData[T] = {
      val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessfulPromptStateData[T]]
    }
    
    @scala.inline
    implicit class SuccessfulPromptStateDataMutableBuilder[Self <: SuccessfulPromptStateData[_], T] (val x: Self with SuccessfulPromptStateData[T]) extends AnyVal {
      
      @scala.inline
      def setIsValid(value: `true`): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
