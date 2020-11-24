package typings.jsdevtoolsOno.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnoError[T] extends ErrorPOJO {
  
  /**
    * Returns a JSON representation of the error, including all built-in error properties,
    * as well as properties that were dynamically added.
    */
  def toJSON(): ErrorPOJO with T = js.native
}
