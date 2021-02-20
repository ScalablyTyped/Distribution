package typings.log4js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Format = java.lang.String | (js.Function3[
    /* req */ js.Any, 
    /* res */ js.Any, 
    /* formatter */ js.Function1[/* str */ java.lang.String, java.lang.String], 
    java.lang.String
  ])
  
  type Token = (js.Function1[/* logEvent */ typings.log4js.mod.LoggingEvent, java.lang.String]) | java.lang.String
  
  @scala.inline
  def addLayout(
    name: java.lang.String,
    config: js.Function1[/* a */ js.Any, js.Function1[/* logEvent */ typings.log4js.mod.LoggingEvent, _]]
  ): scala.Unit = (typings.log4js.mod.^.asInstanceOf[js.Dynamic].applyDynamic("addLayout")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  @scala.inline
  def configure(config: typings.log4js.mod.Configuration): typings.log4js.mod.Log4js = typings.log4js.mod.^.asInstanceOf[js.Dynamic].applyDynamic("configure")(config.asInstanceOf[js.Any]).asInstanceOf[typings.log4js.mod.Log4js]
  @scala.inline
  def configure(filename: java.lang.String): typings.log4js.mod.Log4js = typings.log4js.mod.^.asInstanceOf[js.Dynamic].applyDynamic("configure")(filename.asInstanceOf[js.Any]).asInstanceOf[typings.log4js.mod.Log4js]
  
  @scala.inline
  def connectLogger(logger: typings.log4js.mod.Logger, options: typings.log4js.anon.Context): js.Any = (typings.log4js.mod.^.asInstanceOf[js.Dynamic].applyDynamic("connectLogger")(logger.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def getLogger(): typings.log4js.mod.Logger = typings.log4js.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")().asInstanceOf[typings.log4js.mod.Logger]
  @scala.inline
  def getLogger(category: java.lang.String): typings.log4js.mod.Logger = typings.log4js.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getLogger")(category.asInstanceOf[js.Any]).asInstanceOf[typings.log4js.mod.Logger]
  
  @scala.inline
  def levels: typings.log4js.mod.Levels_ = typings.log4js.mod.^.asInstanceOf[js.Dynamic].selectDynamic("levels").asInstanceOf[typings.log4js.mod.Levels_]
  
  @scala.inline
  def shutdown(): scala.Unit | scala.Null = typings.log4js.mod.^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")().asInstanceOf[scala.Unit | scala.Null]
  @scala.inline
  def shutdown(cb: js.Function1[/* error */ typings.std.Error, scala.Unit]): scala.Unit | scala.Null = typings.log4js.mod.^.asInstanceOf[js.Dynamic].applyDynamic("shutdown")(cb.asInstanceOf[js.Any]).asInstanceOf[scala.Unit | scala.Null]
}
