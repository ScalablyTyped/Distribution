package typings.jupyterlabApputils.dialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Dialog {
  /**
    * The body input types.
    */
  type Body[T] = typings.jupyterlabApputils.dialogMod.Dialog.IBodyWidget[T] | typings.react.mod.ReactElement | java.lang.String
  /**
    * The header input types.
    */
  type Header = typings.react.mod.ReactElement | java.lang.String
}
