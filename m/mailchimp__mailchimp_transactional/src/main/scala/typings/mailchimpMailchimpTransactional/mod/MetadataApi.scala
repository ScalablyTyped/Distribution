package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataApi extends StObject {
  
  /**
    * Add metadata field
    *
    * Add a new custom metadata field to be indexed for the account.
    */
  def add(body: MetadataAddRequest): js.Promise[MetadataResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Delete metadata field
    *
    * Delete an existing custom metadata field. Deletion isn't instataneous, and /metadata/list
    * will continue to return the field until the asynchronous deletion process is complete.
    */
  def delete(body: MetadataDeleteRequest): js.Promise[MetadataResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List metadata fields
    *
    * Get the list of custom metadata fields indexed for the account.
    */
  def list(): js.Promise[js.Array[MetadataResponse] | (AxiosError[Any, Any])] = js.native
  def list(body: MetadataListRequest): js.Promise[js.Array[MetadataResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Update metadata field
    *
    * Update an existing custom metadata field.
    */
  def update(body: MetadataUpdateRequest): js.Promise[MetadataResponse | (AxiosError[Any, Any])] = js.native
}
