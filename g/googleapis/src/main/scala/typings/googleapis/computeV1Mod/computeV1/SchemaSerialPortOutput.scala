package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An instance&#39;s serial console output.
  */
@js.native
trait SchemaSerialPortOutput extends js.Object {
  /**
    * [Output Only] The contents of the console output.
    */
  var contents: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of the resource. Always compute#serialPortOutput for
    * serial port output.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] The position of the next byte of content from the serial
    * console output. Use this value in the next request as the start
    * parameter.
    */
  var next: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * The starting byte position of the output that was returned. This should
    * match the start parameter sent with the request. If the serial console
    * output exceeds the size of the buffer, older output will be overwritten
    * by newer content and the start values will be mismatched.
    */
  var start: js.UndefOr[String] = js.native
}

object SchemaSerialPortOutput {
  @scala.inline
  def apply(): SchemaSerialPortOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSerialPortOutput]
  }
  @scala.inline
  implicit class SchemaSerialPortOutputOps[Self <: SchemaSerialPortOutput] (val x: Self) extends AnyVal {
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
    def setContents(value: String): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContents: Self = this.set("contents", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNext(value: String): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext: Self = this.set("next", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setStart(value: String): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

