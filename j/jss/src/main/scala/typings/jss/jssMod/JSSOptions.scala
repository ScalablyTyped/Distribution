package typings.jss.jssMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSSOptions extends js.Object {
  var insertionPoint: String | HTMLElement
  var plugins: js.Array[JSSPlugin]
  var virtual: Boolean
  def createGenerateClassName(): GenerateClassName[_]
}

object JSSOptions {
  @scala.inline
  def apply(
    createGenerateClassName: () => GenerateClassName[_],
    insertionPoint: String | HTMLElement,
    plugins: js.Array[JSSPlugin],
    virtual: Boolean
  ): JSSOptions = {
    val __obj = js.Dynamic.literal(createGenerateClassName = js.Any.fromFunction0(createGenerateClassName), insertionPoint = insertionPoint.asInstanceOf[js.Any], plugins = plugins, virtual = virtual)
  
    __obj.asInstanceOf[JSSOptions]
  }
}

