package typings.materialUiCore.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@material-ui/core.@material-ui/core/ListItemAvatar.ListItemAvatarProps> */
trait PartialListItemAvatarProp extends StObject {
  
  var children: js.UndefOr[ReactElement] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var classes: js.UndefOr[PartialClassNameMapListIt] = js.undefined
  
  var innerRef: js.UndefOr[typings.react.mod.Ref[Any]] = js.undefined
  
  var ref: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
  ] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object PartialListItemAvatarProp {
  
  inline def apply(): PartialListItemAvatarProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialListItemAvatarProp]
  }
  
  extension [Self <: PartialListItemAvatarProp](x: Self) {
    
    inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setClasses(value: PartialClassNameMapListIt): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setInnerRef(value: typings.react.mod.Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
    
    inline def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
    
    inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
    
    inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    
    inline def setRef(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
    ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
    
    inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
