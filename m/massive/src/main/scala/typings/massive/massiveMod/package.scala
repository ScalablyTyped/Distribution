package typings.massive

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object massiveMod {
  type AnyObject[T] = StringDictionary[T]
  type QueryParamTypes = String | Double | js.Object
  type QueryParams = js.Array[QueryParamTypes] | QueryParamTypes
  type UUID = String
}
