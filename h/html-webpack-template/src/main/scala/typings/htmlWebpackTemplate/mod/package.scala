package typings.htmlWebpackTemplate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Attributes = org.scalablytyped.runtime.StringDictionary[js.Any]
  /** @deprecated use Options */
  type Config = typings.htmlWebpackTemplate.mod.Options
  /** @deprecated use GoogleAnalyticsOptions */
  type GoogleAnalyticsConfig = typings.htmlWebpackTemplate.mod.GoogleAnalyticsOptions
  /**
    * string: value is assigned to the href attribute and the rel attribute is set to "stylesheet"
    * object: properties and values are used as the attribute names and values, respectively.
    */
  type Link = typings.htmlWebpackTemplate.mod.Resource
  type Resource = java.lang.String | typings.htmlWebpackTemplate.mod.Attributes
  /**
    * string: value is assigned to the src attribute and the type attribute is set to "text/javascript".
    * object: properties and values are used as the attribute names and values, respectively.
    */
  type Script = typings.htmlWebpackTemplate.mod.Resource
}
