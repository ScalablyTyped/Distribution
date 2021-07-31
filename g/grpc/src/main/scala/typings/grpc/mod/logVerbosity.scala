package typings.grpc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait logVerbosity extends StObject
@JSImport("grpc", "logVerbosity")
@js.native
object logVerbosity extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[logVerbosity & Double] = js.native
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with logVerbosity
  /* 0 */ val DEBUG: typings.grpc.mod.logVerbosity.DEBUG & Double = js.native
  
  @js.native
  sealed trait ERROR
    extends StObject
       with logVerbosity
  /* 2 */ val ERROR: typings.grpc.mod.logVerbosity.ERROR & Double = js.native
  
  @js.native
  sealed trait INFO
    extends StObject
       with logVerbosity
  /* 1 */ val INFO: typings.grpc.mod.logVerbosity.INFO & Double = js.native
}
