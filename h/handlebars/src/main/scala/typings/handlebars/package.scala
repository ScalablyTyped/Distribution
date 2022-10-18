package typings.handlebars

import org.scalablytyped.runtime.StringDictionary
import typings.handlebars.Handlebars.TemplateDelegate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CompilerInfo = js.Tuple2[Double, String]

type CustomHelperName = String

// NOTE: for backward compatibility of this typing
type HandlebarsTemplateDelegate[T] = TemplateDelegate[T]

type HandlebarsTemplates = StringDictionary[HandlebarsTemplateDelegate[Any]]

// for backward compatibility of this typing
type RuntimeOptions = typings.handlebars.Handlebars.RuntimeOptions
