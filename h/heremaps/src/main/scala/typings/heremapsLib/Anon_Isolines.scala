package typings
package heremapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Isolines extends js.Object {
  var MetaInfo: Anon_Timestamp
  var View: js.Array[Anon_Result]
  var isolines: js.Array[_]
}

object Anon_Isolines {
  @scala.inline
  def apply(MetaInfo: Anon_Timestamp, View: js.Array[Anon_Result], isolines: js.Array[_]): Anon_Isolines = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MetaInfo")(MetaInfo)
    __obj.updateDynamic("View")(View)
    __obj.updateDynamic("isolines")(isolines)
    __obj.asInstanceOf[Anon_Isolines]
  }
}

