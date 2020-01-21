package typings.marked

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var links: StringDictionary[AnonHref]
}

object AnonKey {
  @scala.inline
  def apply(links: StringDictionary[AnonHref]): AnonKey = {
    val __obj = js.Dynamic.literal(links = links.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

