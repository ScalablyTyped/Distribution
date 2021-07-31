package typings.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typings.materialUiCore.anon.Center
import typings.materialUiCore.mod.StandardProps
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object touchRippleMod extends Shortcut {
  
  @JSImport("@material-ui/core/ButtonBase/TouchRipple", JSImport.Default)
  @js.native
  val default: ComponentType[TouchRippleProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialUiCore.materialUiCoreStrings.root
    - typings.materialUiCore.materialUiCoreStrings.ripple
    - typings.materialUiCore.materialUiCoreStrings.rippleVisible
    - typings.materialUiCore.materialUiCoreStrings.ripplePulsate
    - typings.materialUiCore.materialUiCoreStrings.child
    - typings.materialUiCore.materialUiCoreStrings.childLeaving
    - typings.materialUiCore.materialUiCoreStrings.childPulsate
  */
  trait TouchRippleClassKey extends StObject
  object TouchRippleClassKey {
    
    @scala.inline
    def child: typings.materialUiCore.materialUiCoreStrings.child = "child".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.child]
    
    @scala.inline
    def childLeaving: typings.materialUiCore.materialUiCoreStrings.childLeaving = "childLeaving".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.childLeaving]
    
    @scala.inline
    def childPulsate: typings.materialUiCore.materialUiCoreStrings.childPulsate = "childPulsate".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.childPulsate]
    
    @scala.inline
    def ripple: typings.materialUiCore.materialUiCoreStrings.ripple = "ripple".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.ripple]
    
    @scala.inline
    def ripplePulsate: typings.materialUiCore.materialUiCoreStrings.ripplePulsate = "ripplePulsate".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.ripplePulsate]
    
    @scala.inline
    def rippleVisible: typings.materialUiCore.materialUiCoreStrings.rippleVisible = "rippleVisible".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.rippleVisible]
    
    @scala.inline
    def root: typings.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typings.materialUiCore.materialUiCoreStrings.root]
  }
  
  type TouchRippleProps = (StandardProps[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TransitionGroup.TransitionGroupProps */ js.Any, 
    TouchRippleClassKey, 
    scala.Nothing
  ]) & Center
  
  type _To = ComponentType[TouchRippleProps]
  
  /* This means you don't have to write `default`, but can instead just say `touchRippleMod.foo` */
  override def _to: ComponentType[TouchRippleProps] = default
}
