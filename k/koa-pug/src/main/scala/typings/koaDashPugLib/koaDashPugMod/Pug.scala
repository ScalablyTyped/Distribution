package typings
package koaDashPugLib.koaDashPugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** main module */
trait Pug extends js.Object {
  var locals: org.scalablytyped.runtime.StringDictionary[js.Any]
  def use(app: koaLib.koaMod.namespaced[_, js.Object]): scala.Unit
}

object Pug {
  @scala.inline
  def apply(
    locals: org.scalablytyped.runtime.StringDictionary[js.Any],
    use: js.Function1[koaLib.koaMod.namespaced[_, js.Object], scala.Unit]
  ): Pug = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("locals")(locals)
    __obj.updateDynamic("use")(use)
    __obj.asInstanceOf[Pug]
  }
}

