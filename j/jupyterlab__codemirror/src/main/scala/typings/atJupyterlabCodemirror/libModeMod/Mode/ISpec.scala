package typings.atJupyterlabCodemirror.libModeMod.Mode

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
    val __obj = js.Dynamic.literal(mime = mime, mode = mode)
    if (ext != null) __obj.updateDynamic("ext")(ext)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ISpec]
  }
}

