package typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod

import typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod.errNs.JsonRpcError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsonrpc-serializer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def deserialize(msg: String): DeserializeObject = js.native
  def deserializeObject(msg: PayloadObject): DeserializeObject = js.native
  def error(id: String, error: JsonRpcError): String = js.native
  def error(id: Double, error: JsonRpcError): String = js.native
  def errorObject(id: String, error: SerializerError): PayloadObject = js.native
  def errorObject(id: Double, error: SerializerError): PayloadObject = js.native
  def notification(method: String): String = js.native
  def notification(method: String, params: js.Any): String = js.native
  def notificationObject(method: String): PayloadObject = js.native
  def notificationObject(method: String, params: js.Any): PayloadObject = js.native
  def request(id: String, method: String): String = js.native
  def request(id: String, method: String, params: js.Any): String = js.native
  def request(id: Double, method: String): String = js.native
  def request(id: Double, method: String, params: js.Any): String = js.native
  def requestObject(id: String, method: String): PayloadObject = js.native
  def requestObject(id: String, method: String, params: js.Any): PayloadObject = js.native
  def requestObject(id: Double, method: String): PayloadObject = js.native
  def requestObject(id: Double, method: String, params: js.Any): PayloadObject = js.native
  def success(id: String, result: js.Any): String = js.native
  def success(id: Double, result: js.Any): String = js.native
  def successObject(id: String, result: js.Any): PayloadObject = js.native
  def successObject(id: Double, result: js.Any): PayloadObject = js.native
}

