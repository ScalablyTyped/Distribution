package typings.googleapis.servicenetworkingV1betaMod.servicenetworkingV1beta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Source information used to create a Service Config
  */
@js.native
trait SchemaSourceInfo extends js.Object {
  /**
    * All files used during config generation.
    */
  var sourceFiles: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
}

object SchemaSourceInfo {
  @scala.inline
  def apply(sourceFiles: js.Array[StringDictionary[_]] = null): SchemaSourceInfo = {
    val __obj = js.Dynamic.literal()
    if (sourceFiles != null) __obj.updateDynamic("sourceFiles")(sourceFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceInfo]
  }
}

