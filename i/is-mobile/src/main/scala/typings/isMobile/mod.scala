package typings.isMobile

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("is-mobile", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Boolean]
  inline def default(opts: IsMobileOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(opts.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMobile(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobile")().asInstanceOf[Boolean]
  inline def isMobile(opts: IsMobileOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobile")(opts.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type HttpRequestHeadersInterfaceMock = StringDictionary[js.UndefOr[String | js.Array[String]]]
  
  trait HttpRequestInterfaceMock
    extends StObject
       with /* id */ StringDictionary[js.Any] {
    
    var headers: HttpRequestHeadersInterfaceMock
  }
  object HttpRequestInterfaceMock {
    
    inline def apply(headers: HttpRequestHeadersInterfaceMock): HttpRequestInterfaceMock = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpRequestInterfaceMock]
    }
    
    extension [Self <: HttpRequestInterfaceMock](x: Self) {
      
      inline def setHeaders(value: HttpRequestHeadersInterfaceMock): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsMobileOptions extends StObject {
    
    var featureDetect: js.UndefOr[Boolean] = js.undefined
    
    var tablet: js.UndefOr[Boolean] = js.undefined
    
    var ua: js.UndefOr[String | HttpRequestInterfaceMock] = js.undefined
  }
  object IsMobileOptions {
    
    inline def apply(): IsMobileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsMobileOptions]
    }
    
    extension [Self <: IsMobileOptions](x: Self) {
      
      inline def setFeatureDetect(value: Boolean): Self = StObject.set(x, "featureDetect", value.asInstanceOf[js.Any])
      
      inline def setFeatureDetectUndefined: Self = StObject.set(x, "featureDetect", js.undefined)
      
      inline def setTablet(value: Boolean): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
      
      inline def setUa(value: String | HttpRequestInterfaceMock): Self = StObject.set(x, "ua", value.asInstanceOf[js.Any])
      
      inline def setUaUndefined: Self = StObject.set(x, "ua", js.undefined)
    }
  }
}
