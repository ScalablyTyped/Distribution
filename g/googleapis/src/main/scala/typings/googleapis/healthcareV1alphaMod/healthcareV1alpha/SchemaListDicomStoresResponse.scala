package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Lists the DICOM stores in the given dataset.
  */
@js.native
trait SchemaListDicomStoresResponse extends js.Object {
  /**
    * The returned DICOM stores. Won&#39;t be more DICOM stores than the value
    * of page_size in the request.
    */
  var dicomStores: js.UndefOr[js.Array[SchemaDicomStore]] = js.native
  /**
    * Token to retrieve the next page of results or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDicomStoresResponse {
  @scala.inline
  def apply(): SchemaListDicomStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDicomStoresResponse]
  }
  @scala.inline
  implicit class SchemaListDicomStoresResponseOps[Self <: SchemaListDicomStoresResponse] (val x: Self) extends AnyVal {
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
    def setDicomStoresVarargs(value: SchemaDicomStore*): Self = this.set("dicomStores", js.Array(value :_*))
    @scala.inline
    def setDicomStores(value: js.Array[SchemaDicomStore]): Self = this.set("dicomStores", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDicomStores: Self = this.set("dicomStores", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

