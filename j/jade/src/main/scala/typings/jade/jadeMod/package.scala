package typings.jade

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jadeMod {
  type JadeCustomFilterFunction = js.Function2[/* text */ String, /* options */ StringDictionary[Boolean], String]
  type JadeGenerationFunction = js.Function1[/* locals */ js.UndefOr[TemplateLocals], String]
  type TemplateLocals = StringDictionary[js.Any]
}
