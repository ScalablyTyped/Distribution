package typings.jsforce.bulkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.jsforce.jsforceStrings.insert
  - typings.jsforce.jsforceStrings.update
  - typings.jsforce.jsforceStrings.upsert
  - typings.jsforce.jsforceStrings.delete
  - typings.jsforce.jsforceStrings.hardDelete
*/
trait BulkLoadOperation extends js.Object

object BulkLoadOperation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def delete: typings.jsforce.jsforceStrings.delete = this.cast("delete")
  @scala.inline
  def hardDelete: typings.jsforce.jsforceStrings.hardDelete = this.cast("hardDelete")
  @scala.inline
  def insert: typings.jsforce.jsforceStrings.insert = this.cast("insert")
  @scala.inline
  def update: typings.jsforce.jsforceStrings.update = this.cast("update")
  @scala.inline
  def upsert: typings.jsforce.jsforceStrings.upsert = this.cast("upsert")
}

