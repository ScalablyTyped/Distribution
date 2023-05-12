package typings.leafletGeosearch

import typings.leafletGeosearch.distProvidersAlgoliaProviderMod.default
import typings.leafletGeosearch.distProvidersGeoApiFrProviderMod.GeoApiFrProviderOptions
import typings.leafletGeosearch.distProvidersGeoapifyProviderMod.GeoapifyProviderOptions
import typings.leafletGeosearch.distProvidersGoogleProviderMod.GoogleProviderOptions
import typings.leafletGeosearch.distProvidersMapBoxProviderMod.MapBoxProviderOptions
import typings.leafletGeosearch.distProvidersOpenStreetMapProviderMod.OpenStreetMapProviderOptions
import typings.leafletGeosearch.distProvidersPeliasProviderMod.PeliasProviderOptions
import typings.leafletGeosearch.distProvidersProviderMod.ProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProvidersMod {
  
  @JSImport("leaflet-geosearch/dist/providers", "AlgoliaProvider")
  @js.native
  open class AlgoliaProvider () extends default
  
  @JSImport("leaflet-geosearch/dist/providers", "BingProvider")
  @js.native
  open class BingProvider ()
    extends typings.leafletGeosearch.distProvidersBingProviderMod.default
  
  @JSImport("leaflet-geosearch/dist/providers", "EsriProvider")
  @js.native
  open class EsriProvider ()
    extends typings.leafletGeosearch.distProvidersEsriProviderMod.default
  
  @JSImport("leaflet-geosearch/dist/providers", "GeoApiFrProvider")
  @js.native
  open class GeoApiFrProvider ()
    extends typings.leafletGeosearch.distProvidersGeoApiFrProviderMod.default {
    def this(options: GeoApiFrProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "GeoapifyProvider")
  @js.native
  open class GeoapifyProvider ()
    extends typings.leafletGeosearch.distProvidersGeoapifyProviderMod.default {
    def this(options: GeoapifyProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "GeocodeEarthProvider")
  @js.native
  open class GeocodeEarthProvider ()
    extends typings.leafletGeosearch.distProvidersGeocodeEarthProviderMod.default {
    def this(options: PeliasProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "GoogleProvider")
  @js.native
  open class GoogleProvider protected ()
    extends typings.leafletGeosearch.distProvidersGoogleProviderMod.default {
    def this(options: GoogleProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "LegacyGoogleProvider")
  @js.native
  open class LegacyGoogleProvider ()
    extends typings.leafletGeosearch.distProvidersLegacyGoogleProviderMod.default
  
  @JSImport("leaflet-geosearch/dist/providers", "LocationIQProvider")
  @js.native
  open class LocationIQProvider protected ()
    extends typings.leafletGeosearch.distProvidersLocationIQProviderMod.default {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "MapBoxProvider")
  @js.native
  open class MapBoxProvider ()
    extends typings.leafletGeosearch.distProvidersMapBoxProviderMod.default {
    def this(options: MapBoxProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "OpenCageProvider")
  @js.native
  open class OpenCageProvider ()
    extends typings.leafletGeosearch.distProvidersOpenCageProviderMod.default
  
  @JSImport("leaflet-geosearch/dist/providers", "OpenStreetMapProvider")
  @js.native
  open class OpenStreetMapProvider ()
    extends typings.leafletGeosearch.distProvidersOpenStreetMapProviderMod.default {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "PeliasProvider")
  @js.native
  open class PeliasProvider ()
    extends typings.leafletGeosearch.distProvidersPeliasProviderMod.default {
    def this(options: PeliasProviderOptions) = this()
  }
  
  /* note: abstract class */ @JSImport("leaflet-geosearch/dist/providers", "Provider")
  @js.native
  open class Provider[TRequestResult, TRawResult] ()
    extends typings.leafletGeosearch.distProvidersProviderMod.default[TRequestResult, TRawResult] {
    def this(options: ProviderOptions) = this()
  }
}
