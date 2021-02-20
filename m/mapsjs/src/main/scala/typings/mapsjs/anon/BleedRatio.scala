package typings.mapsjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BleedRatio extends StObject {
  
  var bleedRatio: js.UndefOr[Double] = js.native
  
  var clipToRenderBounds: js.UndefOr[Boolean] = js.native
  
  var fieldNames: js.UndefOr[js.Array[String]] = js.native
  
  var simplifyEnabled: js.UndefOr[Boolean] = js.native
  
  var version: js.UndefOr[String] = js.native
}
object BleedRatio {
  
  @scala.inline
  def apply(): BleedRatio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BleedRatio]
  }
  
  @scala.inline
  implicit class BleedRatioMutableBuilder[Self <: BleedRatio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBleedRatio(value: Double): Self = StObject.set(x, "bleedRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBleedRatioUndefined: Self = StObject.set(x, "bleedRatio", js.undefined)
    
    @scala.inline
    def setClipToRenderBounds(value: Boolean): Self = StObject.set(x, "clipToRenderBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipToRenderBoundsUndefined: Self = StObject.set(x, "clipToRenderBounds", js.undefined)
    
    @scala.inline
    def setFieldNames(value: js.Array[String]): Self = StObject.set(x, "fieldNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldNamesUndefined: Self = StObject.set(x, "fieldNames", js.undefined)
    
    @scala.inline
    def setFieldNamesVarargs(value: String*): Self = StObject.set(x, "fieldNames", js.Array(value :_*))
    
    @scala.inline
    def setSimplifyEnabled(value: Boolean): Self = StObject.set(x, "simplifyEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimplifyEnabledUndefined: Self = StObject.set(x, "simplifyEnabled", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
