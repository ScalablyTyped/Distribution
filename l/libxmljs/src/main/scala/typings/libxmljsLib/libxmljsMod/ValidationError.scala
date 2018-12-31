package typings
package libxmljsLib.libxmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError
  extends nodeLib.Error {
  var code: scala.Double | scala.Null
  /**
    * 1-based column number, 0 if not applicable/available.
    */
  var column: scala.Double
  var domain: scala.Double | scala.Null
  var level: scala.Double | scala.Null
  var line: scala.Double | scala.Null
}

