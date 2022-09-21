package typings.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hls.js", "DateRange")
@js.native
open class DateRange protected () extends StObject {
  def this(dateRangeAttr: AttrList) = this()
  def this(dateRangeAttr: AttrList, dateRangeWithSameId: DateRange) = this()
  
  /* private */ var _badValueForSameId: Any = js.native
  
  /* private */ var _endDate: Any = js.native
  
  /* private */ var _startDate: Any = js.native
  
  var attr: AttrList = js.native
  
  def `class`: String = js.native
  
  def duration: Double | Null = js.native
  
  def endDate: js.Date | Null = js.native
  
  def endOnNext: Boolean = js.native
  
  def id: String = js.native
  
  def isValid: Boolean = js.native
  
  def plannedDuration: Double | Null = js.native
  
  def startDate: js.Date = js.native
}
