package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeedsConfig[V /* <: js.Object */] extends js.Object {
  var directory: js.UndefOr[String] = js.undefined
  var extension: js.UndefOr[String] = js.undefined
  var loadExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var stub: js.UndefOr[String] = js.undefined
  var variables: js.UndefOr[V] = js.undefined
}

object SeedsConfig {
  @scala.inline
  def apply[V](
    directory: String = null,
    extension: String = null,
    loadExtensions: js.Array[String] = null,
    stub: String = null,
    variables: V = null
  ): SeedsConfig[V] = {
    val __obj = js.Dynamic.literal()
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (loadExtensions != null) __obj.updateDynamic("loadExtensions")(loadExtensions.asInstanceOf[js.Any])
    if (stub != null) __obj.updateDynamic("stub")(stub.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeedsConfig[V]]
  }
}

