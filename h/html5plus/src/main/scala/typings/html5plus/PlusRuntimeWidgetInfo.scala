package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，应用信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
  */
@js.native
trait PlusRuntimeWidgetInfo extends js.Object {
  /**
    * 应用的APPID
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var appid: js.UndefOr[String] = js.native
  /**
    * 应用描述信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var author: js.UndefOr[String] = js.native
  /**
    * 应用描述信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * 开发者邮箱地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var email: js.UndefOr[String] = js.native
  /**
    * 应用许可特性列表
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var features: js.UndefOr[js.Array[String]] = js.native
  /**
    * 应用授权描述信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var license: js.UndefOr[String] = js.native
  /**
    * 应用授权说明链接地址
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var licensehref: js.UndefOr[String] = js.native
  /**
    * 应用的名称
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * 应用的版本号
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var version: js.UndefOr[String] = js.native
}

object PlusRuntimeWidgetInfo {
  @scala.inline
  def apply(): PlusRuntimeWidgetInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusRuntimeWidgetInfo]
  }
  @scala.inline
  implicit class PlusRuntimeWidgetInfoOps[Self <: PlusRuntimeWidgetInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppid(value: String): Self = this.set("appid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppid: Self = this.set("appid", js.undefined)
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFeaturesVarargs(value: String*): Self = this.set("features", js.Array(value :_*))
    @scala.inline
    def setFeatures(value: js.Array[String]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    @scala.inline
    def setLicensehref(value: String): Self = this.set("licensehref", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicensehref: Self = this.set("licensehref", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

