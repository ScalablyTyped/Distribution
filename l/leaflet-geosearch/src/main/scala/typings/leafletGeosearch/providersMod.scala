package typings.leafletGeosearch

import typings.leafletGeosearch.algoliaProviderMod.default
import typings.leafletGeosearch.geoApiFrProviderMod.GeoApiFrProviderOptions
import typings.leafletGeosearch.mapBoxProviderMod.MapBoxProviderOptions
import typings.leafletGeosearch.openStreetMapProviderMod.OpenStreetMapProviderOptions
import typings.leafletGeosearch.peliasProviderMod.PeliasProviderOptions
import typings.leafletGeosearch.providerMod.ProviderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersMod {
  
  @JSImport("leaflet-geosearch/dist/providers", "AlgoliaProvider")
  @js.native
  open class AlgoliaProvider () extends default
  
  @JSImport("leaflet-geosearch/dist/providers", "BingProvider")
  @js.native
  open class BingProvider ()
    extends typings.leafletGeosearch.bingProviderMod.default
  
  @JSImport("leaflet-geosearch/dist/providers", "EsriProvider")
  @js.native
  open class EsriProvider ()
    extends typings.leafletGeosearch.esriProviderMod.default
  
  @JSImport("leaflet-geosearch/dist/providers", "GeoApiFrProvider")
  @js.native
  open class GeoApiFrProvider ()
    extends typings.leafletGeosearch.geoApiFrProviderMod.default {
    def this(options: GeoApiFrProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "GeocodeEarthProvider")
  @js.native
  open class GeocodeEarthProvider ()
    extends typings.leafletGeosearch.geocodeEarthProviderMod.default {
    def this(options: PeliasProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "GoogleProvider")
  @js.native
  open class GoogleProvider ()
    extends typings.leafletGeosearch.googleProviderMod.default
  
  @JSImport("leaflet-geosearch/dist/providers", "LocationIQProvider")
  @js.native
  open class LocationIQProvider protected ()
    extends typings.leafletGeosearch.locationIQProviderMod.default {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "MapBoxProvider")
  @js.native
  open class MapBoxProvider ()
    extends typings.leafletGeosearch.mapBoxProviderMod.default {
    def this(options: MapBoxProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "OpenCageProvider")
  @js.native
  open class OpenCageProvider ()
    extends typings.leafletGeosearch.openCageProviderMod.default
  
  @JSImport("leaflet-geosearch/dist/providers", "OpenStreetMapProvider")
  @js.native
  open class OpenStreetMapProvider ()
    extends typings.leafletGeosearch.openStreetMapProviderMod.default {
    def this(options: OpenStreetMapProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "PeliasProvider")
  @js.native
  open class PeliasProvider ()
    extends typings.leafletGeosearch.peliasProviderMod.default {
    def this(options: PeliasProviderOptions) = this()
  }
  
  @JSImport("leaflet-geosearch/dist/providers", "Provider")
  @js.native
  abstract class Provider[TRequestResult, TRawResult] ()
    extends typings.leafletGeosearch.providerMod.default[TRequestResult, TRawResult] {
    def this(options: ProviderOptions) = this()
  }
}
