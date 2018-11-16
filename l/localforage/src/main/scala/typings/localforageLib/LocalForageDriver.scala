package typings
package localforageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalForageDriver extends LocalForageDriverDbMethods {
  var _driver: java.lang.String = js.native
  var _support: js.UndefOr[scala.Boolean | LocalForageDriverSupportFunc] = js.native
  def _initStorage(options: LocalForageOptions): scala.Unit = js.native
}

