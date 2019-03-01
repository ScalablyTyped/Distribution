package typings
package hexoLib.hexoMod.HexoNs.LocalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var length: scala.Double
  var name: java.lang.String
  var path: java.lang.String
  var permalink: java.lang.String
  var posts: hexoLib.hexoMod.Model[Post]
  var slug: java.lang.String
}

object Tag {
  @scala.inline
  def apply(
    length: scala.Double,
    name: java.lang.String,
    path: java.lang.String,
    permalink: java.lang.String,
    posts: hexoLib.hexoMod.Model[Post],
    slug: java.lang.String
  ): Tag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("permalink")(permalink)
    __obj.updateDynamic("posts")(posts)
    __obj.updateDynamic("slug")(slug)
    __obj.asInstanceOf[Tag]
  }
}

