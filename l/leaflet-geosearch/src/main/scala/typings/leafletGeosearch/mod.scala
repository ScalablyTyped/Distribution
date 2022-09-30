package typings.leafletGeosearch

import typings.leaflet.mod.Control_
import typings.leafletGeosearch.algoliaProviderMod.default
import typings.leafletGeosearch.geoApiFrProviderMod.GeoApiFrProviderOptions
import typings.leafletGeosearch.mapBoxProviderMod.MapBoxProviderOptions
import typings.leafletGeosearch.openStreetMapProviderMod.OpenStreetMapProviderOptions
import typings.leafletGeosearch.peliasProviderMod.PeliasProviderOptions
import typings.leafletGeosearch.providerMod.ProviderOptions
import typings.leafletGeosearch.searchControlMod.SearchControl
import typings.leafletGeosearch.searchElementMod.SearchElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("leaflet-geosearch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("leaflet-geosearch", "AlgoliaProvider")
  @js.native
  open class AlgoliaProvider () extends default
  
  @JSImport("leaflet-geosearch", "BingProvider")
  @js.native
  open class BingProvider ()
    extends typings.leafletGeosearch.bingProviderMod.default
  
  @JSImport("leaflet-geosearch", "EsriProvider")
  @js.native
  open class EsriProvider ()
    extends typings.leafletGeosearch.esriProviderMod.default
  
  @JSImport("leaflet-geosearch", "GeoApiFrProvider")
  @js.native
  open class GeoApiFrProvider ()
    extends typings.leafletGeosearch.geoApiFrProviderMod.default {
    def this(options: GeoApiFrProviderOptions) = this()
  }
  
  inline def GeoSearchControl(options: Any*): SearchControl & Control_ = ^.asInstanceOf[js.Dynamic].applyDynamic("GeoSearchControl")(options.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SearchControl & Control_]
  
  @JSImport("leaflet-geosearch", "GeocodeEarthProvider")
  @js.native
  open class GeocodeEarthProvider ()
    extends typings.leafletGeosearch.geocodeEarthProviderMod.default {
    def this(options: PeliasProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "GoogleProvider")
  @js.native
  open class GoogleProvider ()
    extends typings.leafletGeosearch.googleProviderMod.default
  
  @JSImport("leaflet-geosearch", "HereProvider")
  @js.native
  open class HereProvider ()
    extends typings.leafletGeosearch.hereProviderMod.default
  
  @JSImport("leaflet-geosearch", "JsonProvider")
  @js.native
  abstract class JsonProvider[TRequestResult, TRawResult] ()
    extends typings.leafletGeosearch.providerMod.default[TRequestResult, TRawResult] {
    def this(options: ProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "LocationIQProvider")
  @js.native
  open class LocationIQProvider protected ()
    extends typings.leafletGeosearch.locationIQProviderMod.default {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "MapBoxProvider")
  @js.native
  open class MapBoxProvider ()
    extends typings.leafletGeosearch.mapBoxProviderMod.default {
    def this(options: MapBoxProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "OpenCageProvider")
  @js.native
  open class OpenCageProvider ()
    extends typings.leafletGeosearch.openCageProviderMod.default
  
  @JSImport("leaflet-geosearch", "OpenStreetMapProvider")
  @js.native
  open class OpenStreetMapProvider ()
    extends typings.leafletGeosearch.openStreetMapProviderMod.default {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "PeliasProvider")
  @js.native
  open class PeliasProvider ()
    extends typings.leafletGeosearch.peliasProviderMod.default {
    def this(options: PeliasProviderOptions) = this()
  }
  
  inline def SearchControl(options: Any*): typings.leafletGeosearch.searchControlMod.SearchControl & Control_ = ^.asInstanceOf[js.Dynamic].applyDynamic("SearchControl")(options.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.leafletGeosearch.searchControlMod.SearchControl & Control_]
  
  @JSImport("leaflet-geosearch", "SearchElement")
  @js.native
  open class SearchElement protected ()
    extends typings.leafletGeosearch.searchElementMod.default {
    def this(hasHandleSubmitSearchLabelClassNames: SearchElementProps) = this()
  }
}
