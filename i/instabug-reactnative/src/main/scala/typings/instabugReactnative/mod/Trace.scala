package typings.instabugReactnative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("instabug-reactnative", "Trace")
@js.native
open class Trace protected () extends StObject {
  def this(id: String) = this()
  def this(id: String, name: String) = this()
  def this(id: String, name: String, attributes: js.Object) = this()
  def this(id: String, name: Unit, attributes: js.Object) = this()
  
  /**
    * End Execution Trace
    */
  def end(): Unit = js.native
  
  /**
    * Add an attribute with key and value to the Trace to be sent.
    * @param {string} key 
    * @param {string} value 
    */
  def setAttribute(key: String, value: String): Unit = js.native
}
