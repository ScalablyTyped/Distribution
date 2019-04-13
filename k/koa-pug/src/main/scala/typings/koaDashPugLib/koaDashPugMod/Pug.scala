package typings
package koaDashPugLib.koaDashPugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** main module */
trait Pug extends js.Object {
  var locals: org.scalablytyped.runtime.StringDictionary[js.Any]
  def use(app: koaLib.koaMod.^[_, js.Object]): scala.Unit
}

object Pug {
  @scala.inline
  def apply(
    locals: org.scalablytyped.runtime.StringDictionary[js.Any],
    use: koaLib.koaMod.^[_, js.Object] => scala.Unit
  ): Pug = {
    val __obj = js.Dynamic.literal(locals = locals, use = js.Any.fromFunction1(use))
  
    __obj.asInstanceOf[Pug]
  }
}

