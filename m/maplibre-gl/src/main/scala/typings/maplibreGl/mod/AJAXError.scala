package typings.maplibreGl.mod

import typings.std.Blob
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "AJAXError")
@js.native
open class AJAXError protected ()
  extends StObject
     with Error {
  def this(status: Double, statusText: String, url: String, body: Blob) = this()
  
  /**
  	 * The response's body.
  	 */
  var body: Blob = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  /**
  	 * The response's HTTP status code.
  	 */
  var status: Double = js.native
  
  /**
  	 * The response's HTTP status text.
  	 */
  var statusText: String = js.native
  
  /**
  	 * The request's URL.
  	 */
  var url: String = js.native
}
