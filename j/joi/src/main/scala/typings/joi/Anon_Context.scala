package typings.joi

import typings.joi.joiMod.Context
import typings.joi.joiMod.Err
import typings.joi.joiMod.State
import typings.joi.joiMod.ValidationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  /**
    * Creates a joi error object.
    * Used in conjunction with custom rules.
    * @param type - the type of rule to create the error for.
    * @param context - provide properties that will be available in the `language` templates.
    * @param state - should the context passed into the `validate` function in a custom rule
    * @param options - should the context passed into the `validate` function in a custom rule
    */
  def createError(`type`: String, context: Context, state: State, options: ValidationOptions): Err
}

object Anon_Context {
  @scala.inline
  def apply(createError: (String, Context, State, ValidationOptions) => Err): Anon_Context = {
    val __obj = js.Dynamic.literal(createError = js.Any.fromFunction4(createError))
  
    __obj.asInstanceOf[Anon_Context]
  }
}

