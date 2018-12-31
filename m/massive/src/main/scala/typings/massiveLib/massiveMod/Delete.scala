package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a UPDATE query. */
@JSImport("massive", "Delete")
@js.native
class Delete protected ()
  extends massiveLib.massiveMod.massiveNs.Delete {
  /** Represents a DELETE query. */
  def this(source: massiveLib.massiveMod.massiveNs.Readable) = this()
  def this(source: massiveLib.massiveMod.massiveNs.Readable, criteria: massiveLib.massiveMod.massiveNs.AnyObject[_]) = this()
  def this(source: massiveLib.massiveMod.massiveNs.Readable, criteria: massiveLib.massiveMod.massiveNs.UUID) = this()
  def this(source: massiveLib.massiveMod.massiveNs.Readable, criteria: scala.Double) = this()
  def this(source: massiveLib.massiveMod.massiveNs.Readable, criteria: massiveLib.massiveMod.massiveNs.AnyObject[_], options: massiveLib.massiveMod.massiveNs.ResultProcessingOptions with massiveLib.massiveMod.massiveNs.InheritanceOptions) = this()
  def this(source: massiveLib.massiveMod.massiveNs.Readable, criteria: massiveLib.massiveMod.massiveNs.UUID, options: massiveLib.massiveMod.massiveNs.ResultProcessingOptions with massiveLib.massiveMod.massiveNs.InheritanceOptions) = this()
  def this(source: massiveLib.massiveMod.massiveNs.Readable, criteria: scala.Double, options: massiveLib.massiveMod.massiveNs.ResultProcessingOptions with massiveLib.massiveMod.massiveNs.InheritanceOptions) = this()
  /** Format this object into a SQL SELECT. */
  /* CompleteClass */
  override def format(): java.lang.String = js.native
}

