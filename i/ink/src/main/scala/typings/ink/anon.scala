package typings.ink

import typings.ink.buildDomMod.NodeNames
import typings.ink.buildRenderNodeToOutputMod.OutputTransformer
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveFocusId extends StObject {
    
    var activeFocusId: Unit
    
    var error: Unit
    
    var focusables: js.Array[scala.Nothing]
    
    var isFocusEnabled: Boolean
  }
  object ActiveFocusId {
    
    inline def apply(activeFocusId: Unit, error: Unit, focusables: js.Array[scala.Nothing], isFocusEnabled: Boolean): ActiveFocusId = {
      val __obj = js.Dynamic.literal(activeFocusId = activeFocusId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focusables = focusables.asInstanceOf[js.Any], isFocusEnabled = isFocusEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveFocusId]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActiveFocusId] (val x: Self) extends AnyVal {
      
      inline def setActiveFocusId(value: Unit): Self = StObject.set(x, "activeFocusId", value.asInstanceOf[js.Any])
      
      inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFocusables(value: js.Array[scala.Nothing]): Self = StObject.set(x, "focusables", value.asInstanceOf[js.Any])
      
      inline def setFocusablesVarargs(value: scala.Nothing*): Self = StObject.set(x, "focusables", js.Array(value*))
      
      inline def setIsFocusEnabled(value: Boolean): Self = StObject.set(x, "isFocusEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutoFocus extends StObject {
    
    var autoFocus: Boolean
  }
  object AutoFocus {
    
    inline def apply(autoFocus: Boolean): AutoFocus = {
      val __obj = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoFocus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoFocus] (val x: Self) extends AnyVal {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Error extends StObject {
    
    var error: js.Error
  }
  object Error {
    
    inline def apply(error: js.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var output: String
  }
  object Height {
    
    inline def apply(height: Double, output: String): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeName extends StObject {
    
    var nodeName: NodeNames
  }
  object NodeName {
    
    inline def apply(nodeName: NodeNames): NodeName = {
      val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeName] (val x: Self) extends AnyVal {
      
      inline def setNodeName(value: NodeNames): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait OffsetX extends StObject {
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var skipStaticElements: Boolean
    
    var transformers: js.UndefOr[js.Array[OutputTransformer]] = js.undefined
  }
  object OffsetX {
    
    inline def apply(skipStaticElements: Boolean): OffsetX = {
      val __obj = js.Dynamic.literal(skipStaticElements = skipStaticElements.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetX]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OffsetX] (val x: Self) extends AnyVal {
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setSkipStaticElements(value: Boolean): Self = StObject.set(x, "skipStaticElements", value.asInstanceOf[js.Any])
      
      inline def setTransformers(value: js.Array[OutputTransformer]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      inline def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
      
      inline def setTransformersVarargs(value: OutputTransformer*): Self = StObject.set(x, "transformers", js.Array(value*))
    }
  }
  
  trait ShowCursor extends StObject {
    
    var showCursor: js.UndefOr[Boolean] = js.undefined
  }
  object ShowCursor {
    
    inline def apply(): ShowCursor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowCursor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ShowCursor] (val x: Self) extends AnyVal {
      
      inline def setShowCursor(value: Boolean): Self = StObject.set(x, "showCursor", value.asInstanceOf[js.Any])
      
      inline def setShowCursorUndefined: Self = StObject.set(x, "showCursor", js.undefined)
    }
  }
  
  trait Transformers extends StObject {
    
    var transformers: js.Array[OutputTransformer]
  }
  object Transformers {
    
    inline def apply(transformers: js.Array[OutputTransformer]): Transformers = {
      val __obj = js.Dynamic.literal(transformers = transformers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transformers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transformers] (val x: Self) extends AnyVal {
      
      inline def setTransformers(value: js.Array[OutputTransformer]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      inline def setTransformersVarargs(value: OutputTransformer*): Self = StObject.set(x, "transformers", js.Array(value*))
    }
  }
}
