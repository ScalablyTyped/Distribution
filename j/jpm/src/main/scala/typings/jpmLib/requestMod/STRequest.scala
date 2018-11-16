package typings
package jpmLib.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait STRequest[ResponseType] extends BaseRequest {
  var response: STResponse[ResponseType]
}

