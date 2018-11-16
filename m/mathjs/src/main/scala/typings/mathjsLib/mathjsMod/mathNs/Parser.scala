package typings
package mathjsLib.mathjsMod.mathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Parser extends js.Object {
  def clear(): scala.Unit
  def eval(expr: java.lang.String): js.Any
  def get(variable: java.lang.String): js.Any
  def getAll(): ScalablyTyped.runtime.StringDictionary[js.Any]
  def set(variable: java.lang.String, value: js.Any): scala.Unit
}

