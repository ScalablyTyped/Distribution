package typings.hlsParser.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format extends js.Object {
  
  var format: js.UndefOr[String] = js.native
  
  var formatVersion: js.UndefOr[String] = js.native
  
  var iv: js.UndefOr[Buffer] = js.native
  
  var method: String = js.native
  
  var uri: js.UndefOr[String] = js.native
}
object Format {
  
  @scala.inline
  def apply(method: String): Format = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
    
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
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatVersion(value: String): Self = this.set("formatVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatVersion: Self = this.set("formatVersion", js.undefined)
    
    @scala.inline
    def setIv(value: Buffer): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
}
