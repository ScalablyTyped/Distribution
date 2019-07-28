package typings.i2cDashBus.i2cDashBusMod

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
    val __obj = js.Dynamic.literal(i2c = i2c, protocolMangling = protocolMangling, smbusBlockProcCall = smbusBlockProcCall, smbusPec = smbusPec, smbusProcCall = smbusProcCall, smbusQuick = smbusQuick, smbusReadBlock = smbusReadBlock, smbusReadByte = smbusReadByte, smbusReadI2cBlock = smbusReadI2cBlock, smbusReadWord = smbusReadWord, smbusReceiveByte = smbusReceiveByte, smbusSendByte = smbusSendByte, smbusWriteBlock = smbusWriteBlock, smbusWriteByte = smbusWriteByte, smbusWriteI2cBlock = smbusWriteI2cBlock, smbusWriteWord = smbusWriteWord, tenBitAddr = tenBitAddr)
  
    __obj.asInstanceOf[I2cBusFuncs]
  }
}

