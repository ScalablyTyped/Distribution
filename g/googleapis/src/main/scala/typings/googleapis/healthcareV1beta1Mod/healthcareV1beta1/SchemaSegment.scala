package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A segment in a structured format.
  */
@js.native
trait SchemaSegment extends js.Object {
  /**
    * A mapping from the positional location to the value. The key string uses
    * zero-based indexes separated by dots to identify Fields, components and
    * sub-components. A bracket notation is also used to identify different
    * instances of a repeated field. Regex for key:
    * (\d+)(\[\d+\])?(.\d+)?(.\d+)?  Examples of (key, value) pairs: - (0.1,
    * &quot;foo&quot;): Component 1 of Field 0 has the value &quot;foo&quot;. -
    * (1.1.2, &quot;bar&quot;): Sub-component 2 of Component 1 of field 1 has
    * the value &quot;bar&quot;. - (1[2].1, &quot;baz&quot;): Component 1 of
    * Instance 2 of Field 1, which is repeated, has the value &quot;baz&quot;.
    */
  var fields: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A string that indicates the type of segment, e.g., EVN, PID.
    */
  var segmentId: js.UndefOr[String] = js.native
  /**
    * Set ID for segments that can be in a set. This can be empty if it is
    * missing or it is not applicable.
    */
  var setId: js.UndefOr[String] = js.native
}

object SchemaSegment {
  @scala.inline
  def apply(fields: StringDictionary[String] = null, segmentId: String = null, setId: String = null): SchemaSegment = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (segmentId != null) __obj.updateDynamic("segmentId")(segmentId.asInstanceOf[js.Any])
    if (setId != null) __obj.updateDynamic("setId")(setId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSegment]
  }
}

