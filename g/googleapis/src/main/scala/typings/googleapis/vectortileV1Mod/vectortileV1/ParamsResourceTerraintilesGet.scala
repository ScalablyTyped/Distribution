package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTerraintilesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The precision of terrain altitudes in centimeters. Possible values: between 1 (cm level precision) and 1,000,000 (10-kilometer level precision).
    */
  var altitudePrecisionCentimeters: js.UndefOr[Double] = js.undefined
  
  /**
    * API client name and version. For example, the SDK calling the API. The exact format is up to the client.
    */
  @JSName("clientInfo.apiClient")
  var clientInfoDotapiClient: js.UndefOr[String] = js.undefined
  
  /**
    * Application ID, such as the package name on Android and the bundle identifier on iOS platforms.
    */
  @JSName("clientInfo.applicationId")
  var clientInfoDotapplicationId: js.UndefOr[String] = js.undefined
  
  /**
    * Application version number, such as "1.2.3". The exact format is application-dependent.
    */
  @JSName("clientInfo.applicationVersion")
  var clientInfoDotapplicationVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Device model as reported by the device. The exact format is platform-dependent.
    */
  @JSName("clientInfo.deviceModel")
  var clientInfoDotdeviceModel: js.UndefOr[String] = js.undefined
  
  /**
    * Operating system name and version as reported by the OS. For example, "Mac OS X 10.10.4". The exact format is platform-dependent.
    */
  @JSName("clientInfo.operatingSystem")
  var clientInfoDotoperatingSystem: js.UndefOr[String] = js.undefined
  
  /**
    * Platform where the application is running.
    */
  @JSName("clientInfo.platform")
  var clientInfoDotplatform: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A client-generated user ID. The ID should be generated and persisted during the first user session or whenever a pre-existing ID is not found. The exact format is up to the client. This must be non-empty in a GetFeatureTileRequest (whether via the header or GetFeatureTileRequest.client_info).
    */
  @JSName("clientInfo.userId")
  var clientInfoDotuserId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum allowed resolution for the returned elevation heightmap. Possible values: between 1 and 1024 (and not less than min_elevation_resolution_cells). Over-sized heightmaps will be non-uniformly down-sampled such that each edge is no longer than this value. Non-uniformity is chosen to maximise the amount of preserved data. For example: Original resolution: 100px (width) * 30px (height) max_elevation_resolution: 30 New resolution: 30px (width) * 30px (height)
    */
  var maxElevationResolutionCells: js.UndefOr[Double] = js.undefined
  
  /**
    *  api-linter: core::0131::request-unknown-fields=disabled aip.dev/not-precedent: Maintaining existing request parameter pattern. The minimum allowed resolution for the returned elevation heightmap. Possible values: between 0 and 1024 (and not more than max_elevation_resolution_cells). Zero is supported for backward compatibility. Under-sized heightmaps will be non-uniformly up-sampled such that each edge is no shorter than this value. Non-uniformity is chosen to maximise the amount of preserved data. For example: Original resolution: 30px (width) * 10px (height) min_elevation_resolution: 30 New resolution: 30px (width) * 30px (height)
    */
  var minElevationResolutionCells: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. Resource name of the tile. The tile resource name is prefixed by its collection ID `terraintiles/` followed by the resource ID, which encodes the tile's global x and y coordinates and zoom level as `@,,z`. For example, `terraintiles/@1,2,3z`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Terrain formats that the client understands.
    */
  var terrainFormats: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceTerraintilesGet {
  
  inline def apply(): ParamsResourceTerraintilesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTerraintilesGet]
  }
  
  extension [Self <: ParamsResourceTerraintilesGet](x: Self) {
    
    inline def setAltitudePrecisionCentimeters(value: Double): Self = StObject.set(x, "altitudePrecisionCentimeters", value.asInstanceOf[js.Any])
    
    inline def setAltitudePrecisionCentimetersUndefined: Self = StObject.set(x, "altitudePrecisionCentimeters", js.undefined)
    
    inline def setClientInfoDotapiClient(value: String): Self = StObject.set(x, "clientInfo.apiClient", value.asInstanceOf[js.Any])
    
    inline def setClientInfoDotapiClientUndefined: Self = StObject.set(x, "clientInfo.apiClient", js.undefined)
    
    inline def setClientInfoDotapplicationId(value: String): Self = StObject.set(x, "clientInfo.applicationId", value.asInstanceOf[js.Any])
    
    inline def setClientInfoDotapplicationIdUndefined: Self = StObject.set(x, "clientInfo.applicationId", js.undefined)
    
    inline def setClientInfoDotapplicationVersion(value: String): Self = StObject.set(x, "clientInfo.applicationVersion", value.asInstanceOf[js.Any])
    
    inline def setClientInfoDotapplicationVersionUndefined: Self = StObject.set(x, "clientInfo.applicationVersion", js.undefined)
    
    inline def setClientInfoDotdeviceModel(value: String): Self = StObject.set(x, "clientInfo.deviceModel", value.asInstanceOf[js.Any])
    
    inline def setClientInfoDotdeviceModelUndefined: Self = StObject.set(x, "clientInfo.deviceModel", js.undefined)
    
    inline def setClientInfoDotoperatingSystem(value: String): Self = StObject.set(x, "clientInfo.operatingSystem", value.asInstanceOf[js.Any])
    
    inline def setClientInfoDotoperatingSystemUndefined: Self = StObject.set(x, "clientInfo.operatingSystem", js.undefined)
    
    inline def setClientInfoDotplatform(value: String): Self = StObject.set(x, "clientInfo.platform", value.asInstanceOf[js.Any])
    
    inline def setClientInfoDotplatformUndefined: Self = StObject.set(x, "clientInfo.platform", js.undefined)
    
    inline def setClientInfoDotuserId(value: String): Self = StObject.set(x, "clientInfo.userId", value.asInstanceOf[js.Any])
    
    inline def setClientInfoDotuserIdUndefined: Self = StObject.set(x, "clientInfo.userId", js.undefined)
    
    inline def setMaxElevationResolutionCells(value: Double): Self = StObject.set(x, "maxElevationResolutionCells", value.asInstanceOf[js.Any])
    
    inline def setMaxElevationResolutionCellsUndefined: Self = StObject.set(x, "maxElevationResolutionCells", js.undefined)
    
    inline def setMinElevationResolutionCells(value: Double): Self = StObject.set(x, "minElevationResolutionCells", value.asInstanceOf[js.Any])
    
    inline def setMinElevationResolutionCellsUndefined: Self = StObject.set(x, "minElevationResolutionCells", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTerrainFormats(value: js.Array[String]): Self = StObject.set(x, "terrainFormats", value.asInstanceOf[js.Any])
    
    inline def setTerrainFormatsUndefined: Self = StObject.set(x, "terrainFormats", js.undefined)
    
    inline def setTerrainFormatsVarargs(value: String*): Self = StObject.set(x, "terrainFormats", js.Array(value*))
  }
}
