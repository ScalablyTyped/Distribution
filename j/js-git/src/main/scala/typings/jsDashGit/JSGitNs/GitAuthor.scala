package typings.jsDashGit.JSGitNs

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
    val __obj = js.Dynamic.literal(date = date, email = email, name = name)
  
    __obj.asInstanceOf[GitAuthor]
  }
}

