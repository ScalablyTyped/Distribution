package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，应用信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
  */
trait PlusRuntimeWidgetInfo extends js.Object {
  /**
    * 应用的APPID
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var appid: js.UndefOr[String] = js.undefined
  /**
    * 应用描述信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var author: js.UndefOr[String] = js.undefined
  /**
    * 应用描述信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * 开发者邮箱地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * 应用许可特性列表
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var features: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 应用授权描述信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var license: js.UndefOr[String] = js.undefined
  /**
    * 应用授权说明链接地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var licensehref: js.UndefOr[String] = js.undefined
  /**
    * 应用的名称
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * 应用的版本号
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var version: js.UndefOr[String] = js.undefined
}

object PlusRuntimeWidgetInfo {
  @scala.inline
  def apply(
    appid: String = null,
    author: String = null,
    description: String = null,
    email: String = null,
    features: js.Array[String] = null,
    license: String = null,
    licensehref: String = null,
    name: String = null,
    version: String = null
  ): PlusRuntimeWidgetInfo = {
    val __obj = js.Dynamic.literal()
    if (appid != null) __obj.updateDynamic("appid")(appid)
    if (author != null) __obj.updateDynamic("author")(author)
    if (description != null) __obj.updateDynamic("description")(description)
    if (email != null) __obj.updateDynamic("email")(email)
    if (features != null) __obj.updateDynamic("features")(features)
    if (license != null) __obj.updateDynamic("license")(license)
    if (licensehref != null) __obj.updateDynamic("licensehref")(licensehref)
    if (name != null) __obj.updateDynamic("name")(name)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[PlusRuntimeWidgetInfo]
  }
}

