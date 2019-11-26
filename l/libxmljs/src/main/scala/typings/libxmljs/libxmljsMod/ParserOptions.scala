package typings.libxmljs.libxmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:strict-export-declare-modifiers
trait ParserOptions extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var basefix: js.UndefOr[Boolean] = js.undefined
  var big_lines: js.UndefOr[Boolean] = js.undefined
  var blanks: js.UndefOr[Boolean] = js.undefined
  var cdata: js.UndefOr[Boolean] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var dict: js.UndefOr[Boolean] = js.undefined
  var doctype: js.UndefOr[Boolean] = js.undefined
  var dtdattr: js.UndefOr[js.Any] = js.undefined
  var dtdload: js.UndefOr[Boolean] = js.undefined
  var dtdvalid: js.UndefOr[Boolean] = js.undefined
  var errors: js.UndefOr[Boolean] = js.undefined
  var huge: js.UndefOr[Boolean] = js.undefined
  var ignore_enc: js.UndefOr[Boolean] = js.undefined
  var implied: js.UndefOr[Boolean] = js.undefined
  var net: js.UndefOr[Boolean] = js.undefined
  var nobasefix: js.UndefOr[Boolean] = js.undefined
  var noblanks: js.UndefOr[Boolean] = js.undefined
  var nocdata: js.UndefOr[Boolean] = js.undefined
  var nodict: js.UndefOr[Boolean] = js.undefined
  var noent: js.UndefOr[Boolean] = js.undefined
  var noerror: js.UndefOr[Boolean] = js.undefined
  var nonet: js.UndefOr[Boolean] = js.undefined
  var nowarning: js.UndefOr[Boolean] = js.undefined
  var noxincnode: js.UndefOr[Boolean] = js.undefined
  var nsclean: js.UndefOr[Boolean] = js.undefined
  var old: js.UndefOr[Boolean] = js.undefined
  var oldsax: js.UndefOr[Boolean] = js.undefined
  var pedantic: js.UndefOr[Boolean] = js.undefined
  var recover: js.UndefOr[Boolean] = js.undefined
  var sax1: js.UndefOr[Boolean] = js.undefined
  var warnings: js.UndefOr[Boolean] = js.undefined
  var xinclude: js.UndefOr[Boolean] = js.undefined
}

