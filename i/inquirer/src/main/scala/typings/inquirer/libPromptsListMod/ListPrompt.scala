package typings.inquirer.libPromptsListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a prompt which provides a list to choose an answer from.
  *
  * @template TQuestion
  * The options for the question.
  */
@js.native
trait ListPrompt[TQuestion /* <: Question */]
  extends typings.inquirer.libPromptsBaseMod.^[TQuestion] {
  /**
    * Gets or sets a value indicating whether the prompt has been rendered the first time.
    */
  var firstRender: Boolean = js.native
  /**
    * Gets or sets an object for paginating the content.
    */
  var paginator: typings.inquirer.libUtilsPaginatorMod.^ = js.native
  /**
    * The index of the selected choice.
    */
  var selected: Double = js.native
  /**
    * Resolves the value of the prompt.
    */
  /* protected */ def done(value: js.Any): Unit = js.native
  /**
    * Gets the current value of the prompt.
    */
  /* protected */ def getCurrentValue(): js.Any = js.native
  /**
    * Handles the `downKey`-event.
    */
  /* protected */ def onDownKey(): Unit = js.native
  /**
    * Handles the `numberKey`-event.
    *
    * @param input
    * The number that has been pressed.
    */
  /* protected */ def onNumberKey(input: Double): Unit = js.native
  /**
    * Handles the `success`-event of the prompt.
    *
    * @param value
    * The value of the prompt.
    */
  /* protected */ def onSubmit(value: js.Any): Unit = js.native
  /**
    * Handles the `upKey`-event.
    */
  /* protected */ def onUpKey(): Unit = js.native
  /**
    * Renders the prompt.
    */
  /* protected */ def render(): Unit = js.native
}

