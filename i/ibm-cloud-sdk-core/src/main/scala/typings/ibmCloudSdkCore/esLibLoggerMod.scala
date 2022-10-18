package typings.ibmCloudSdkCore

import typings.debug.mod.Debugger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esLibLoggerMod {
  
  object default {
    
    @JSImport("ibm-cloud-sdk-core/es/lib/logger", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ibm-cloud-sdk-core/es/lib/logger", "default.debug")
    @js.native
    def debug: Debugger = js.native
    inline def debug(formatter: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(formatter.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def debug_=(x: Debugger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/lib/logger", "default.error")
    @js.native
    def error: Debugger = js.native
    inline def error(formatter: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(scala.List(formatter.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def error_=(x: Debugger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("error")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/lib/logger", "default.info")
    @js.native
    def info: Debugger = js.native
    inline def info(formatter: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(scala.List(formatter.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def info_=(x: Debugger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("info")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/lib/logger", "default.verbose")
    @js.native
    def verbose: Debugger = js.native
    inline def verbose(formatter: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verbose")(scala.List(formatter.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def verbose_=(x: Debugger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("verbose")(x.asInstanceOf[js.Any])
    
    @JSImport("ibm-cloud-sdk-core/es/lib/logger", "default.warn")
    @js.native
    def warn: Debugger = js.native
    inline def warn(formatter: Any, args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(formatter.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    inline def warn_=(x: Debugger): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("warn")(x.asInstanceOf[js.Any])
  }
}
