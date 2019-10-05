package typings.koaDashQs

import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.^
import typings.koaDashQs.koaDashQsMod.ParseMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("koa-qs", JSImport.Namespace)
@js.native
object koaDashQsMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.koaDashQs.koaDashQsStrings.extended
    - typings.koaDashQs.koaDashQsStrings.strict
    - typings.koaDashQs.koaDashQsStrings.first
  */
  trait ParseMode extends js.Object
  
  def apply(app: ^[DefaultState, DefaultContext]): ^[DefaultState, DefaultContext] = js.native
  def apply(app: ^[DefaultState, DefaultContext], mode: ParseMode): ^[DefaultState, DefaultContext] = js.native
}

