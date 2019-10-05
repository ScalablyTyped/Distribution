package typings.atJupyterlabRendermimeDashInterfaces.atJupyterlabRendermimeDashInterfacesMod.IRenderMime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface for a module that exports an extension or extensions as
  * the default value.
  */
trait IExtensionModule extends js.Object {
  /**
    * The default export.
    */
  val default: IExtension | js.Array[IExtension]
}

object IExtensionModule {
  @scala.inline
  def apply(default: IExtension | js.Array[IExtension]): IExtensionModule = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IExtensionModule]
  }
}

