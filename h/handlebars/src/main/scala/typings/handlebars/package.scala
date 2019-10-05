package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object handlebars {
  import org.scalablytyped.runtime.StringDictionary
  import typings.handlebars.Handlebars.TemplateDelegate

  type CompilerInfo = js.Tuple2[Double, String]
  type CustomHelperName = String
  // NOTE: for backward compatibility of this typing
  type HandlebarsTemplateDelegate[T] = TemplateDelegate[T]
  type HandlebarsTemplates = StringDictionary[HandlebarsTemplateDelegate[js.Any]]
  type KnownHelpers = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ name in handlebars.BuiltinHelperName | handlebars.CustomHelperName ]: boolean}
    */ typings.handlebars.handlebarsStrings.KnownHelpers with js.Any
  // for backward compatibility of this typing
  type RuntimeOptions = typings.handlebars.Handlebars.RuntimeOptions
}
