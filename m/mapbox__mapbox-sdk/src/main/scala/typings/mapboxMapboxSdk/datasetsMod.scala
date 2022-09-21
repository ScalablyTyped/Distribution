package typings.mapboxMapboxSdk

import typings.geojson.mod.Feature
import typings.geojson.mod.GeoJsonProperties
import typings.geojson.mod.Geometry
import typings.geojson.mod.GeometryCollection
import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.geojson.mod.MultiPoint
import typings.geojson.mod.MultiPolygon
import typings.geojson.mod.Point
import typings.geojson.mod.Polygon
import typings.mapboxMapboxSdk.anon.DatasetId
import typings.mapboxMapboxSdk.anon.Description
import typings.mapboxMapboxSdk.anon.FeatureId
import typings.mapboxMapboxSdk.anon.Limit
import typings.mapboxMapboxSdk.anon.Name
import typings.mapboxMapboxSdk.anon.Sortby
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import typings.mapboxMapboxSdk.mod.SdkConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datasetsMod {
  
  @JSImport("@mapbox/mapbox-sdk/services/datasets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: SdkConfig): DatasetsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[DatasetsService]
  inline def default(config: typings.mapboxMapboxSdk.mod.default): DatasetsService = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[DatasetsService]
  
  /**
    * All GeoJSON types except for FeatureCollection.
    */
  type DataSetsFeature = Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection[Geometry] | (Feature[Geometry, GeoJsonProperties])
  
  trait Dataset extends StObject {
    
    /**
      * The extent of features in the dataset as an array of west, south, east, north coordinates
      */
    var bounds: js.Array[Double]
    
    /*
      * Date and time the dataset was created
      */
    var created: String
    
    /**
      * The description of the dataset
      */
    var description: String
    
    /**
      * The number of features in the dataset
      */
    var features: Double
    
    /**
      * Id for an existing dataset
      */
    var id: String
    
    /*
      * Date and time the dataset was last modified
      */
    var modified: String
    
    /**
      * The name of the dataset
      */
    var name: String
    
    /**
      * The username of the dataset owner
      */
    var owner: String
    
    /**
      * The size of the dataset in bytes
      */
    var size: Double
  }
  object Dataset {
    
    inline def apply(
      bounds: js.Array[Double],
      created: String,
      description: String,
      features: Double,
      id: String,
      modified: String,
      name: String,
      owner: String,
      size: Double
    ): Dataset = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dataset]
    }
    
    extension [Self <: Dataset](x: Self) {
      
      inline def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value*))
      
      inline def setCreated(value: String): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setFeatures(value: Double): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setModified(value: String): Self = StObject.set(x, "modified", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DatasetsService extends StObject {
    
    /**
      *  Create a new, empty dataset.
      * @param config Object
      */
    def createDataset(config: Description): MapiRequest[Any] = js.native
    
    /**
      * Delete a dataset, including all features it contains.
      * @param config
      */
    def deleteDataset(config: DatasetId): MapiRequest[Any] = js.native
    
    /**
      * Delete a feature in a dataset.
      * @param config
      */
    def deleteFeature(config: FeatureId): MapiRequest[Any] = js.native
    
    /**
      * Get a feature in a dataset.
      * @param config
      */
    def getFeature(config: FeatureId): MapiRequest[Any] = js.native
    
    /**
      * Get metadata about a dataset.
      * @param config
      */
    def getMetadata(config: DatasetId): MapiRequest[Any] = js.native
    
    /**
      * List datasets in your account.
      */
    def listDatasets(): MapiRequest[Any] = js.native
    def listDatasets(config: Sortby): MapiRequest[Any] = js.native
    
    /**
      * List features in a dataset.
      * This endpoint supports pagination. Use MapiRequest#eachPage or manually specify the limit and start options.
      * @param config
      */
    def listFeatures(config: Limit): MapiRequest[Any] = js.native
    
    /**
      * Add a feature to a dataset or update an existing one.
      * @param config
      */
    def putFeature(config: typings.mapboxMapboxSdk.anon.Feature): MapiRequest[Any] = js.native
    
    /**
      * Update user-defined properties of a dataset's metadata.
      * @param config
      */
    def updateMetadata(config: Name): MapiRequest[Any] = js.native
  }
}
