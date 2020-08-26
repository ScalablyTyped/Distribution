package typings.hapiWreck.mod.Client.read

import typings.hapiWreck.hapiWreckStrings.force
import typings.hapiWreck.hapiWreckStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Determines how to handle gzipped payloads.
    *
    * @default false
    */
  val gunzip: js.UndefOr[Boolean | force] = js.native
  /**
    * Determines how to parse the payload as JSON.
    */
  val json: js.UndefOr[Boolean | strict | force] = js.native
  /**
    * The maximum allowed response payload size.
    * 
    * @default 0
    */
  val maxBytes: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds to wait while reading data before aborting handling of the response.
    * 
    * @default 0
    */
  val timeout: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
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
    def setGunzip(value: Boolean | force): Self = this.set("gunzip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGunzip: Self = this.set("gunzip", js.undefined)
    @scala.inline
    def setJson(value: Boolean | strict | force): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setMaxBytes(value: Double): Self = this.set("maxBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBytes: Self = this.set("maxBytes", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

