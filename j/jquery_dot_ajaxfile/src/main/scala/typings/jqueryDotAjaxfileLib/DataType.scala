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
  
  /* 0 */ val Json: Json with scala.Double = js.native
  /* 2 */ val Text: Text with scala.Double = js.native
  /* 1 */ val Xml: Xml with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[jqueryDotAjaxfileLib.DataType with scala.Double] = js.native
}

