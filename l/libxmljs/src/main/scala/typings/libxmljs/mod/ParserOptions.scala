package typings.libxmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:strict-export-declare-modifiers
@js.native
trait ParserOptions extends js.Object {
  var baseUrl: js.UndefOr[String] = js.native
  var basefix: js.UndefOr[Boolean] = js.native
  var big_lines: js.UndefOr[Boolean] = js.native
  var blanks: js.UndefOr[Boolean] = js.native
  var cdata: js.UndefOr[Boolean] = js.native
  var compact: js.UndefOr[Boolean] = js.native
  var dict: js.UndefOr[Boolean] = js.native
  var doctype: js.UndefOr[Boolean] = js.native
  var dtdattr: js.UndefOr[js.Any] = js.native
  var dtdload: js.UndefOr[Boolean] = js.native
  var dtdvalid: js.UndefOr[Boolean] = js.native
  var errors: js.UndefOr[Boolean] = js.native
  var huge: js.UndefOr[Boolean] = js.native
  var ignore_enc: js.UndefOr[Boolean] = js.native
  var implied: js.UndefOr[Boolean] = js.native
  var net: js.UndefOr[Boolean] = js.native
  var nobasefix: js.UndefOr[Boolean] = js.native
  var noblanks: js.UndefOr[Boolean] = js.native
  var nocdata: js.UndefOr[Boolean] = js.native
  var nodict: js.UndefOr[Boolean] = js.native
  var noent: js.UndefOr[Boolean] = js.native
  var noerror: js.UndefOr[Boolean] = js.native
  var nonet: js.UndefOr[Boolean] = js.native
  var nowarning: js.UndefOr[Boolean] = js.native
  var noxincnode: js.UndefOr[Boolean] = js.native
  var nsclean: js.UndefOr[Boolean] = js.native
  var old: js.UndefOr[Boolean] = js.native
  var oldsax: js.UndefOr[Boolean] = js.native
  var pedantic: js.UndefOr[Boolean] = js.native
  var recover: js.UndefOr[Boolean] = js.native
  var sax1: js.UndefOr[Boolean] = js.native
  var warnings: js.UndefOr[Boolean] = js.native
  var xinclude: js.UndefOr[Boolean] = js.native
}

object ParserOptions {
  @scala.inline
  def apply(): ParserOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParserOptions]
  }
  @scala.inline
  implicit class ParserOptionsOps[Self <: ParserOptions] (val x: Self) extends AnyVal {
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseUrl: Self = this.set("baseUrl", js.undefined)
    @scala.inline
    def setBasefix(value: Boolean): Self = this.set("basefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasefix: Self = this.set("basefix", js.undefined)
    @scala.inline
    def setBig_lines(value: Boolean): Self = this.set("big_lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBig_lines: Self = this.set("big_lines", js.undefined)
    @scala.inline
    def setBlanks(value: Boolean): Self = this.set("blanks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlanks: Self = this.set("blanks", js.undefined)
    @scala.inline
    def setCdata(value: Boolean): Self = this.set("cdata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdata: Self = this.set("cdata", js.undefined)
    @scala.inline
    def setCompact(value: Boolean): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setDict(value: Boolean): Self = this.set("dict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDict: Self = this.set("dict", js.undefined)
    @scala.inline
    def setDoctype(value: Boolean): Self = this.set("doctype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoctype: Self = this.set("doctype", js.undefined)
    @scala.inline
    def setDtdattr(value: js.Any): Self = this.set("dtdattr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtdattr: Self = this.set("dtdattr", js.undefined)
    @scala.inline
    def setDtdload(value: Boolean): Self = this.set("dtdload", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtdload: Self = this.set("dtdload", js.undefined)
    @scala.inline
    def setDtdvalid(value: Boolean): Self = this.set("dtdvalid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtdvalid: Self = this.set("dtdvalid", js.undefined)
    @scala.inline
    def setErrors(value: Boolean): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
    @scala.inline
    def setHuge(value: Boolean): Self = this.set("huge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHuge: Self = this.set("huge", js.undefined)
    @scala.inline
    def setIgnore_enc(value: Boolean): Self = this.set("ignore_enc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore_enc: Self = this.set("ignore_enc", js.undefined)
    @scala.inline
    def setImplied(value: Boolean): Self = this.set("implied", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplied: Self = this.set("implied", js.undefined)
    @scala.inline
    def setNet(value: Boolean): Self = this.set("net", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNet: Self = this.set("net", js.undefined)
    @scala.inline
    def setNobasefix(value: Boolean): Self = this.set("nobasefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNobasefix: Self = this.set("nobasefix", js.undefined)
    @scala.inline
    def setNoblanks(value: Boolean): Self = this.set("noblanks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoblanks: Self = this.set("noblanks", js.undefined)
    @scala.inline
    def setNocdata(value: Boolean): Self = this.set("nocdata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNocdata: Self = this.set("nocdata", js.undefined)
    @scala.inline
    def setNodict(value: Boolean): Self = this.set("nodict", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodict: Self = this.set("nodict", js.undefined)
    @scala.inline
    def setNoent(value: Boolean): Self = this.set("noent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoent: Self = this.set("noent", js.undefined)
    @scala.inline
    def setNoerror(value: Boolean): Self = this.set("noerror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoerror: Self = this.set("noerror", js.undefined)
    @scala.inline
    def setNonet(value: Boolean): Self = this.set("nonet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonet: Self = this.set("nonet", js.undefined)
    @scala.inline
    def setNowarning(value: Boolean): Self = this.set("nowarning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNowarning: Self = this.set("nowarning", js.undefined)
    @scala.inline
    def setNoxincnode(value: Boolean): Self = this.set("noxincnode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoxincnode: Self = this.set("noxincnode", js.undefined)
    @scala.inline
    def setNsclean(value: Boolean): Self = this.set("nsclean", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNsclean: Self = this.set("nsclean", js.undefined)
    @scala.inline
    def setOld(value: Boolean): Self = this.set("old", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOld: Self = this.set("old", js.undefined)
    @scala.inline
    def setOldsax(value: Boolean): Self = this.set("oldsax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldsax: Self = this.set("oldsax", js.undefined)
    @scala.inline
    def setPedantic(value: Boolean): Self = this.set("pedantic", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePedantic: Self = this.set("pedantic", js.undefined)
    @scala.inline
    def setRecover(value: Boolean): Self = this.set("recover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecover: Self = this.set("recover", js.undefined)
    @scala.inline
    def setSax1(value: Boolean): Self = this.set("sax1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSax1: Self = this.set("sax1", js.undefined)
    @scala.inline
    def setWarnings(value: Boolean): Self = this.set("warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
    @scala.inline
    def setXinclude(value: Boolean): Self = this.set("xinclude", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXinclude: Self = this.set("xinclude", js.undefined)
  }
  
}

