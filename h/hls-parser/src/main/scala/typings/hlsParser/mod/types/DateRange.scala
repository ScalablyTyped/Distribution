package typings.hlsParser.mod.types

import typings.hlsParser.anon.Attributes
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls-parser", "types.DateRange")
@js.native
class DateRange protected () extends js.Object {
  def this(properties: Attributes) = this()
  
  var attributes: js.UndefOr[js.Object] = js.native
  
  var classId: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var end: js.UndefOr[Date] = js.native
  
  var endOnNext: js.UndefOr[Boolean] = js.native
  
  var id: String = js.native
  
  var plannedDuration: js.UndefOr[Double] = js.native
  
  var start: Date = js.native
}
