package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToISOTimeOptions extends js.Object {
  /**
    * choose between the basic and extended format
    * @default 'extended'
    */
  var format: js.UndefOr[ToISOFormat] = js.native
  /**
    * @default true
    */
  var includeOffset: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var suppressMilliseconds: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var suppressSeconds: js.UndefOr[Boolean] = js.native
}

object ToISOTimeOptions {
  @scala.inline
  def apply(): ToISOTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToISOTimeOptions]
  }
  @scala.inline
  implicit class ToISOTimeOptionsOps[Self <: ToISOTimeOptions] (val x: Self) extends AnyVal {
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
    def setFormat(value: ToISOFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setIncludeOffset(value: Boolean): Self = this.set("includeOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeOffset: Self = this.set("includeOffset", js.undefined)
    @scala.inline
    def setSuppressMilliseconds(value: Boolean): Self = this.set("suppressMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressMilliseconds: Self = this.set("suppressMilliseconds", js.undefined)
    @scala.inline
    def setSuppressSeconds(value: Boolean): Self = this.set("suppressSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressSeconds: Self = this.set("suppressSeconds", js.undefined)
  }
  
}

