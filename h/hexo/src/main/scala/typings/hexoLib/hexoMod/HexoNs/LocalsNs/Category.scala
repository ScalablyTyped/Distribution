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
    val __obj = js.Dynamic.literal(length = length, name = name, parent = parent, path = path, permalink = permalink, posts = posts, slug = slug)
  
    __obj.asInstanceOf[Category]
  }
}

