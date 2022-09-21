package typings.inquirer.mod

import typings.inquirer.inquirerStrings.separator
import typings.inquirer.mod.inquirer.prompts.PromptCollection
import typings.inquirer.mod.inquirer.ui.BottomBarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides the functionality to prompt questions.
  */
object default {
  
  @JSImport("inquirer", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Represents a choice-item separator.
    */
  @JSImport("inquirer", "default.Separator")
  @js.native
  /**
    * Initializes a new instance of the {@link Separator `Separator`} class.
    *
    * @param line
    * The text of the separator.
    */
  open class Separator ()
    extends StObject
       with typings.inquirer.mod.inquirer.Separator {
    def this(line: String) = this()
    
    /**
      * @inheritdoc
      */
    /* CompleteClass */
    @JSName("line")
    var line_Separator: String = js.native
    
    /**
      * Gets the type of the choice.
      */
    /* CompleteClass */
    @JSName("type")
    var type_SeparatorOptions: separator = js.native
  }
  object Separator {
    
    @JSImport("inquirer", "default.Separator")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Checks whether the specified {@link item `item`} is not a separator.
      *
      * @param item
      * The item to check.
      *
      * @returns
      * A value indicating whether the item is not a separator.
      */
    /* static member */
    inline def exclude(item: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(item.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  /**
    * Creates a prompt-module.
    *
    * @param opt
    * The streams for the prompt-module.
    *
    * @returns
    * The new prompt-module.
    */
  @JSImport("inquirer", "default.createPromptModule")
  @js.native
  def createPromptModule: PromptModuleCreator = js.native
  inline def createPromptModule_=(x: PromptModuleCreator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createPromptModule")(x.asInstanceOf[js.Any])
  
  /**
    * The default prompt-module.
    */
  @JSImport("inquirer", "default.prompt")
  @js.native
  def prompt: PromptModule = js.native
  inline def prompt_=(x: PromptModule): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prompt")(x.asInstanceOf[js.Any])
  
  /**
    * Registers a new prompt-type.
    *
    * @param name
    * The name of the prompt.
    *
    * @param prompt
    * The constructor of the prompt.
    */
  @JSImport("inquirer", "default.registerPrompt")
  @js.native
  def registerPrompt: RegisterFunction = js.native
  inline def registerPrompt_=(x: RegisterFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("registerPrompt")(x.asInstanceOf[js.Any])
  
  /**
    * Registers the default prompts.
    */
  @JSImport("inquirer", "default.restoreDefaultPrompts")
  @js.native
  def restoreDefaultPrompts: RestoreFunction = js.native
  inline def restoreDefaultPrompts_=(x: RestoreFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("restoreDefaultPrompts")(x.asInstanceOf[js.Any])
  
  /**
    * Provides components for the ui.
    */
  object ui {
    
    /**
      * Represents the bottom-bar UI.
      */
    @JSImport("inquirer", "default.ui.BottomBar")
    @js.native
    /**
      * Initializes a new instance of the {@link BottomBar `BottomBar`} class.
      *
      * @param options
      * Provides options for the bottom-bar ui.
      */
    open class BottomBar ()
      extends typings.inquirer.mod.inquirer.ui.BottomBar {
      def this(options: BottomBarOptions) = this()
    }
    
    /**
      * Represents the prompt ui.
      */
    @JSImport("inquirer", "default.ui.Prompt")
    @js.native
    open class Prompt[T /* <: Answers */] protected ()
      extends typings.inquirer.mod.inquirer.ui.Prompt[T] {
      /**
        * Initializes a new instance of the {@link Prompt `Prompt`} class.
        *
        * @param prompts
        * The prompts for the ui.
        *
        * @param options
        * The input- and output-stream of the ui.
        */
      def this(prompts: PromptCollection) = this()
      def this(prompts: PromptCollection, options: StreamOptions) = this()
    }
  }
}
