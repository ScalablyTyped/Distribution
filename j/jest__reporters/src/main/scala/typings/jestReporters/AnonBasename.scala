package typings.jestReporters

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBasename extends js.Object {
  var basename: String
  var dirname: String
}

object AnonBasename {
  @scala.inline
  def apply(basename: String, dirname: String): AnonBasename = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBasename]
  }
}

