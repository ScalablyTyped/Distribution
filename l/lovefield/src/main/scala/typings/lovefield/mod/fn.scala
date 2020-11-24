package typings.lovefield.mod

import typings.lovefield.mod.schema.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// module op
@JSImport("lovefield", "fn")
@js.native
object fn extends js.Object {
  
  def avg(column: Column): Column = js.native
  
  def count(): Column = js.native
  def count(column: Column): Column = js.native
  
  def distinct(column: Column): Column = js.native
  
  def geomean(column: Column): Column = js.native
  
  def max(column: Column): Column = js.native
  
  def min(column: Column): Column = js.native
  
  def stddev(column: Column): Column = js.native
  
  def sum(column: Column): Column = js.native
}
