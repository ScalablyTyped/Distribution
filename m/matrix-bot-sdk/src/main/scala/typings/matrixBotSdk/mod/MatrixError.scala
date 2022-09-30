package typings.matrixBotSdk.mod

import typings.matrixBotSdk.anon.Errcode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "MatrixError")
@js.native
open class MatrixError protected ()
  extends typings.matrixBotSdk.matrixErrorMod.MatrixError {
  /**
    * Creates a new Matrix Error
    * @param body The error body.
    * @param statusCode The HTTP status code.
    */
  def this(body: Errcode, statusCode: Double) = this()
}
