package typings.jsSpec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spec_ extends js.Object {
  /**
    * The name of the spec, displayed in explain() results.
    */
  val name: String = js.native
  /**
    * Data necessary to check values for conformity.
    */
  val options: js.Object = js.native
  /**
    * Returns the conformed value to this spec.
    * @param value the value to test for conformance
    * @returns if the value does not conform to the spec, or the value if it does.
    */
  def conform(value: js.Any): js.Any = js.native
  /**
    * Explain why a value does not conform to this spec.
    * @param path the path to the value
    * @param via the containing specs, if any
    * @param value the value to examine
    * @returns list of problems or null if none
    */
  def explain(path: js.Array[String], via: js.Array[String], value: js.Any): js.Array[Problem] = js.native
}

object Spec_ {
  @scala.inline
  def apply(
    conform: js.Any => js.Any,
    explain: (js.Array[String], js.Array[String], js.Any) => js.Array[Problem],
    name: String,
    options: js.Object
  ): Spec_ = {
    val __obj = js.Dynamic.literal(conform = js.Any.fromFunction1(conform), explain = js.Any.fromFunction3(explain), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Spec_]
  }
  @scala.inline
  implicit class Spec_Ops[Self <: Spec_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConform(value: js.Any => js.Any): Self = this.set("conform", js.Any.fromFunction1(value))
    @scala.inline
    def setExplain(value: (js.Array[String], js.Array[String], js.Any) => js.Array[Problem]): Self = this.set("explain", js.Any.fromFunction3(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
  }
  
}

