package typings.heremaps

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
    val __obj = js.Dynamic.literal(MetaInfo = MetaInfo.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], isolines = isolines.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Isolines]
  }
}

