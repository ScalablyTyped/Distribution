package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Intents.BatchUpdateIntents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse extends js.Object {
  /**
    * The collection of updated or created intents.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Intent]] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1BatchUpdateIntentsResponseOps[Self <: SchemaGoogleCloudDialogflowV2beta1BatchUpdateIntentsResponse] (val x: Self) extends AnyVal {
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
    def setIntentsVarargs(value: SchemaGoogleCloudDialogflowV2beta1Intent*): Self = this.set("intents", js.Array(value :_*))
    @scala.inline
    def setIntents(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Intent]): Self = this.set("intents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntents: Self = this.set("intents", js.undefined)
  }
  
}

