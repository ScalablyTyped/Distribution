package typings.localDynamo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cors: js.UndefOr[String | js.Array[String]] = js.native
  var detached: js.UndefOr[Boolean] = js.native
  var dir: js.UndefOr[String] = js.native
  var heap: js.UndefOr[String] = js.native
  var port: Double = js.native
  var sharedDb: js.UndefOr[Boolean] = js.native
  var stdio: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(port: Double): Options = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setCorsVarargs(value: String*): Self = this.set("cors", js.Array(value :_*))
    @scala.inline
    def setCors(value: String | js.Array[String]): Self = this.set("cors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCors: Self = this.set("cors", js.undefined)
    @scala.inline
    def setDetached(value: Boolean): Self = this.set("detached", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setHeap(value: String): Self = this.set("heap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeap: Self = this.set("heap", js.undefined)
    @scala.inline
    def setSharedDb(value: Boolean): Self = this.set("sharedDb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedDb: Self = this.set("sharedDb", js.undefined)
    @scala.inline
    def setStdio(value: String): Self = this.set("stdio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStdio: Self = this.set("stdio", js.undefined)
  }
  
}

