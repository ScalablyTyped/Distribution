package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a UPDATE query. */
@JSImport("massive", "Update")
@js.native
class Update protected () extends StObject {
  /** Represents an UPDATE query. */
  def this(source: Readable, changes: AnyObject[js.Any], criteria: AnyObject[js.Any]) = this()
  def this(
    source: Readable,
    changes: AnyObject[js.Any],
    criteria: AnyObject[js.Any],
    options: ResultProcessingOptions & PersistenceUpdateDocOptions
  ) = this()
  
  /** Format this object into a SQL SELECT. */
  def format(): String = js.native
}
