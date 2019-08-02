package typings.atMapboxMapboxDashSdk.servicesDatasetsMod

import typings.atMapboxMapboxDashSdk.Anon_DatasetId
import typings.atMapboxMapboxDashSdk.Anon_DatasetIdDescription
import typings.atMapboxMapboxDashSdk.Anon_DatasetIdFeature
import typings.atMapboxMapboxDashSdk.Anon_DatasetIdFeatureId
import typings.atMapboxMapboxDashSdk.Anon_DatasetIdLimit
import typings.atMapboxMapboxDashSdk.Anon_DatasetIdString
import typings.atMapboxMapboxDashSdk.Anon_Description
import typings.atMapboxMapboxDashSdk.libClassesMapiDashRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetsService extends js.Object {
  /**
    *  Create a new, empty dataset.
    * @param config Object
    */
  def createDataset(config: Anon_Description): MapiRequest
  /**
    * Delete a dataset, including all features it contains.
    * @param config
    */
  def deleteDataset(config: Anon_DatasetIdString): MapiRequest
  /**
    * Delete a feature in a dataset.
    * @param config
    */
  // implicit any
  def deleteFeature(config: Anon_DatasetIdFeatureId): js.Any
  /**
    * Get a feature in a dataset.
    * @param config
    */
  // implicit any
  def getFeature(config: Anon_DatasetIdFeatureId): js.Any
  /**
    * Get metadata about a dataset.
    * @param config
    */
  def getMetadata(config: Anon_DatasetId): MapiRequest
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
  def listFeatures(config: Anon_DatasetIdLimit): js.Any
  /**
    * Add a feature to a dataset or update an existing one.
    * @param config
    */
  def putFeature(config: Anon_DatasetIdFeature): MapiRequest
  /**
    * Update user-defined properties of a dataset's metadata.
    * @param config
    */
  def updateMetadata(config: Anon_DatasetIdDescription): MapiRequest
}

object DatasetsService {
  @scala.inline
  def apply(
    createDataset: Anon_Description => MapiRequest,
    deleteDataset: Anon_DatasetIdString => MapiRequest,
    deleteFeature: Anon_DatasetIdFeatureId => js.Any,
    getFeature: Anon_DatasetIdFeatureId => js.Any,
    getMetadata: Anon_DatasetId => MapiRequest,
    listDatasets: () => MapiRequest,
    listFeatures: Anon_DatasetIdLimit => js.Any,
    putFeature: Anon_DatasetIdFeature => MapiRequest,
    updateMetadata: Anon_DatasetIdDescription => MapiRequest
  ): DatasetsService = {
    val __obj = js.Dynamic.literal(createDataset = js.Any.fromFunction1(createDataset), deleteDataset = js.Any.fromFunction1(deleteDataset), deleteFeature = js.Any.fromFunction1(deleteFeature), getFeature = js.Any.fromFunction1(getFeature), getMetadata = js.Any.fromFunction1(getMetadata), listDatasets = js.Any.fromFunction0(listDatasets), listFeatures = js.Any.fromFunction1(listFeatures), putFeature = js.Any.fromFunction1(putFeature), updateMetadata = js.Any.fromFunction1(updateMetadata))
  
    __obj.asInstanceOf[DatasetsService]
  }
}

