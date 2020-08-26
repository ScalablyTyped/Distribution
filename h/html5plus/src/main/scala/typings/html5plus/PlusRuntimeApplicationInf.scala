package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，打开第三方程序参数
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
  */
@js.native
trait PlusRuntimeApplicationInf extends js.Object {
  /**
    * 程序的操作行为
    * Android平台上与系统的action值一致；iOS平台为要调用程序的URLScheme格式字符串。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var action: js.UndefOr[String] = js.native
  /**
    * 调用程序的参数
    * 仅Android平台支持，为JSON格式，用于传递给要调用程序的参数，如extra:{url:"http://www.html5plus.org"}。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var extra: js.UndefOr[js.Any] = js.native
  /**
    * 新任务模式标记
    * 可取值：
    *         true-使用新任务模式标记（FLAG_ACTIVITY_NEW_TASK）启动应用；
    *         false-不使用新任务模式标记（FLAG_ACTIVITY_NEW_TASK）启动应用。
    *     默认值为true。
    *     注意：由于5+应用配置的launchMode为singleTask，所以另一个5+应用通过plus.runtime.launchApplication启动时如果应用已经在后台运行则不会触发newintent事件，为了避免此问题需要将newTask参数值设置为false。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var newTask: js.UndefOr[Boolean] = js.native
  /**
    * 第三方程序包名
    * 仅Android平台支持，表示程序的包名，其它平台忽略此属性值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/runtime.html](http://www.html5plus.org/doc/zh_cn/runtime.html)
    */
  var pname: js.UndefOr[String] = js.native
}

object PlusRuntimeApplicationInf {
  @scala.inline
  def apply(): PlusRuntimeApplicationInf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusRuntimeApplicationInf]
  }
  @scala.inline
  implicit class PlusRuntimeApplicationInfOps[Self <: PlusRuntimeApplicationInf] (val x: Self) extends AnyVal {
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    @scala.inline
    def setExtra(value: js.Any): Self = this.set("extra", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    @scala.inline
    def setNewTask(value: Boolean): Self = this.set("newTask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewTask: Self = this.set("newTask", js.undefined)
    @scala.inline
    def setPname(value: String): Self = this.set("pname", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePname: Self = this.set("pname", js.undefined)
  }
  
}

