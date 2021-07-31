package typings.grunt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* GRUNT CONFIGURATION
    *********************/
  object grunt {
    
    object fail {
      
      @JSGlobal("grunt.fail.ErrorCode")
      @js.native
      object ErrorCode extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.grunt.grunt.fail.ErrorCode & Double] = js.native
        
        /* 5 */ val Autocomplete: typings.grunt.grunt.fail.ErrorCode.Autocomplete & Double = js.native
        
        /* 1 */ val Fatal: typings.grunt.grunt.fail.ErrorCode.Fatal & Double = js.native
        
        /* 2 */ val MissingGruntfile: typings.grunt.grunt.fail.ErrorCode.MissingGruntfile & Double = js.native
        
        /* 0 */ val NoError: typings.grunt.grunt.fail.ErrorCode.NoError & Double = js.native
        
        /* 3 */ val Task: typings.grunt.grunt.fail.ErrorCode.Task & Double = js.native
        
        /* 4 */ val Template: typings.grunt.grunt.fail.ErrorCode.Template & Double = js.native
        
        /* 6 */ val Warning: typings.grunt.grunt.fail.ErrorCode.Warning & Double = js.native
      }
    }
  }
  
  /**
    * {@link https://github.com/isaacs/minimatch}
    */
  object minimatch
}
