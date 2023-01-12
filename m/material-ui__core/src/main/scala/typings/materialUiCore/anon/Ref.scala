package typings.materialUiCore.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref[C] extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var ref: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: C extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
  ] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object Ref {
  
  inline def apply[C](): Ref[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ref[C]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ref[?], C] (val x: Self & Ref[C]) extends AnyVal {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setRef(
      value: /* import warning: importer.ImportType#apply Failed type conversion: C extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
    ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
