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
    posts: Model[Post],
    slug: String
  ): Category = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], posts = posts.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Category]
  }
}

