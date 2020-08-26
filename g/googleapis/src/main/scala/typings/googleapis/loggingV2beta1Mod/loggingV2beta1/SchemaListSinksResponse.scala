package typings.googleapis.loggingV2beta1Mod.loggingV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result returned from ListSinks.
  */
@js.native
trait SchemaListSinksResponse extends js.Object {
  /**
    * If there might be more results than appear in this response, then
    * nextPageToken is included. To get the next set of results, call the same
    * method again using the value of nextPageToken as pageToken.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of sinks.
    */
  var sinks: js.UndefOr[js.Array[SchemaLogSink]] = js.native
}

object SchemaListSinksResponse {
  @scala.inline
  def apply(): SchemaListSinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListSinksResponse]
  }
  @scala.inline
  implicit class SchemaListSinksResponseOps[Self <: SchemaListSinksResponse] (val x: Self) extends AnyVal {
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setSinksVarargs(value: SchemaLogSink*): Self = this.set("sinks", js.Array(value :_*))
    @scala.inline
    def setSinks(value: js.Array[SchemaLogSink]): Self = this.set("sinks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSinks: Self = this.set("sinks", js.undefined)
  }
  
}

