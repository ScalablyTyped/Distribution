package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.anon.Attribution
import typings.mapboxMapboxSdk.anon.Id
import typings.mapboxMapboxSdk.anon.IdOwnerId
import typings.mapboxMapboxSdk.anon.JobId
import typings.mapboxMapboxSdk.anon.Private
import typings.mapboxMapboxSdk.anon.Recipe
import typings.mapboxMapboxSdk.anon.RecipeTilesetId
import typings.mapboxMapboxSdk.anon.SortBy_
import typings.mapboxMapboxSdk.anon.Stage
import typings.mapboxMapboxSdk.anon.Start
import typings.mapboxMapboxSdk.anon.TilesetId
import typings.mapboxMapboxSdk.libClassesMapiClientMod.SdkConfig
import typings.mapboxMapboxSdk.libClassesMapiRequestMod.MapiRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object servicesTilesetsMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/tilesets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: SdkConfig): TilesetsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[TilesetsService]
  inline def default(config: typings.mapboxMapboxSdk.libClassesMapiClientMod.default): TilesetsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[TilesetsService]
  
  trait Tileset extends StObject {
    
    var center: js.Array[Double]
    
    var created: String
    
    var description: String
    
    var filesize: Double
    
    var id: String
    
    var modified: String
    
    var name: String
    
    var status: String
    
    var `type`: String
    
    var visibility: String
  }
  object Tileset {
    
    inline def apply(
      center: js.Array[Double],
      created: String,
      description: String,
      filesize: Double,
      id: String,
      modified: String,
      name: String,
      status: String,
      `type`: String,
      visibility: String
    ): Tileset = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], filesize = filesize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tileset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Tileset] (val x: Self) extends AnyVal {
      
      inline def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
      
      inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFilesize(value: Double): Self = StObject.set(x, "filesize", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    }
  }
  
  trait TilesetsService extends StObject {
    
    def createTileset(config: Private): MapiRequest[Any]
    
    def createTilesetSource(config: Id): MapiRequest[Any]
    
    def deleteTileset(config: TilesetId): MapiRequest[Any]
    
    def deleteTilesetSource(config: IdOwnerId): MapiRequest[Any]
    
    def getRecipe(config: TilesetId): MapiRequest[Any]
    
    def getTilesetSource(config: IdOwnerId): MapiRequest[Any]
    
    def getTilesetsQueue(): MapiRequest[Any]
    
    def listTilesetJobs(config: Stage): MapiRequest[Any]
    
    def listTilesetSources(config: Start): MapiRequest[Any]
    
    def listTilesets(config: SortBy_): MapiRequest[Any]
    
    def publishTileset(config: TilesetId): MapiRequest[Any]
    
    def tileJSONMetadata(config: TilesetId): MapiRequest[Any]
    
    def tilesetJob(config: JobId): MapiRequest[Any]
    
    def tilesetStatus(config: TilesetId): MapiRequest[Any]
    
    def updateRecipe(config: RecipeTilesetId): MapiRequest[Any]
    
    def updateTileset(config: Attribution): MapiRequest[Any]
    
    def validateRecipe(config: Recipe): MapiRequest[Any]
  }
  object TilesetsService {
    
    inline def apply(
      createTileset: Private => MapiRequest[Any],
      createTilesetSource: Id => MapiRequest[Any],
      deleteTileset: TilesetId => MapiRequest[Any],
      deleteTilesetSource: IdOwnerId => MapiRequest[Any],
      getRecipe: TilesetId => MapiRequest[Any],
      getTilesetSource: IdOwnerId => MapiRequest[Any],
      getTilesetsQueue: () => MapiRequest[Any],
      listTilesetJobs: Stage => MapiRequest[Any],
      listTilesetSources: Start => MapiRequest[Any],
      listTilesets: SortBy_ => MapiRequest[Any],
      publishTileset: TilesetId => MapiRequest[Any],
      tileJSONMetadata: TilesetId => MapiRequest[Any],
      tilesetJob: JobId => MapiRequest[Any],
      tilesetStatus: TilesetId => MapiRequest[Any],
      updateRecipe: RecipeTilesetId => MapiRequest[Any],
      updateTileset: Attribution => MapiRequest[Any],
      validateRecipe: Recipe => MapiRequest[Any]
    ): TilesetsService = {
      val __obj = js.Dynamic.literal(createTileset = js.Any.fromFunction1(createTileset), createTilesetSource = js.Any.fromFunction1(createTilesetSource), deleteTileset = js.Any.fromFunction1(deleteTileset), deleteTilesetSource = js.Any.fromFunction1(deleteTilesetSource), getRecipe = js.Any.fromFunction1(getRecipe), getTilesetSource = js.Any.fromFunction1(getTilesetSource), getTilesetsQueue = js.Any.fromFunction0(getTilesetsQueue), listTilesetJobs = js.Any.fromFunction1(listTilesetJobs), listTilesetSources = js.Any.fromFunction1(listTilesetSources), listTilesets = js.Any.fromFunction1(listTilesets), publishTileset = js.Any.fromFunction1(publishTileset), tileJSONMetadata = js.Any.fromFunction1(tileJSONMetadata), tilesetJob = js.Any.fromFunction1(tilesetJob), tilesetStatus = js.Any.fromFunction1(tilesetStatus), updateRecipe = js.Any.fromFunction1(updateRecipe), updateTileset = js.Any.fromFunction1(updateTileset), validateRecipe = js.Any.fromFunction1(validateRecipe))
      __obj.asInstanceOf[TilesetsService]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TilesetsService] (val x: Self) extends AnyVal {
      
      inline def setCreateTileset(value: Private => MapiRequest[Any]): Self = StObject.set(x, "createTileset", js.Any.fromFunction1(value))
      
      inline def setCreateTilesetSource(value: Id => MapiRequest[Any]): Self = StObject.set(x, "createTilesetSource", js.Any.fromFunction1(value))
      
      inline def setDeleteTileset(value: TilesetId => MapiRequest[Any]): Self = StObject.set(x, "deleteTileset", js.Any.fromFunction1(value))
      
      inline def setDeleteTilesetSource(value: IdOwnerId => MapiRequest[Any]): Self = StObject.set(x, "deleteTilesetSource", js.Any.fromFunction1(value))
      
      inline def setGetRecipe(value: TilesetId => MapiRequest[Any]): Self = StObject.set(x, "getRecipe", js.Any.fromFunction1(value))
      
      inline def setGetTilesetSource(value: IdOwnerId => MapiRequest[Any]): Self = StObject.set(x, "getTilesetSource", js.Any.fromFunction1(value))
      
      inline def setGetTilesetsQueue(value: () => MapiRequest[Any]): Self = StObject.set(x, "getTilesetsQueue", js.Any.fromFunction0(value))
      
      inline def setListTilesetJobs(value: Stage => MapiRequest[Any]): Self = StObject.set(x, "listTilesetJobs", js.Any.fromFunction1(value))
      
      inline def setListTilesetSources(value: Start => MapiRequest[Any]): Self = StObject.set(x, "listTilesetSources", js.Any.fromFunction1(value))
      
      inline def setListTilesets(value: SortBy_ => MapiRequest[Any]): Self = StObject.set(x, "listTilesets", js.Any.fromFunction1(value))
      
      inline def setPublishTileset(value: TilesetId => MapiRequest[Any]): Self = StObject.set(x, "publishTileset", js.Any.fromFunction1(value))
      
      inline def setTileJSONMetadata(value: TilesetId => MapiRequest[Any]): Self = StObject.set(x, "tileJSONMetadata", js.Any.fromFunction1(value))
      
      inline def setTilesetJob(value: JobId => MapiRequest[Any]): Self = StObject.set(x, "tilesetJob", js.Any.fromFunction1(value))
      
      inline def setTilesetStatus(value: TilesetId => MapiRequest[Any]): Self = StObject.set(x, "tilesetStatus", js.Any.fromFunction1(value))
      
      inline def setUpdateRecipe(value: RecipeTilesetId => MapiRequest[Any]): Self = StObject.set(x, "updateRecipe", js.Any.fromFunction1(value))
      
      inline def setUpdateTileset(value: Attribution => MapiRequest[Any]): Self = StObject.set(x, "updateTileset", js.Any.fromFunction1(value))
      
      inline def setValidateRecipe(value: Recipe => MapiRequest[Any]): Self = StObject.set(x, "validateRecipe", js.Any.fromFunction1(value))
    }
  }
}
