package typings
package js2xmlparserLib.libOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWrapHandlers
  extends /**
  * Mapping between the string version of a key in an object or map with a
  * value that is an array or set to a function taking the string version
  * of that key, as well as that array or set.
  *
  * This function returns either a string that will become the name for each
  * XML element for each item in the array or set, or `null` to indicate that
  * wrapping should not occur.
  */
/* key */ org.scalablytyped.runtime.StringDictionary[
      js.Function2[/* key */ java.lang.String, /* value */ js.Any, java.lang.String | scala.Null]
    ]

object IWrapHandlers {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Mapping between the string version of a key in an object or map with a
    * value that is an array or set to a function taking the string version
    * of that key, as well as that array or set.
    *
    * This function returns either a string that will become the name for each
    * XML element for each item in the array or set, or `null` to indicate that
    * wrapping should not occur.
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[
      js.Function2[/* key */ java.lang.String, /* value */ js.Any, java.lang.String | scala.Null]
    ] = null
  ): IWrapHandlers = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[IWrapHandlers]
  }
}

