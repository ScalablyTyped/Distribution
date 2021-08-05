package typings.jsDataHttp

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.jsDataHttp.mod.HttpAdapter
import typings.jsDataHttp.mod.IBaseHttpAdapter
import typings.jsDataHttp.mod.IDict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Alpha extends StObject {
    
    var alpha: js.UndefOr[String | Boolean] = js.undefined
    
    var beta: js.UndefOr[String | Boolean] = js.undefined
    
    var full: js.UndefOr[String] = js.undefined
    
    var major: js.UndefOr[String] = js.undefined
    
    var minor: js.UndefOr[String] = js.undefined
    
    var patch: js.UndefOr[String] = js.undefined
  }
  object Alpha {
    
    inline def apply(): Alpha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alpha]
    }
    
    extension [Self <: Alpha](x: Self) {
      
      inline def setAlpha(value: String | Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setBeta(value: String | Boolean): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      inline def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
      
      inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      inline def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
      
      inline def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      inline def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
    }
  }
  
  @js.native
  trait TypeofHttpAdapter
    extends StObject
       with Instantiable0[HttpAdapter]
       with Instantiable1[/* opts */ IBaseHttpAdapter, HttpAdapter] {
    
    def extend(): /* import warning: importer.ImportType#apply Failed type conversion: typeof HttpAdapter */ js.Any = js.native
    def extend(instanceProps: Unit, classProps: IDict): /* import warning: importer.ImportType#apply Failed type conversion: typeof HttpAdapter */ js.Any = js.native
    def extend(instanceProps: IDict): /* import warning: importer.ImportType#apply Failed type conversion: typeof HttpAdapter */ js.Any = js.native
    def extend(instanceProps: IDict, classProps: IDict): /* import warning: importer.ImportType#apply Failed type conversion: typeof HttpAdapter */ js.Any = js.native
    
    var version: Alpha = js.native
  }
}
