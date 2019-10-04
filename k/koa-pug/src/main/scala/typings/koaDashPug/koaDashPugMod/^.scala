package typings.koaDashPug.koaDashPugMod

import org.scalablytyped.runtime.StringDictionary
import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** main module */
@JSImport("koa-pug", JSImport.Namespace)
@js.native
class ^ () extends Pug {
  def this(options: PugOptions) = this()
  /* CompleteClass */
  override var locals: StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override def use(app: typings.koa.koaMod.^[DefaultState, DefaultContext]): Unit = js.native
}

