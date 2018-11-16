package typings
package jsmockitoLib.JsMockitoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("JsMockito")
@js.native
object JsMockitoNsMembers extends js.Object {
  var version: java.lang.String = js.native
  def isMock(maybeMock: js.Any): scala.Boolean = js.native
  def mock[T](Obj: jsmockitoLib.Anon_T[T]): T = js.native
  def mockFunction(): js.Function = js.native
  def mockFunction(funcName: java.lang.String): js.Function = js.native
  def mockFunction(funcName: java.lang.String, delegate: js.Function): js.Function = js.native
  def spy[T](delegate: T): T = js.native
  def verify[T](mock: T): T = js.native
  def verify[T](mock: T, verifier: Verifier): T = js.native
  def verifyNoMoreInteractions(mock: js.Any*): scala.Unit = js.native
  def verifyZeroInteractions(mock: js.Any*): scala.Unit = js.native
  def when[T](mock: T): T = js.native
}

