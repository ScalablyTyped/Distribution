package typings.googleapis.streetviewpublishV1Mod.streetviewpublishV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to batch update of metadata of one or more Photos.
  */
@js.native
trait SchemaBatchUpdatePhotosResponse extends js.Object {
  
  /**
    * List of results for each individual Photo updated, in the same order as
    * the request.
    */
  var results: js.UndefOr[js.Array[SchemaPhotoResponse]] = js.native
}
object SchemaBatchUpdatePhotosResponse {
  
  @scala.inline
  def apply(): SchemaBatchUpdatePhotosResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchUpdatePhotosResponse]
  }
  
  @scala.inline
  implicit class SchemaBatchUpdatePhotosResponseOps[Self <: SchemaBatchUpdatePhotosResponse] (val x: Self) extends AnyVal {
    
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
    def setResultsVarargs(value: SchemaPhotoResponse*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[SchemaPhotoResponse]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
