package typings.inquirer.libPromptsExpandMod

import typings.inquirer.inquirerMod.Answers
import typings.node.readlineMod.Interface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a prompt which forces the user to make a choice by typing a specific key.
  *
  * @template TQuestion
  * The options for the question.
  */
@JSImport("inquirer/lib/prompts/expand", JSImport.Namespace)
@js.native
class ^[TQuestion /* <: Question */] protected () extends ExpandPrompt[TQuestion] {
  /**
    * Initializes a new instance of the `ExpandPrompt<T>` class.
    *
    * @param question
    * The question to prompt the user to answer.
    *
    * @param readLine
    * An object for performing read from and write to the console.
    *
    * @param answers
    * The answer-object.
    */
  def this(question: TQuestion, readLine: Interface, answers: Answers) = this()
}

