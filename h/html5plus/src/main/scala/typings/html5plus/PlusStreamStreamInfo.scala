package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，流应用信息
  * 流应用标识、图标、是否下载完成等信息。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
  */
trait PlusStreamStreamInfo extends js.Object {
  /**
    * 流应用是否下载完成
    * true表示流应用下载完成，false表示流应用未下载完成。
    * 	注意，流应用未下载完成以让可以正常启动运行，启动后会自动下载。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var complete: js.UndefOr[Boolean] = js.undefined
  /**
    * 流应用的图标
    * 流应用下载的图标路径（本地路径），如果未下载完成则返回空。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var icon: js.UndefOr[String] = js.undefined
  /**
    * 流应用标识
    * 流应用唯一字符串标识。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/stream.html](http://www.html5plus.org/doc/zh_cn/stream.html)
    */
  var id: js.UndefOr[String] = js.undefined
}

object PlusStreamStreamInfo {
  @scala.inline
  def apply(complete: js.UndefOr[Boolean] = js.undefined, icon: String = null, id: String = null): PlusStreamStreamInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(complete)) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusStreamStreamInfo]
  }
}

