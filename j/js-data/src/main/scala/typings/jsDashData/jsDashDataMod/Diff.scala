package typings.jsDashData.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diff extends js.Object {
  var added: js.Any
  var changed: js.Any
  var removed: js.Any
}

object Diff {
  @scala.inline
  def apply(added: js.Any, changed: js.Any, removed: js.Any): Diff = {
    val __obj = js.Dynamic.literal(added = added, changed = changed, removed = removed)
  
    __obj.asInstanceOf[Diff]
  }
}

