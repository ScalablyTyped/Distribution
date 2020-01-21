package typings.listr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("listr", JSImport.Namespace)
@js.native
class ^[Ctx] () extends Listr[Ctx] {
  def this(options: ListrOptions[Ctx]) = this()
  def this(tasks: js.Array[ListrTask[Ctx]]) = this()
  def this(tasks: js.Array[ListrTask[Ctx]], options: ListrOptions[Ctx]) = this()
}

