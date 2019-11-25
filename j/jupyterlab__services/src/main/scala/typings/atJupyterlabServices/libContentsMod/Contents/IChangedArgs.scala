package typings.atJupyterlabServices.libContentsMod.Contents

import typings.atJupyterlabServices.atJupyterlabServicesStrings.`new`
import typings.atJupyterlabServices.atJupyterlabServicesStrings.delete
import typings.atJupyterlabServices.atJupyterlabServicesStrings.rename
import typings.atJupyterlabServices.atJupyterlabServicesStrings.save
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The change args for a file change.
  */
trait IChangedArgs extends js.Object {
  /**
    * The old contents.
    */
  var newValue: Partial[IModel] | Null
  /**
    * The new contents.
    */
  var oldValue: Partial[IModel] | Null
  /**
    * The type of change.
    */
  var `type`: `new` | delete | rename | save
}

object IChangedArgs {
  @scala.inline
  def apply(
    `type`: `new` | delete | rename | save,
    newValue: Partial[IModel] = null,
    oldValue: Partial[IModel] = null
  ): IChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs]
  }
}

