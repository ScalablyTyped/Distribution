package typings.jestWorker

import typings.jestWorker.mod.ReservedKeys
import typings.jestWorker.mod.WorkerSchedulingPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jestWorkerStrings {
  
  @js.native
  sealed trait end
    extends StObject
       with ReservedKeys
  inline def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait getStderr
    extends StObject
       with ReservedKeys
  inline def getStderr: getStderr = "getStderr".asInstanceOf[getStderr]
  
  @js.native
  sealed trait getStdout
    extends StObject
       with ReservedKeys
  inline def getStdout: getStdout = "getStdout".asInstanceOf[getStdout]
  
  @js.native
  sealed trait `in-order`
    extends StObject
       with WorkerSchedulingPolicy
  inline def `in-order`: `in-order` = "in-order".asInstanceOf[`in-order`]
  
  @js.native
  sealed trait `round-robin`
    extends StObject
       with WorkerSchedulingPolicy
  inline def `round-robin`: `round-robin` = "round-robin".asInstanceOf[`round-robin`]
  
  @js.native
  sealed trait setup
    extends StObject
       with ReservedKeys
  inline def setup: setup = "setup".asInstanceOf[setup]
  
  @js.native
  sealed trait teardown
    extends StObject
       with ReservedKeys
  inline def teardown: teardown = "teardown".asInstanceOf[teardown]
}
