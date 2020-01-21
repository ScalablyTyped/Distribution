package typings.jsToJava.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Currency
  extends /* k */ StringDictionary[js.Any] {
  var currencyCode: java.lang.String
}

@JSImport("js-to-java", "Currency")
@js.native
object Currency extends js.Object {
  def apply(): js.Object = js.native
  def apply(value: java.lang.String): js.Object = js.native
  def apply(value: Currency): js.Object = js.native
}

