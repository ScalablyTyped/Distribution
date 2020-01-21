package typings.gulpWatch

import typings.gulpWatch.gulpWatchStrings.add
import typings.gulpWatch.gulpWatchStrings.change
import typings.gulpWatch.gulpWatchStrings.unlink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdd extends js.Object {
  var event: add | change | unlink
}

object AnonAdd {
  @scala.inline
  def apply(event: add | change | unlink): AnonAdd = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAdd]
  }
}

