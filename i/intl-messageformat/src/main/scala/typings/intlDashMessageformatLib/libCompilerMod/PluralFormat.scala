package typings
package intlDashMessageformatLib.libCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("intl-messageformat/lib/compiler", "PluralFormat")
@js.native
class PluralFormat protected () extends _Pattern {
  def this(id: java.lang.String, useOrdinal: scala.Boolean, offset: scala.Double, options: stdLib.Record[java.lang.String, js.Array[Pattern]], locales: java.lang.String) = this()
  def this(id: java.lang.String, useOrdinal: scala.Boolean, offset: scala.Double, options: stdLib.Record[java.lang.String, js.Array[Pattern]], locales: js.Array[java.lang.String]) = this()
  var id: java.lang.String = js.native
  var offset: js.Any = js.native
  var options: js.Any = js.native
  var pluralRules: js.Any = js.native
  def getOption(value: scala.Double): js.Array[Pattern] = js.native
}

