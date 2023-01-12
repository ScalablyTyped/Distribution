package typings.jestEnvironmentVscodeExtension

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Mocks[Files /* <: StringDictionary[String] */] extends StObject {
    
    var files: Files
    
    var mocks: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object Mocks {
    
    inline def apply[Files /* <: StringDictionary[String] */](files: Files): Mocks[Files] = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mocks[Files]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Mocks[?], Files /* <: StringDictionary[String] */] (val x: Self & Mocks[Files]) extends AnyVal {
      
      inline def setFiles(value: Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setMocks(value: StringDictionary[Any]): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
      
      inline def setMocksUndefined: Self = StObject.set(x, "mocks", js.undefined)
    }
  }
}
