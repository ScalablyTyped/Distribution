package typings.mapsjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BleedRatio extends StObject {
  
  var bleedRatio: js.UndefOr[Double] = js.undefined
  
  var clipToRenderBounds: js.UndefOr[Boolean] = js.undefined
  
  var fieldNames: js.UndefOr[js.Array[String]] = js.undefined
  
  var simplifyEnabled: js.UndefOr[Boolean] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
}
object BleedRatio {
  
  inline def apply(): BleedRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BleedRatio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BleedRatio] (val x: Self) extends AnyVal {
    
    inline def setBleedRatio(value: Double): Self = StObject.set(x, "bleedRatio", value.asInstanceOf[js.Any])
    
    inline def setBleedRatioUndefined: Self = StObject.set(x, "bleedRatio", js.undefined)
    
    inline def setClipToRenderBounds(value: Boolean): Self = StObject.set(x, "clipToRenderBounds", value.asInstanceOf[js.Any])
    
    inline def setClipToRenderBoundsUndefined: Self = StObject.set(x, "clipToRenderBounds", js.undefined)
    
    inline def setFieldNames(value: js.Array[String]): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    inline def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    
    inline def setFieldNamesVarargs(value: String*): Self = StObject.set(x, "fieldNames", js.Array(value*))
    
    inline def setSimplifyEnabled(value: Boolean): Self = StObject.set(x, "simplifyEnabled", value.asInstanceOf[js.Any])
    
    inline def setSimplifyEnabledUndefined: Self = StObject.set(x, "simplifyEnabled", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
