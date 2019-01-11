package typings
package jsDotSpecLib.jsDotSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js.spec", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def assert(spec: jsDotSpecLib.jsDotSpecMod.SpecInput, value: js.Any): scala.Unit = js.native
  def conform(spec: jsDotSpecLib.jsDotSpecMod.SpecInput, value: js.Any): js.Any = js.native
  def explain(spec: jsDotSpecLib.jsDotSpecMod.SpecInput, value: js.Any): scala.Unit = js.native
  def explainData(spec: jsDotSpecLib.jsDotSpecMod.SpecInput, value: js.Any): js.Array[jsDotSpecLib.jsDotSpecMod.Problem] = js.native
  def explainStr(spec: jsDotSpecLib.jsDotSpecMod.SpecInput, value: js.Any): java.lang.String = js.native
  def problemStr(problem: jsDotSpecLib.jsDotSpecMod.Problem): java.lang.String = js.native
  def valid(spec: jsDotSpecLib.jsDotSpecMod.SpecInput, value: js.Any): scala.Boolean = js.native
}

