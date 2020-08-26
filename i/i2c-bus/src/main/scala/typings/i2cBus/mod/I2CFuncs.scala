package typings.i2cBus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait I2CFuncs extends js.Object {
  var i2c: Boolean = js.native
  var protocolMangling: Boolean = js.native
  var smbusBlockProcCall: Boolean = js.native
  var smbusPec: Boolean = js.native
  var smbusProcCall: Boolean = js.native
  var smbusQuick: Boolean = js.native
  var smbusReadBlock: Boolean = js.native
  var smbusReadByte: Boolean = js.native
  var smbusReadI2cBlock: Boolean = js.native
  var smbusReadWord: Boolean = js.native
  var smbusReceiveByte: Boolean = js.native
  var smbusSendByte: Boolean = js.native
  var smbusWriteBlock: Boolean = js.native
  var smbusWriteByte: Boolean = js.native
  var smbusWriteI2cBlock: Boolean = js.native
  var smbusWriteWord: Boolean = js.native
  var tenBitAddr: Boolean = js.native
}

object I2CFuncs {
  @scala.inline
  def apply(
    i2c: Boolean,
    protocolMangling: Boolean,
    smbusBlockProcCall: Boolean,
    smbusPec: Boolean,
    smbusProcCall: Boolean,
    smbusQuick: Boolean,
    smbusReadBlock: Boolean,
    smbusReadByte: Boolean,
    smbusReadI2cBlock: Boolean,
    smbusReadWord: Boolean,
    smbusReceiveByte: Boolean,
    smbusSendByte: Boolean,
    smbusWriteBlock: Boolean,
    smbusWriteByte: Boolean,
    smbusWriteI2cBlock: Boolean,
    smbusWriteWord: Boolean,
    tenBitAddr: Boolean
  ): I2CFuncs = {
    val __obj = js.Dynamic.literal(i2c = i2c.asInstanceOf[js.Any], protocolMangling = protocolMangling.asInstanceOf[js.Any], smbusBlockProcCall = smbusBlockProcCall.asInstanceOf[js.Any], smbusPec = smbusPec.asInstanceOf[js.Any], smbusProcCall = smbusProcCall.asInstanceOf[js.Any], smbusQuick = smbusQuick.asInstanceOf[js.Any], smbusReadBlock = smbusReadBlock.asInstanceOf[js.Any], smbusReadByte = smbusReadByte.asInstanceOf[js.Any], smbusReadI2cBlock = smbusReadI2cBlock.asInstanceOf[js.Any], smbusReadWord = smbusReadWord.asInstanceOf[js.Any], smbusReceiveByte = smbusReceiveByte.asInstanceOf[js.Any], smbusSendByte = smbusSendByte.asInstanceOf[js.Any], smbusWriteBlock = smbusWriteBlock.asInstanceOf[js.Any], smbusWriteByte = smbusWriteByte.asInstanceOf[js.Any], smbusWriteI2cBlock = smbusWriteI2cBlock.asInstanceOf[js.Any], smbusWriteWord = smbusWriteWord.asInstanceOf[js.Any], tenBitAddr = tenBitAddr.asInstanceOf[js.Any])
    __obj.asInstanceOf[I2CFuncs]
  }
  @scala.inline
  implicit class I2CFuncsOps[Self <: I2CFuncs] (val x: Self) extends AnyVal {
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
    def setI2c(value: Boolean): Self = this.set("i2c", value.asInstanceOf[js.Any])
    @scala.inline
    def setProtocolMangling(value: Boolean): Self = this.set("protocolMangling", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusBlockProcCall(value: Boolean): Self = this.set("smbusBlockProcCall", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusPec(value: Boolean): Self = this.set("smbusPec", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusProcCall(value: Boolean): Self = this.set("smbusProcCall", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusQuick(value: Boolean): Self = this.set("smbusQuick", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusReadBlock(value: Boolean): Self = this.set("smbusReadBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusReadByte(value: Boolean): Self = this.set("smbusReadByte", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusReadI2cBlock(value: Boolean): Self = this.set("smbusReadI2cBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusReadWord(value: Boolean): Self = this.set("smbusReadWord", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusReceiveByte(value: Boolean): Self = this.set("smbusReceiveByte", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusSendByte(value: Boolean): Self = this.set("smbusSendByte", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusWriteBlock(value: Boolean): Self = this.set("smbusWriteBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusWriteByte(value: Boolean): Self = this.set("smbusWriteByte", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusWriteI2cBlock(value: Boolean): Self = this.set("smbusWriteI2cBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmbusWriteWord(value: Boolean): Self = this.set("smbusWriteWord", value.asInstanceOf[js.Any])
    @scala.inline
    def setTenBitAddr(value: Boolean): Self = this.set("tenBitAddr", value.asInstanceOf[js.Any])
  }
  
}

