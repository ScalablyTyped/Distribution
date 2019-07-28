package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，应用安装参数
  * 可通过对象设置安装的应用是否进行appid校验、版本号校验等。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
  */
trait PlusRuntimeWidgetOptions extends js.Object {
  /**
    * 是否强制安装
    * true表示强制安装，不进行版本号的校验；false则需要版本号校验，如果将要安装应用的版本号不高于现有应用的版本号则终止安装，并返回安装失败。
    * 	仅安装wgt和wgtu时生效，默认值 false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var force: js.UndefOr[Boolean] = js.undefined
}

object PlusRuntimeWidgetOptions {
  @scala.inline
  def apply(force: js.UndefOr[Boolean] = js.undefined): PlusRuntimeWidgetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[PlusRuntimeWidgetOptions]
  }
}

