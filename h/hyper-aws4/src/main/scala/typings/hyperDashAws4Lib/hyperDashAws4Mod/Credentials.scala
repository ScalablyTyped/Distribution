package typings
package hyperDashAws4Lib.hyperDashAws4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var accessKey: java.lang.String
  var secretKey: java.lang.String
}

object Credentials {
  @scala.inline
  def apply(accessKey: java.lang.String, secretKey: java.lang.String): Credentials = {
    val __obj = js.Dynamic.literal(accessKey = accessKey, secretKey = secretKey)
  
    __obj.asInstanceOf[Credentials]
  }
}

