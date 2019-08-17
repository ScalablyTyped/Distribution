package typings.massive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object massiveMod {
  import org.scalablytyped.runtime.StringDictionary

  type AnyObject[T] = StringDictionary[T]
  type QueryParamTypes = String | Double | js.Object
  type QueryParams = js.Array[QueryParamTypes] | QueryParamTypes
  type UUID = String
}
