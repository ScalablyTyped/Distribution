package typings.isFileEsm

import typings.isFileEsm.anon.ERRPATHMUSTBEABSOLUTE
import typings.isFileEsm.isFileEsmStrings.c
import typings.isFileEsm.isFileEsmStrings.commonjs
import typings.isFileEsm.isFileEsmStrings.j
import typings.isFileEsm.isFileEsmStrings.m
import typings.isFileEsm.isFileEsmStrings.module
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(path: String): js.Promise[Result] = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Result]]
  inline def apply(
    path: String,
    callback: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[Result], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("is-file-esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("is-file-esm", "constants")
  @js.native
  def constants: ERRPATHMUSTBEABSOLUTE = js.native
  inline def constants_=(x: ERRPATHMUSTBEABSOLUTE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constants")(x.asInstanceOf[js.Any])
  
  inline def sync(path: String): Result = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(path.asInstanceOf[js.Any]).asInstanceOf[Result]
  
  trait Result extends StObject {
    
    var esm: Boolean
    
    var extType: c | m | j
    
    var path: String
    
    var pkgPath: String
    
    var `type`: js.UndefOr[module | commonjs] = js.undefined
  }
  object Result {
    
    inline def apply(esm: Boolean, extType: c | m | j, path: String, pkgPath: String): Result = {
      val __obj = js.Dynamic.literal(esm = esm.asInstanceOf[js.Any], extType = extType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pkgPath = pkgPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setEsm(value: Boolean): Self = StObject.set(x, "esm", value.asInstanceOf[js.Any])
      
      inline def setExtType(value: c | m | j): Self = StObject.set(x, "extType", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPkgPath(value: String): Self = StObject.set(x, "pkgPath", value.asInstanceOf[js.Any])
      
      inline def setType(value: module | commonjs): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
