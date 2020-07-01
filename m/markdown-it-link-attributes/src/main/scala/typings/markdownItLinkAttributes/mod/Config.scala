package typings.markdownItLinkAttributes.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var attrs: StringDictionary[String]
}

object Config {
  @scala.inline
  def apply(attrs: StringDictionary[String]): Config = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

