package typings.atJupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Target extends js.Object {
  /**
    * Filter for returned comms
    *
    * @deprecated - this is a non-standard field. Use target_name instead
    *
    * #### Notes
    * See https://github.com/jupyterlab/jupyterlab/issues/6947
    */
  var target: js.UndefOr[String] = js.undefined
  /**
    * The comm target name to filter returned comms
    */
  var target_name: js.UndefOr[String] = js.undefined
}

object Anon_Target {
  @scala.inline
  def apply(target: String = null, target_name: String = null): Anon_Target = {
    val __obj = js.Dynamic.literal()
    if (target != null) __obj.updateDynamic("target")(target)
    if (target_name != null) __obj.updateDynamic("target_name")(target_name)
    __obj.asInstanceOf[Anon_Target]
  }
}

