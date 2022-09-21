package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleMod {
  
  @JSImport("handsontable/helpers/console", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def error(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def info(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def log(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  inline def warn(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
}
