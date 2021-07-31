package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a INSERT query. */
@JSImport("massive", "Insert")
@js.native
class Insert protected () extends StObject {
  def this(source: Readable, record: js.Array[js.Any]) = this()
  /** Represents an INSERT query. */
  def this(source: Readable, record: AnyObject[js.Any]) = this()
  def this(
    source: Readable,
    record: js.Array[js.Any],
    options: ResultProcessingOptions & PersistenceInsertOptions
  ) = this()
  def this(
    source: Readable,
    record: AnyObject[js.Any],
    options: ResultProcessingOptions & PersistenceInsertOptions
  ) = this()
  
  /** Format this object into a SQL SELECT. */
  def format(): String = js.native
}
