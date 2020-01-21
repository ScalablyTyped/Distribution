package typings.googleapis.fusiontablesV2Mod.fusiontablesV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an import request.
  */
@js.native
trait SchemaImport extends js.Object {
  /**
    * The kind of item this is. For an import, this is always
    * fusiontables#import.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The number of rows received from the import request.
    */
  var numRowsReceived: js.UndefOr[String] = js.native
}

object SchemaImport {
  @scala.inline
  def apply(kind: String = null, numRowsReceived: String = null): SchemaImport = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (numRowsReceived != null) __obj.updateDynamic("numRowsReceived")(numRowsReceived.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImport]
  }
}

