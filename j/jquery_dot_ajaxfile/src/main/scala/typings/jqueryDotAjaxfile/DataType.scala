package typings.jqueryDotAjaxfile

import org.scalablytyped.runtime.TopLevel
import typings.jqueryDotAjaxfile.DataType.Json
import typings.jqueryDotAjaxfile.DataType.Text
import typings.jqueryDotAjaxfile.DataType.Xml
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DataType with Double] = js.native
  /* 0 */ @js.native
  object Json extends TopLevel[Json with Double]
  
  /* 2 */ @js.native
  object Text extends TopLevel[Text with Double]
  
  /* 1 */ @js.native
  object Xml extends TopLevel[Xml with Double]
  
}

