package typings.hexo.hexoMod.Locals

import typings.hexo.hexoMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Category extends Tag {
  var parent: String
}

object Category {
  @scala.inline
  def apply(
    length: Double,
    name: String,
    parent: String,
    path: String,
    permalink: String,
    posts: Model[typings.hexo.hexoMod.Locals.Post],
    slug: String
  ): Category = {
    val __obj = js.Dynamic.literal(length = length, name = name, parent = parent, path = path, permalink = permalink, posts = posts, slug = slug)
  
    __obj.asInstanceOf[Category]
  }
}

