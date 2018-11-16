package typings
package graphqlLib.errorFormatErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLFormattedError extends js.Object {
  val extensions: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  val locations: js.UndefOr[js.Array[graphqlLib.languageLocationMod.SourceLocation]]
  val message: java.lang.String
  val path: js.UndefOr[js.Array[java.lang.String | scala.Double]]
}

