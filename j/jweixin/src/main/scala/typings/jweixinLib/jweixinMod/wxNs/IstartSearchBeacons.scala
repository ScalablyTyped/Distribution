package typings
package jweixinLib.jweixinMod.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/*=============================地理位置================================*/
/*=============================摇一摇周边================================*/
trait IstartSearchBeacons extends BaseParams {
  var ticket: java.lang.String
    // 摇周边的业务ticket, 系统自动添加在摇出来的页面链接后面
  // 开启查找完成后的回调函数
  @JSName("complete")
  def complete_MIstartSearchBeacons(argv: js.Any): scala.Unit
}

