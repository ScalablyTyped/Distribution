package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a INSERT query. */
@JSImport("massive", "Insert")
@js.native
class Insert protected ()
  extends massiveLib.massiveMod.massiveNs.Insert {
  def this(source: massiveLib.massiveMod.massiveNs.Readable, record: js.Array[_]) = this()
  /** Represents an INSERT query. */
  def this(source: massiveLib.massiveMod.massiveNs.Readable, record: massiveLib.massiveMod.massiveNs.AnyObject[_]) = this()
  def this(source: massiveLib.massiveMod.massiveNs.Readable, record: js.Array[_], options: massiveLib.massiveMod.massiveNs.ResultProcessingOptions with massiveLib.massiveMod.massiveNs.PersistenceInsertOptions) = this()
  def this(source: massiveLib.massiveMod.massiveNs.Readable, record: massiveLib.massiveMod.massiveNs.AnyObject[_], options: massiveLib.massiveMod.massiveNs.ResultProcessingOptions with massiveLib.massiveMod.massiveNs.PersistenceInsertOptions) = this()
  /** Format this object into a SQL SELECT. */
  /* CompleteClass */
  override def format(): java.lang.String = js.native
}

