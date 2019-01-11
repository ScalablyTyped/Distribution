package typings
package jsonrpcDashSerializerLib.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonrpc-serializer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deserialize(msg: java.lang.String): jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.DeserializeObject = js.native
  def deserializeObject(msg: jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.PayloadObject): jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.DeserializeObject = js.native
  def error(id: java.lang.String, error: jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.errNs.JsonRpcError): java.lang.String = js.native
  def error(id: scala.Double, error: jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.errNs.JsonRpcError): java.lang.String = js.native
  def errorObject(id: java.lang.String, error: jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.SerializerError): jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.PayloadObject = js.native
  def errorObject(id: scala.Double, error: jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.SerializerError): jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.PayloadObject = js.native
  def notification(method: java.lang.String): java.lang.String = js.native
  def notification(method: java.lang.String, params: js.Any): java.lang.String = js.native
  def notificationObject(method: java.lang.String): jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.PayloadObject = js.native
  def notificationObject(method: java.lang.String, params: js.Any): jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.PayloadObject = js.native
  def request(id: java.lang.String, method: java.lang.String): java.lang.String = js.native
  def request(id: java.lang.String, method: java.lang.String, params: js.Any): java.lang.String = js.native
  def request(id: scala.Double, method: java.lang.String): java.lang.String = js.native
  def request(id: scala.Double, method: java.lang.String, params: js.Any): java.lang.String = js.native
  def requestObject(id: java.lang.String, method: java.lang.String): jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.PayloadObject = js.native
  def requestObject(id: java.lang.String, method: java.lang.String, params: js.Any): jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.PayloadObject = js.native
  def requestObject(id: scala.Double, method: java.lang.String): jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.PayloadObject = js.native
  def requestObject(id: scala.Double, method: java.lang.String, params: js.Any): jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.PayloadObject = js.native
  def success(id: java.lang.String, result: js.Any): java.lang.String = js.native
  def success(id: scala.Double, result: js.Any): java.lang.String = js.native
  def successObject(id: java.lang.String, result: js.Any): jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.PayloadObject = js.native
  def successObject(id: scala.Double, result: js.Any): jsonrpcDashSerializerLib.jsonrpcDashSerializerMod.PayloadObject = js.native
}

