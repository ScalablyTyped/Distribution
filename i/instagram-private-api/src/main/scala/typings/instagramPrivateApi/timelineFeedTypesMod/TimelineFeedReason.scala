package typings.instagramPrivateApi.timelineFeedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.instagramPrivateApi.instagramPrivateApiStrings.pagination
  - typings.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh
  - typings.instagramPrivateApi.instagramPrivateApiStrings.warm_start_fetch
  - typings.instagramPrivateApi.instagramPrivateApiStrings.cold_start_fetch
*/
trait TimelineFeedReason extends js.Object

object TimelineFeedReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cold_start_fetch: typings.instagramPrivateApi.instagramPrivateApiStrings.cold_start_fetch = this.cast("cold_start_fetch")
  @scala.inline
  def pagination: typings.instagramPrivateApi.instagramPrivateApiStrings.pagination = this.cast("pagination")
  @scala.inline
  def pull_to_refresh: typings.instagramPrivateApi.instagramPrivateApiStrings.pull_to_refresh = this.cast("pull_to_refresh")
  @scala.inline
  def warm_start_fetch: typings.instagramPrivateApi.instagramPrivateApiStrings.warm_start_fetch = this.cast("warm_start_fetch")
}

