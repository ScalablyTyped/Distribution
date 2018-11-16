package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataType extends js.Object

@JSGlobal("DataType")
@js.native
object DataType extends js.Object {
  @js.native
  sealed trait Json
    extends jqueryDotAjaxfileLib.DataType
  
  @js.native
  sealed trait Text
    extends jqueryDotAjaxfileLib.DataType
  
  @js.native
  sealed trait Xml
    extends jqueryDotAjaxfileLib.DataType
  
  val Json: Json with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  val Xml: Xml with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[jqueryDotAjaxfileLib.DataType with java.lang.String] = js.native
}

