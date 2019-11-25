package typings.instagramDashPrivateDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  var count: Double
  var text: String
}

object Anon_Count {
  @scala.inline
  def apply(count: Double, text: String): Anon_Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Count]
  }
}

