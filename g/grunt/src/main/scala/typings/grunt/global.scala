package typings.grunt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  /* GRUNT CONFIGURATION
    *********************/
  @js.native
  object grunt extends js.Object {
    @js.native
    object fail extends js.Object {
      @js.native
      object ErrorCode extends js.Object {
        /* 5 */ val Autocomplete: typings.grunt.grunt.fail.ErrorCode.Autocomplete with Double = js.native
        /* 1 */ val Fatal: typings.grunt.grunt.fail.ErrorCode.Fatal with Double = js.native
        /* 2 */ val MissingGruntfile: typings.grunt.grunt.fail.ErrorCode.MissingGruntfile with Double = js.native
        /* 0 */ val NoError: typings.grunt.grunt.fail.ErrorCode.NoError with Double = js.native
        /* 3 */ val Task: typings.grunt.grunt.fail.ErrorCode.Task with Double = js.native
        /* 4 */ val Template: typings.grunt.grunt.fail.ErrorCode.Template with Double = js.native
        /* 6 */ val Warning: typings.grunt.grunt.fail.ErrorCode.Warning with Double = js.native
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[typings.grunt.grunt.fail.ErrorCode with Double] = js.native
      }
      
    }
    
  }
  
  /**
    * {@link https://github.com/isaacs/minimatch}
    */
  @js.native
  object minimatch extends js.Object
  
}

