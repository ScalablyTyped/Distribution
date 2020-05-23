package typings.ineum.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendTraceId extends js.Object {
  var backendTraceId: js.UndefOr[String] = js.undefined
  var componentStack: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var error: js.UndefOr[Error] = js.undefined
  var meta: js.UndefOr[StringDictionary[String | Double | Boolean]] = js.undefined
}

object BackendTraceId {
  @scala.inline
  def apply(
    backendTraceId: String = null,
    componentStack: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    error: Error = null,
    meta: StringDictionary[String | Double | Boolean] = null
  ): BackendTraceId = {
    val __obj = js.Dynamic.literal()
    if (backendTraceId != null) __obj.updateDynamic("backendTraceId")(backendTraceId.asInstanceOf[js.Any])
    if (componentStack != null) __obj.updateDynamic("componentStack")(componentStack.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendTraceId]
  }
}

