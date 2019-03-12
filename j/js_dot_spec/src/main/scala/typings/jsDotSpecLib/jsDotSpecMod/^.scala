package typings
package jsDotSpecLib.jsDotSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js.spec", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def assert(spec: SpecInput, value: js.Any): scala.Unit = js.native
  def conform(spec: SpecInput, value: js.Any): js.Any = js.native
  def explain(spec: SpecInput, value: js.Any): scala.Unit = js.native
  def explainData(spec: SpecInput, value: js.Any): js.Array[Problem] = js.native
  def explainStr(spec: SpecInput, value: js.Any): java.lang.String = js.native
  def problemStr(problem: Problem): java.lang.String = js.native
  def valid(spec: SpecInput, value: js.Any): scala.Boolean = js.native
}

