package typings.jupyterlabCodemirror.modeMod.Mode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The interface of a codemirror modeInfo spec.
  */
trait ISpec extends js.Object {
  var ext: js.UndefOr[js.Array[String]] = js.undefined
  var mime: String
  var mode: String
  var name: js.UndefOr[String] = js.undefined
}

object ISpec {
  @scala.inline
  def apply(mime: String, mode: String, ext: js.Array[String] = null, name: String = null): ISpec = {
    val __obj = js.Dynamic.literal(mime = mime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    if (ext != null) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpec]
  }
}

