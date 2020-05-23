package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.anon.ApiVersion
import typings.mangopay2NodejsSdk.anon.PartialHeaders
import typings.mangopay2NodejsSdk.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  var headers: PartialHeaders
  /**
    * Path options are replacing the ${placeholders} from apiMethods
    */
  var path: ApiVersion
  var requestConfig: Timeout
  var responseConfig: Timeout
}

object RequestOptions {
  @scala.inline
  def apply(headers: PartialHeaders, path: ApiVersion, requestConfig: Timeout, responseConfig: Timeout): RequestOptions = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestConfig = requestConfig.asInstanceOf[js.Any], responseConfig = responseConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

