package typings.log4js.mod

import typings.log4js.anon.Context
import typings.log4js.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def addLayout(name: String, config: js.Function1[/* a */ Any, js.Function1[/* logEvent */ LoggingEvent, Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addLayout")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def configure(config: Configuration): Log4js = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[Log4js]
inline def configure(filename: String): Log4js = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(filename.asInstanceOf[js.Any]).asInstanceOf[Log4js]

inline def connectLogger(logger: Logger, options: Context): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("connectLogger")(logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Any]

inline def getLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[Logger]
inline def getLogger(category: String): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(category.asInstanceOf[js.Any]).asInstanceOf[Logger]

inline def levels: Levels_ = ^.asInstanceOf[js.Dynamic].selectDynamic("levels").asInstanceOf[Levels_]

inline def recording(): Recording_ = ^.asInstanceOf[js.Dynamic].applyDynamic("recording")().asInstanceOf[Recording_]

inline def shutdown(): Unit | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")().asInstanceOf[Unit | Null]
inline def shutdown(cb: js.Function1[/* error */ js.Error, Unit]): Unit | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit | Null]

type AppenderFunction = js.Function1[/* loggingEvent */ LoggingEvent, Unit]

type Config = Any

type Format = String | (js.Function3[
/* req */ Any, 
/* res */ Any, 
/* formatter */ js.Function1[/* str */ String, String], 
String])

type LayoutFunction = js.Function1[/* loggingEvent */ LoggingEvent, String]

type Token = (js.Function1[/* logEvent */ LoggingEvent, String]) | String
