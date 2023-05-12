package typings.gulpMatch

import typings.vinyl.mod.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Does a vinyl file match a condition? This function checks the condition on the file.path of the vinyl-fs file passed to it.
    *
    * Condition can be a boolean, a function, a regular expression, a glob string (or array of glob strings), or a stat filter object.
    */
  inline def apply(file: File, condition: MatchCondition): Boolean = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], condition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(
    file: File,
    condition: MatchCondition,
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify minimatch.IOptions */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].apply(file.asInstanceOf[js.Any], condition.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("gulp-match", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type MatchCondition = Boolean | (js.Function1[/* fs */ File, Boolean]) | js.RegExp | String | js.Array[String] | StatFilterCondition
  
  trait StatFilterCondition extends StObject {
    
    var isDirectory: js.UndefOr[Boolean] = js.undefined
    
    var isFile: js.UndefOr[Boolean] = js.undefined
  }
  object StatFilterCondition {
    
    inline def apply(): StatFilterCondition = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StatFilterCondition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatFilterCondition] (val x: Self) extends AnyVal {
      
      inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
      
      inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
      
      inline def setIsFile(value: Boolean): Self = StObject.set(x, "isFile", value.asInstanceOf[js.Any])
      
      inline def setIsFileUndefined: Self = StObject.set(x, "isFile", js.undefined)
    }
  }
}
