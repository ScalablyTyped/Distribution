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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("i2c")(i2c)
    __obj.updateDynamic("protocolMangling")(protocolMangling)
    __obj.updateDynamic("smbusBlockProcCall")(smbusBlockProcCall)
    __obj.updateDynamic("smbusPec")(smbusPec)
    __obj.updateDynamic("smbusProcCall")(smbusProcCall)
    __obj.updateDynamic("smbusQuick")(smbusQuick)
    __obj.updateDynamic("smbusReadBlock")(smbusReadBlock)
    __obj.updateDynamic("smbusReadByte")(smbusReadByte)
    __obj.updateDynamic("smbusReadI2cBlock")(smbusReadI2cBlock)
    __obj.updateDynamic("smbusReadWord")(smbusReadWord)
    __obj.updateDynamic("smbusReceiveByte")(smbusReceiveByte)
    __obj.updateDynamic("smbusSendByte")(smbusSendByte)
    __obj.updateDynamic("smbusWriteBlock")(smbusWriteBlock)
    __obj.updateDynamic("smbusWriteByte")(smbusWriteByte)
    __obj.updateDynamic("smbusWriteI2cBlock")(smbusWriteI2cBlock)
    __obj.updateDynamic("smbusWriteWord")(smbusWriteWord)
    __obj.updateDynamic("tenBitAddr")(tenBitAddr)
    __obj.asInstanceOf[I2cBusFuncs]
  }
}

