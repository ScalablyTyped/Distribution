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

