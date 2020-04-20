package typings.jsdevtoolsFilePathFilter.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filters[T] extends js.Object {
  var exclude: T
  var include: T
}

object Filters {
  @scala.inline
  def apply[T](exclude: T, include: T): Filters[T] = {
    val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], include = include.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filters[T]]
  }
}

