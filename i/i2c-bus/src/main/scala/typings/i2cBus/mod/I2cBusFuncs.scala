package typings.i2cBus.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I2cBusFuncs extends js.Object {
  var i2c: Boolean
  var protocolMangling: Boolean
  var smbusBlockProcCall: Boolean
  var smbusPec: Boolean
  var smbusProcCall: Boolean
  var smbusQuick: Boolean
  var smbusReadBlock: Boolean
  var smbusReadByte: Boolean
  var smbusReadI2cBlock: Boolean
  var smbusReadWord: Boolean
  var smbusReceiveByte: Boolean
  var smbusSendByte: Boolean
  var smbusWriteBlock: Boolean
  var smbusWriteByte: Boolean
  var smbusWriteI2cBlock: Boolean
  var smbusWriteWord: Boolean
  var tenBitAddr: Boolean
}

object I2cBusFuncs {
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
  ): I2cBusFuncs = {
    val __obj = js.Dynamic.literal(i2c = i2c.asInstanceOf[js.Any], protocolMangling = protocolMangling.asInstanceOf[js.Any], smbusBlockProcCall = smbusBlockProcCall.asInstanceOf[js.Any], smbusPec = smbusPec.asInstanceOf[js.Any], smbusProcCall = smbusProcCall.asInstanceOf[js.Any], smbusQuick = smbusQuick.asInstanceOf[js.Any], smbusReadBlock = smbusReadBlock.asInstanceOf[js.Any], smbusReadByte = smbusReadByte.asInstanceOf[js.Any], smbusReadI2cBlock = smbusReadI2cBlock.asInstanceOf[js.Any], smbusReadWord = smbusReadWord.asInstanceOf[js.Any], smbusReceiveByte = smbusReceiveByte.asInstanceOf[js.Any], smbusSendByte = smbusSendByte.asInstanceOf[js.Any], smbusWriteBlock = smbusWriteBlock.asInstanceOf[js.Any], smbusWriteByte = smbusWriteByte.asInstanceOf[js.Any], smbusWriteI2cBlock = smbusWriteI2cBlock.asInstanceOf[js.Any], smbusWriteWord = smbusWriteWord.asInstanceOf[js.Any], tenBitAddr = tenBitAddr.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[I2cBusFuncs]
  }
}

