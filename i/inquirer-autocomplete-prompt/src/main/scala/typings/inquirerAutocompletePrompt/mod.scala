package typings.inquirerAutocompletePrompt

import typings.inquirer.mod.Answers
import typings.inquirer.mod.KeyUnion
import typings.inquirer.mod.Question
import typings.inquirer.mod.QuestionCollection
import typings.inquirerAutocompletePrompt.anon.Key
import typings.inquirerAutocompletePrompt.inquirerAutocompletePromptStrings.autocomplete
import typings.node.readlineMod.Interface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Provides the functionality to create a new Inquirer plugin
    */
  @JSImport("inquirer-autocomplete-prompt", JSImport.Namespace)
  @js.native
  open class ^[T /* <: Answers */] protected ()
    extends StObject
       with AutocompletePrompt[T] {
    /**
      * Create new AutocompletePrompt
      *
      * @param questions
      * The questions to prompt
      * @param rl
      * The readline interface
      * @param answers
      * The currently supplied answers
      */
    def this(questions: QuestionCollection[T], rl: Interface, answers: Answers) = this()
  }
  
  /**
    * Provides the functionality to create a new Inquirer plugin
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Base * / any */ @js.native
  trait AutocompletePrompt[T /* <: Answers */] extends StObject {
    
    /**
      * The choices currently available on the prompt
      */
    var currentChoices: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Choices */ Any = js.native
    
    /**
      * Verify selected range is not out of bounds
      */
    def ensureSelectedInRange(): Unit = js.native
    
    /**
      * Flag that is true on first render
      */
    var firstRender: Boolean = js.native
    
    /**
      * Initial value of answer
      */
    var initialValue: Any = js.native
    
    /**
      * When user types
      *
      * @param e
      * Object containing info on the key pressed and the value of the selected option
      */
    def onKeypress(e: Key): Unit = js.native
    
    /**
      * When user presses `enter` key
      *
      * @param line
      * The input on the line.
      */
    def onSubmit(line: String): Unit = js.native
    
    /**
      * When user presses `enter` key and validation has passed.
      *
      * @param line
      * The input on the line.
      */
    def onSubmitAfterValidation(line: String): Unit = js.native
    
    /**
      * Paginator for choices
      */
    var paginator: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Paginator */ Any = js.native
    
    /**
      * Questions to prompt
      */
    var questions: QuestionCollection[T] = js.native
    
    /**
      * Render the prompt to screen
      */
    def render(): Unit = js.native
    def render(error: String): Unit = js.native
    
    /**
      * Curate list of choices.
      *
      * @param searchTerm
      * The term to search for
      */
    def search(searchTerm: String): js.Promise[Unit] = js.native
    
    /**
      * Currently selected choice index
      */
    var selected: Double = js.native
  }
  
  /**
    * Provides options for a question of type `AutocompletePrompt`.
    *
    * @template T
    * The type of the answers.
    */
  @js.native
  trait AutocompleteQuestionOptions[T /* <: Answers */]
    extends StObject
       with Question[T] {
    
    /**
      *  Is the text shown if the search returns no results. Defaults: No results...
      */
    var emptyText: js.UndefOr[Boolean] = js.native
    
    /**
      * The key to save the answer to the answers-hash.
      */
    @JSName("name")
    var name_AutocompleteQuestionOptions: KeyUnion[T] = js.native
    
    /**
      * The number of elements to show on each page.
      */
    var pageSize: js.UndefOr[Double] = js.native
    
    /**
      * Is the text shown when searching. Defaults: Searching...
      */
    var searchText: js.UndefOr[Boolean] = js.native
    
    /**
      * Function to determine what options to display to user.
      * Called with previous answers object and the current user input each time the user types, it must return a promise.
      */
    def source(answersSoFar: T): js.Promise[js.Array[Any]] = js.native
    def source(answersSoFar: T, input: String): js.Promise[js.Array[Any]] = js.native
    
    /**
      * default false. Setting it to true turns the input into a normal text input.
      */
    var suggestOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * The key to save the answer to the answers-hash.
      */
    @JSName("type")
    var type_AutocompleteQuestionOptions: autocomplete = js.native
  }
}
