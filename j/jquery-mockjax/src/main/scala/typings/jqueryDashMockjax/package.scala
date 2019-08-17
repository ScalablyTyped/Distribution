package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jqueryDashMockjax {
  import org.scalablytyped.runtime.StringDictionary

  type MockJaxCustomLogger = StringDictionary[MockJaxLoggingFunction]
  type MockJaxLoggingFunction = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  type MockJaxSettingsHeaders = StringDictionary[String]
}
