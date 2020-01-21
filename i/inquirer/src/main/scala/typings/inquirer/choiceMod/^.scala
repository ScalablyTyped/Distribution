package typings.inquirer.choiceMod

import typings.inquirer.mod.Answers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a choice for several question-types.
  *
  * @template T
  * The type of the answers.
  */
@JSImport("inquirer/lib/objects/choice", JSImport.Namespace)
@js.native
class ^[T /* <: Answers */] protected () extends Choice[T] {
  /**
    * Initializes a new instance of the `Choice` class.
    *
    * @param value
    * The value of the choice.
    *
    * @param answers
    * An object which contains the answers to the questions.
    */
  def this(value: js.Any, answers: T) = this()
  /**
    * @inheritdoc
    */
  /* CompleteClass */
  @JSName("disabled")
  override var disabled_Choice: Boolean = js.native
  /**
    * @inheritdoc
    */
  /* CompleteClass */
  @JSName("name")
  override var name_Choice: String = js.native
  /**
    * @inheritdoc
    */
  /* CompleteClass */
  @JSName("short")
  override var short_Choice: String = js.native
}

