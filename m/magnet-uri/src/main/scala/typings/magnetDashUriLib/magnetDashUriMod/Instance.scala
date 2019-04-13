package typings
package magnetDashUriLib.magnetDashUriMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance
  extends stdLib.Object {
  var announce: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var as: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var dn: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var infoHash: js.UndefOr[java.lang.String] = js.undefined
  var infoHashBuffer: js.UndefOr[nodeLib.Buffer] = js.undefined
  var ix: js.UndefOr[scala.Double | js.Array[scala.Double]] = js.undefined
  var keywords: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var kt: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var tr: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var urlList: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ws: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var xs: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var xt: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    announce: js.Array[java.lang.String] = null,
    as: java.lang.String | js.Array[java.lang.String] = null,
    dn: java.lang.String | js.Array[java.lang.String] = null,
    infoHash: java.lang.String = null,
    infoHashBuffer: nodeLib.Buffer = null,
    ix: scala.Double | js.Array[scala.Double] = null,
    keywords: java.lang.String | js.Array[java.lang.String] = null,
    kt: js.Array[java.lang.String] = null,
    name: java.lang.String | js.Array[java.lang.String] = null,
    tr: java.lang.String | js.Array[java.lang.String] = null,
    urlList: js.Array[java.lang.String] = null,
    ws: java.lang.String | js.Array[java.lang.String] = null,
    xs: java.lang.String | js.Array[java.lang.String] = null,
    xt: java.lang.String | js.Array[java.lang.String] = null
  ): Instance = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (announce != null) __obj.updateDynamic("announce")(announce)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (dn != null) __obj.updateDynamic("dn")(dn.asInstanceOf[js.Any])
    if (infoHash != null) __obj.updateDynamic("infoHash")(infoHash)
    if (infoHashBuffer != null) __obj.updateDynamic("infoHashBuffer")(infoHashBuffer)
    if (ix != null) __obj.updateDynamic("ix")(ix.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (kt != null) __obj.updateDynamic("kt")(kt)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    if (urlList != null) __obj.updateDynamic("urlList")(urlList)
    if (ws != null) __obj.updateDynamic("ws")(ws.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (xt != null) __obj.updateDynamic("xt")(xt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

