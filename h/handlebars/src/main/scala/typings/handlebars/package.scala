package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object handlebars {
  type CompilerInfo = js.Tuple2[scala.Double, java.lang.String]
  type CustomHelperName = java.lang.String
  // NOTE: for backward compatibility of this typing
  type HandlebarsTemplateDelegate[T] = typings.handlebars.Handlebars.TemplateDelegate[T]
  type HandlebarsTemplates = org.scalablytyped.runtime.StringDictionary[typings.handlebars.HandlebarsTemplateDelegate[js.Any]]
  type KnownHelpers = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in handlebars.BuiltinHelperName | handlebars.CustomHelperName ]: boolean}
    */ typings.handlebars.handlebarsStrings.KnownHelpers with org.scalablytyped.runtime.TopLevel[js.Any]
  // for backward compatibility of this typing
  type RuntimeOptions = typings.handlebars.Handlebars.RuntimeOptions
}
