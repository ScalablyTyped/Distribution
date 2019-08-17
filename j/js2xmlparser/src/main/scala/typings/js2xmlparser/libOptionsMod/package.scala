package typings.js2xmlparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libOptionsMod {
  import org.scalablytyped.runtime.StringDictionary

  type ITypeHandlers = /**
    * Mapping between the type of a value in an object to a function taking
    * this value and returning a replacement value.
    */
  StringDictionary[js.Function1[/* value */ js.Any, js.Any]]
  type IWrapHandlers = /**
    * Mapping between the string version of a key in an object or map with a
    * value that is an array or set to a function taking the string version
    * of that key, as well as that array or set.
    *
    * This function returns either a string that will become the name for each
    * XML element for each item in the array or set, or `null` to indicate that
    * wrapping should not occur.
    */
  StringDictionary[js.Function2[/* key */ String, /* value */ js.Any, String | Null]]
}
