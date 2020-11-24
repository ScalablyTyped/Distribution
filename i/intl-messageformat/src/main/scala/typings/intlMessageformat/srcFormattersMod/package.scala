package typings.intlMessageformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object srcFormattersMod {
  
  type FormatXMLElementFn[T, R] = js.Function1[/* parts */ js.Array[java.lang.String | T], R]
  
  type PrimitiveType = js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null | typings.std.Date]
}
