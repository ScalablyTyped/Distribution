package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of sources that the user can search using the query API.
  */
@js.native
trait SchemaQuerySource extends js.Object {
  /**
    * Display name of the data source.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * List of all operators applicable for this source.
    */
  var operators: js.UndefOr[js.Array[SchemaQueryOperator]] = js.native
  /**
    * A short name or alias for the source.  This value can be used with the
    * &#39;source&#39; operator.
    */
  var shortName: js.UndefOr[String] = js.native
  /**
    * Name of the source
    */
  var source: js.UndefOr[SchemaSource] = js.native
}

object SchemaQuerySource {
  @scala.inline
  def apply(
    displayName: String = null,
    operators: js.Array[SchemaQueryOperator] = null,
    shortName: String = null,
    source: SchemaSource = null
  ): SchemaQuerySource = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (operators != null) __obj.updateDynamic("operators")(operators.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuerySource]
  }
}

