package typings.html5ToPdf.mod

import typings.html5ToPdf.html5ToPdfStrings.A3
import typings.html5ToPdf.html5ToPdfStrings.A4
import typings.html5ToPdf.html5ToPdfStrings.Legal
import typings.html5ToPdf.html5ToPdfStrings.Tabloid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegacyOptions extends js.Object {
  
  /**
    * [COMPATIBLE]\
    * True for landscape, false for portrait.
    */
  var landscape: js.UndefOr[Boolean] = js.native
  
  /**
    * [NOT COMPATIBLE]\
    * 0 - default\
    * 1 - none\
    * 2 - minimum
    */
  var marginsType: js.UndefOr[Double] = js.native
  
  /**
    * [COMPATIBLE]\
    * Page size
    */
  var pageSize: js.UndefOr[A3 | A4 | Legal | Tabloid] = js.native
  
  /**
    * [COMPATIBLE]\
    * Whether to print CSS backgrounds.
    */
  var printBackground: js.UndefOr[Boolean] = js.native
}
object LegacyOptions {
  
  @scala.inline
  def apply(): LegacyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyOptions]
  }
  
  @scala.inline
  implicit class LegacyOptionsOps[Self <: LegacyOptions] (val x: Self) extends AnyVal {
    
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
    def setLandscape(value: Boolean): Self = this.set("landscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandscape: Self = this.set("landscape", js.undefined)
    
    @scala.inline
    def setMarginsType(value: Double): Self = this.set("marginsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarginsType: Self = this.set("marginsType", js.undefined)
    
    @scala.inline
    def setPageSize(value: A3 | A4 | Legal | Tabloid): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    
    @scala.inline
    def setPrintBackground(value: Boolean): Self = this.set("printBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintBackground: Self = this.set("printBackground", js.undefined)
  }
}
