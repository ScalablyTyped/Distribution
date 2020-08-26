package typings.jsprintmanager.mod.JSPM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsprintmanager", "JSPM.ParallelPortPrinter")
@js.native
class ParallelPortPrinter protected () extends IClientPrinter {
  def this(portName: String) = this()
  @JSName("Id")
  var Id_ParallelPortPrinter: String = js.native
  var _parallelPortName: js.Any = js.native
  var portName: String = js.native
}

