package typings
package lovefieldLib.lovefieldMod.lfNs.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Database extends js.Object {
  def name(): java.lang.String
  def pragma(): DatabasePragma
  def table(tableName: java.lang.String): Table
  def tables(): js.Array[Table]
  def version(): scala.Double
}

