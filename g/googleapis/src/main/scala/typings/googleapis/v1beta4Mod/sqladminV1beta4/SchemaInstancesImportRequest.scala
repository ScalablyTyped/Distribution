package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance import request.
  */
@js.native
trait SchemaInstancesImportRequest extends js.Object {
  /**
    * Contains details about the import operation.
    */
  var importContext: js.UndefOr[SchemaImportContext] = js.native
}

object SchemaInstancesImportRequest {
  @scala.inline
  def apply(importContext: SchemaImportContext = null): SchemaInstancesImportRequest = {
    val __obj = js.Dynamic.literal()
    if (importContext != null) __obj.updateDynamic("importContext")(importContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesImportRequest]
  }
}

