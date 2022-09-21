package typings.massive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("massive", "Sequence")
@js.native
open class Sequence protected () extends StObject {
  /** A database sequence. */
  def this(db: Database, name: String, schema: String) = this()
  
  /**
    * Get the last value the sequence returned.
    * The return value will be a stringified number.
    */
  def lastValue(): js.Promise[String] = js.native
  
  /**
    * Increment the sequence counter and return the next value.
    * The return value will be a stringified number.
    */
  def nextValue(): js.Promise[String] = js.native
  
  /** Reset the sequence. */
  def reset(initialValue: Double): js.Promise[Unit] = js.native
}
