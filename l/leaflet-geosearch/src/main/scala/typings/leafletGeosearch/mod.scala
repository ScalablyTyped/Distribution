package typings.leafletGeosearch

import typings.leaflet.mod.Control_
import typings.leafletGeosearch.distProvidersAlgoliaProviderMod.default
import typings.leafletGeosearch.distProvidersGeoApiFrProviderMod.GeoApiFrProviderOptions
import typings.leafletGeosearch.distProvidersGoogleProviderMod.GoogleProviderOptions
import typings.leafletGeosearch.distProvidersMapBoxProviderMod.MapBoxProviderOptions
import typings.leafletGeosearch.distProvidersOpenStreetMapProviderMod.OpenStreetMapProviderOptions
import typings.leafletGeosearch.distProvidersPeliasProviderMod.PeliasProviderOptions
import typings.leafletGeosearch.distProvidersProviderMod.ProviderOptions
import typings.leafletGeosearch.distSearchControlMod.SearchControl
import typings.leafletGeosearch.distSearchElementMod.SearchElementProps
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
    extends typings.leafletGeosearch.distProvidersBingProviderMod.default
  
  @JSImport("leaflet-geosearch", "EsriProvider")
  @js.native
  open class EsriProvider ()
    extends typings.leafletGeosearch.distProvidersEsriProviderMod.default
  
  @JSImport("leaflet-geosearch", "GeoApiFrProvider")
  @js.native
  open class GeoApiFrProvider ()
    extends typings.leafletGeosearch.distProvidersGeoApiFrProviderMod.default {
    def this(options: GeoApiFrProviderOptions) = this()
  }
  
  inline def GeoSearchControl(options: Any*): SearchControl & Control_ = ^.asInstanceOf[js.Dynamic].applyDynamic("GeoSearchControl")(options.asInstanceOf[Seq[js.Any]]*).asInstanceOf[SearchControl & Control_]
  
  @JSImport("leaflet-geosearch", "GeocodeEarthProvider")
  @js.native
  open class GeocodeEarthProvider ()
    extends typings.leafletGeosearch.distProvidersGeocodeEarthProviderMod.default {
    def this(options: PeliasProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "GoogleProvider")
  @js.native
  open class GoogleProvider protected ()
    extends typings.leafletGeosearch.distProvidersGoogleProviderMod.default {
    def this(options: GoogleProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "HereProvider")
  @js.native
  open class HereProvider ()
    extends typings.leafletGeosearch.distProvidersHereProviderMod.default
  
  /* note: abstract class */ @JSImport("leaflet-geosearch", "JsonProvider")
  @js.native
  open class JsonProvider[TRequestResult, TRawResult] ()
    extends typings.leafletGeosearch.distProvidersProviderMod.default[TRequestResult, TRawResult] {
    def this(options: ProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "LegacyGoogleProvider")
  @js.native
  open class LegacyGoogleProvider ()
    extends typings.leafletGeosearch.distProvidersLegacyGoogleProviderMod.default
  
  @JSImport("leaflet-geosearch", "LocationIQProvider")
  @js.native
  open class LocationIQProvider protected ()
    extends typings.leafletGeosearch.distProvidersLocationIQProviderMod.default {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "MapBoxProvider")
  @js.native
  open class MapBoxProvider ()
    extends typings.leafletGeosearch.distProvidersMapBoxProviderMod.default {
    def this(options: MapBoxProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "OpenCageProvider")
  @js.native
  open class OpenCageProvider ()
    extends typings.leafletGeosearch.distProvidersOpenCageProviderMod.default
  
  @JSImport("leaflet-geosearch", "OpenStreetMapProvider")
  @js.native
  open class OpenStreetMapProvider ()
    extends typings.leafletGeosearch.distProvidersOpenStreetMapProviderMod.default {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch", "PeliasProvider")
  @js.native
  open class PeliasProvider ()
    extends typings.leafletGeosearch.distProvidersPeliasProviderMod.default {
    def this(options: PeliasProviderOptions) = this()
  }
  
  inline def SearchControl(options: Any*): typings.leafletGeosearch.distSearchControlMod.SearchControl & Control_ = ^.asInstanceOf[js.Dynamic].applyDynamic("SearchControl")(options.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.leafletGeosearch.distSearchControlMod.SearchControl & Control_]
  
  @JSImport("leaflet-geosearch", "SearchElement")
  @js.native
  open class SearchElement protected ()
    extends typings.leafletGeosearch.distSearchElementMod.default {
    def this(param0: SearchElementProps) = this()
  }
}
