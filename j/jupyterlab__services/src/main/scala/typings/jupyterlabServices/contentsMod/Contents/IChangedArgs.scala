package typings.jupyterlabServices.contentsMod.Contents

import typings.jupyterlabServices.anon.PartialIModel
import typings.jupyterlabServices.jupyterlabServicesStrings.`new`
import typings.jupyterlabServices.jupyterlabServicesStrings.delete
import typings.jupyterlabServices.jupyterlabServicesStrings.rename
import typings.jupyterlabServices.jupyterlabServicesStrings.save
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
  var newValue: PartialIModel | Null
  /**
    * The new contents.
    */
  var oldValue: PartialIModel | Null
  /**
    * The type of change.
    */
  var `type`: `new` | delete | rename | save
}

object IChangedArgs {
  @scala.inline
  def apply(
    `type`: `new` | delete | rename | save,
    newValue: PartialIModel = null,
    oldValue: PartialIModel = null
  ): IChangedArgs = {
    val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChangedArgs]
  }
}

