package typings.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The operation metadata returned for the batchend services operation.
  */
@js.native
trait SchemaGoogleApiServiceusageV1OperationMetadata extends js.Object {
  /**
    * The full name of the resources that this operation is directly associated
    * with.
    */
  var resourceNames: js.UndefOr[js.Array[String]] = js.native
}

object SchemaGoogleApiServiceusageV1OperationMetadata {
  @scala.inline
  def apply(): SchemaGoogleApiServiceusageV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleApiServiceusageV1OperationMetadata]
  }
  @scala.inline
  implicit class SchemaGoogleApiServiceusageV1OperationMetadataOps[Self <: SchemaGoogleApiServiceusageV1OperationMetadata] (val x: Self) extends AnyVal {
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
    def setResourceNamesVarargs(value: String*): Self = this.set("resourceNames", js.Array(value :_*))
    @scala.inline
    def setResourceNames(value: js.Array[String]): Self = this.set("resourceNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceNames: Self = this.set("resourceNames", js.undefined)
  }
  
}

