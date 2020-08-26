package typings.mapboxMapboxSdk.datasetsMod

import typings.mapboxMapboxSdk.anon.DatasetId
import typings.mapboxMapboxSdk.anon.Description
import typings.mapboxMapboxSdk.anon.Feature
import typings.mapboxMapboxSdk.anon.FeatureId
import typings.mapboxMapboxSdk.anon.Limit
import typings.mapboxMapboxSdk.anon.Name
import typings.mapboxMapboxSdk.anon.`0`
import typings.mapboxMapboxSdk.mapiRequestMod.MapiRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetsService extends js.Object {
  /**
    *  Create a new, empty dataset.
    * @param config Object
    */
  def createDataset(config: Description): MapiRequest = js.native
  /**
    * Delete a dataset, including all features it contains.
    * @param config
    */
  def deleteDataset(config: `0`): MapiRequest = js.native
  /**
    * Delete a feature in a dataset.
    * @param config
    */
  // implicit any
  def deleteFeature(config: FeatureId): js.Any = js.native
  /**
    * Get a feature in a dataset.
    * @param config
    */
  // implicit any
  def getFeature(config: FeatureId): js.Any = js.native
  /**
    * Get metadata about a dataset.
    * @param config
    */
  def getMetadata(config: DatasetId): MapiRequest = js.native
  /**
    * List datasets in your account.
    */
  def listDatasets(): MapiRequest = js.native
  /**
    * List features in a dataset.
    * This endpoint supports pagination. Use MapiRequest#eachPage or manually specify the limit and start options.
    * @param config
    */
  // implicit any
  def listFeatures(config: Limit): js.Any = js.native
  /**
    * Add a feature to a dataset or update an existing one.
    * @param config
    */
  def putFeature(config: Feature): MapiRequest = js.native
  /**
    * Update user-defined properties of a dataset's metadata.
    * @param config
    */
  def updateMetadata(config: Name): MapiRequest = js.native
}

object DatasetsService {
  @scala.inline
  def apply(
    createDataset: Description => MapiRequest,
    deleteDataset: `0` => MapiRequest,
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
  @scala.inline
  implicit class DatasetsServiceOps[Self <: DatasetsService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreateDataset(value: Description => MapiRequest): Self = this.set("createDataset", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteDataset(value: `0` => MapiRequest): Self = this.set("deleteDataset", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteFeature(value: FeatureId => js.Any): Self = this.set("deleteFeature", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFeature(value: FeatureId => js.Any): Self = this.set("getFeature", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMetadata(value: DatasetId => MapiRequest): Self = this.set("getMetadata", js.Any.fromFunction1(value))
    @scala.inline
    def setListDatasets(value: () => MapiRequest): Self = this.set("listDatasets", js.Any.fromFunction0(value))
    @scala.inline
    def setListFeatures(value: Limit => js.Any): Self = this.set("listFeatures", js.Any.fromFunction1(value))
    @scala.inline
    def setPutFeature(value: Feature => MapiRequest): Self = this.set("putFeature", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateMetadata(value: Name => MapiRequest): Self = this.set("updateMetadata", js.Any.fromFunction1(value))
  }
  
}

