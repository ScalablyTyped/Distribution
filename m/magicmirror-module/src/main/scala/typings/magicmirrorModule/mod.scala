package typings.magicmirrorModule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def error(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def group(groupTitle: String, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(List(groupTitle.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def group(groupTitle: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("group")(List(groupTitle.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def groupCollapsed(groupTitle: String, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCollapsed")(List(groupTitle.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def groupCollapsed(groupTitle: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("groupCollapsed")(List(groupTitle.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def groupEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("groupEnd")().asInstanceOf[Unit]
  
  inline def info(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def info(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def log(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def log(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  
  inline def time(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[Unit]
  inline def time(timerName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(timerName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def timeEnd(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeEnd")().asInstanceOf[Unit]
  inline def timeEnd(timerName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeEnd")(timerName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def timeStamp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeStamp")().asInstanceOf[Unit]
  inline def timeStamp(timerName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("timeStamp")(timerName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def warn(message: Any, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  inline def warn(message: Unit, optionalParams: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(List(message.asInstanceOf[js.Any]).`++`(optionalParams.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
}
