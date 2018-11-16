package typings
package jsonrpcDashSerializerLib.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SerializerError
  extends stdLib.Error {
  var code: scala.Double
  var data: js.UndefOr[js.Array[_]] = js.undefined
}

