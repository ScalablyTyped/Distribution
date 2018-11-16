package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The PlainObject type is a JavaScript object containing zero or more key-value pairs. The plain object is, in other words, an Object object. It is designated "plain" in jQuery documentation to distinguish it from other kinds of JavaScript objects: for example, null, user-defined arrays, and host objects such as document, all of which have a typeof value of "object."
     *
     * **Note**: The type declaration of PlainObject is imprecise. It includes host objects and user-defined arrays which do not match jQuery's definition.
     */

trait PlainObject[T]
  extends /* key */ ScalablyTyped.runtime.StringDictionary[T]

