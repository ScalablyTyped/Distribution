package typings.mapboxMapboxSdk

import typings.mapboxMapboxSdk.anon.OwnerIdString
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tilesetsMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/tilesets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(config: SdkConfig): TilesetsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[TilesetsService]
  @scala.inline
  def default(config: typings.mapboxMapboxSdk.mod.default): TilesetsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[TilesetsService]
  
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
    
    @scala.inline
    def apply(
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
    implicit class TilesetMutableBuilder[Self <: Tileset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value :_*))
      
      @scala.inline
      def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesize(value: Double): Self = StObject.set(x, "filesize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
    }
  }
  
  trait TilesetsService extends StObject {
    
    def listTilesets(config: OwnerIdString): MapiRequest
  }
  object TilesetsService {
    
    @scala.inline
    def apply(listTilesets: OwnerIdString => MapiRequest): TilesetsService = {
      val __obj = js.Dynamic.literal(listTilesets = js.Any.fromFunction1(listTilesets))
      __obj.asInstanceOf[TilesetsService]
    }
    
    @scala.inline
    implicit class TilesetsServiceMutableBuilder[Self <: TilesetsService] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setListTilesets(value: OwnerIdString => MapiRequest): Self = StObject.set(x, "listTilesets", js.Any.fromFunction1(value))
    }
  }
}
