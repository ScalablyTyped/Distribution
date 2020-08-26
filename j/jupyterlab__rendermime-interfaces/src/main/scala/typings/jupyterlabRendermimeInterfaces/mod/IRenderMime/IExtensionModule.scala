package typings.jupyterlabRendermimeInterfaces.mod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a module that exports an extension or extensions as
  * the default value.
  */
@js.native
trait IExtensionModule extends js.Object {
  /**
    * The default export.
    */
  val default: IExtension | js.Array[IExtension] = js.native
}

object IExtensionModule {
  @scala.inline
  def apply(default: IExtension | js.Array[IExtension]): IExtensionModule = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExtensionModule]
  }
  @scala.inline
  implicit class IExtensionModuleOps[Self <: IExtensionModule] (val x: Self) extends AnyVal {
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
    def setDefaultVarargs(value: IExtension*): Self = this.set("default", js.Array(value :_*))
    @scala.inline
    def setDefault(value: IExtension | js.Array[IExtension]): Self = this.set("default", value.asInstanceOf[js.Any])
  }
  
}

