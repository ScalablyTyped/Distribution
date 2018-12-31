package typings
package k6Lib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestObj extends js.Object {
  var body: js.UndefOr[java.lang.String | js.Object] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[RequestParams] = js.undefined
  var url: java.lang.String
}

