package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadyParam extends js.Object {
  var setupTime: scala.Double
  var viewable: jwplayerLib.jwplayerLibNumbers.`0` | jwplayerLib.jwplayerLibNumbers.`1`
}

object ReadyParam {
  @scala.inline
  def apply(
    setupTime: scala.Double,
    viewable: jwplayerLib.jwplayerLibNumbers.`0` | jwplayerLib.jwplayerLibNumbers.`1`
  ): ReadyParam = {
    val __obj = js.Dynamic.literal(setupTime = setupTime, viewable = viewable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadyParam]
  }
}

