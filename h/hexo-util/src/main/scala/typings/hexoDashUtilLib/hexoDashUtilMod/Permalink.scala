package typings
package hexoDashUtilLib.hexoDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-util", "Permalink")
@js.native
class Permalink protected () extends js.Object {
  def this(rule: java.lang.String) = this()
  def this(rule: java.lang.String, options: hexoDashUtilLib.Anon_Segments) = this()
  var params: js.Array[java.lang.String] = js.native
  var regex: stdLib.RegExp = js.native
  var rule: java.lang.String = js.native
  def parse(str: java.lang.String): js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def stringify(data: org.scalablytyped.runtime.StringDictionary[java.lang.String]): java.lang.String = js.native
  def test(str: java.lang.String): scala.Boolean = js.native
}

