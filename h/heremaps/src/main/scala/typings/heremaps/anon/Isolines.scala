package typings.heremaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Isolines extends js.Object {
  var MetaInfo: Timestamp
  var View: js.Array[Result]
  var isolines: js.Array[_]
}

object Isolines {
  @scala.inline
  def apply(MetaInfo: Timestamp, View: js.Array[Result], isolines: js.Array[_]): Isolines = {
    val __obj = js.Dynamic.literal(MetaInfo = MetaInfo.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], isolines = isolines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Isolines]
  }
}

