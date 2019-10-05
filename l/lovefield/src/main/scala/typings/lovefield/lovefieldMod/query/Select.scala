package typings.lovefield.lovefieldMod.query

import typings.lovefield.lovefieldMod.Binder
import typings.lovefield.lovefieldMod.Order
import typings.lovefield.lovefieldMod.Predicate
import typings.lovefield.lovefieldMod.schema.Column
import typings.lovefield.lovefieldMod.schema.Table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select extends Builder {
  def from(tables: Table*): Select = js.native
  def groupBy(columns: Column*): Select = js.native
  def innerJoin(table: Table, predicate: Predicate): Select = js.native
  def leftOuterJoin(table: Table, predicate: Predicate): Select = js.native
  def limit(numberOfRows: Double): Select = js.native
  def limit(numberOfRows: Binder): Select = js.native
  def orderBy(column: Column): Select = js.native
  def orderBy(column: Column, order: Order): Select = js.native
  def skip(numberOfRows: Double): Select = js.native
  def skip(numberOfRows: Binder): Select = js.native
  def where(predicate: Predicate): Select = js.native
}

