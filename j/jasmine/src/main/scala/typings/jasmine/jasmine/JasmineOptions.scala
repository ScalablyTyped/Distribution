package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JasmineOptions extends StObject {
  
  /**
    * The path to the project's base directory. This can be absolute or relative
    * to the current working directory. If it isn't specified, the current working
    * directory will be used.
    */
  var projectBaseDir: js.UndefOr[String] = js.undefined
}
object JasmineOptions {
  
  inline def apply(): JasmineOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JasmineOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JasmineOptions] (val x: Self) extends AnyVal {
    
    inline def setProjectBaseDir(value: String): Self = StObject.set(x, "projectBaseDir", value.asInstanceOf[js.Any])
    
    inline def setProjectBaseDirUndefined: Self = StObject.set(x, "projectBaseDir", js.undefined)
  }
}
