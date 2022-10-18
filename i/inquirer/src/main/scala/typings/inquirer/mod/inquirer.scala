package typings.inquirer.mod

import org.scalablytyped.runtime.Instantiable3
import typings.inquirer.anon.Choices
import typings.inquirer.anon.Default
import typings.inquirer.inquirerBooleans.`false`
import typings.inquirer.inquirerBooleans.`true`
import typings.inquirer.inquirerStrings.answered
import typings.inquirer.inquirerStrings.done
import typings.inquirer.inquirerStrings.idle
import typings.inquirer.inquirerStrings.loading
import typings.inquirer.inquirerStrings.pending
import typings.inquirer.mod.inquirer.prompts.PromptCollection
import typings.node.readlineMod.Interface
import typings.rxjs.mod.Observable_
import typings.std.Record
import typings.through.mod.ThroughStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the functionality to prompt questions.
  */
object inquirer {
  
  /**
    * Represents a choice-item separator.
    */
  trait Separator
    extends StObject
       with SeparatorOptions {
    
    /**
      * @inheritdoc
      */
    @JSName("line")
    var line_Separator: String
  }
  object Separator {
    
    inline def apply(line: String): Separator = {
      val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("separator")
      __obj.asInstanceOf[Separator]
    }
    
    extension [Self <: Separator](x: Self) {
      
      inline def setLine(value: String): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Provides components for the prompts.
    */
  object prompts {
    
    /**
      * Provides data about the failed state of a prompt.
      */
    trait FailedPromptStateData
      extends StObject
         with PromptStateData {
      
      /**
        * @inheritdoc
        */
      @JSName("isValid")
      var isValid_FailedPromptStateData: `false` | String
    }
    object FailedPromptStateData {
      
      inline def apply(isValid: `false` | String): FailedPromptStateData = {
        val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
        __obj.asInstanceOf[FailedPromptStateData]
      }
      
      extension [Self <: FailedPromptStateData](x: Self) {
        
        inline def setIsValid(value: `false` | String): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Represents a prompt.
      */
    trait PromptBase extends StObject {
      
      /**
        * Runs the prompt.
        *
        * @returns
        * The result of the prompt.
        */
      def run(): js.Promise[Any]
      
      /**
        * Gets or sets a string which represents the state of the prompt.
        */
      var status: PromptState
    }
    object PromptBase {
      
      inline def apply(run: () => js.Promise[Any], status: PromptState): PromptBase = {
        val __obj = js.Dynamic.literal(run = js.Any.fromFunction0(run), status = status.asInstanceOf[js.Any])
        __obj.asInstanceOf[PromptBase]
      }
      
      extension [Self <: PromptBase](x: Self) {
        
        inline def setRun(value: () => js.Promise[Any]): Self = StObject.set(x, "run", js.Any.fromFunction0(value))
        
        inline def setStatus(value: PromptState): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
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
      extends StObject
         with /**
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
    Instantiable3[/* question */ Any, /* readLine */ Interface, /* answers */ Answers, PromptBase]
    
    /**
      * Provides pipes for handling events of a prompt.
      *
      * @param T
      * The type of the answer.
      */
    trait PromptEventPipes[T] extends StObject {
      
      /**
        * An object representing an error.
        */
      var error: Observable_[FailedPromptStateData]
      
      /**
        * A pipeline for successful inputs.
        */
      var success: Observable_[SuccessfulPromptStateData[T]]
    }
    object PromptEventPipes {
      
      inline def apply[T](error: Observable_[FailedPromptStateData], success: Observable_[SuccessfulPromptStateData[T]]): PromptEventPipes[T] = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
        __obj.asInstanceOf[PromptEventPipes[T]]
      }
      
      extension [Self <: PromptEventPipes[?], T](x: Self & PromptEventPipes[T]) {
        
        inline def setError(value: Observable_[FailedPromptStateData]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setSuccess(value: Observable_[SuccessfulPromptStateData[T]]): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Provides options for a prompt.
      *
      * @template T
      * The type of the answers.
      */
    type PromptOptions[T /* <: Question[Answers] */] = T & Choices
    
    /**
      * Represents the state of a prompt.
      */
    type PromptState = LiteralUnion[pending | idle | loading | answered | done, String]
    
    /**
      * Provides data about the state of a prompt.
      */
    trait PromptStateData extends StObject {
      
      /**
        * Either a {@link String `string`} which describes the error of the prompt or a {@link Boolean `boolean`} indicating whether the prompt-value is valid.
        */
      var isValid: String | Boolean
    }
    object PromptStateData {
      
      inline def apply(isValid: String | Boolean): PromptStateData = {
        val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any])
        __obj.asInstanceOf[PromptStateData]
      }
      
      extension [Self <: PromptStateData](x: Self) {
        
