package typings.leafletProviders

import org.scalablytyped.runtime.StringDictionary
import typings.leaflet.mod.TileLayerOptions
import typings.leafletProviders.mod.TileLayer_.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object TileLayer_ {
    
    @JSImport("leaflet", "TileLayer.Provider")
    @js.native
    open class Provider protected ()
      extends typings.leaflet.mod.TileLayer_ {
      def this(provider: String) = this()
      def this(provider: String, options: StringDictionary[String]) = this()
      def this(provider: String, options: TileLayerOptions) = this()
    }
    object Provider {
      
      @JSImport("leaflet", "TileLayer.Provider.providers")
      @js.native
      val providers: ProvidersMap = js.native
      
      trait ProviderConfig extends StObject {
        
        var options: js.UndefOr[TileLayerOptions] = js.undefined
        
        var url: String
        
        var variants: js.UndefOr[StringDictionary[String | ProviderConfig]] = js.undefined
      }
      object ProviderConfig {
        
        inline def apply(url: String): ProviderConfig = {
          val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
          __obj.asInstanceOf[ProviderConfig]
        }
        
        extension [Self <: ProviderConfig](x: Self) {
          
          inline def setOptions(value: TileLayerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
          
          inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
          
          inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
          
          inline def setVariants(value: StringDictionary[String | ProviderConfig]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
          
          inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
        }
      }
      
      type ProvidersMap = StringDictionary[ProviderConfig]
    }
  }
  
  object tileLayer {
    
    @JSImport("leaflet", "tileLayer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def provider(provider: String): Provider = ^.asInstanceOf[js.Dynamic].applyDynamic("provider")(provider.asInstanceOf[js.Any]).asInstanceOf[Provider]
    inline def provider(provider: String, options: StringDictionary[String]): Provider = (^.asInstanceOf[js.Dynamic].applyDynamic("provider")(provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Provider]
    inline def provider(provider: String, options: TileLayerOptions): Provider = (^.asInstanceOf[js.Dynamic].applyDynamic("provider")(provider.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Provider]
  }
}
