package typings
package jwplayerLib.jwplayerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdPlayParam extends js.Object {
  var creativetype: java.lang.String
  var newstate: java.lang.String
  var oldstate: java.lang.String
  var tag: java.lang.String
}

object AdPlayParam {
  @scala.inline
  def apply(
    creativetype: java.lang.String,
    newstate: java.lang.String,
    oldstate: java.lang.String,
    tag: java.lang.String
  ): AdPlayParam = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("creativetype")(creativetype)
    __obj.updateDynamic("newstate")(newstate)
    __obj.updateDynamic("oldstate")(oldstate)
    __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[AdPlayParam]
  }
}

