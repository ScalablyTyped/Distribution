package typings
package jwplayerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jwplayerNs {
  type EventCallback[T] = js.Function1[/* param */ T, scala.Unit]
  type NoParamEvent = jwplayerLib.jwplayerLibStrings.adBlock | jwplayerLib.jwplayerLibStrings.beforeComplete | jwplayerLib.jwplayerLibStrings.complete | jwplayerLib.jwplayerLibStrings.beforePlay | jwplayerLib.jwplayerLibStrings.displayClick | jwplayerLib.jwplayerLibStrings.playlistComplete | jwplayerLib.jwplayerLibStrings.seeked | jwplayerLib.jwplayerLibStrings.remove
}
