package typings.matrixAppserviceBridge.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "ApiError")
@js.native
open class ApiError protected ()
  extends typings.matrixAppserviceBridge.libProvisioningMod.ApiError {
  def this(error: String) = this()
  def this(error: String, errcode: typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode) = this()
  def this(error: String, errcode: Unit, statusCode: Double) = this()
  def this(
    error: String,
    errcode: typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode,
    statusCode: Double
  ) = this()
  def this(error: String, errcode: Unit, statusCode: Double, additionalContent: Record[String, Any]) = this()
  def this(error: String, errcode: Unit, statusCode: Unit, additionalContent: Record[String, Any]) = this()
  def this(
    error: String,
    errcode: typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode,
    statusCode: Double,
    additionalContent: Record[String, Any]
  ) = this()
  def this(
    error: String,
    errcode: typings.matrixAppserviceBridge.libProvisioningErrorsMod.ErrCode,
    statusCode: Unit,
    additionalContent: Record[String, Any]
  ) = this()
}
