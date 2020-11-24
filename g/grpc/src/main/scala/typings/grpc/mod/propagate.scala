package typings.grpc.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait propagate extends js.Object
@JSImport("grpc", "propagate")
@js.native
object propagate extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[propagate with Double] = js.native
  
  @js.native
  sealed trait CANCELLATION extends propagate
  /* 3 */ @js.native
  object CANCELLATION extends TopLevel[CANCELLATION with Double]
  
  @js.native
  sealed trait CENSUS_STATS_CONTEXT extends propagate
  /* 1 */ @js.native
  object CENSUS_STATS_CONTEXT extends TopLevel[CENSUS_STATS_CONTEXT with Double]
  
  @js.native
  sealed trait CENSUS_TRACING_CONTEXT extends propagate
  /* 2 */ @js.native
  object CENSUS_TRACING_CONTEXT extends TopLevel[CENSUS_TRACING_CONTEXT with Double]
  
  @js.native
  sealed trait DEADLINE extends propagate
  /* 0 */ @js.native
  object DEADLINE extends TopLevel[DEADLINE with Double]
  
  @js.native
  sealed trait DEFAULTS extends propagate
  /* 4 */ @js.native
  object DEFAULTS extends TopLevel[DEFAULTS with Double]
}
