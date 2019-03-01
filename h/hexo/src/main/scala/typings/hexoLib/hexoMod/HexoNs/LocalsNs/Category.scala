package typings
package hexoLib.hexoMod.HexoNs.LocalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends Tag {
  var parent: java.lang.String
}

object Category {
  @scala.inline
  def apply(
    length: scala.Double,
    name: java.lang.String,
    parent: java.lang.String,
    path: java.lang.String,
    permalink: java.lang.String,
    posts: hexoLib.hexoMod.Model[Post],
    slug: java.lang.String
  ): Category = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("parent")(parent)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("permalink")(permalink)
    __obj.updateDynamic("posts")(posts)
    __obj.updateDynamic("slug")(slug)
    __obj.asInstanceOf[Category]
  }
}

