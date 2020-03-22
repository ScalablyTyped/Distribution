package typings.javascriptTimeAgo.styleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.javascriptTimeAgo.javascriptTimeAgoStrings.tiny
  - typings.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time`
  - typings.javascriptTimeAgo.javascriptTimeAgoStrings.narrow
  - typings.javascriptTimeAgo.javascriptTimeAgoStrings.short
  - typings.javascriptTimeAgo.javascriptTimeAgoStrings.long
*/
trait Flavour extends js.Object

object Flavour {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def long: typings.javascriptTimeAgo.javascriptTimeAgoStrings.long = this.cast("long")
  @scala.inline
  def narrow: typings.javascriptTimeAgo.javascriptTimeAgoStrings.narrow = this.cast("narrow")
  @scala.inline
  def short: typings.javascriptTimeAgo.javascriptTimeAgoStrings.short = this.cast("short")
  @scala.inline
  def `short-time`: typings.javascriptTimeAgo.javascriptTimeAgoStrings.`short-time` = this.cast("short-time")
  @scala.inline
  def tiny: typings.javascriptTimeAgo.javascriptTimeAgoStrings.tiny = this.cast("tiny")
}

