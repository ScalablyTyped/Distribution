package typings.hlsDashParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Offset extends js.Object {
  var offset: Double
  var precise: Boolean
}

object Anon_Offset {
  @scala.inline
  def apply(offset: Double, precise: Boolean): Anon_Offset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], precise = precise.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Offset]
  }
}

