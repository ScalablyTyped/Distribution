package typings
package lovefieldLib.lovefieldMod.lfNs.queryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Builder extends js.Object {
  def bind(values: js.Any*): Builder
  def exec(): js.Promise[js.Array[js.Object]]
  def explain(): java.lang.String
  def toSql(): java.lang.String
}

