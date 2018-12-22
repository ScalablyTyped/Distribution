package typings
package koliteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DirtyFlagResult extends js.Object {
  var isDirty: knockoutLib.KnockoutComputed[scala.Boolean]
  def forceDirty(): scala.Unit
  def reset(): scala.Unit
}

