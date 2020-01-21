package typings.jupyterlabCoreutils.statedbMod.StateDB

import typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.cancel
import typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.clear
import typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.merge
import typings.jupyterlabCoreutils.jupyterlabCoreutilsStrings.overwrite
import typings.phosphorCoreutils.jsonMod.ReadonlyJSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A data transformation that can be applied to a state database.
  */
trait DataTransform extends js.Object {
  /**
    * The contents of the change operation.
    */
  var contents: ReadonlyJSONObject | Null
  var `type`: cancel | clear | merge | overwrite
}

object DataTransform {
  @scala.inline
  def apply(`type`: cancel | clear | merge | overwrite, contents: ReadonlyJSONObject = null): DataTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransform]
  }
}

