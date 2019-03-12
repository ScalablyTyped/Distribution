package typings
package jssLib.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSSOptions extends js.Object {
  var insertionPoint: java.lang.String | stdLib.HTMLElement
  var plugins: js.Array[JSSPlugin]
  var virtual: scala.Boolean
  def createGenerateClassName(): GenerateClassName[_]
}

object JSSOptions {
  @scala.inline
  def apply(
    createGenerateClassName: () => GenerateClassName[_],
    insertionPoint: java.lang.String | stdLib.HTMLElement,
    plugins: js.Array[JSSPlugin],
    virtual: scala.Boolean
  ): JSSOptions = {
    val __obj = js.Dynamic.literal(createGenerateClassName = js.Any.fromFunction0(createGenerateClassName), insertionPoint = insertionPoint.asInstanceOf[js.Any], plugins = plugins, virtual = virtual)
  
    __obj.asInstanceOf[JSSOptions]
  }
}

