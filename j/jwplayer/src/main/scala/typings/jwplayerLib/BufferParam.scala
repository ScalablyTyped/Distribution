package typings
package jwplayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BufferParam extends CallbackParam {
  var newstate: java.lang.String
  var oldstate: java.lang.String
  var reason: jwplayerLib.jwplayerLibStrings.loading | jwplayerLib.jwplayerLibStrings.complete | jwplayerLib.jwplayerLibStrings.stalled | jwplayerLib.jwplayerLibStrings.error
}

