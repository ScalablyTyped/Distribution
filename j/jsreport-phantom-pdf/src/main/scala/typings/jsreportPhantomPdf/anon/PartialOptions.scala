package typings.jsreportPhantomPdf.anon

import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`dedicated-process`
import typings.jsreportPhantomPdf.jsreportPhantomPdfStrings.`phantom-server`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<jsreport-phantom-pdf.jsreport-phantom-pdf.Options> */
@js.native
trait PartialOptions extends js.Object {
  
  var allowLocalFilesAccess: js.UndefOr[Boolean] = js.native
  
  var defaultPhantomjsVersion: js.UndefOr[String] = js.native
  
  var strategy: js.UndefOr[`dedicated-process` | `phantom-server`] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
}
object PartialOptions {
  
  @scala.inline
  def apply(): PartialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOptions]
  }
  
  @scala.inline
  implicit class PartialOptionsOps[Self <: PartialOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowLocalFilesAccess(value: Boolean): Self = this.set("allowLocalFilesAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowLocalFilesAccess: Self = this.set("allowLocalFilesAccess", js.undefined)
    
    @scala.inline
    def setDefaultPhantomjsVersion(value: String): Self = this.set("defaultPhantomjsVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPhantomjsVersion: Self = this.set("defaultPhantomjsVersion", js.undefined)
    
    @scala.inline
    def setStrategy(value: `dedicated-process` | `phantom-server`): Self = this.set("strategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
