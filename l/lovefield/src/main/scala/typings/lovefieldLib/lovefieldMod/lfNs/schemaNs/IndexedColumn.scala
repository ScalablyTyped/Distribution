package typings
package lovefieldLib.lovefieldMod.lfNs.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexedColumn extends js.Object {
  var autoIncrement: scala.Boolean
  var name: java.lang.String
  var order: lovefieldLib.lovefieldMod.lfNs.Order
}

object IndexedColumn {
  @scala.inline
  def apply(autoIncrement: scala.Boolean, name: java.lang.String, order: lovefieldLib.lovefieldMod.lfNs.Order): IndexedColumn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoIncrement")(autoIncrement)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[IndexedColumn]
  }
}

