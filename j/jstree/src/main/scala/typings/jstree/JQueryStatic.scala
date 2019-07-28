package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  /**
    * holds all jstree related functions and variables,
    * including the actual class and methods to create,
    * access and manipulate instances.
    * @property jstree
    * @type {JSTreeStatic}
    */
  var jstree: js.UndefOr[JSTreeStatic] = js.undefined
  /**
    * helpers
    */
  var vakata: js.UndefOr[VakataStatic] = js.undefined
}

object JQueryStatic {
  @scala.inline
  def apply(jstree: JSTreeStatic = null, vakata: VakataStatic = null): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    if (jstree != null) __obj.updateDynamic("jstree")(jstree)
    if (vakata != null) __obj.updateDynamic("vakata")(vakata)
    __obj.asInstanceOf[JQueryStatic]
  }
}

