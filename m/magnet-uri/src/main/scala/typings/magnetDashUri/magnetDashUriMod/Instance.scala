package typings.magnetDashUri.magnetDashUriMod

import typings.node.Buffer
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Instance extends Object {
  var announce: js.UndefOr[js.Array[String]] = js.undefined
  var as: js.UndefOr[String | js.Array[String]] = js.undefined
  var dn: js.UndefOr[String | js.Array[String]] = js.undefined
  var infoHash: js.UndefOr[String] = js.undefined
  var infoHashBuffer: js.UndefOr[Buffer] = js.undefined
  var ix: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var keywords: js.UndefOr[String | js.Array[String]] = js.undefined
  var kt: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String | js.Array[String]] = js.undefined
  var tr: js.UndefOr[String | js.Array[String]] = js.undefined
  var urlList: js.UndefOr[js.Array[String]] = js.undefined
  var ws: js.UndefOr[String | js.Array[String]] = js.undefined
  var xs: js.UndefOr[String | js.Array[String]] = js.undefined
  var xt: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Instance {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    announce: js.Array[String] = null,
    as: String | js.Array[String] = null,
    dn: String | js.Array[String] = null,
    infoHash: String = null,
    infoHashBuffer: Buffer = null,
    ix: Double | js.Array[Double] = null,
    keywords: String | js.Array[String] = null,
    kt: js.Array[String] = null,
    name: String | js.Array[String] = null,
    tr: String | js.Array[String] = null,
    urlList: js.Array[String] = null,
    ws: String | js.Array[String] = null,
    xs: String | js.Array[String] = null,
    xt: String | js.Array[String] = null
  ): Instance = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (announce != null) __obj.updateDynamic("announce")(announce.asInstanceOf[js.Any])
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (dn != null) __obj.updateDynamic("dn")(dn.asInstanceOf[js.Any])
    if (infoHash != null) __obj.updateDynamic("infoHash")(infoHash.asInstanceOf[js.Any])
    if (infoHashBuffer != null) __obj.updateDynamic("infoHashBuffer")(infoHashBuffer.asInstanceOf[js.Any])
    if (ix != null) __obj.updateDynamic("ix")(ix.asInstanceOf[js.Any])
    if (keywords != null) __obj.updateDynamic("keywords")(keywords.asInstanceOf[js.Any])
    if (kt != null) __obj.updateDynamic("kt")(kt.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tr != null) __obj.updateDynamic("tr")(tr.asInstanceOf[js.Any])
    if (urlList != null) __obj.updateDynamic("urlList")(urlList.asInstanceOf[js.Any])
    if (ws != null) __obj.updateDynamic("ws")(ws.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    if (xt != null) __obj.updateDynamic("xt")(xt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
}

