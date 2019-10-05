package typings.lovefield.lovefieldMod.schema

import typings.lovefield.lovefieldMod.Order
import typings.lovefield.lovefieldMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBuilder extends js.Object {
  def addColumn(name: String, `type`: Type): TableBuilder = js.native
  def addForeignKey(name: String, spec: RawForeignKeySpec): TableBuilder = js.native
  def addIndex(name: String, columns: js.Array[IndexedColumn | String]): TableBuilder = js.native
  def addIndex(name: String, columns: js.Array[IndexedColumn | String], unique: Boolean): TableBuilder = js.native
  def addIndex(name: String, columns: js.Array[IndexedColumn | String], unique: Boolean, order: Order): TableBuilder = js.native
  def addNullable(columns: js.Array[String]): TableBuilder = js.native
  def addPrimaryKey(columns: js.Array[IndexedColumn | String]): TableBuilder = js.native
  def addPrimaryKey(columns: js.Array[IndexedColumn | String], autoInc: Boolean): TableBuilder = js.native
  def addUnique(name: String, columns: js.Array[String]): TableBuilder = js.native
}

