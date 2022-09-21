package typings.less.Less

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaticOptions extends StObject {
  
  var async: Boolean
  
  var fileAsync: Boolean
  
  var modifyVars: StringDictionary[String]
}
object StaticOptions {
  
  inline def apply(async: Boolean, fileAsync: Boolean, modifyVars: StringDictionary[String]): StaticOptions = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fileAsync = fileAsync.asInstanceOf[js.Any], modifyVars = modifyVars.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticOptions]
  }
  
  extension [Self <: StaticOptions](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setFileAsync(value: Boolean): Self = StObject.set(x, "fileAsync", value.asInstanceOf[js.Any])
    
    inline def setModifyVars(value: StringDictionary[String]): Self = StObject.set(x, "modifyVars", value.asInstanceOf[js.Any])
  }
}
