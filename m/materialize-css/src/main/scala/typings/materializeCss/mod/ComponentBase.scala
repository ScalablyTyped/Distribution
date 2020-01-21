package typings.materializeCss.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("materialize-css", "ComponentBase")
@js.native
abstract class ComponentBase[TOptions] ()
  extends typings.materializeCss.M.ComponentBase[TOptions] {
  def this(options: Partial[TOptions]) = this()
}

