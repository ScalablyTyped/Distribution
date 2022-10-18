package typings.jupyterlabLogconsole

import typings.jupyterlabLogconsole.libLoggerMod.FullLogLevel
import typings.jupyterlabLogconsole.libLoggerMod.ILogOutput
import typings.jupyterlabLogconsole.libLoggerMod.ILogOutputModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LastModel extends StObject {
    
    var lastModel: ILogOutputModel
    
    var value: ILogOutput
  }
  object LastModel {
    
    inline def apply(lastModel: ILogOutputModel, value: ILogOutput): LastModel = {
      val __obj = js.Dynamic.literal(lastModel = lastModel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastModel]
    }
    
    extension [Self <: LastModel](x: Self) {
      
      inline def setLastModel(value: ILogOutputModel): Self = StObject.set(x, "lastModel", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ILogOutput): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Level extends StObject {
    
    /**
      * Log level
      */
    var level: FullLogLevel
    
    /**
      * Date & time when output is logged in integer representation.
      */
    var timestamp: Double
  }
  object Level {
    
    inline def apply(level: FullLogLevel, timestamp: Double): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    extension [Self <: Level](x: Self) {
      
      inline def setLevel(value: FullLogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
