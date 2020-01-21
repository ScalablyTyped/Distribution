package typings.jweixin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jweixin", "checkJsApi")
@js.native
object checkJsApi extends js.Object {
  /**
  	 * 判断当前客户端版本是否支持指定JS接口
  	 * 备注：checkJsApi接口是客户端6.0.2新引入的一个预留接口，第一期开放的接口均可不使用checkJsApi来检测。
  	 */
  def apply(params: IcheckJsApi): Unit = js.native
}

