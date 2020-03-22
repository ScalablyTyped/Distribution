package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Determines the shape of the response
trait ReadResponseHeaders extends js.Object {
  var resolveWithFullResponse: `true`
}

object ReadResponseHeaders {
  @scala.inline
  def apply(resolveWithFullResponse: `true`): ReadResponseHeaders = {
    val __obj = js.Dynamic.literal(resolveWithFullResponse = resolveWithFullResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadResponseHeaders]
  }
}

