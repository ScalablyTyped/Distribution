package typings.kamailioKemi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofxcapServer extends js.Object {
  def xcaps_del(uri: String, path: String): Double
  def xcaps_get(uri: String, path: String): Double
  def xcaps_put(uri: String, path: String, pbody: String): Double
}

object TypeofxcapServer {
  @scala.inline
  def apply(
    xcaps_del: (String, String) => Double,
    xcaps_get: (String, String) => Double,
    xcaps_put: (String, String, String) => Double
  ): TypeofxcapServer = {
    val __obj = js.Dynamic.literal(xcaps_del = js.Any.fromFunction2(xcaps_del), xcaps_get = js.Any.fromFunction2(xcaps_get), xcaps_put = js.Any.fromFunction3(xcaps_put))
  
    __obj.asInstanceOf[TypeofxcapServer]
  }
}

