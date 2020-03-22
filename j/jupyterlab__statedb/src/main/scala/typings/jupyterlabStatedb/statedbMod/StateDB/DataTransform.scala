package typings.jupyterlabStatedb.statedbMod.StateDB

import typings.jupyterlabStatedb.jupyterlabStatedbStrings.cancel
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.clear
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.merge
import typings.jupyterlabStatedb.jupyterlabStatedbStrings.overwrite
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A data transformation that can be applied to a state database.
  */
trait DataTransform[T /* <: ReadonlyPartialJSONValue */] extends js.Object {
  /**
    * The contents of the change operation.
    */
  var contents: Content[T] | Null
  var `type`: cancel | clear | merge | overwrite
}

object DataTransform {
  @scala.inline
  def apply[T /* <: ReadonlyPartialJSONValue */](`type`: cancel | clear | merge | overwrite, contents: Content[T] = null): DataTransform[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (contents != null) __obj.updateDynamic("contents")(contents.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTransform[T]]
  }
}

