package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algoid extends js.Object {
  var algoid: String
  var algparam: String
  var keyidx: String
}

object Anon_Algoid {
  @scala.inline
  def apply(algoid: String, algparam: String, keyidx: String): Anon_Algoid = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], algparam = algparam.asInstanceOf[js.Any], keyidx = keyidx.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Algoid]
  }
}

