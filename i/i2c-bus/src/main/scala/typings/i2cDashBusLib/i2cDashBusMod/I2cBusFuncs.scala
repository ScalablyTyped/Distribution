package typings
package i2cDashBusLib.i2cDashBusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait I2cBusFuncs extends js.Object {
  var i2c: scala.Boolean
  var protocolMangling: scala.Boolean
  var smbusBlockProcCall: scala.Boolean
  var smbusPec: scala.Boolean
  var smbusProcCall: scala.Boolean
  var smbusQuick: scala.Boolean
  var smbusReadBlock: scala.Boolean
  var smbusReadByte: scala.Boolean
  var smbusReadI2cBlock: scala.Boolean
  var smbusReadWord: scala.Boolean
  var smbusReceiveByte: scala.Boolean
  var smbusSendByte: scala.Boolean
  var smbusWriteBlock: scala.Boolean
  var smbusWriteByte: scala.Boolean
  var smbusWriteI2cBlock: scala.Boolean
  var smbusWriteWord: scala.Boolean
  var tenBitAddr: scala.Boolean
}

object I2cBusFuncs {
  @scala.inline
  def apply(
    i2c: scala.Boolean,
    protocolMangling: scala.Boolean,
    smbusBlockProcCall: scala.Boolean,
    smbusPec: scala.Boolean,
    smbusProcCall: scala.Boolean,
    smbusQuick: scala.Boolean,
    smbusReadBlock: scala.Boolean,
    smbusReadByte: scala.Boolean,
    smbusReadI2cBlock: scala.Boolean,
    smbusReadWord: scala.Boolean,
    smbusReceiveByte: scala.Boolean,
    smbusSendByte: scala.Boolean,
    smbusWriteBlock: scala.Boolean,
    smbusWriteByte: scala.Boolean,
    smbusWriteI2cBlock: scala.Boolean,
    smbusWriteWord: scala.Boolean,
    tenBitAddr: scala.Boolean
  ): I2cBusFuncs = {
    val __obj = js.Dynamic.literal(i2c = i2c, protocolMangling = protocolMangling, smbusBlockProcCall = smbusBlockProcCall, smbusPec = smbusPec, smbusProcCall = smbusProcCall, smbusQuick = smbusQuick, smbusReadBlock = smbusReadBlock, smbusReadByte = smbusReadByte, smbusReadI2cBlock = smbusReadI2cBlock, smbusReadWord = smbusReadWord, smbusReceiveByte = smbusReceiveByte, smbusSendByte = smbusSendByte, smbusWriteBlock = smbusWriteBlock, smbusWriteByte = smbusWriteByte, smbusWriteI2cBlock = smbusWriteI2cBlock, smbusWriteWord = smbusWriteWord, tenBitAddr = tenBitAddr)
  
    __obj.asInstanceOf[I2cBusFuncs]
  }
}

