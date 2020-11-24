package typings.jsonld.mod.Options

import typings.jsonld.jsonldStrings.URDNA2015
import typings.jsonld.jsonldStrings.URGNA2012
import typings.jsonld.mod.MimeNQuad
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Normalize extends Common {
  
  var algorithm: js.UndefOr[URDNA2015 | URGNA2012] = js.native
  
  var expansion: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[MimeNQuad] = js.native
  
  var inputFormat: js.UndefOr[MimeNQuad] = js.native
  
  var skipExpansion: js.UndefOr[Boolean] = js.native
  
  var useNative: js.UndefOr[Boolean] = js.native
}
object Normalize {
  
  @scala.inline
  def apply(): Normalize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Normalize]
  }
  
  @scala.inline
  implicit class NormalizeOps[Self <: Normalize] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: URDNA2015 | URGNA2012): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setExpansion(value: Boolean): Self = this.set("expansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpansion: Self = this.set("expansion", js.undefined)
    
    @scala.inline
    def setFormat(value: MimeNQuad): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setInputFormat(value: MimeNQuad): Self = this.set("inputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputFormat: Self = this.set("inputFormat", js.undefined)
    
    @scala.inline
    def setSkipExpansion(value: Boolean): Self = this.set("skipExpansion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipExpansion: Self = this.set("skipExpansion", js.undefined)
    
    @scala.inline
    def setUseNative(value: Boolean): Self = this.set("useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNative: Self = this.set("useNative", js.undefined)
  }
}
