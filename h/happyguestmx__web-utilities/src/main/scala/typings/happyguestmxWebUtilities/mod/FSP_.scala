package typings.happyguestmxWebUtilities.mod

import typings.happyguestmxWebUtilities.happyguestmxWebUtilitiesStrings.asc
import typings.happyguestmxWebUtilities.happyguestmxWebUtilitiesStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FSP_ extends StObject {
  
  def FSP(query: FspQuery): FspPaginationOutput = js.native
  
  def Filter(term: String): Boolean = js.native
  def Filter(term: js.Array[String]): Boolean = js.native
  
  def Pagin(page: Double, size: Double): FspPaginOutput = js.native
  
  def Sort(orderBy: String, sortType: asc | desc): js.Array[Any] = js.native
  
  var data: js.Array[Any] = js.native
  
  var filter: Boolean = js.native
  
  var filterColums: js.Array[Any] = js.native
  
  var should_sort: Boolean = js.native
}
