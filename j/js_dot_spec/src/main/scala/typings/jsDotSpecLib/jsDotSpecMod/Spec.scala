package typings
package jsDotSpecLib.jsDotSpecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Spec extends js.Object {
  /**
    * The name of the spec, displayed in explain() results.
    */
  val name: java.lang.String
  /**
    * Data necessary to check values for conformity.
    */
  val options: js.Object
  /**
    * Returns the conformed value to this spec.
    * @param value the value to test for conformance
    * @returns if the value does not conform to the spec, or the value if it does.
    */
  def conform(value: js.Any): js.Any
  /**
    * Explain why a value does not conform to this spec.
    * @param path the path to the value
    * @param via the containing specs, if any
    * @param value the value to examine
    * @returns list of problems or null if none
    */
  def explain(path: js.Array[java.lang.String], via: js.Array[java.lang.String], value: js.Any): js.Array[Problem]
}

object Spec {
  @scala.inline
  def apply(
    conform: js.Function1[js.Any, js.Any],
    explain: js.Function3[js.Array[java.lang.String], js.Array[java.lang.String], js.Any, js.Array[Problem]],
    name: java.lang.String,
    options: js.Object,
    toString: js.Function0[java.lang.String]
  ): Spec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("conform")(conform)
    __obj.updateDynamic("explain")(explain)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("toString")(toString)
    __obj.asInstanceOf[Spec]
  }
}

