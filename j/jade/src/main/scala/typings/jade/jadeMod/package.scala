package typings.jade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jadeMod {
  import org.scalablytyped.runtime.StringDictionary

  type JadeCustomFilterFunction = js.Function2[/* text */ String, /* options */ StringDictionary[Boolean], String]
  type JadeGenerationFunction = js.Function1[/* locals */ js.UndefOr[TemplateLocals], String]
  type TemplateLocals = StringDictionary[js.Any]
}
