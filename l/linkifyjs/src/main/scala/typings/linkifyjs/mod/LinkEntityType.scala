package typings.linkifyjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.linkifyjs.linkifyjsStrings.url
  - typings.linkifyjs.linkifyjsStrings.email
  - typings.linkifyjs.linkifyjsStrings.hashtag
  - typings.linkifyjs.linkifyjsStrings.mention
*/
trait LinkEntityType extends js.Object

object LinkEntityType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typings.linkifyjs.linkifyjsStrings.email = this.cast("email")
  @scala.inline
  def hashtag: typings.linkifyjs.linkifyjsStrings.hashtag = this.cast("hashtag")
  @scala.inline
  def mention: typings.linkifyjs.linkifyjsStrings.mention = this.cast("mention")
  @scala.inline
  def url: typings.linkifyjs.linkifyjsStrings.url = this.cast("url")
}

