package typings.matrixJsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowJoin extends js.Object {
  var allowJoin: Boolean
  // True to allow guests to join this room. This implicitly gives guests write access. If false or not given, guests are explicitly forbidden from joining the room.
  var allowRead: Boolean
}

object AnonAllowJoin {
  @scala.inline
  def apply(allowJoin: Boolean, allowRead: Boolean): AnonAllowJoin = {
    val __obj = js.Dynamic.literal(allowJoin = allowJoin.asInstanceOf[js.Any], allowRead = allowRead.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllowJoin]
  }
}

