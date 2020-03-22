package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.AnonApiVersion
import typings.mangopay2NodejsSdk.AnonTimeout
import typings.mangopay2NodejsSdk.PartialHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var headers: PartialHeaders
  /**
    * Path options are replacing the ${placeholders} from apiMethods
    */
  var path: AnonApiVersion
  var requestConfig: AnonTimeout
  var responseConfig: AnonTimeout
}

object RequestOptions {
  @scala.inline
  def apply(
    headers: PartialHeaders,
    path: AnonApiVersion,
    requestConfig: AnonTimeout,
    responseConfig: AnonTimeout
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestConfig = requestConfig.asInstanceOf[js.Any], responseConfig = responseConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RequestOptions]
  }
}

