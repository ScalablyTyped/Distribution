package typings.matrixAppserviceBridge.mod

import typings.matrixAppservice.anon.Errcode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice-bridge", "AppserviceHttpError")
@js.native
open class AppserviceHttpError protected ()
  extends typings.matrixAppservice.mod.AppserviceHttpError {
  /**
    * Creates a new Appservice HTTP error
    * @param body The error body.
    * @param status The HTTP status code.
    */
  def this(body: Errcode, status: Double) = this()
}
