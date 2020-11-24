package typings.leafletProviders.mod.TileLayer_.Provider

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.TileLayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProviderConfig extends js.Object {
  
  var options: js.UndefOr[TileLayerOptions] = js.native
  
  var url: String = js.native
  
  var variants: js.UndefOr[StringDictionary[String | ProviderConfig]] = js.native
}
object ProviderConfig {
  
  @scala.inline
  def apply(url: String): ProviderConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderConfig]
  }
  
  @scala.inline
  implicit class ProviderConfigOps[Self <: ProviderConfig] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: TileLayerOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setVariants(value: StringDictionary[String | ProviderConfig]): Self = this.set("variants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
  }
}
