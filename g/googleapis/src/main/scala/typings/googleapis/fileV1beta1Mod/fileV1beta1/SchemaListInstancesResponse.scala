package typings.googleapis.fileV1beta1Mod.fileV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ListInstancesResponse is the result of ListInstancesRequest.
  */
@js.native
trait SchemaListInstancesResponse extends js.Object {
  /**
    * A list of instances in the project for the specified location.  If the
    * {location} value in the request is &quot;-&quot;, the response contains a
    * list of instances from all locations. If any location is unreachable, the
    * response will only return instances in reachable locations and the
    * &quot;unreachable&quot; field will be populated with a list of
    * unreachable locations.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.native
  /**
    * The token you can use to retrieve the next page of results. Not returned
    * if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}

object SchemaListInstancesResponse {
  @scala.inline
  def apply(): SchemaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInstancesResponse]
  }
  @scala.inline
  implicit class SchemaListInstancesResponseOps[Self <: SchemaListInstancesResponse] (val x: Self) extends AnyVal {
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
    def setInstancesVarargs(value: SchemaInstance*): Self = this.set("instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: js.Array[SchemaInstance]): Self = this.set("instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("instances", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = this.set("unreachable", js.Array(value :_*))
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = this.set("unreachable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnreachable: Self = this.set("unreachable", js.undefined)
  }
  
}

