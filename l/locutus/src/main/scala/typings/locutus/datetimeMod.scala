package typings.locutus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datetimeMod {
  
  @JSImport("locutus/php/datetime", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkdate(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")().asInstanceOf[js.Any]
  inline def checkdate(m: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def checkdate(m: js.Any, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def checkdate(m: js.Any, d: js.Any, y: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def checkdate(m: js.Any, d: Unit, y: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def checkdate(m: Unit, d: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def checkdate(m: Unit, d: js.Any, y: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def checkdate(m: Unit, d: Unit, y: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkdate")(m.asInstanceOf[js.Any], d.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def date(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("date")().asInstanceOf[js.Any]
  inline def date(format: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(format.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def date(format: js.Any, timestamp: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def date(format: Unit, timestamp: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def dateParse(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("date_parse")().asInstanceOf[js.Any]
  inline def dateParse(date: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("date_parse")(date.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getdate(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getdate")().asInstanceOf[js.Any]
  inline def getdate(timestamp: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getdate")(timestamp.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def gettimeofday(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gettimeofday")().asInstanceOf[js.Any]
  inline def gettimeofday(returnFloat: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gettimeofday")(returnFloat.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def gmdate(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gmdate")().asInstanceOf[js.Any]
  inline def gmdate(format: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gmdate")(format.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def gmdate(format: js.Any, timestamp: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("gmdate")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def gmdate(format: Unit, timestamp: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("gmdate")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def gmmktime(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gmmktime")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def gmstrftime(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gmstrftime")().asInstanceOf[js.Any]
  inline def gmstrftime(format: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("gmstrftime")(format.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def gmstrftime(format: js.Any, timestamp: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("gmstrftime")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def gmstrftime(format: Unit, timestamp: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("gmstrftime")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def idate(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("idate")().asInstanceOf[js.Any]
  inline def idate(format: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("idate")(format.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def idate(format: js.Any, timestamp: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("idate")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def idate(format: Unit, timestamp: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("idate")(format.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def microtime(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("microtime")().asInstanceOf[js.Any]
  inline def microtime(getAsFloat: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("microtime")(getAsFloat.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def mktime(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mktime")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def strftime(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strftime")().asInstanceOf[js.Any]
  inline def strftime(fmt: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def strftime(fmt: js.Any, timestamp: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def strftime(fmt: Unit, timestamp: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(fmt.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def strptime(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strptime")().asInstanceOf[js.Any]
  inline def strptime(dateStr: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strptime")(dateStr.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def strptime(dateStr: js.Any, format: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("strptime")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def strptime(dateStr: Unit, format: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("strptime")(dateStr.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def strtotime(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strtotime")().asInstanceOf[js.Any]
  inline def strtotime(text: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("strtotime")(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def strtotime(text: js.Any, now: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("strtotime")(text.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def strtotime(text: Unit, now: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("strtotime")(text.asInstanceOf[js.Any], now.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def time(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("time")().asInstanceOf[js.Any]
}
