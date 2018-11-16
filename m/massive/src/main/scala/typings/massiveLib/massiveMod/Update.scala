package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a UPDATE query. */
@JSImport("massive", "Update")
@js.native
class Update protected ()
  extends massiveLib.massiveMod.massiveNs.Update {
  /** Represents an UPDATE query. */
  def this(source: massiveLib.massiveMod.massiveNs.Readable, changes: massiveLib.massiveMod.massiveNs.AnyObject[_], criteria: massiveLib.massiveMod.massiveNs.AnyObject[_]) = this()
  /** Represents an UPDATE query. */
  def this(source: massiveLib.massiveMod.massiveNs.Readable, changes: massiveLib.massiveMod.massiveNs.AnyObject[_], criteria: massiveLib.massiveMod.massiveNs.AnyObject[_], options: massiveLib.massiveMod.massiveNs.ResultProcessingOptions with massiveLib.massiveMod.massiveNs.PersistenceUpdateDocOptions) = this()
  /** Format this object into a SQL SELECT. */
  /* CompleteClass */
  override def format(): java.lang.String = js.native
}

