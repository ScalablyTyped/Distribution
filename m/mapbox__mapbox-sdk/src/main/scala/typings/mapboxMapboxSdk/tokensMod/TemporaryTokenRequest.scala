package typings.mapboxMapboxSdk.tokensMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporaryTokenRequest extends js.Object {
  var expires: String
  var scopes: js.Array[String]
}

object TemporaryTokenRequest {
  @scala.inline
  def apply(expires: String, scopes: js.Array[String]): TemporaryTokenRequest = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TemporaryTokenRequest]
  }
}

