package typings
package lovefieldLib.lovefieldMod.lfNs.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBuilder extends js.Object {
  def addColumn(name: java.lang.String, `type`: lovefieldLib.lovefieldMod.lfNs.Type): TableBuilder = js.native
  def addForeignKey(name: java.lang.String, spec: RawForeignKeySpec): TableBuilder = js.native
  def addIndex(name: java.lang.String, columns: js.Array[java.lang.String | IndexedColumn]): TableBuilder = js.native
  def addIndex(name: java.lang.String, columns: js.Array[java.lang.String | IndexedColumn], unique: scala.Boolean): TableBuilder = js.native
  def addIndex(
    name: java.lang.String,
    columns: js.Array[java.lang.String | IndexedColumn],
    unique: scala.Boolean,
    order: lovefieldLib.lovefieldMod.lfNs.Order
  ): TableBuilder = js.native
  def addNullable(columns: js.Array[java.lang.String]): TableBuilder = js.native
  def addPrimaryKey(columns: js.Array[java.lang.String | IndexedColumn]): TableBuilder = js.native
  def addPrimaryKey(columns: js.Array[java.lang.String | IndexedColumn], autoInc: scala.Boolean): TableBuilder = js.native
  def addUnique(name: java.lang.String, columns: js.Array[java.lang.String]): TableBuilder = js.native
}

