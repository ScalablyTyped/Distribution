package typings

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.HandlebarsNs.TemplateDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object handlebars {
  // NOTE: for backward compatibility of this typing
  type HandlebarsTemplateDelegate[T] = TemplateDelegate[T]
  type HandlebarsTemplates = StringDictionary[HandlebarsTemplateDelegate[js.Any]]
  // for backward compatibility of this typing
  type RuntimeOptions = typings.handlebars.HandlebarsNs.RuntimeOptions
}
