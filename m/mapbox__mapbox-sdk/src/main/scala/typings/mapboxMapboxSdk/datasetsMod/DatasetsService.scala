package typings.mapboxMapboxSdk.datasetsMod

import typings.mapboxMapboxSdk.AnonDatasetId
import typings.mapboxMapboxSdk.AnonDatasetIdString
import typings.mapboxMapboxSdk.AnonDescription
import typings.mapboxMapboxSdk.AnonFeature
import typings.mapboxMapboxSdk.AnonFeatureId
import typings.mapboxMapboxSdk.AnonLimit
import typings.mapboxMapboxSdk.AnonName
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetsService extends js.Object {
  /**
    *  Create a new, empty dataset.
    * @param config Object
    */
  def createDataset(config: AnonDescription): MapiRequest
  /**
    * Delete a dataset, including all features it contains.
    * @param config
    */
  def deleteDataset(config: AnonDatasetIdString): MapiRequest
  /**
    * Delete a feature in a dataset.
    * @param config
    */
  // implicit any
  def deleteFeature(config: AnonFeatureId): js.Any
  /**
    * Get a feature in a dataset.
    * @param config
    */
  // implicit any
  def getFeature(config: AnonFeatureId): js.Any
  /**
    * Get metadata about a dataset.
    * @param config
    */
  def getMetadata(config: AnonDatasetId): MapiRequest
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
  def listFeatures(config: AnonLimit): js.Any
  /**
    * Add a feature to a dataset or update an existing one.
    * @param config
    */
  def putFeature(config: AnonFeature): MapiRequest
  /**
    * Update user-defined properties of a dataset's metadata.
    * @param config
    */
  def updateMetadata(config: AnonName): MapiRequest
}

object DatasetsService {
  @scala.inline
  def apply(
    createDataset: AnonDescription => MapiRequest,
    deleteDataset: AnonDatasetIdString => MapiRequest,
    deleteFeature: AnonFeatureId => js.Any,
    getFeature: AnonFeatureId => js.Any,
    getMetadata: AnonDatasetId => MapiRequest,
    listDatasets: () => MapiRequest,
    listFeatures: AnonLimit => js.Any,
    putFeature: AnonFeature => MapiRequest,
    updateMetadata: AnonName => MapiRequest
  ): DatasetsService = {
    val __obj = js.Dynamic.literal(createDataset = js.Any.fromFunction1(createDataset), deleteDataset = js.Any.fromFunction1(deleteDataset), deleteFeature = js.Any.fromFunction1(deleteFeature), getFeature = js.Any.fromFunction1(getFeature), getMetadata = js.Any.fromFunction1(getMetadata), listDatasets = js.Any.fromFunction0(listDatasets), listFeatures = js.Any.fromFunction1(listFeatures), putFeature = js.Any.fromFunction1(putFeature), updateMetadata = js.Any.fromFunction1(updateMetadata))
  
    __obj.asInstanceOf[DatasetsService]
  }
}

