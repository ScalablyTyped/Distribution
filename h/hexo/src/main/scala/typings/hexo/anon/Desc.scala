package typings.hexo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Desc extends js.Object {
  var desc: String
  var name: String
}

object Desc {
  @scala.inline
  def apply(desc: String, name: String): Desc = {
    val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desc]
  }
}

