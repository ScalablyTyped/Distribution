package typings.jestReporters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Basename extends js.Object {
  var basename: String
  var dirname: String
}

object Basename {
  @scala.inline
  def apply(basename: String, dirname: String): Basename = {
    val __obj = js.Dynamic.literal(basename = basename.asInstanceOf[js.Any], dirname = dirname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basename]
  }
}

