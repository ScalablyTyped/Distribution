package typings.jupyterlabSharedModels

import typings.jupyterlabNbformat.mod.IKernelspecMetadata
import typings.jupyterlabNbformat.mod.ILanguageInfoMetadata
import typings.jupyterlabNbformat.mod.INotebookMetadata
import typings.jupyterlabSharedModels.jupyterlabSharedModelsStrings.add
import typings.jupyterlabSharedModels.jupyterlabSharedModelsStrings.delete
import typings.jupyterlabSharedModels.jupyterlabSharedModelsStrings.update
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Action extends StObject {
    
    var action: add | update | delete
    
    var newValue: Any
    
    var oldValue: Any
  }
  object Action {
    
    inline def apply(action: add | update | delete, newValue: Any, oldValue: Any): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Action] (val x: Self) extends AnyVal {
      
      inline def setAction(value: add | update | delete): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delete[T] extends StObject {
    
    var delete: js.UndefOr[Double] = js.undefined
    
    var insert: js.UndefOr[T] = js.undefined
    
    var retain: js.UndefOr[Double] = js.undefined
  }
  object Delete {
    
    inline def apply[T](): Delete[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Delete[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delete[?], T] (val x: Self & Delete[T]) extends AnyVal {
      
      inline def setDelete(value: Double): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
      
      inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
      
      inline def setInsert(value: T): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setInsertUndefined: Self = StObject.set(x, "insert", js.undefined)
      
      inline def setRetain(value: Double): Self = StObject.set(x, "retain", value.asInstanceOf[js.Any])
      
      inline def setRetainUndefined: Self = StObject.set(x, "retain", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var newValue: Any
    
    var oldValue: Any
  }
  object Name {
    
    inline def apply(name: String, newValue: Any, oldValue: Any): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewValue extends StObject {
    
    var newValue: js.UndefOr[INotebookMetadata] = js.undefined
    
    var oldValue: INotebookMetadata
  }
  object NewValue {
    
    inline def apply(oldValue: INotebookMetadata): NewValue = {
      val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NewValue] (val x: Self) extends AnyVal {
      
      inline def setNewValue(value: INotebookMetadata): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setOldValue(value: INotebookMetadata): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait NewValueOldValue[MetadataType] extends StObject {
    
    var newValue: js.UndefOr[Partial[MetadataType]] = js.undefined
    
    var oldValue: js.UndefOr[Partial[MetadataType]] = js.undefined
  }
  object NewValueOldValue {
    
    inline def apply[MetadataType](): NewValueOldValue[MetadataType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NewValueOldValue[MetadataType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NewValueOldValue[?], MetadataType] (val x: Self & NewValueOldValue[MetadataType]) extends AnyVal {
      
      inline def setNewValue(value: Partial[MetadataType]): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setOldValue(value: Partial[MetadataType]): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    }
  }
  
  trait OldValue extends StObject {
    
    var newValue: js.UndefOr[Double] = js.undefined
    
    var oldValue: js.UndefOr[Double] = js.undefined
  }
  object OldValue {
    
    inline def apply(): OldValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OldValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OldValue] (val x: Self) extends AnyVal {
      
      inline def setNewValue(value: Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setOldValue(value: Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@jupyterlab/nbformat.@jupyterlab/nbformat.INotebookMetadata> */
  trait PartialINotebookMetadata extends StObject {
    
    var kernelspec: js.UndefOr[IKernelspecMetadata] = js.undefined
    
    var language_info: js.UndefOr[ILanguageInfoMetadata] = js.undefined
    
    var orig_nbformat: js.UndefOr[Double] = js.undefined
  }
  object PartialINotebookMetadata {
    
    inline def apply(): PartialINotebookMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialINotebookMetadata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialINotebookMetadata] (val x: Self) extends AnyVal {
      
      inline def setKernelspec(value: IKernelspecMetadata): Self = StObject.set(x, "kernelspec", value.asInstanceOf[js.Any])
      
      inline def setKernelspecUndefined: Self = StObject.set(x, "kernelspec", js.undefined)
      
      inline def setLanguage_info(value: ILanguageInfoMetadata): Self = StObject.set(x, "language_info", value.asInstanceOf[js.Any])
      
      inline def setLanguage_infoUndefined: Self = StObject.set(x, "language_info", js.undefined)
      
      inline def setOrig_nbformat(value: Double): Self = StObject.set(x, "orig_nbformat", value.asInstanceOf[js.Any])
      
      inline def setOrig_nbformatUndefined: Self = StObject.set(x, "orig_nbformat", js.undefined)
    }
  }
}
