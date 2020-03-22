package typings.jsdevtoolsFilePathFilter.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsdevtoolsFilePathFilter.jsdevtoolsFilePathFilterStrings.include
  - typings.jsdevtoolsFilePathFilter.jsdevtoolsFilePathFilterStrings.exclude
*/
trait Filter extends js.Object

object Filter {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exclude: typings.jsdevtoolsFilePathFilter.jsdevtoolsFilePathFilterStrings.exclude = this.cast("exclude")
  @scala.inline
  def include: typings.jsdevtoolsFilePathFilter.jsdevtoolsFilePathFilterStrings.include = this.cast("include")
}