        inline def setIsValid(value: String | Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Provides data about the successful state of a prompt.
      *
      * @param T
      * The type of the answer.
      */
    trait SuccessfulPromptStateData[T]
      extends StObject
         with PromptStateData {
      
      /**
        * @inheritdoc
        */
      @JSName("isValid")
      var isValid_SuccessfulPromptStateData: `true`
      
      /**
        * The value of the prompt.
        */
      var value: T
    }
    object SuccessfulPromptStateData {
      
      inline def apply[T](value: T): SuccessfulPromptStateData[T] = {
        val __obj = js.Dynamic.literal(isValid = true, value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[SuccessfulPromptStateData[T]]
      }
      
      extension [Self <: SuccessfulPromptStateData[?], T](x: Self & SuccessfulPromptStateData[T]) {
        
        inline def setIsValid(value: `true`): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
        
        inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * Provides components for the ui.
    */
  object ui {
    
    /**
      * Represents the bottom-bar UI.
      */
    @js.native
    trait BottomBar
      extends typings.inquirer.libUiBaseUIMod.default {
      
      /**
        * Cleans the bottom bar.
        */
      /* protected */ def clean(): this.type = js.native
      
      /**
        * Fixes the new-line characters of the specified {@link text `text`}.
        *
        * @param text
        * The text to process.
        */
      /* protected */ def enforceLF(text: String): String = js.native
      
      /**
        * Gets or sets a stream to write logs to.
        */
      var log: ThroughStream = js.native
      
      /**
        * Renders the bottom bar.
        */
      /* protected */ def render(): this.type = js.native
      
      /**
        * Renders the specified {@link text `text`} to the bottom bar.
        *
        * @param text
        * The text to print to the bottom bar.
        */
      def updateBottomBar(text: String): this.type = js.native
      
      /**
        * Writes a message to the bottom bar.
        *
        * @param message
        * The message to write.
        */
      /* protected */ def write(message: String): Unit = js.native
      
      /**
        * Writes the specified {@link data `data`} to the log-zone.
        *
        * @param data
        * The data to write to the log-zone.
        */
      /* protected */ def writeLog(data: Any): this.type = js.native
    }
    
    /**
      * Provides options for the bottom-bar UI.
      */
    trait BottomBarOptions
      extends StObject
         with StreamOptions {
      
      /**
        * The initial text to display.
        */
      var bottomBar: js.UndefOr[String] = js.undefined
    }
    object BottomBarOptions {
      
      inline def apply(): BottomBarOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[BottomBarOptions]
      }
      
      extension [Self <: BottomBarOptions](x: Self) {
        
        inline def setBottomBar(value: String): Self = StObject.set(x, "bottomBar", value.asInstanceOf[js.Any])
        
        inline def setBottomBarUndefined: Self = StObject.set(x, "bottomBar", js.undefined)
      }
    }
    
    /**
      * Represents a fetched answer.
      */
    trait FetchedAnswer extends StObject {
      
      /**
        * The value of the answer.
        */
      var answer: Any
      
      /**
        * The name of the answer.
        */
      var name: String
    }
    object FetchedAnswer {
      
      inline def apply(answer: Any, name: String): FetchedAnswer = {
        val __obj = js.Dynamic.literal(answer = answer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[FetchedAnswer]
      }
      
      extension [Self <: FetchedAnswer](x: Self) {
        
        inline def setAnswer(value: Any): Self = StObject.set(x, "answer", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Represents a fetched answer.
      *
      * @template T
      * The type of the answers.
      */
    type FetchedQuestion[T /* <: Answers */] = DistinctQuestion[T] & Default[T]
    
    /**
      * Represents the prompt ui.
      */
    @js.native
    trait Prompt[T /* <: Answers */]
      extends typings.inquirer.libUiBaseUIMod.default {
      
      /**
        * Gets or sets the answers provided by the user.
        */
      var answers: T = js.native
      
      /**
        * Fetches the answer to a question.
        *
        * @param question
        * The question to fetch the answer for.
        *
        * @returns
        * The answer to the question.
        */
      /* protected */ def fetchAnswer(question: FetchedQuestion[T]): Observable_[FetchedAnswer] = js.native
      
      /**
        * Filters the question if it is runnable.
        *
        * @param question
        * The question to filter.
        *
        * @returns
        * Either the event-flow of the question if it is runnable or an empty event-flow.
        */
      /* protected */ def filterIfRunnable(question: DistinctQuestion[T]): Observable_[DistinctQuestion[T]] = js.native
      
      /**
        * Finishes the process.
        */
      /* protected */ def onCompletion(): T = js.native
      
      /**
        * Gets or sets the event-flow of the process.
        */
      var process: Observable_[QuestionAnswer[T]] = js.native
      
      /**
        * Processes a question.
        *
        * @param question
        * The question to process.
        *
        * @returns
        * The answer to the question.
        */
      /* protected */ def processQuestion(question: DistinctQuestion[T]): Observable_[FetchedAnswer] = js.native
      
      /**
        * Gets or sets the prompts of the ui.
        */
      var prompts: PromptCollection = js.native
      
      /**
        * Runs the prompt-UI.
        *
        * @param questions
        * The questions to prompt the user to answer.
        *
        * @returns
        * The answers provided by the user.
        */
      def run(questions: js.Array[DistinctQuestion[T]]): js.Promise[T] = js.native
      
      /**
        * Sets the type of the question if no question-type is specified.
        *
        * @param question
        * The question to set the default type for.
        *
        * @returns
        * The processed question.
        */
      /* protected */ def setDefaultType(question: DistinctQuestion[T]): Observable_[DistinctQuestion[T]] = js.native
    }
  }
}
