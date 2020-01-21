package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A map value.
  */
@js.native
trait SchemaMapValue extends js.Object {
  /**
    * The map&#39;s fields.  The map keys represent field names. Field names
    * matching the regular expression `__.*__` are reserved. Reserved field
    * names are forbidden except in certain documented contexts. The map keys,
    * represented as UTF-8, must not exceed 1,500 bytes and cannot be empty.
    */
  var fields: js.UndefOr[StringDictionary[SchemaValue]] = js.native
}

object SchemaMapValue {
  @scala.inline
  def apply(fields: StringDictionary[SchemaValue] = null): SchemaMapValue = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMapValue]
  }
}

