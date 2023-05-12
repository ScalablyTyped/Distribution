package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcDeadlineMod {
  
  @JSImport("@grpc/grpc-js/build/src/deadline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deadlineToString(deadline: Deadline): String = ^.asInstanceOf[js.Dynamic].applyDynamic("deadlineToString")(deadline.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDeadlineTimeoutString(deadline: Deadline): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeadlineTimeoutString")(deadline.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getRelativeTimeout(deadline: Deadline): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRelativeTimeout")(deadline.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def minDeadline(deadlineList: Deadline*): Deadline = ^.asInstanceOf[js.Dynamic].applyDynamic("minDeadline")(deadlineList.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Deadline]
  
  type Deadline = js.Date | Double
}
