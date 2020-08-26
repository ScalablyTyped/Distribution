package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SSLConfig extends js.Object {
  var cafile: js.UndefOr[String | js.Array[String]] = js.native
  var certfile: js.UndefOr[String | js.Array[String]] = js.native
  var keyfile: js.UndefOr[String | js.Array[String]] = js.native
}

object SSLConfig {
  @scala.inline
  def apply(): SSLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSLConfig]
  }
  @scala.inline
  implicit class SSLConfigOps[Self <: SSLConfig] (val x: Self) extends AnyVal {
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
    def setCafileVarargs(value: String*): Self = this.set("cafile", js.Array(value :_*))
    @scala.inline
    def setCafile(value: String | js.Array[String]): Self = this.set("cafile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCafile: Self = this.set("cafile", js.undefined)
    @scala.inline
    def setCertfileVarargs(value: String*): Self = this.set("certfile", js.Array(value :_*))
    @scala.inline
    def setCertfile(value: String | js.Array[String]): Self = this.set("certfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertfile: Self = this.set("certfile", js.undefined)
    @scala.inline
    def setKeyfileVarargs(value: String*): Self = this.set("keyfile", js.Array(value :_*))
    @scala.inline
    def setKeyfile(value: String | js.Array[String]): Self = this.set("keyfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyfile: Self = this.set("keyfile", js.undefined)
  }
  
}

