package typings
package atHapiJoiLib

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
  def createError(
    `type`: java.lang.String,
    context: atHapiJoiLib.atHapiJoiMod.Context,
    state: atHapiJoiLib.atHapiJoiMod.State,
    options: atHapiJoiLib.atHapiJoiMod.ValidationOptions
  ): atHapiJoiLib.atHapiJoiMod.Err
}

object Anon_Context {
  @scala.inline
  def apply(
    createError: (java.lang.String, atHapiJoiLib.atHapiJoiMod.Context, atHapiJoiLib.atHapiJoiMod.State, atHapiJoiLib.atHapiJoiMod.ValidationOptions) => atHapiJoiLib.atHapiJoiMod.Err
  ): Anon_Context = {
    val __obj = js.Dynamic.literal(createError = js.Any.fromFunction4(createError))
  
    __obj.asInstanceOf[Anon_Context]
  }
}

