package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datetimeMod {
  
  @JSImport("locutus/php/datetime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkdate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")().asInstanceOf[Any]
  inline def checkdate(m: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def checkdate(m: Any, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def checkdate(m: Any, d: Any, y: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def checkdate(m: Any, d: Unit, y: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def checkdate(m: Unit, d: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def checkdate(m: Unit, d: Any, y: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def checkdate(m: Unit, d: Unit, y: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def date(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[Any]
  inline def date(format: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(format.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def date(format: Any, timestamp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def date(format: Unit, timestamp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def dateParse(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("date_parse")().asInstanceOf[Any]
  inline def dateParse(date: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("date_parse")(date.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getdate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getdate")().asInstanceOf[Any]
  inline def getdate(timestamp: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getdate")(timestamp.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def gettimeofday(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gettimeofday")().asInstanceOf[Any]
  inline def gettimeofday(returnFloat: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gettimeofday")(returnFloat.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def gmdate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gmdate")().asInstanceOf[Any]
  inline def gmdate(format: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gmdate")(format.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def gmdate(format: Any, timestamp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("gmdate")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def gmdate(format: Unit, timestamp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("gmdate")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def gmmktime(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gmmktime")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def gmstrftime(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gmstrftime")().asInstanceOf[Any]
  inline def gmstrftime(format: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gmstrftime")(format.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def gmstrftime(format: Any, timestamp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("gmstrftime")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def gmstrftime(format: Unit, timestamp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("gmstrftime")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def idate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("idate")().asInstanceOf[Any]
  inline def idate(format: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("idate")(format.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def idate(format: Any, timestamp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("idate")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def idate(format: Unit, timestamp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("idate")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def microtime(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("microtime")().asInstanceOf[Any]
  inline def microtime(getAsFloat: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("microtime")(getAsFloat.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def mktime(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mktime")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def strftime(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strftime")().asInstanceOf[Any]
  inline def strftime(fmt: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def strftime(fmt: Any, timestamp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def strftime(fmt: Unit, timestamp: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def strptime(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strptime")().asInstanceOf[Any]
  inline def strptime(dateStr: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strptime")(dateStr.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def strptime(dateStr: Any, format: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("strptime")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def strptime(dateStr: Unit, format: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("strptime")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def strtotime(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strtotime")().asInstanceOf[Any]
  inline def strtotime(text: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strtotime")(text.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def strtotime(text: Any, now: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("strtotime")(text.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def strtotime(text: Unit, now: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("strtotime")(text.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def time(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[Any]
}
