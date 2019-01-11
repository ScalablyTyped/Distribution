package typings
package jsonUnderscoreMlLib.jsonUnderscoreMlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("json_ml", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def parse(xml: java.lang.String): js.Array[jsonUnderscoreMlLib.jsonUnderscoreMlMod.Node] = js.native
  def parse(xml: java.lang.String, trim: scala.Boolean): js.Array[jsonUnderscoreMlLib.jsonUnderscoreMlMod.Node] = js.native
  def stringify(`object`: js.Array[jsonUnderscoreMlLib.jsonUnderscoreMlMod.Node]): java.lang.String = js.native
  def stringify(
    `object`: js.Array[jsonUnderscoreMlLib.jsonUnderscoreMlMod.Node],
    replacer: js.Function1[/* node */ cheerioLib.Cheerio, _]
  ): java.lang.String = js.native
  def stringify(
    `object`: js.Array[jsonUnderscoreMlLib.jsonUnderscoreMlMod.Node],
    replacer: js.Function1[/* node */ cheerioLib.Cheerio, _],
    indent: scala.Double
  ): java.lang.String = js.native
  def stringify(
    `object`: js.Array[jsonUnderscoreMlLib.jsonUnderscoreMlMod.Node],
    replacer: scala.Null,
    indent: scala.Double
  ): java.lang.String = js.native
}

