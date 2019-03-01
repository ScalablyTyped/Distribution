package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Method extends js.Object {
  var method: java.lang.String
  var path: java.lang.String
  var vhost: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Method {
  @scala.inline
  def apply(method: java.lang.String, path: java.lang.String, vhost: java.lang.String = null): Anon_Method = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("path")(path)
    if (vhost != null) __obj.updateDynamic("vhost")(vhost)
    __obj.asInstanceOf[Anon_Method]
  }
}

