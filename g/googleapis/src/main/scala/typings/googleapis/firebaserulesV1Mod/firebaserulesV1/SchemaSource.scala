package typings.googleapis.firebaserulesV1Mod.firebaserulesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Source` is one or more `File` messages comprising a logical set of rules.
  */
@js.native
trait SchemaSource extends js.Object {
  /**
    * `File` set constituting the `Source` bundle.
    */
  var files: js.UndefOr[js.Array[SchemaFile]] = js.native
}

object SchemaSource {
  @scala.inline
  def apply(files: js.Array[SchemaFile] = null): SchemaSource = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSource]
  }
}

