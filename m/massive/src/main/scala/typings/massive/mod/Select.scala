package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SELECT query. */
@JSImport("massive", "Select")
@js.native
open class Select protected () extends StObject {
  /** Represents an SELECT query. */
  def this(source: Readable, criteria: AnyObject[Any]) = this()
  def this(source: Readable, criteria: UUID) = this()
  def this(source: Readable, criteria: AnyObject[Any], options: RetrievalOptions & ResultProcessingOptions) = this()
  def this(source: Readable, criteria: UUID, options: RetrievalOptions & ResultProcessingOptions) = this()
  
  /** Format this object into a SQL SELECT. */
  def format(): String = js.native
}
