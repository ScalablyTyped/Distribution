package typings.googleapis.discoveryV1Mod.discoveryV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRestResource extends js.Object {
  /**
    * Methods on this resource.
    */
  var methods: js.UndefOr[StringDictionary[SchemaRestMethod]] = js.native
  /**
    * Sub-resources on this resource.
    */
  var resources: js.UndefOr[StringDictionary[SchemaRestResource]] = js.native
}

object SchemaRestResource {
  @scala.inline
  def apply(
    methods: StringDictionary[SchemaRestMethod] = null,
    resources: StringDictionary[SchemaRestResource] = null
  ): SchemaRestResource = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRestResource]
  }
}

