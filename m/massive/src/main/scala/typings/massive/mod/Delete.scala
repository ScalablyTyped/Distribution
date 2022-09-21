package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a UPDATE query. */
@JSImport("massive", "Delete")
@js.native
open class Delete protected () extends StObject {
  /** Represents a DELETE query. */
  def this(source: Readable) = this()
  def this(source: Readable, criteria: Double) = this()
  def this(source: Readable, criteria: AnyObject[Any]) = this()
  def this(source: Readable, criteria: UUID) = this()
  def this(source: Readable, criteria: Double, options: ResultProcessingOptions & InheritanceOptions) = this()
  def this(source: Readable, criteria: Unit, options: ResultProcessingOptions & InheritanceOptions) = this()
  def this(source: Readable, criteria: AnyObject[Any], options: ResultProcessingOptions & InheritanceOptions) = this()
  def this(source: Readable, criteria: UUID, options: ResultProcessingOptions & InheritanceOptions) = this()
  
  /** Format this object into a SQL SELECT. */
  def format(): String = js.native
}
