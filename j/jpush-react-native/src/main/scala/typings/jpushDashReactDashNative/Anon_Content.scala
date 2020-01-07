package typings.jpushDashReactDashNative

import typings.jpushDashReactDashNative.jpushDashReactDashNativeMod.Extra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: String
  var extras: Extra
  var messageID: String
  var title: String
}

object Anon_Content {
  @scala.inline
  def apply(content: String, extras: Extra, messageID: String, title: String): Anon_Content = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Content]
  }
}

