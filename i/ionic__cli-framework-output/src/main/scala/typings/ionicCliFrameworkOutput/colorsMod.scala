package typings.ionicCliFrameworkOutput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod {
  
  @JSImport("@ionic/cli-framework-output/dist/colors", "NO_COLORS")
  @js.native
  val NO_COLORS: Colors = js.native
  
  @js.native
  trait ColorFunction extends StObject {
    
    def apply(text: String*): String = js.native
  }
  
  trait Colors extends StObject {
    
    /**
      * Used to mark text as ancillary or supportive.
      */
    def ancillary(text: String*): String
    /**
      * Used to mark text as ancillary or supportive.
      */
    @JSName("ancillary")
    var ancillary_Original: ColorFunction
    
    /**
      * Used to mark text as failed.
      */
    def failure(text: String*): String
    /**
      * Used to mark text as failed.
      */
    @JSName("failure")
    var failure_Original: ColorFunction
    
    /**
      * Used to mark text as input such as commands, inputs, options, etc.
      */
    def input(text: String*): String
    /**
      * Used to mark text as input such as commands, inputs, options, etc.
      */
    @JSName("input")
    var input_Original: ColorFunction
    
    var log: LoggerColors
    
    /**
      * Used to mark text as important. Comparable to HTML's <strong>.
      */
    def strong(text: String*): String
    /**
      * Used to mark text as important. Comparable to HTML's <strong>.
      */
    @JSName("strong")
    var strong_Original: ColorFunction
    
    /**
      * Used to mark text as successful.
      */
    def success(text: String*): String
    /**
      * Used to mark text as successful.
      */
    @JSName("success")
    var success_Original: ColorFunction
    
    /**
      * Used to mark text as less important.
      */
    def weak(text: String*): String
    /**
      * Used to mark text as less important.
      */
    @JSName("weak")
    var weak_Original: ColorFunction
  }
  object Colors {
    
    inline def apply(
      ancillary: ColorFunction,
      failure: ColorFunction,
      input: ColorFunction,
      log: LoggerColors,
      strong: ColorFunction,
      success: ColorFunction,
      weak: ColorFunction
    ): Colors = {
      val __obj = js.Dynamic.literal(ancillary = ancillary.asInstanceOf[js.Any], failure = failure.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], strong = strong.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], weak = weak.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    extension [Self <: Colors](x: Self) {
      
      inline def setAncillary(value: ColorFunction): Self = StObject.set(x, "ancillary", value.asInstanceOf[js.Any])
      
      inline def setFailure(value: ColorFunction): Self = StObject.set(x, "failure", value.asInstanceOf[js.Any])
      
      inline def setInput(value: ColorFunction): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLog(value: LoggerColors): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setStrong(value: ColorFunction): Self = StObject.set(x, "strong", value.asInstanceOf[js.Any])
      
      inline def setSuccess(value: ColorFunction): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setWeak(value: ColorFunction): Self = StObject.set(x, "weak", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ L in @ionic/cli-framework-output.@ionic/cli-framework-output/dist/logger.LoggerLevel ]: @ionic/cli-framework-output.@ionic/cli-framework-output/dist/colors.ColorFunction} */
  trait LoggerColors extends StObject {
    
    def DEBUG(text: String*): String
    @JSName("DEBUG")
    var DEBUG_Original: ColorFunction
    
    def ERROR(text: String*): String
    @JSName("ERROR")
    var ERROR_Original: ColorFunction
    
    def INFO(text: String*): String
    @JSName("INFO")
    var INFO_Original: ColorFunction
    
    def WARN(text: String*): String
    @JSName("WARN")
    var WARN_Original: ColorFunction
  }
  object LoggerColors {
    
    inline def apply(DEBUG: ColorFunction, ERROR: ColorFunction, INFO: ColorFunction, WARN: ColorFunction): LoggerColors = {
      val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggerColors]
    }
    
    extension [Self <: LoggerColors](x: Self) {
      
      inline def setDEBUG(value: ColorFunction): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: ColorFunction): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setINFO(value: ColorFunction): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      inline def setWARN(value: ColorFunction): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
}
