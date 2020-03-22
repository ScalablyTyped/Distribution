package typings.karma.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.karma.karmaStrings.css
  - typings.karma.karmaStrings.html
  - typings.karma.karmaStrings.js_
  - typings.karma.karmaStrings.dart
  - typings.karma.karmaStrings.module
  - typings.karma.karmaStrings.dom
*/
trait FilePatternTypes extends js.Object

object FilePatternTypes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def css: typings.karma.karmaStrings.css = this.cast("css")
  @scala.inline
  def dart: typings.karma.karmaStrings.dart = this.cast("dart")
  @scala.inline
  def dom: typings.karma.karmaStrings.dom = this.cast("dom")
  @scala.inline
  def html: typings.karma.karmaStrings.html = this.cast("html")
  @JSName("js")
  @scala.inline
  def js_ : typings.karma.karmaStrings.js_ = this.cast("js")
  @scala.inline
  def module: typings.karma.karmaStrings.module = this.cast("module")
}

