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
    
    @scala.inline
    def apply(prefixed: PrefixedCssPropertyName, standard: StandardCssPropertyName): CssVendorProperty = {
      val __obj = js.Dynamic.literal(prefixed = prefixed.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssVendorProperty]
    }
    
    @scala.inline
    implicit class CssVendorPropertyMutableBuilder[Self <: CssVendorProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefixed(value: PrefixedCssPropertyName): Self = StObject.set(x, "prefixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandard(value: StandardCssPropertyName): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ K in @material/animation.@material/animation/types.StandardCssPropertyName ]: @material/animation.@material/animation/types.CssVendorProperty} */
  trait CssVendorPropertyMap extends StObject {
    
    var animation: CssVendorProperty
    
    var transform: CssVendorProperty
    
    var transition: CssVendorProperty
  }
  object CssVendorPropertyMap {
    
    @scala.inline
    def apply(animation: CssVendorProperty, transform: CssVendorProperty, transition: CssVendorProperty): CssVendorPropertyMap = {
      val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[CssVendorPropertyMap]
    }
    
    @scala.inline
    implicit class CssVendorPropertyMapMutableBuilder[Self <: CssVendorPropertyMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: CssVendorProperty): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransform(value: CssVendorProperty): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransition(value: CssVendorProperty): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    }
  }
  
  trait JsVendorProperty extends StObject {
    
    var cssProperty: StandardCssPropertyName
    
    var prefixed: PrefixedJsEventType
    
    var standard: StandardJsEventType
  }
  object JsVendorProperty {
    
    @scala.inline
    def apply(cssProperty: StandardCssPropertyName, prefixed: PrefixedJsEventType, standard: StandardJsEventType): JsVendorProperty = {
      val __obj = js.Dynamic.literal(cssProperty = cssProperty.asInstanceOf[js.Any], prefixed = prefixed.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsVendorProperty]
    }
    
    @scala.inline
    implicit class JsVendorPropertyMutableBuilder[Self <: JsVendorProperty] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCssProperty(value: StandardCssPropertyName): Self = StObject.set(x, "cssProperty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixed(value: PrefixedJsEventType): Self = StObject.set(x, "prefixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStandard(value: StandardJsEventType): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(
      animationend: JsVendorProperty,
      animationiteration: JsVendorProperty,
      animationstart: JsVendorProperty,
      transitionend: JsVendorProperty
    ): JsVendorPropertyMap = {
      val __obj = js.Dynamic.literal(animationend = animationend.asInstanceOf[js.Any], animationiteration = animationiteration.asInstanceOf[js.Any], animationstart = animationstart.asInstanceOf[js.Any], transitionend = transitionend.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsVendorPropertyMap]
    }
    
    @scala.inline
    implicit class JsVendorPropertyMapMutableBuilder[Self <: JsVendorPropertyMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationend(value: JsVendorProperty): Self = StObject.set(x, "animationend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationiteration(value: JsVendorProperty): Self = StObject.set(x, "animationiteration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationstart(value: JsVendorProperty): Self = StObject.set(x, "animationstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionend(value: JsVendorProperty): Self = StObject.set(x, "transitionend", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialAnimation.materialAnimationStrings.`-webkit-animation`
    - typings.materialAnimation.materialAnimationStrings.`-webkit-transform`
    - typings.materialAnimation.materialAnimationStrings.`-webkit-transition`
  */
  trait PrefixedCssPropertyName extends StObject
  object PrefixedCssPropertyName {
    
    @scala.inline
    def `-webkit-animation`: typings.materialAnimation.materialAnimationStrings.`-webkit-animation` = "-webkit-animation".asInstanceOf[typings.materialAnimation.materialAnimationStrings.`-webkit-animation`]
    
    @scala.inline
    def `-webkit-transform`: typings.materialAnimation.materialAnimationStrings.`-webkit-transform` = "-webkit-transform".asInstanceOf[typings.materialAnimation.materialAnimationStrings.`-webkit-transform`]
    
    @scala.inline
    def `-webkit-transition`: typings.materialAnimation.materialAnimationStrings.`-webkit-transition` = "-webkit-transition".asInstanceOf[typings.materialAnimation.materialAnimationStrings.`-webkit-transition`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialAnimation.materialAnimationStrings.webkitAnimationEnd
    - typings.materialAnimation.materialAnimationStrings.webkitAnimationIteration
    - typings.materialAnimation.materialAnimationStrings.webkitAnimationStart
    - typings.materialAnimation.materialAnimationStrings.webkitTransitionEnd
  */
  trait PrefixedJsEventType extends StObject
  object PrefixedJsEventType {
    
    @scala.inline
    def webkitAnimationEnd: typings.materialAnimation.materialAnimationStrings.webkitAnimationEnd = "webkitAnimationEnd".asInstanceOf[typings.materialAnimation.materialAnimationStrings.webkitAnimationEnd]
    
    @scala.inline
    def webkitAnimationIteration: typings.materialAnimation.materialAnimationStrings.webkitAnimationIteration = "webkitAnimationIteration".asInstanceOf[typings.materialAnimation.materialAnimationStrings.webkitAnimationIteration]
    
    @scala.inline
    def webkitAnimationStart: typings.materialAnimation.materialAnimationStrings.webkitAnimationStart = "webkitAnimationStart".asInstanceOf[typings.materialAnimation.materialAnimationStrings.webkitAnimationStart]
    
    @scala.inline
    def webkitTransitionEnd: typings.materialAnimation.materialAnimationStrings.webkitTransitionEnd = "webkitTransitionEnd".asInstanceOf[typings.materialAnimation.materialAnimationStrings.webkitTransitionEnd]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialAnimation.materialAnimationStrings.animation
    - typings.materialAnimation.materialAnimationStrings.transform
    - typings.materialAnimation.materialAnimationStrings.transition
  */
  trait StandardCssPropertyName extends StObject
  object StandardCssPropertyName {
    
    @scala.inline
    def animation: typings.materialAnimation.materialAnimationStrings.animation = "animation".asInstanceOf[typings.materialAnimation.materialAnimationStrings.animation]
    
    @scala.inline
    def transform: typings.materialAnimation.materialAnimationStrings.transform = "transform".asInstanceOf[typings.materialAnimation.materialAnimationStrings.transform]
    
    @scala.inline
    def transition: typings.materialAnimation.materialAnimationStrings.transition = "transition".asInstanceOf[typings.materialAnimation.materialAnimationStrings.transition]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.materialAnimation.materialAnimationStrings.animationend
    - typings.materialAnimation.materialAnimationStrings.animationiteration
    - typings.materialAnimation.materialAnimationStrings.animationstart
    - typings.materialAnimation.materialAnimationStrings.transitionend
  */
  trait StandardJsEventType extends StObject
  object StandardJsEventType {
    
    @scala.inline
    def animationend: typings.materialAnimation.materialAnimationStrings.animationend = "animationend".asInstanceOf[typings.materialAnimation.materialAnimationStrings.animationend]
    
    @scala.inline
    def animationiteration: typings.materialAnimation.materialAnimationStrings.animationiteration = "animationiteration".asInstanceOf[typings.materialAnimation.materialAnimationStrings.animationiteration]
    
    @scala.inline
    def animationstart: typings.materialAnimation.materialAnimationStrings.animationstart = "animationstart".asInstanceOf[typings.materialAnimation.materialAnimationStrings.animationstart]
    
    @scala.inline
    def transitionend: typings.materialAnimation.materialAnimationStrings.transitionend = "transitionend".asInstanceOf[typings.materialAnimation.materialAnimationStrings.transitionend]
  }
}
