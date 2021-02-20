package typings.jupyterlabLogconsole

import typings.jupyterlabLogconsole.loggerMod.FullLogLevel
import typings.jupyterlabLogconsole.loggerMod.ILogOutput
import typings.jupyterlabLogconsole.loggerMod.ILogOutputModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait LastModel extends StObject {
    
    var lastModel: ILogOutputModel = js.native
    
    var value: ILogOutput = js.native
  }
  object LastModel {
    
    @scala.inline
    def apply(lastModel: ILogOutputModel, value: ILogOutput): LastModel = {
      val __obj = js.Dynamic.literal(lastModel = lastModel.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LastModel]
    }
    
    @scala.inline
    implicit class LastModelMutableBuilder[Self <: LastModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastModel(value: ILogOutputModel): Self = StObject.set(x, "lastModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: ILogOutput): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Level extends StObject {
    
    /**
      * Log level
      */
    var level: FullLogLevel = js.native
    
    /**
      * Date & time when output is logged in integer representation.
      */
    var timestamp: Double = js.native
  }
  object Level {
    
    @scala.inline
    def apply(level: FullLogLevel, timestamp: Double): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLevel(value: FullLogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
