package typings.jsDotSpec.jsDotSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("js.spec", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def assert(spec: SpecInput, value: js.Any): Unit = js.native
  def conform(spec: SpecInput, value: js.Any): js.Any = js.native
  def explain(spec: SpecInput, value: js.Any): Unit = js.native
  def explainData(spec: SpecInput, value: js.Any): js.Array[Problem] = js.native
  def explainStr(spec: SpecInput, value: js.Any): String = js.native
  def problemStr(problem: Problem): String = js.native
  def valid(spec: SpecInput, value: js.Any): Boolean = js.native
}

