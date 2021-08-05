package typings.materialAnimation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait CssVendorProperty extends StObject {
    
    var prefixed: PrefixedCssPropertyName
    
    var standard: StandardCssPropertyName
  }
  object CssVendorProperty {
    
    inline def apply(prefixed: PrefixedCssPropertyName, standard: StandardCssPropertyName): CssVendorProperty = {
      val __obj = js.Dynamic.literal(prefixed = prefixed.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssVendorProperty]
    }
    
    extension [Self <: CssVendorProperty](x: Self) {
      
      inline def setPrefixed(value: PrefixedCssPropertyName): Self = StObject.set(x, "prefixed", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: StandardCssPropertyName): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in @material/animation.@material/animation/types.StandardCssPropertyName ]: @material/animation.@material/animation/types.CssVendorProperty} */
  trait CssVendorPropertyMap extends StObject {
    
    var animation: CssVendorProperty
    
    var transform: CssVendorProperty
    
    var transition: CssVendorProperty
  }
  object CssVendorPropertyMap {
    
    inline def apply(animation: CssVendorProperty, transform: CssVendorProperty, transition: CssVendorProperty): CssVendorPropertyMap = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssVendorPropertyMap]
    }
    
    extension [Self <: CssVendorPropertyMap](x: Self) {
      
      inline def setAnimation(value: CssVendorProperty): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setTransform(value: CssVendorProperty): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: CssVendorProperty): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsVendorProperty extends StObject {
    
    var cssProperty: StandardCssPropertyName
    
    var prefixed: PrefixedJsEventType
    
    var standard: StandardJsEventType
  }
  object JsVendorProperty {
    
    inline def apply(cssProperty: StandardCssPropertyName, prefixed: PrefixedJsEventType, standard: StandardJsEventType): JsVendorProperty = {
      val __obj = js.Dynamic.literal(cssProperty = cssProperty.asInstanceOf[js.Any], prefixed = prefixed.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsVendorProperty]
    }
    
    extension [Self <: JsVendorProperty](x: Self) {
      
      inline def setCssProperty(value: StandardCssPropertyName): Self = StObject.set(x, "cssProperty", value.asInstanceOf[js.Any])
      
      inline def setPrefixed(value: PrefixedJsEventType): Self = StObject.set(x, "prefixed", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: StandardJsEventType): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in @material/animation.@material/animation/types.StandardJsEventType ]: @material/animation.@material/animation/types.JsVendorProperty} */
  trait JsVendorPropertyMap extends StObject {
    
    var animationend: JsVendorProperty
    
    var animationiteration: JsVendorProperty
    
    var animationstart: JsVendorProperty
    
    var transitionend: JsVendorProperty
  }
  object JsVendorPropertyMap {
    
    inline def apply(
      animationend: JsVendorProperty,
      animationiteration: JsVendorProperty,
      animationstart: JsVendorProperty,
      transitionend: JsVendorProperty
    ): JsVendorPropertyMap = {
      val __obj = js.Dynamic.literal(animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsVendorPropertyMap]
    }
    
    extension [Self <: JsVendorPropertyMap](x: Self) {
      
      inline def setAnimationend(value: JsVendorProperty): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      inline def setAnimationiteration(value: JsVendorProperty): Self = StObject.set(x, "animationiteration", value.asInstanceOf[js.Any])
      
      inline def setAnimationstart(value: JsVendorProperty): Self = StObject.set(x, "animationstart", value.asInstanceOf[js.Any])
      
      inline def setTransitionend(value: JsVendorProperty): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialAnimation.materialAnimationStrings.`-webkit-animation`
    - typings.materialAnimation.materialAnimationStrings.`-webkit-transform`
    - typings.materialAnimation.materialAnimationStrings.`-webkit-transition`
  */
  trait PrefixedCssPropertyName extends StObject
  object PrefixedCssPropertyName {
    
    inline def `-webkit-animation`: typings.materialAnimation.materialAnimationStrings.`-webkit-animation` = "-webkit-animation".asInstanceOf[typings.materialAnimation.materialAnimationStrings.`-webkit-animation`]
    
    inline def `-webkit-transform`: typings.materialAnimation.materialAnimationStrings.`-webkit-transform` = "-webkit-transform".asInstanceOf[typings.materialAnimation.materialAnimationStrings.`-webkit-transform`]
    
    inline def `-webkit-transition`: typings.materialAnimation.materialAnimationStrings.`-webkit-transition` = "-webkit-transition".asInstanceOf[typings.materialAnimation.materialAnimationStrings.`-webkit-transition`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialAnimation.materialAnimationStrings.webkitAnimationEnd
    - typings.materialAnimation.materialAnimationStrings.webkitAnimationIteration
    - typings.materialAnimation.materialAnimationStrings.webkitAnimationStart
    - typings.materialAnimation.materialAnimationStrings.webkitTransitionEnd
  */
  trait PrefixedJsEventType extends StObject
  object PrefixedJsEventType {
    
    inline def webkitAnimationEnd: typings.materialAnimation.materialAnimationStrings.webkitAnimationEnd = "webkitAnimationEnd".asInstanceOf[typings.materialAnimation.materialAnimationStrings.webkitAnimationEnd]
    
    inline def webkitAnimationIteration: typings.materialAnimation.materialAnimationStrings.webkitAnimationIteration = "webkitAnimationIteration".asInstanceOf[typings.materialAnimation.materialAnimationStrings.webkitAnimationIteration]
    
    inline def webkitAnimationStart: typings.materialAnimation.materialAnimationStrings.webkitAnimationStart = "webkitAnimationStart".asInstanceOf[typings.materialAnimation.materialAnimationStrings.webkitAnimationStart]
    
    inline def webkitTransitionEnd: typings.materialAnimation.materialAnimationStrings.webkitTransitionEnd = "webkitTransitionEnd".asInstanceOf[typings.materialAnimation.materialAnimationStrings.webkitTransitionEnd]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialAnimation.materialAnimationStrings.animation
    - typings.materialAnimation.materialAnimationStrings.transform
    - typings.materialAnimation.materialAnimationStrings.transition
  */
  trait StandardCssPropertyName extends StObject
  object StandardCssPropertyName {
    
    inline def animation: typings.materialAnimation.materialAnimationStrings.animation = "animation".asInstanceOf[typings.materialAnimation.materialAnimationStrings.animation]
    
    inline def transform: typings.materialAnimation.materialAnimationStrings.transform = "transform".asInstanceOf[typings.materialAnimation.materialAnimationStrings.transform]
    
    inline def transition: typings.materialAnimation.materialAnimationStrings.transition = "transition".asInstanceOf[typings.materialAnimation.materialAnimationStrings.transition]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialAnimation.materialAnimationStrings.animationend
    - typings.materialAnimation.materialAnimationStrings.animationiteration
    - typings.materialAnimation.materialAnimationStrings.animationstart
    - typings.materialAnimation.materialAnimationStrings.transitionend
  */
  trait StandardJsEventType extends StObject
  object StandardJsEventType {
    
    inline def animationend: typings.materialAnimation.materialAnimationStrings.animationend = "animationend".asInstanceOf[typings.materialAnimation.materialAnimationStrings.animationend]
    
    inline def animationiteration: typings.materialAnimation.materialAnimationStrings.animationiteration = "animationiteration".asInstanceOf[typings.materialAnimation.materialAnimationStrings.animationiteration]
    
    inline def animationstart: typings.materialAnimation.materialAnimationStrings.animationstart = "animationstart".asInstanceOf[typings.materialAnimation.materialAnimationStrings.animationstart]
    
    inline def transitionend: typings.materialAnimation.materialAnimationStrings.transitionend = "transitionend".asInstanceOf[typings.materialAnimation.materialAnimationStrings.transitionend]
  }
}
