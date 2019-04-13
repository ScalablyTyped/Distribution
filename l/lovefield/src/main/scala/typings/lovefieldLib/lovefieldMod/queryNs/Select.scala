package typings
package lovefieldLib.lovefieldMod.queryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select extends Builder {
  def from(tables: lovefieldLib.lovefieldMod.schemaNs.Table*): Select = js.native
  def groupBy(columns: lovefieldLib.lovefieldMod.schemaNs.Column*): Select = js.native
  def innerJoin(table: lovefieldLib.lovefieldMod.schemaNs.Table, predicate: lovefieldLib.lovefieldMod.Predicate): Select = js.native
  def leftOuterJoin(table: lovefieldLib.lovefieldMod.schemaNs.Table, predicate: lovefieldLib.lovefieldMod.Predicate): Select = js.native
  def limit(numberOfRows: lovefieldLib.lovefieldMod.Binder): Select = js.native
  def limit(numberOfRows: scala.Double): Select = js.native
  def orderBy(column: lovefieldLib.lovefieldMod.schemaNs.Column): Select = js.native
  def orderBy(column: lovefieldLib.lovefieldMod.schemaNs.Column, order: lovefieldLib.lovefieldMod.Order): Select = js.native
  def skip(numberOfRows: lovefieldLib.lovefieldMod.Binder): Select = js.native
  def skip(numberOfRows: scala.Double): Select = js.native
  def where(predicate: lovefieldLib.lovefieldMod.Predicate): Select = js.native
}

