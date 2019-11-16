package typings.atKeystonejsAdapterDashMongoose.atKeystonejsAdapterDashMongooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongooseAdaptorOptions extends js.Object {
  var listAdapterClass: js.UndefOr[js.Any] = js.undefined
  var mongoUri: String
}

object MongooseAdaptorOptions {
  @scala.inline
  def apply(mongoUri: String, listAdapterClass: js.Any = null): MongooseAdaptorOptions = {
    val __obj = js.Dynamic.literal(mongoUri = mongoUri)
    if (listAdapterClass != null) __obj.updateDynamic("listAdapterClass")(listAdapterClass)
    __obj.asInstanceOf[MongooseAdaptorOptions]
  }
}

