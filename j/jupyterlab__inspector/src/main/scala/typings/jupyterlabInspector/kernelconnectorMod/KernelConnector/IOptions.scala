package typings.jupyterlabInspector.kernelconnectorMod.KernelConnector

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The instantiation options for an inspection handler.
  */
trait IOptions extends js.Object {
  /**
    * The session context used to make API requests to the kernel.
    */
  var sessionContext: ISessionContext
}

object IOptions {
  @scala.inline
  def apply(sessionContext: ISessionContext): IOptions = {
    val __obj = js.Dynamic.literal(sessionContext = sessionContext.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

