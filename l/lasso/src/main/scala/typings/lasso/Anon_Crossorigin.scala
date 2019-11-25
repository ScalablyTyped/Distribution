package typings.lasso

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Crossorigin extends js.Object {
  var crossorigin: String
  var integrity: String
}

object Anon_Crossorigin {
  @scala.inline
  def apply(crossorigin: String, integrity: String): Anon_Crossorigin = {
    val __obj = js.Dynamic.literal(crossorigin = crossorigin.asInstanceOf[js.Any], integrity = integrity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Crossorigin]
  }
}

