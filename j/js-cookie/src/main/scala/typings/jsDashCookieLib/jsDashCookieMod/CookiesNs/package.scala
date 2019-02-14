package typings
package jsDashCookieLib.jsDashCookieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CookiesNs {
  type CookieReadConverter = js.Function2[/* value */ java.lang.String, /* name */ java.lang.String, java.lang.String]
  type CookieWriteConverter[T /* <: js.Object */] = js.Function2[/* value */ java.lang.String | T, /* name */ java.lang.String, java.lang.String]
}
