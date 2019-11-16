package typings.atKeystonejsEmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RendererOpts extends js.Object {
  def send(rendererOpts: js.Any, transportOptions: js.Any): js.Any
}

object Anon_RendererOpts {
  @scala.inline
  def apply(send: (js.Any, js.Any) => js.Any): Anon_RendererOpts = {
    val __obj = js.Dynamic.literal(send = js.Any.fromFunction2(send))
  
    __obj.asInstanceOf[Anon_RendererOpts]
  }
}

