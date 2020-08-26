package typings.jsonServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MiddlewaresOptions extends js.Object {
  /**
    * Enable body-parser middleware
    * @default true
    */
  var bodyParser: js.UndefOr[Boolean] = js.native
  /**
    * Enable logger middleware
    * @default true
    */
  var logger: js.UndefOr[Boolean] = js.native
  /**
    * Disable CORS
    * @default false
    */
  var noCors: js.UndefOr[Boolean] = js.native
  /**
    * Disable compression
    * @default false
    */
  var noGzip: js.UndefOr[Boolean] = js.native
  /**
    * Accept only GET requests
    * @default false
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  /**
    * Path to static files
    * @default "public" (if folder exists)
    */
  var static: js.UndefOr[String] = js.native
}

object MiddlewaresOptions {
  @scala.inline
  def apply(): MiddlewaresOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MiddlewaresOptions]
  }
  @scala.inline
  implicit class MiddlewaresOptionsOps[Self <: MiddlewaresOptions] (val x: Self) extends AnyVal {
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
    def setBodyParser(value: Boolean): Self = this.set("bodyParser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBodyParser: Self = this.set("bodyParser", js.undefined)
    @scala.inline
    def setLogger(value: Boolean): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setNoCors(value: Boolean): Self = this.set("noCors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoCors: Self = this.set("noCors", js.undefined)
    @scala.inline
    def setNoGzip(value: Boolean): Self = this.set("noGzip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoGzip: Self = this.set("noGzip", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setStatic(value: String): Self = this.set("static", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatic: Self = this.set("static", js.undefined)
  }
  
}

