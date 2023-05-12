package typings.johnnyFive.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("johnny-five", "Relays")
@js.native
open class Relays protected ()
  extends StObject
     with /* index */ NumberDictionary[Relay] {
  /**
    * An array of pins
    */
  /**
    * Using relays with different types. Some NC, some NO, etc…
    */
  // tslint:disable-next-line:unified-signatures
  /**
    * Using an array of existing relays to join them into a single interface.
    */
  def this(options: js.Array[Double | Relay | RelayOption | String]) = this()
  
  /**
    * Close the circuit.
    */
  def close(): Unit = js.native
  
  /**
    * Open the circuit.
    */
  def open(): Unit = js.native
  
  /**
    * Toggle the circuit open/close.
    */
  def toggle(): Unit = js.native
}
