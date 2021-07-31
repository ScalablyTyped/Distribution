package typings.ionic.definitionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSLConfig extends StObject {
  
  var cafile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var certfile: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var keyfile: js.UndefOr[String | js.Array[String]] = js.undefined
}
object SSLConfig {
  
  @scala.inline
  def apply(): SSLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SSLConfig]
  }
  
  @scala.inline
  implicit class SSLConfigMutableBuilder[Self <: SSLConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCafile(value: String | js.Array[String]): Self = StObject.set(x, "cafile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCafileUndefined: Self = StObject.set(x, "cafile", js.undefined)
    
    @scala.inline
    def setCafileVarargs(value: String*): Self = StObject.set(x, "cafile", js.Array(value :_*))
    
    @scala.inline
    def setCertfile(value: String | js.Array[String]): Self = StObject.set(x, "certfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertfileUndefined: Self = StObject.set(x, "certfile", js.undefined)
    
    @scala.inline
    def setCertfileVarargs(value: String*): Self = StObject.set(x, "certfile", js.Array(value :_*))
    
    @scala.inline
    def setKeyfile(value: String | js.Array[String]): Self = StObject.set(x, "keyfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyfileUndefined: Self = StObject.set(x, "keyfile", js.undefined)
    
    @scala.inline
    def setKeyfileVarargs(value: String*): Self = StObject.set(x, "keyfile", js.Array(value :_*))
  }
}
