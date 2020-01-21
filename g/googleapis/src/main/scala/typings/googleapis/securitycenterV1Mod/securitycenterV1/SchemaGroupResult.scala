package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result containing the properties and count of a groupBy request.
  */
@js.native
trait SchemaGroupResult extends js.Object {
  /**
    * Total count of resources for the given properties.
    */
  var count: js.UndefOr[String] = js.native
  /**
    * Properties matching the groupBy fields in the request.
    */
  var properties: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object SchemaGroupResult {
  @scala.inline
  def apply(count: String = null, properties: StringDictionary[js.Any] = null): SchemaGroupResult = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGroupResult]
  }
}

