package typings.mailchimpMailchimpTransactional.mod

import typings.axios.mod.AxiosError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsApi extends StObject {
  
  /**
    * View all tags history
    *
    * Return the recent history (hourly stats for the last 30 days) for all tags.
    */
  def allTimeSeries(): js.Promise[js.Array[SearchTimeSeriesResponse] | (AxiosError[Any, Any])] = js.native
  def allTimeSeries(body: TagsAllTimeSeriesRequest): js.Promise[js.Array[SearchTimeSeriesResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * Delete tag
    *
    * Deletes a tag permanently. Deleting a tag removes the tag from any messages that have been sent,
    * and also deletes the tag's stats. There is no way to undo this operation, so use it carefully.
    */
  def delete(body: TagsDeleteRequest): js.Promise[TagsResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * Get tag info
    *
    * Return more detailed information about a single tag, including aggregates of recent stats.
    */
  def info(body: TagsInfoRequest): js.Promise[TagsInfoResponse | (AxiosError[Any, Any])] = js.native
  
  /**
    * List tags
    *
    * Return all of the user-defined tag information.
    */
  def list(): js.Promise[js.Array[TagsResponse] | (AxiosError[Any, Any])] = js.native
  def list(body: TagsListRequest): js.Promise[js.Array[TagsResponse] | (AxiosError[Any, Any])] = js.native
  
  /**
    * View tag history
    *
    * Return the recent history (hourly stats for the last 30 days) for a tag.
    */
  def timeSeries(body: TagsTimeSeriesRequest): js.Promise[js.Array[SearchTimeSeriesResponse] | (AxiosError[Any, Any])] = js.native
}
