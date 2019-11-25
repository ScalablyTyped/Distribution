package typings.atHapiHapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: String
  var path: String
  var vhost: js.UndefOr[String] = js.undefined
}

object Anon_Method {
  @scala.inline
  def apply(method: String, path: String, vhost: String = null): Anon_Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (vhost != null) __obj.updateDynamic("vhost")(vhost.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Method]
  }
}

