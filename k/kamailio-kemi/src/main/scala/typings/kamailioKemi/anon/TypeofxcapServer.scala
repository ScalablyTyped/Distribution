package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofxcapServer extends js.Object {
  def xcaps_del(uri: String, path: String): Double = js.native
  def xcaps_get(uri: String, path: String): Double = js.native
  def xcaps_put(uri: String, path: String, pbody: String): Double = js.native
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
  @scala.inline
  implicit class TypeofxcapServerOps[Self <: TypeofxcapServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setXcaps_del(value: (String, String) => Double): Self = this.set("xcaps_del", js.Any.fromFunction2(value))
    @scala.inline
    def setXcaps_get(value: (String, String) => Double): Self = this.set("xcaps_get", js.Any.fromFunction2(value))
    @scala.inline
    def setXcaps_put(value: (String, String, String) => Double): Self = this.set("xcaps_put", js.Any.fromFunction3(value))
  }
  
}

