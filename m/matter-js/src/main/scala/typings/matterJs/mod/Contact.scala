package typings.matterJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter-js", "Contact")
@js.native
open class Contact () extends StObject {
  
  var normalImpulse: Double = js.native
  
  var tangentImpulse: Double = js.native
  
  var vertex: Vertex = js.native
}
/* static members */
object Contact {
  
  @JSImport("matter-js", "Contact")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new contact.
    * @method create
    * @param {Vertex} vertex
    * @returns {contact} A new contact
    */
  inline def create(vertex: Vertex): Contact = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(vertex.asInstanceOf[js.Any]).asInstanceOf[Contact]
}
