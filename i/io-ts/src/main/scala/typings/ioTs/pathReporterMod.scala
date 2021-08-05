package typings.ioTs

import typings.ioTs.mod.ValidationError
import typings.ioTs.reporterMod.Reporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathReporterMod {
  
  @JSImport("io-ts/lib/PathReporter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("io-ts/lib/PathReporter", "PathReporter")
  @js.native
  val PathReporter: Reporter[js.Array[String]] = js.native
  
  inline def failure(es: js.Array[ValidationError]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("failure")(es.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def success(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("success")().asInstanceOf[js.Array[String]]
}
