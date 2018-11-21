package typings
package koaDashBouncerLib.koaDashBouncerMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var vals: js.Any = js.native
  def check(result: js.Any): scala.Unit = js.native
  def check(result: js.Any, tip: java.lang.String): scala.Unit = js.native
  def checkNot(result: js.Any): koaDashBouncerLib.koaDashBouncerMod.KoaBouncerNs.Validator = js.native
  def checkNot(result: js.Any, tip: java.lang.String): koaDashBouncerLib.koaDashBouncerMod.KoaBouncerNs.Validator = js.native
  def validateBody(key: java.lang.String): koaDashBouncerLib.koaDashBouncerMod.KoaBouncerNs.Validator = js.native
  def validateParam(key: java.lang.String): koaDashBouncerLib.koaDashBouncerMod.KoaBouncerNs.Validator = js.native
  def validateQuery(key: java.lang.String): koaDashBouncerLib.koaDashBouncerMod.KoaBouncerNs.Validator = js.native
}

