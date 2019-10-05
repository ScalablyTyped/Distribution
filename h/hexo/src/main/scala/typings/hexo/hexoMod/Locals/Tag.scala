package typings.hexo.hexoMod.Locals

import typings.hexo.hexoMod.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var length: Double
  var name: String
  var path: String
  var permalink: String
  var posts: Model[typings.hexo.hexoMod.Locals.Post]
  var slug: String
}

object Tag {
  @scala.inline
  def apply(
    length: Double,
    name: String,
    path: String,
    permalink: String,
    posts: Model[typings.hexo.hexoMod.Locals.Post],
    slug: String
  ): Tag = {
    val __obj = js.Dynamic.literal(length = length, name = name, path = path, permalink = permalink, posts = posts, slug = slug)
  
    __obj.asInstanceOf[Tag]
  }
}

