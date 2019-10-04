package typings.koaDashPug.koaDashPugMod

import org.scalablytyped.runtime.StringDictionary
import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** main module */
trait Pug extends js.Object {
  var locals: StringDictionary[js.Any]
  def use(app: typings.koa.koaMod.^[DefaultState, DefaultContext]): Unit
}

object Pug {
  @scala.inline
  def apply(locals: StringDictionary[js.Any], use: typings.koa.koaMod.^[DefaultState, DefaultContext] => Unit): Pug = {
    val __obj = js.Dynamic.literal(locals = locals, use = js.Any.fromFunction1(use))
  
    __obj.asInstanceOf[Pug]
  }
}

