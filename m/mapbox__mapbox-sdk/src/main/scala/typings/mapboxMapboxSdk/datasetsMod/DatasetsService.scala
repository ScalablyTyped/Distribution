package typings.mapboxMapboxSdk.datasetsMod

import typings.mapboxMapboxSdk.AnonDatasetId
import typings.mapboxMapboxSdk.AnonDatasetIdDescription
import typings.mapboxMapboxSdk.AnonDatasetIdFeature
import typings.mapboxMapboxSdk.AnonDatasetIdFeatureId
import typings.mapboxMapboxSdk.AnonDatasetIdLimit
import typings.mapboxMapboxSdk.AnonDatasetIdString
import typings.mapboxMapboxSdk.AnonDescription
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
  def deleteFeature(config: AnonDatasetIdFeatureId): js.Any
  /**
    * Get a feature in a dataset.
    * @param config
    */
  // implicit any
  def getFeature(config: AnonDatasetIdFeatureId): js.Any
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
  def listFeatures(config: AnonDatasetIdLimit): js.Any
  /**
    * Add a feature to a dataset or update an existing one.
    * @param config
    */
  def putFeature(config: AnonDatasetIdFeature): MapiRequest
  /**
    * Update user-defined properties of a dataset's metadata.
    * @param config
    */
  def updateMetadata(config: AnonDatasetIdDescription): MapiRequest
}

object DatasetsService {
  @scala.inline
  def apply(
    createDataset: AnonDescription => MapiRequest,
    deleteDataset: AnonDatasetIdString => MapiRequest,
    deleteFeature: AnonDatasetIdFeatureId => js.Any,
    getFeature: AnonDatasetIdFeatureId => js.Any,
    getMetadata: AnonDatasetId => MapiRequest,
    listDatasets: () => MapiRequest,
    listFeatures: AnonDatasetIdLimit => js.Any,
    putFeature: AnonDatasetIdFeature => MapiRequest,
    updateMetadata: AnonDatasetIdDescription => MapiRequest
  ): DatasetsService = {
    val __obj = js.Dynamic.literal(createDataset = js.Any.fromFunction1(createDataset), deleteDataset = js.Any.fromFunction1(deleteDataset), deleteFeature = js.Any.fromFunction1(deleteFeature), getFeature = js.Any.fromFunction1(getFeature), getMetadata = js.Any.fromFunction1(getMetadata), listDatasets = js.Any.fromFunction0(listDatasets), listFeatures = js.Any.fromFunction1(listFeatures), putFeature = js.Any.fromFunction1(putFeature), updateMetadata = js.Any.fromFunction1(updateMetadata))
  
    __obj.asInstanceOf[DatasetsService]
  }
}

