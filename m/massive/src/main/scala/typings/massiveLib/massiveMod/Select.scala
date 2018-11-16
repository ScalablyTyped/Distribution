package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SELECT query. */
@JSImport("massive", "Select")
@js.native
class Select protected ()
  extends massiveLib.massiveMod.massiveNs.Select {
  /** Represents an SELECT query. */
  def this(source: massiveLib.massiveMod.massiveNs.Readable, criteria: massiveLib.massiveMod.massiveNs.AnyObject[_]) = this()
  /** Represents an SELECT query. */
  def this(source: massiveLib.massiveMod.massiveNs.Readable, criteria: massiveLib.massiveMod.massiveNs.UUID) = this()
  /** Represents an SELECT query. */
  def this(source: massiveLib.massiveMod.massiveNs.Readable, criteria: massiveLib.massiveMod.massiveNs.AnyObject[_], options: massiveLib.massiveMod.massiveNs.RetrievalOptions with massiveLib.massiveMod.massiveNs.ResultProcessingOptions) = this()
  /** Represents an SELECT query. */
  def this(source: massiveLib.massiveMod.massiveNs.Readable, criteria: massiveLib.massiveMod.massiveNs.UUID, options: massiveLib.massiveMod.massiveNs.RetrievalOptions with massiveLib.massiveMod.massiveNs.ResultProcessingOptions) = this()
  /** Format this object into a SQL SELECT. */
  /* CompleteClass */
  override def format(): java.lang.String = js.native
}

