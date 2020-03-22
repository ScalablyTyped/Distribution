package typings.js2xmlparser.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js2xmlparser/lib/options", "DtdOptions")
@js.native
class DtdOptions protected () extends IDtdOptions {
  def this(validation: Boolean) = this()
  def this(validation: Boolean, dtdOptions: IDtdOptions) = this()
  @JSName("include")
  var include_DtdOptions: Boolean = js.native
}

