package typings.javascriptTimeAgo.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.javascriptTimeAgo.javascriptTimeAgoStrings.long
  - typings.javascriptTimeAgo.javascriptTimeAgoStrings.short
  - typings.javascriptTimeAgo.javascriptTimeAgoStrings.narrow
*/
trait DefaultFormats extends js.Object

object DefaultFormats {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typings.javascriptTimeAgo.javascriptTimeAgoStrings.long = this.cast("long")
  @scala.inline
  def narrow: typings.javascriptTimeAgo.javascriptTimeAgoStrings.narrow = this.cast("narrow")
  @scala.inline
  def short: typings.javascriptTimeAgo.javascriptTimeAgoStrings.short = this.cast("short")
}

