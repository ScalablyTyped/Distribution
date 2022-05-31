package typings.jupyterlabServices.messagesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A convenience type for a base for an execute reply content.
  */
trait IExecuteReplyBase
  extends StObject
     with IExecuteCount
     with IReplyOkContent
object IExecuteReplyBase {
  
  inline def apply(): IExecuteReplyBase = {
    val __obj = js.Dynamic.literal(status = "ok", execution_count = null)
    __obj.asInstanceOf[IExecuteReplyBase]
  }
}
