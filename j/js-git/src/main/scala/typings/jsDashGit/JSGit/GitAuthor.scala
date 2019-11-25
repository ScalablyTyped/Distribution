package typings.jsDashGit.JSGit

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitAuthor extends js.Object {
  var date: Date
  var email: String
  var name: String
}

object GitAuthor {
  @scala.inline
  def apply(date: Date, email: String, name: String): GitAuthor = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitAuthor]
  }
}

