package typings.jqueryDotAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DataType extends js.Object

@JSGlobal("DataType")
@js.native
object DataType extends js.Object {
  @js.native
  sealed trait Json extends DataType
  
  @js.native
  sealed trait Text extends DataType
  
  @js.native
  sealed trait Xml extends DataType
  
  /* 0 */ val Json: typings.jqueryDotAjaxfile.DataType.Json with Double = js.native
  /* 2 */ val Text: typings.jqueryDotAjaxfile.DataType.Text with Double = js.native
  /* 1 */ val Xml: typings.jqueryDotAjaxfile.DataType.Xml with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataType with Double] = js.native
}

