package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 创建应用快捷方式要设置的参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
  */
@js.native
trait PlusNavigatorShortcutOptions extends js.Object {
  /**
    * 要启动Activity类名
    * 通常情况下不需要指定此值，仅在5+SDK集成时自定义Activity才用到。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var classname: js.UndefOr[String] = js.native
  /**
    * 快捷方式的扩展参数
    * 其中key和value值都必须是字符串类型。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var extra: js.UndefOr[js.Any] = js.native
  /**
    * 是否需要强制创建快捷方式
    * true表示强制创建，false表示不强制创建，默认值为true。
    *     强制创建可能会导致在无法判断快捷方式是否存在的设备上重复创建，如果需要尽可能避免出现重复创建桌面快捷方式则应该设置force属性值为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * 快捷方式的图标
    * 如果未设置则优先使用应用中指定的图标（manifest.json中icon节点下对应分辨率的图标），如未区配则使用应用的图标（仅在独立打包时），否则使用runtime提供的默认图标。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var icon: js.UndefOr[String] = js.native
  /**
    * 快捷方式名称
    * 如果未设置则使用应用的名称，manifest.json中name属性值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * 创建快捷方式后的提示信息
    * 快捷方式创建成功后显示，默认提示内容为“"XXXX"已创建桌面快捷方式”，其中"XXXX"为程序的名称，如果不需要提示则设置此值为空字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var toast: js.UndefOr[String] = js.native
}

object PlusNavigatorShortcutOptions {
  @scala.inline
  def apply(): PlusNavigatorShortcutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNavigatorShortcutOptions]
  }
  @scala.inline
  implicit class PlusNavigatorShortcutOptionsOps[Self <: PlusNavigatorShortcutOptions] (val x: Self) extends AnyVal {
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
    def setClassname(value: String): Self = this.set("classname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassname: Self = this.set("classname", js.undefined)
    @scala.inline
    def setExtra(value: js.Any): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setToast(value: String): Self = this.set("toast", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToast: Self = this.set("toast", js.undefined)
  }
  
}

