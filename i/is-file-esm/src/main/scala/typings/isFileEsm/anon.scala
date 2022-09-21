package typings.isFileEsm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ERRPATHMUSTBEABSOLUTE extends StObject {
    
    var ERR_PATH_MUST_BE_ABSOLUTE: String
    
    var ERR_PATH_MUST_BE_STRING: String
    
    var ERR_PATH_MUST_EXIST: String
    
    var ERR_PATH_MUST_HAVE_VALID_EXT: String
  }
  object ERRPATHMUSTBEABSOLUTE {
    
    inline def apply(
      ERR_PATH_MUST_BE_ABSOLUTE: String,
      ERR_PATH_MUST_BE_STRING: String,
      ERR_PATH_MUST_EXIST: String,
      ERR_PATH_MUST_HAVE_VALID_EXT: String
    ): ERRPATHMUSTBEABSOLUTE = {
      val __obj = js.Dynamic.literal(ERR_PATH_MUST_BE_ABSOLUTE = ERR_PATH_MUST_BE_ABSOLUTE.asInstanceOf[js.Any], ERR_PATH_MUST_BE_STRING = ERR_PATH_MUST_BE_STRING.asInstanceOf[js.Any], ERR_PATH_MUST_EXIST = ERR_PATH_MUST_EXIST.asInstanceOf[js.Any], ERR_PATH_MUST_HAVE_VALID_EXT = ERR_PATH_MUST_HAVE_VALID_EXT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ERRPATHMUSTBEABSOLUTE]
    }
    
    extension [Self <: ERRPATHMUSTBEABSOLUTE](x: Self) {
      
      inline def setERR_PATH_MUST_BE_ABSOLUTE(value: String): Self = StObject.set(x, "ERR_PATH_MUST_BE_ABSOLUTE", value.asInstanceOf[js.Any])
      
      inline def setERR_PATH_MUST_BE_STRING(value: String): Self = StObject.set(x, "ERR_PATH_MUST_BE_STRING", value.asInstanceOf[js.Any])
      
      inline def setERR_PATH_MUST_EXIST(value: String): Self = StObject.set(x, "ERR_PATH_MUST_EXIST", value.asInstanceOf[js.Any])
      
      inline def setERR_PATH_MUST_HAVE_VALID_EXT(value: String): Self = StObject.set(x, "ERR_PATH_MUST_HAVE_VALID_EXT", value.asInstanceOf[js.Any])
    }
  }
}
