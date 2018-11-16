package typings
package markoLib.srcRuntimeHtmlTemplateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("marko/src/runtime/html/Template", "Readable")
@js.native
class Readable protected ()
  extends nodeLib.streamMod.Readable {
  def this(template: Template, data: js.Any, options: js.Any) = this()
  var _d: js.Any = js.native
  var _rendered: scala.Boolean = js.native
  var _shouldBuffer: scala.Boolean = js.native
  var _t: js.Any = js.native
  def write(data: js.Any): scala.Unit = js.native
}

