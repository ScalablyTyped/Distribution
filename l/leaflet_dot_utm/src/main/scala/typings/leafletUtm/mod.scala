package typings.leafletUtm

import typings.leafletUtm.anon.Band
import typings.leafletUtm.mod.Utm_.ToStringOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @JSImport("leaflet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet", "Utm")
  @js.native
  /* private */ open class Utm_ () extends StObject {
    
    var band: String = js.native
    
    def equals(other: Utm_): Boolean = js.native
    
    def latLng(): LatLng = js.native
    def latLng(noException: Boolean): LatLng = js.native
    
    def normalize(): LatLng = js.native
    
    var southHemi: Boolean = js.native
    
    def toString(options: ToStringOptions): String = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var zone: Double = js.native
  }
  object Utm_ {
    
    @JSImport("leaflet", "Utm")
    @js.native
    val ^ : js.Any = js.native
    
    inline def setDefaultOptions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultOptions")().asInstanceOf[Unit]
    inline def setDefaultOptions(
      params: js.Function2[/* opts */ ToStringOptions, /* defaultOpts */ ToStringOptions, ToStringOptions]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultOptions")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setDefaultOptions(params: ToStringOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultOptions")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    trait ToStringOptions extends StObject {
      
      /** Number of decimals for x and y. Default 1. */
      var decimals: js.UndefOr[Double] = js.undefined
      
      /**
        * String defining the format to use.
        * Default `{x}{sep} {y}{sep} {zone}{band}{sep} {datum}`, where:
        * `{x}: easting`
        * `{y}: northing`
        * `{zone}: UTM zone, value between 1 and 60`
        * `{band}: Band letter, between C and X`
        * `{datum}: WGS84`
        * `{hemi}: Hemisphere, north or south`
        * `{sep}: separator`
        */
      var format: js.UndefOr[String] = js.undefined
      
      /** String used in the format for field {hemi} in the north hemisphere. Default 'North'. */
      var north: js.UndefOr[String] = js.undefined
      
      /** Separator used in the format. Default ','. */
      var sep: js.UndefOr[String] = js.undefined
      
      /** String used in the format for field {hemi} in the south hemisphere. Default 'South'. */
      var south: js.UndefOr[String] = js.undefined
    }
    object ToStringOptions {
      
      inline def apply(): ToStringOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ToStringOptions]
      }
      
      extension [Self <: ToStringOptions](x: Self) {
        
        inline def setDecimals(value: Double): Self = StObject.set(x, "decimals", value.asInstanceOf[js.Any])
        
        inline def setDecimalsUndefined: Self = StObject.set(x, "decimals", js.undefined)
        
        inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
        
        inline def setNorth(value: String): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
        
        inline def setNorthUndefined: Self = StObject.set(x, "north", js.undefined)
        
        inline def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
        
        inline def setSepUndefined: Self = StObject.set(x, "sep", js.undefined)
        
        inline def setSouth(value: String): Self = StObject.set(x, "south", value.asInstanceOf[js.Any])
        
        inline def setSouthUndefined: Self = StObject.set(x, "south", js.undefined)
      }
    }
  }
  
  inline def utm(params: Band): Utm_ = ^.asInstanceOf[js.Dynamic].applyDynamic("utm")(params.asInstanceOf[js.Any]).asInstanceOf[Utm_]
  
  @js.native
  trait LatLng extends StObject {
    
    def utm(): Utm_ = js.native
    def utm(zone: Double): Utm_ = js.native
    def utm(zone: Double, southHemi: Boolean): Utm_ = js.native
    def utm(zone: Unit, southHemi: Boolean): Utm_ = js.native
  }
}
