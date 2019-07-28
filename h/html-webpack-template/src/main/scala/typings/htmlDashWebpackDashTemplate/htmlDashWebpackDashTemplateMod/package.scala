package typings.htmlDashWebpackDashTemplate

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object htmlDashWebpackDashTemplateMod {
  type Attributes = StringDictionary[js.Any]
  /** @deprecated use Options */
  type Config = Options
  /** @deprecated use GoogleAnalyticsOptions */
  type GoogleAnalyticsConfig = GoogleAnalyticsOptions
  /**
  	 * string: value is assigned to the href attribute and the rel attribute is set to "stylesheet"
  	 * object: properties and values are used as the attribute names and values, respectively.
  	 */
  type Link = Resource
  type Resource = String | Attributes
  /**
  	 * string: value is assigned to the src attribute and the type attribute is set to "text/javascript".
  	 * object: properties and values are used as the attribute names and values, respectively.
  	 */
  type Script = Resource
}
