package typings.materialUiCore

import typings.materialUiCore.anon.Ref
import typings.materialUiCore.formLabelFormLabelMod.FormLabelProps
import typings.materialUiCore.materialUiCoreStrings.dense
import typings.materialUiCore.materialUiCoreStrings.filled
import typings.materialUiCore.materialUiCoreStrings.label
import typings.materialUiCore.materialUiCoreStrings.outlined
import typings.materialUiCore.materialUiCoreStrings.standard
import typings.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputLabelInputLabelMod {
  
  @JSImport("@material-ui/core/InputLabel/InputLabel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: InputLabelProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.focused
    - typings.materialUiCore.materialUiCoreStrings.disabled
    - typings.materialUiCore.materialUiCoreStrings.error
    - typings.materialUiCore.materialUiCoreStrings.required
    - typings.materialUiCore.materialUiCoreStrings.asterisk
    - typings.materialUiCore.materialUiCoreStrings.formControl
    - typings.materialUiCore.materialUiCoreStrings.marginDense
    - typings.materialUiCore.materialUiCoreStrings.shrink
    - typings.materialUiCore.materialUiCoreStrings.animated
    - typings.materialUiCore.materialUiCoreStrings.filled
    - typings.materialUiCore.materialUiCoreStrings.outlined
  */
  trait InputLabelClassKey extends StObject
  object InputLabelClassKey {
    
    inline def animated: typings.materialUiCore.materialUiCoreStrings.animated = "animated".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.animated]
    
    inline def asterisk: typings.materialUiCore.materialUiCoreStrings.asterisk = "asterisk".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.asterisk]
    
    inline def disabled: typings.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def error: typings.materialUiCore.materialUiCoreStrings.error = "error".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.error]
    
    inline def filled: typings.materialUiCore.materialUiCoreStrings.filled = "filled".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.filled]
    
    inline def focused: typings.materialUiCore.materialUiCoreStrings.focused = "focused".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.focused]
    
    inline def formControl: typings.materialUiCore.materialUiCoreStrings.formControl = "formControl".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.formControl]
    
    inline def marginDense: typings.materialUiCore.materialUiCoreStrings.marginDense = "marginDense".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.marginDense]
    
    inline def outlined: typings.materialUiCore.materialUiCoreStrings.outlined = "outlined".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.outlined]
    
    inline def required: typings.materialUiCore.materialUiCoreStrings.required = "required".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.required]
    
    inline def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
    
    inline def shrink: typings.materialUiCore.materialUiCoreStrings.shrink = "shrink".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.shrink]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps<'label', {}> extends any ? std.Pick<@material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps<'label', {}>, std.Exclude<keyof @material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps<'label', {}>, 'classes' | never>> : never */ trait InputLabelProps
    extends StObject
       with StyledComponentProps[InputLabelClassKey]
       with Ref[FormLabelProps[label, js.Object]] {
    
    /**
      * The contents of the `InputLabel`.
      */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var color: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps<'label', {}>['color'] */ js.Any
      ] = js.undefined
    
    /**
      * If `true`, the transition animation is disabled.
      */
    var disableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, apply disabled class.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the label will be displayed in an error state.
      */
    var error: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the input of this label is focused.
      */
    var focused: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `dense`, will adjust vertical spacing. This is normally obtained via context from
      * FormControl.
      */
    var margin: js.UndefOr[dense] = js.undefined
    
    /**
      * if `true`, the label will indicate that the input is required.
      */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the label is shrunk.
      */
    var shrink: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The variant to use.
      */
    var variant: js.UndefOr[standard | outlined | filled] = js.undefined
  }
  object InputLabelProps {
    
    inline def apply(): InputLabelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputLabelProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InputLabelProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setColor(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/FormLabel/FormLabel.FormLabelProps<'label', {}>['color'] */ js.Any
      ): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
      
      inline def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
      
      inline def setMargin(value: dense): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setShrink(value: Boolean): Self = StObject.set(x, "shrink", value.asInstanceOf[js.Any])
      
      inline def setShrinkUndefined: Self = StObject.set(x, "shrink", js.undefined)
      
      inline def setVariant(value: standard | outlined | filled): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
