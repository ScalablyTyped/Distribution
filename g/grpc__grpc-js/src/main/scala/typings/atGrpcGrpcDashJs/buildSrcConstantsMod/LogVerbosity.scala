package typings.atGrpcGrpcDashJs.buildSrcConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LogVerbosity extends js.Object

@JSImport("@grpc/grpc-js/build/src/constants", "LogVerbosity")
@js.native
object LogVerbosity extends js.Object {
  @js.native
  sealed trait DEBUG extends LogVerbosity
  
  @js.native
  sealed trait ERROR extends LogVerbosity
  
  @js.native
  sealed trait INFO extends LogVerbosity
  
  /* 0 */ val DEBUG: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.LogVerbosity.DEBUG with Double = js.native
  /* 2 */ val ERROR: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.LogVerbosity.ERROR with Double = js.native
  /* 1 */ val INFO: typings.atGrpcGrpcDashJs.buildSrcConstantsMod.LogVerbosity.INFO with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LogVerbosity with Double] = js.native
}

