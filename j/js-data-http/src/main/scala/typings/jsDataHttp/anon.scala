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
    
    @scala.inline
    def apply(): Alpha = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Alpha]
    }
    
    @scala.inline
    implicit class AlphaMutableBuilder[Self <: Alpha] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlpha(value: String | Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setBeta(value: String | Boolean): Self = StObject.set(x, "beta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBetaUndefined: Self = StObject.set(x, "beta", js.undefined)
      
      @scala.inline
      def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      @scala.inline
      def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
      
      @scala.inline
      def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
      
      @scala.inline
      def setPatch(value: String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatchUndefined: Self = StObject.set(x, "patch", js.undefined)
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
