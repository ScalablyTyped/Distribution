package typings
package lovefieldLib.lovefieldMod.lfNs.queryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Select extends Builder {
  def from(tables: lovefieldLib.lovefieldMod.lfNs.schemaNs.Table*): Select = js.native
  def groupBy(columns: lovefieldLib.lovefieldMod.lfNs.schemaNs.Column*): Select = js.native
  def innerJoin(
    table: lovefieldLib.lovefieldMod.lfNs.schemaNs.Table,
    predicate: lovefieldLib.lovefieldMod.lfNs.Predicate
  ): Select = js.native
  def leftOuterJoin(
    table: lovefieldLib.lovefieldMod.lfNs.schemaNs.Table,
    predicate: lovefieldLib.lovefieldMod.lfNs.Predicate
  ): Select = js.native
  def limit(numberOfRows: lovefieldLib.lovefieldMod.lfNs.Binder): Select = js.native
  def limit(numberOfRows: scala.Double): Select = js.native
  def orderBy(column: lovefieldLib.lovefieldMod.lfNs.schemaNs.Column): Select = js.native
  def orderBy(
    column: lovefieldLib.lovefieldMod.lfNs.schemaNs.Column,
    order: lovefieldLib.lovefieldMod.lfNs.Order
  ): Select = js.native
  def skip(numberOfRows: lovefieldLib.lovefieldMod.lfNs.Binder): Select = js.native
  def skip(numberOfRows: scala.Double): Select = js.native
  def where(predicate: lovefieldLib.lovefieldMod.lfNs.Predicate): Select = js.native
}

