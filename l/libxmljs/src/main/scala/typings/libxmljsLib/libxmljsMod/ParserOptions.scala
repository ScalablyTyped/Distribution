package typings
package libxmljsLib.libxmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:strict-export-declare-modifiers
trait ParserOptions extends js.Object {
  var basefix: js.UndefOr[scala.Boolean] = js.undefined
  var big_lines: js.UndefOr[scala.Boolean] = js.undefined
  var blanks: js.UndefOr[scala.Boolean] = js.undefined
  var cdata: js.UndefOr[scala.Boolean] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var dict: js.UndefOr[scala.Boolean] = js.undefined
  var doctype: js.UndefOr[scala.Boolean] = js.undefined
  var dtdattr: js.UndefOr[js.Any] = js.undefined
  var dtdload: js.UndefOr[scala.Boolean] = js.undefined
  var dtdvalid: js.UndefOr[scala.Boolean] = js.undefined
  var errors: js.UndefOr[scala.Boolean] = js.undefined
  var huge: js.UndefOr[scala.Boolean] = js.undefined
  var ignore_enc: js.UndefOr[scala.Boolean] = js.undefined
  var implied: js.UndefOr[scala.Boolean] = js.undefined
  var net: js.UndefOr[scala.Boolean] = js.undefined
  var nobasefix: js.UndefOr[scala.Boolean] = js.undefined
  var noblanks: js.UndefOr[scala.Boolean] = js.undefined
  var nocdata: js.UndefOr[scala.Boolean] = js.undefined
  var nodict: js.UndefOr[scala.Boolean] = js.undefined
  var noent: js.UndefOr[scala.Boolean] = js.undefined
  var noerror: js.UndefOr[scala.Boolean] = js.undefined
  var nonet: js.UndefOr[scala.Boolean] = js.undefined
  var nowarning: js.UndefOr[scala.Boolean] = js.undefined
  var noxincnode: js.UndefOr[scala.Boolean] = js.undefined
  var nsclean: js.UndefOr[scala.Boolean] = js.undefined
  var old: js.UndefOr[scala.Boolean] = js.undefined
  var oldsax: js.UndefOr[scala.Boolean] = js.undefined
  var pedantic: js.UndefOr[scala.Boolean] = js.undefined
  var recover: js.UndefOr[scala.Boolean] = js.undefined
  var sax1: js.UndefOr[scala.Boolean] = js.undefined
  var warnings: js.UndefOr[scala.Boolean] = js.undefined
  var xinclude: js.UndefOr[scala.Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    basefix: js.UndefOr[scala.Boolean] = js.undefined,
    big_lines: js.UndefOr[scala.Boolean] = js.undefined,
    blanks: js.UndefOr[scala.Boolean] = js.undefined,
    cdata: js.UndefOr[scala.Boolean] = js.undefined,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    dict: js.UndefOr[scala.Boolean] = js.undefined,
    doctype: js.UndefOr[scala.Boolean] = js.undefined,
    dtdattr: js.Any = null,
    dtdload: js.UndefOr[scala.Boolean] = js.undefined,
    dtdvalid: js.UndefOr[scala.Boolean] = js.undefined,
    errors: js.UndefOr[scala.Boolean] = js.undefined,
    huge: js.UndefOr[scala.Boolean] = js.undefined,
    ignore_enc: js.UndefOr[scala.Boolean] = js.undefined,
    implied: js.UndefOr[scala.Boolean] = js.undefined,
    net: js.UndefOr[scala.Boolean] = js.undefined,
    nobasefix: js.UndefOr[scala.Boolean] = js.undefined,
    noblanks: js.UndefOr[scala.Boolean] = js.undefined,
    nocdata: js.UndefOr[scala.Boolean] = js.undefined,
    nodict: js.UndefOr[scala.Boolean] = js.undefined,
    noent: js.UndefOr[scala.Boolean] = js.undefined,
    noerror: js.UndefOr[scala.Boolean] = js.undefined,
    nonet: js.UndefOr[scala.Boolean] = js.undefined,
    nowarning: js.UndefOr[scala.Boolean] = js.undefined,
    noxincnode: js.UndefOr[scala.Boolean] = js.undefined,
    nsclean: js.UndefOr[scala.Boolean] = js.undefined,
    old: js.UndefOr[scala.Boolean] = js.undefined,
    oldsax: js.UndefOr[scala.Boolean] = js.undefined,
    pedantic: js.UndefOr[scala.Boolean] = js.undefined,
    recover: js.UndefOr[scala.Boolean] = js.undefined,
    sax1: js.UndefOr[scala.Boolean] = js.undefined,
    warnings: js.UndefOr[scala.Boolean] = js.undefined,
    xinclude: js.UndefOr[scala.Boolean] = js.undefined
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basefix)) __obj.updateDynamic("basefix")(basefix)
    if (!js.isUndefined(big_lines)) __obj.updateDynamic("big_lines")(big_lines)
    if (!js.isUndefined(blanks)) __obj.updateDynamic("blanks")(blanks)
    if (!js.isUndefined(cdata)) __obj.updateDynamic("cdata")(cdata)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (!js.isUndefined(dict)) __obj.updateDynamic("dict")(dict)
    if (!js.isUndefined(doctype)) __obj.updateDynamic("doctype")(doctype)
    if (dtdattr != null) __obj.updateDynamic("dtdattr")(dtdattr)
    if (!js.isUndefined(dtdload)) __obj.updateDynamic("dtdload")(dtdload)
    if (!js.isUndefined(dtdvalid)) __obj.updateDynamic("dtdvalid")(dtdvalid)
    if (!js.isUndefined(errors)) __obj.updateDynamic("errors")(errors)
    if (!js.isUndefined(huge)) __obj.updateDynamic("huge")(huge)
    if (!js.isUndefined(ignore_enc)) __obj.updateDynamic("ignore_enc")(ignore_enc)
    if (!js.isUndefined(implied)) __obj.updateDynamic("implied")(implied)
    if (!js.isUndefined(net)) __obj.updateDynamic("net")(net)
    if (!js.isUndefined(nobasefix)) __obj.updateDynamic("nobasefix")(nobasefix)
    if (!js.isUndefined(noblanks)) __obj.updateDynamic("noblanks")(noblanks)
    if (!js.isUndefined(nocdata)) __obj.updateDynamic("nocdata")(nocdata)
    if (!js.isUndefined(nodict)) __obj.updateDynamic("nodict")(nodict)
    if (!js.isUndefined(noent)) __obj.updateDynamic("noent")(noent)
    if (!js.isUndefined(noerror)) __obj.updateDynamic("noerror")(noerror)
    if (!js.isUndefined(nonet)) __obj.updateDynamic("nonet")(nonet)
    if (!js.isUndefined(nowarning)) __obj.updateDynamic("nowarning")(nowarning)
    if (!js.isUndefined(noxincnode)) __obj.updateDynamic("noxincnode")(noxincnode)
    if (!js.isUndefined(nsclean)) __obj.updateDynamic("nsclean")(nsclean)
    if (!js.isUndefined(old)) __obj.updateDynamic("old")(old)
    if (!js.isUndefined(oldsax)) __obj.updateDynamic("oldsax")(oldsax)
    if (!js.isUndefined(pedantic)) __obj.updateDynamic("pedantic")(pedantic)
    if (!js.isUndefined(recover)) __obj.updateDynamic("recover")(recover)
    if (!js.isUndefined(sax1)) __obj.updateDynamic("sax1")(sax1)
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings)
    if (!js.isUndefined(xinclude)) __obj.updateDynamic("xinclude")(xinclude)
    __obj.asInstanceOf[ParserOptions]
  }
}

