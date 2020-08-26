package typings.googleapis.composerV1beta1Mod.composerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The environments in a project and location.
  */
@js.native
trait SchemaListEnvironmentsResponse extends js.Object {
  /**
    * The list of environments returned by a ListEnvironmentsRequest.
    */
  var environments: js.UndefOr[js.Array[SchemaEnvironment]] = js.native
  /**
    * The page token used to query for the next page if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListEnvironmentsResponse {
  @scala.inline
  def apply(): SchemaListEnvironmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListEnvironmentsResponse]
  }
  @scala.inline
  implicit class SchemaListEnvironmentsResponseOps[Self <: SchemaListEnvironmentsResponse] (val x: Self) extends AnyVal {
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
    def setEnvironmentsVarargs(value: SchemaEnvironment*): Self = this.set("environments", js.Array(value :_*))
    @scala.inline
    def setEnvironments(value: js.Array[SchemaEnvironment]): Self = this.set("environments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironments: Self = this.set("environments", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

