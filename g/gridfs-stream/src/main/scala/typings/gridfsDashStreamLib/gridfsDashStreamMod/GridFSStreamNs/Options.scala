package typings
package gridfsDashStreamLib.gridfsDashStreamMod.GridFSStreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var _id: js.UndefOr[java.lang.String] = js.undefined
  // any other options from the GridStore may be passed too, e.g.
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  var content_type: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[js.Any] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var range: js.UndefOr[Range] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    _id: java.lang.String = null,
    chunkSize: scala.Int | scala.Double = null,
    content_type: java.lang.String = null,
    filename: java.lang.String = null,
    metadata: js.Any = null,
    mode: java.lang.String = null,
    range: Range = null,
    root: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (content_type != null) __obj.updateDynamic("content_type")(content_type)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (range != null) __obj.updateDynamic("range")(range)
    if (root != null) __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[Options]
  }
}

