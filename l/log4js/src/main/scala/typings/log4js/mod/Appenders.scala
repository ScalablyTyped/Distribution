package typings.log4js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Appenders extends StObject {
  
  var CategoryFilterAppender: typings.log4js.mod.CategoryFilterAppender
  
  var ConsoleAppender: typings.log4js.mod.ConsoleAppender
  
  var CustomAppender: typings.log4js.mod.CustomAppender
  
  var DateFileAppender: typings.log4js.mod.DateFileAppender
  
  var FileAppender: typings.log4js.mod.FileAppender
  
  var LogLevelFilterAppender: typings.log4js.mod.LogLevelFilterAppender
  
  var MultiFileAppender: typings.log4js.mod.MultiFileAppender
  
  var MultiprocessAppender: typings.log4js.mod.MultiprocessAppender
  
  var NoLogFilterAppender: typings.log4js.mod.NoLogFilterAppender
  
  var RecordingAppender: typings.log4js.mod.RecordingAppender
  
  var StandardErrorAppender: typings.log4js.mod.StandardErrorAppender
  
  var StandardOutputAppender: typings.log4js.mod.StandardOutputAppender
  
  var SyncfileAppender: typings.log4js.mod.SyncfileAppender
  
  var TCPAppender: typings.log4js.mod.TCPAppender
}
object Appenders {
  
  inline def apply(
    CategoryFilterAppender: CategoryFilterAppender,
    ConsoleAppender: ConsoleAppender,
    CustomAppender: CustomAppender,
    DateFileAppender: DateFileAppender,
    FileAppender: FileAppender,
    LogLevelFilterAppender: LogLevelFilterAppender,
    MultiFileAppender: MultiFileAppender,
    MultiprocessAppender: MultiprocessAppender,
    NoLogFilterAppender: NoLogFilterAppender,
    RecordingAppender: RecordingAppender,
    StandardErrorAppender: StandardErrorAppender,
    StandardOutputAppender: StandardOutputAppender,
    SyncfileAppender: SyncfileAppender,
    TCPAppender: TCPAppender
  ): Appenders = {
    val __obj = js.Dynamic.literal(CategoryFilterAppender = CategoryFilterAppender.asInstanceOf[js.Any], ConsoleAppender = ConsoleAppender.asInstanceOf[js.Any], CustomAppender = CustomAppender.asInstanceOf[js.Any], DateFileAppender = DateFileAppender.asInstanceOf[js.Any], FileAppender = FileAppender.asInstanceOf[js.Any], LogLevelFilterAppender = LogLevelFilterAppender.asInstanceOf[js.Any], MultiFileAppender = MultiFileAppender.asInstanceOf[js.Any], MultiprocessAppender = MultiprocessAppender.asInstanceOf[js.Any], NoLogFilterAppender = NoLogFilterAppender.asInstanceOf[js.Any], RecordingAppender = RecordingAppender.asInstanceOf[js.Any], StandardErrorAppender = StandardErrorAppender.asInstanceOf[js.Any], StandardOutputAppender = StandardOutputAppender.asInstanceOf[js.Any], SyncfileAppender = SyncfileAppender.asInstanceOf[js.Any], TCPAppender = TCPAppender.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appenders]
  }
  
  extension [Self <: Appenders](x: Self) {
    
    inline def setCategoryFilterAppender(value: CategoryFilterAppender): Self = StObject.set(x, "CategoryFilterAppender", value.asInstanceOf[js.Any])
    
    inline def setConsoleAppender(value: ConsoleAppender): Self = StObject.set(x, "ConsoleAppender", value.asInstanceOf[js.Any])
    
    inline def setCustomAppender(value: CustomAppender): Self = StObject.set(x, "CustomAppender", value.asInstanceOf[js.Any])
    
    inline def setDateFileAppender(value: DateFileAppender): Self = StObject.set(x, "DateFileAppender", value.asInstanceOf[js.Any])
    
    inline def setFileAppender(value: FileAppender): Self = StObject.set(x, "FileAppender", value.asInstanceOf[js.Any])
    
    inline def setLogLevelFilterAppender(value: LogLevelFilterAppender): Self = StObject.set(x, "LogLevelFilterAppender", value.asInstanceOf[js.Any])
    
    inline def setMultiFileAppender(value: MultiFileAppender): Self = StObject.set(x, "MultiFileAppender", value.asInstanceOf[js.Any])
    
    inline def setMultiprocessAppender(value: MultiprocessAppender): Self = StObject.set(x, "MultiprocessAppender", value.asInstanceOf[js.Any])
    
    inline def setNoLogFilterAppender(value: NoLogFilterAppender): Self = StObject.set(x, "NoLogFilterAppender", value.asInstanceOf[js.Any])
    
    inline def setRecordingAppender(value: RecordingAppender): Self = StObject.set(x, "RecordingAppender", value.asInstanceOf[js.Any])
    
    inline def setStandardErrorAppender(value: StandardErrorAppender): Self = StObject.set(x, "StandardErrorAppender", value.asInstanceOf[js.Any])
    
    inline def setStandardOutputAppender(value: StandardOutputAppender): Self = StObject.set(x, "StandardOutputAppender", value.asInstanceOf[js.Any])
    
    inline def setSyncfileAppender(value: SyncfileAppender): Self = StObject.set(x, "SyncfileAppender", value.asInstanceOf[js.Any])
    
    inline def setTCPAppender(value: TCPAppender): Self = StObject.set(x, "TCPAppender", value.asInstanceOf[js.Any])
  }
}
