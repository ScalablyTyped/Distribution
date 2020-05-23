package typings.mapboxMapboxSdk.datasetsMod

import typings.mapboxMapboxSdk.anon.DatasetId
import typings.mapboxMapboxSdk.anon.DatasetIdString
import typings.mapboxMapboxSdk.anon.Description
import typings.mapboxMapboxSdk.anon.Feature
import typings.mapboxMapboxSdk.anon.FeatureId
import typings.mapboxMapboxSdk.anon.Limit
import typings.mapboxMapboxSdk.anon.Name
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetsService extends js.Object {
  /**
    *  Create a new, empty dataset.
    * @param config Object
    */
  def createDataset(config: Description): MapiRequest
  /**
    * Delete a dataset, including all features it contains.
    * @param config
    */
  def deleteDataset(config: DatasetIdString): MapiRequest
  /**
    * Delete a feature in a dataset.
    * @param config
    */
  // implicit any
  def deleteFeature(config: FeatureId): js.Any
  /**
    * Get a feature in a dataset.
    * @param config
    */
  // implicit any
  def getFeature(config: FeatureId): js.Any
  /**
    * Get metadata about a dataset.
    * @param config
    */
  def getMetadata(config: DatasetId): MapiRequest
  /**
    * List datasets in your account.
    */
  def listDatasets(): MapiRequest
  /**
    * List features in a dataset.
    * This endpoint supports pagination. Use MapiRequest#eachPage or manually specify the limit and start options.
    * @param config
    */
  // implicit any
  def listFeatures(config: Limit): js.Any
  /**
    * Add a feature to a dataset or update an existing one.
    * @param config
    */
  def putFeature(config: Feature): MapiRequest
  /**
    * Update user-defined properties of a dataset's metadata.
    * @param config
    */
  def updateMetadata(config: Name): MapiRequest
}

object DatasetsService {
  @scala.inline
  def apply(
    createDataset: Description => MapiRequest,
    deleteDataset: DatasetIdString => MapiRequest,
    deleteFeature: FeatureId => js.Any,
    getFeature: FeatureId => js.Any,
    getMetadata: DatasetId => MapiRequest,
    listDatasets: () => MapiRequest,
    listFeatures: Limit => js.Any,
    putFeature: Feature => MapiRequest,
    updateMetadata: Name => MapiRequest
  ): DatasetsService = {
    val __obj = js.Dynamic.literal(createDataset = js.Any.fromFunction1(createDataset), deleteDataset = js.Any.fromFunction1(deleteDataset), deleteFeature = js.Any.fromFunction1(deleteFeature), getFeature = js.Any.fromFunction1(getFeature), getMetadata = js.Any.fromFunction1(getMetadata), listDatasets = js.Any.fromFunction0(listDatasets), listFeatures = js.Any.fromFunction1(listFeatures), putFeature = js.Any.fromFunction1(putFeature), updateMetadata = js.Any.fromFunction1(updateMetadata))
    __obj.asInstanceOf[DatasetsService]
  }
}

