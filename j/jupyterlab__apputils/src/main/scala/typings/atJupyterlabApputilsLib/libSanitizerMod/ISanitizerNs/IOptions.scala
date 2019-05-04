package typings
package atJupyterlabApputilsLib.libSanitizerMod.ISanitizerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options used to sanitize.
  */
trait IOptions extends js.Object {
  /**
    * The allowed attributes for a given tag.
    */
  var allowedAttributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]] = js.undefined
  /**
    * The allowed style values for a given tag.
    */
  var allowedStyles: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Array[stdLib.RegExp]]]
  ] = js.undefined
  /**
    * The allowed tags.
    */
  var allowedTags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    allowedAttributes: org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]] = null,
    allowedStyles: org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[js.Array[stdLib.RegExp]]] = null,
    allowedTags: js.Array[java.lang.String] = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (allowedAttributes != null) __obj.updateDynamic("allowedAttributes")(allowedAttributes)
    if (allowedStyles != null) __obj.updateDynamic("allowedStyles")(allowedStyles)
    if (allowedTags != null) __obj.updateDynamic("allowedTags")(allowedTags)
    __obj.asInstanceOf[IOptions]
  }
}

