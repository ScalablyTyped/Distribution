package typings.htmlEncodingSniffer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The ultimate fallback encoding used if no valid encoding is supplied
    * by the transport layer, and no encoding is sniffed from the bytes.
    *
    * @default
    * ```js
    * 'windows-1252'
    * ```
    *
    * Which is recommended by the algorithm's table of suggested
    * defaults for "All other locales" (including the `en` locale).
    */
  var defaultEncoding: js.UndefOr[String] = js.native
  
  /**
    * An encoding label that is obtained from the "transport layer"
    * (probably an HTTP `Content-Type` header), which overrides
    * everything but a BOM.
    */
  var transportLayerEncodingLabel: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDefaultEncoding(value: String): Self = this.set("defaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultEncoding: Self = this.set("defaultEncoding", js.undefined)
    
    @scala.inline
    def setTransportLayerEncodingLabel(value: String): Self = this.set("transportLayerEncodingLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransportLayerEncodingLabel: Self = this.set("transportLayerEncodingLabel", js.undefined)
  }
}