object ParserOptions {
  @scala.inline
  def apply(
    baseUrl: String = null,
    basefix: js.UndefOr[Boolean] = js.undefined,
    big_lines: js.UndefOr[Boolean] = js.undefined,
    blanks: js.UndefOr[Boolean] = js.undefined,
    cdata: js.UndefOr[Boolean] = js.undefined,
    compact: js.UndefOr[Boolean] = js.undefined,
    dict: js.UndefOr[Boolean] = js.undefined,
    doctype: js.UndefOr[Boolean] = js.undefined,
    dtdattr: js.Any = null,
    dtdload: js.UndefOr[Boolean] = js.undefined,
    dtdvalid: js.UndefOr[Boolean] = js.undefined,
    errors: js.UndefOr[Boolean] = js.undefined,
    huge: js.UndefOr[Boolean] = js.undefined,
    ignore_enc: js.UndefOr[Boolean] = js.undefined,
    implied: js.UndefOr[Boolean] = js.undefined,
    net: js.UndefOr[Boolean] = js.undefined,
    nobasefix: js.UndefOr[Boolean] = js.undefined,
    noblanks: js.UndefOr[Boolean] = js.undefined,
    nocdata: js.UndefOr[Boolean] = js.undefined,
    nodict: js.UndefOr[Boolean] = js.undefined,
    noent: js.UndefOr[Boolean] = js.undefined,
    noerror: js.UndefOr[Boolean] = js.undefined,
    nonet: js.UndefOr[Boolean] = js.undefined,
    nowarning: js.UndefOr[Boolean] = js.undefined,
    noxincnode: js.UndefOr[Boolean] = js.undefined,
    nsclean: js.UndefOr[Boolean] = js.undefined,
    old: js.UndefOr[Boolean] = js.undefined,
    oldsax: js.UndefOr[Boolean] = js.undefined,
    pedantic: js.UndefOr[Boolean] = js.undefined,
    recover: js.UndefOr[Boolean] = js.undefined,
    sax1: js.UndefOr[Boolean] = js.undefined,
    warnings: js.UndefOr[Boolean] = js.undefined,
    xinclude: js.UndefOr[Boolean] = js.undefined
  ): ParserOptions = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(basefix)) __obj.updateDynamic("basefix")(basefix.asInstanceOf[js.Any])
    if (!js.isUndefined(big_lines)) __obj.updateDynamic("big_lines")(big_lines.asInstanceOf[js.Any])
    if (!js.isUndefined(blanks)) __obj.updateDynamic("blanks")(blanks.asInstanceOf[js.Any])
    if (!js.isUndefined(cdata)) __obj.updateDynamic("cdata")(cdata.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(dict)) __obj.updateDynamic("dict")(dict.asInstanceOf[js.Any])
    if (!js.isUndefined(doctype)) __obj.updateDynamic("doctype")(doctype.asInstanceOf[js.Any])
    if (dtdattr != null) __obj.updateDynamic("dtdattr")(dtdattr.asInstanceOf[js.Any])
    if (!js.isUndefined(dtdload)) __obj.updateDynamic("dtdload")(dtdload.asInstanceOf[js.Any])
    if (!js.isUndefined(dtdvalid)) __obj.updateDynamic("dtdvalid")(dtdvalid.asInstanceOf[js.Any])
    if (!js.isUndefined(errors)) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    if (!js.isUndefined(huge)) __obj.updateDynamic("huge")(huge.asInstanceOf[js.Any])
    if (!js.isUndefined(ignore_enc)) __obj.updateDynamic("ignore_enc")(ignore_enc.asInstanceOf[js.Any])
    if (!js.isUndefined(implied)) __obj.updateDynamic("implied")(implied.asInstanceOf[js.Any])
    if (!js.isUndefined(net)) __obj.updateDynamic("net")(net.asInstanceOf[js.Any])
    if (!js.isUndefined(nobasefix)) __obj.updateDynamic("nobasefix")(nobasefix.asInstanceOf[js.Any])
    if (!js.isUndefined(noblanks)) __obj.updateDynamic("noblanks")(noblanks.asInstanceOf[js.Any])
    if (!js.isUndefined(nocdata)) __obj.updateDynamic("nocdata")(nocdata.asInstanceOf[js.Any])
    if (!js.isUndefined(nodict)) __obj.updateDynamic("nodict")(nodict.asInstanceOf[js.Any])
    if (!js.isUndefined(noent)) __obj.updateDynamic("noent")(noent.asInstanceOf[js.Any])
    if (!js.isUndefined(noerror)) __obj.updateDynamic("noerror")(noerror.asInstanceOf[js.Any])
    if (!js.isUndefined(nonet)) __obj.updateDynamic("nonet")(nonet.asInstanceOf[js.Any])
    if (!js.isUndefined(nowarning)) __obj.updateDynamic("nowarning")(nowarning.asInstanceOf[js.Any])
    if (!js.isUndefined(noxincnode)) __obj.updateDynamic("noxincnode")(noxincnode.asInstanceOf[js.Any])
    if (!js.isUndefined(nsclean)) __obj.updateDynamic("nsclean")(nsclean.asInstanceOf[js.Any])
    if (!js.isUndefined(old)) __obj.updateDynamic("old")(old.asInstanceOf[js.Any])
    if (!js.isUndefined(oldsax)) __obj.updateDynamic("oldsax")(oldsax.asInstanceOf[js.Any])
    if (!js.isUndefined(pedantic)) __obj.updateDynamic("pedantic")(pedantic.asInstanceOf[js.Any])
    if (!js.isUndefined(recover)) __obj.updateDynamic("recover")(recover.asInstanceOf[js.Any])
    if (!js.isUndefined(sax1)) __obj.updateDynamic("sax1")(sax1.asInstanceOf[js.Any])
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    if (!js.isUndefined(xinclude)) __obj.updateDynamic("xinclude")(xinclude.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParserOptions]
  }
}

