package typings.jestResolve

import typings.jestResolve.mod.ModuleNotFoundError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FilePath extends StObject {
    
    var filePath: String
    
    def requireResolveFunction(moduleName: String): String
    
    var rootDir: String
  }
  object FilePath {
    
    inline def apply(filePath: String, requireResolveFunction: String => String, rootDir: String): FilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], requireResolveFunction = js.Any.fromFunction1(requireResolveFunction), rootDir = rootDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilePath]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilePath] (val x: Self) extends AnyVal {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setRequireResolveFunction(value: String => String): Self = StObject.set(x, "requireResolveFunction", js.Any.fromFunction1(value))
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequireResolveFunction extends StObject {
    
    def requireResolveFunction(moduleName: String): String
    
    var rootDir: String
    
    var testEnvironment: String
  }
  object RequireResolveFunction {
    
    inline def apply(requireResolveFunction: String => String, rootDir: String, testEnvironment: String): RequireResolveFunction = {
      val __obj = js.Dynamic.literal(requireResolveFunction = js.Any.fromFunction1(requireResolveFunction), rootDir = rootDir.asInstanceOf[js.Any], testEnvironment = testEnvironment.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequireResolveFunction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequireResolveFunction] (val x: Self) extends AnyVal {
      
      inline def setRequireResolveFunction(value: String => String): Self = StObject.set(x, "requireResolveFunction", js.Any.fromFunction1(value))
      
      inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
      
      inline def setTestEnvironment(value: String): Self = StObject.set(x, "testEnvironment", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofModuleNotFoundError extends StObject {
    
    /* static member */
    def duckType(error: ModuleNotFoundError): ModuleNotFoundError
  }
  object TypeofModuleNotFoundError {
    
    inline def apply(duckType: ModuleNotFoundError => ModuleNotFoundError): TypeofModuleNotFoundError = {
      val __obj = js.Dynamic.literal(duckType = js.Any.fromFunction1(duckType))
      __obj.asInstanceOf[TypeofModuleNotFoundError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofModuleNotFoundError] (val x: Self) extends AnyVal {
      
      inline def setDuckType(value: ModuleNotFoundError => ModuleNotFoundError): Self = StObject.set(x, "duckType", js.Any.fromFunction1(value))
    }
  }
}
