package typings.ionicReact

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationDirection
import typings.ionicCore.animationInterfaceMod.AnimationFill
import typings.ionicCore.animationInterfaceMod.AnimationKeyFrame
import typings.ionicCore.animationInterfaceMod.AnimationKeyFrames
import typings.ionicReact.anon.Callback
import typings.ionicReact.anon.Dur
import typings.ionicReact.anon.ForceLinearEasing
import typings.ionicReact.anon.Step
import typings.react.mod.PureComponent
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createAnimationMod {
  
  @JSImport("@ionic/react/dist/types/components/CreateAnimation", "CreateAnimation")
  @js.native
  class CreateAnimation protected ()
    extends PureComponent[CreateAnimationProps, js.Object, js.Any] {
    def this(props: js.Any) = this()
    
    var animation: Animation = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCreateAnimation(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCreateAnimation(prevProps: js.Any): Unit = js.native
    
    var nodes: Map[Double, HTMLElement] = js.native
    
    def setupAnimation(props: js.Any): Unit = js.native
  }
  
  trait CreateAnimationProps extends StObject {
    
    var afterAddClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var afterAddRead: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterAddWrite: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var afterClearStyles: js.UndefOr[js.Array[String]] = js.undefined
    
    var afterRemoveClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var afterStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var beforeAddClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var beforeAddRead: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeAddWrite: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var beforeClearStyles: js.UndefOr[js.Array[String]] = js.undefined
    
    var beforeRemoveClass: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var beforeStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var destroy: js.UndefOr[Boolean] = js.undefined
    
    var direction: js.UndefOr[AnimationDirection] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var fill: js.UndefOr[AnimationFill] = js.undefined
    
    var from: js.UndefOr[js.Array[PartialPropertyValue] | PartialPropertyValue] = js.undefined
    
    var fromTo: js.UndefOr[js.Array[PropertyValue] | PropertyValue] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var iterations: js.UndefOr[Double] = js.undefined
    
    var keyframes: js.UndefOr[AnimationKeyFrames] = js.undefined
    
    var onFinish: js.UndefOr[Callback] = js.undefined
    
    var pause: js.UndefOr[Boolean] = js.undefined
    
    var play: js.UndefOr[Boolean] = js.undefined
    
    var progressEnd: js.UndefOr[Dur] = js.undefined
    
    var progressStart: js.UndefOr[ForceLinearEasing] = js.undefined
    
    var progressStep: js.UndefOr[Step] = js.undefined
    
    var stop: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[js.Array[PartialPropertyValue] | PartialPropertyValue] = js.undefined
  }
  object CreateAnimationProps {
    
    @scala.inline
    def apply(): CreateAnimationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateAnimationProps]
    }
    
    @scala.inline
    implicit class CreateAnimationPropsMutableBuilder[Self <: CreateAnimationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterAddClass(value: String | js.Array[String]): Self = StObject.set(x, "afterAddClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterAddClassUndefined: Self = StObject.set(x, "afterAddClass", js.undefined)
      
      @scala.inline
      def setAfterAddClassVarargs(value: String*): Self = StObject.set(x, "afterAddClass", js.Array(value :_*))
      
      @scala.inline
      def setAfterAddRead(value: () => Unit): Self = StObject.set(x, "afterAddRead", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterAddReadUndefined: Self = StObject.set(x, "afterAddRead", js.undefined)
      
      @scala.inline
      def setAfterAddWrite(value: () => Unit): Self = StObject.set(x, "afterAddWrite", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAfterAddWriteUndefined: Self = StObject.set(x, "afterAddWrite", js.undefined)
      
      @scala.inline
      def setAfterClearStyles(value: js.Array[String]): Self = StObject.set(x, "afterClearStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterClearStylesUndefined: Self = StObject.set(x, "afterClearStyles", js.undefined)
      
      @scala.inline
      def setAfterClearStylesVarargs(value: String*): Self = StObject.set(x, "afterClearStyles", js.Array(value :_*))
      
      @scala.inline
      def setAfterRemoveClass(value: String | js.Array[String]): Self = StObject.set(x, "afterRemoveClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterRemoveClassUndefined: Self = StObject.set(x, "afterRemoveClass", js.undefined)
      
      @scala.inline
      def setAfterRemoveClassVarargs(value: String*): Self = StObject.set(x, "afterRemoveClass", js.Array(value :_*))
      
      @scala.inline
      def setAfterStyles(value: StringDictionary[js.Any]): Self = StObject.set(x, "afterStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterStylesUndefined: Self = StObject.set(x, "afterStyles", js.undefined)
      
      @scala.inline
      def setBeforeAddClass(value: String | js.Array[String]): Self = StObject.set(x, "beforeAddClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeAddClassUndefined: Self = StObject.set(x, "beforeAddClass", js.undefined)
      
      @scala.inline
      def setBeforeAddClassVarargs(value: String*): Self = StObject.set(x, "beforeAddClass", js.Array(value :_*))
      
      @scala.inline
      def setBeforeAddRead(value: () => Unit): Self = StObject.set(x, "beforeAddRead", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeAddReadUndefined: Self = StObject.set(x, "beforeAddRead", js.undefined)
      
      @scala.inline
      def setBeforeAddWrite(value: () => Unit): Self = StObject.set(x, "beforeAddWrite", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeAddWriteUndefined: Self = StObject.set(x, "beforeAddWrite", js.undefined)
      
      @scala.inline
      def setBeforeClearStyles(value: js.Array[String]): Self = StObject.set(x, "beforeClearStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeClearStylesUndefined: Self = StObject.set(x, "beforeClearStyles", js.undefined)
      
      @scala.inline
      def setBeforeClearStylesVarargs(value: String*): Self = StObject.set(x, "beforeClearStyles", js.Array(value :_*))
      
      @scala.inline
      def setBeforeRemoveClass(value: String | js.Array[String]): Self = StObject.set(x, "beforeRemoveClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeRemoveClassUndefined: Self = StObject.set(x, "beforeRemoveClass", js.undefined)
      
      @scala.inline
      def setBeforeRemoveClassVarargs(value: String*): Self = StObject.set(x, "beforeRemoveClass", js.Array(value :_*))
      
      @scala.inline
      def setBeforeStyles(value: StringDictionary[js.Any]): Self = StObject.set(x, "beforeStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeStylesUndefined: Self = StObject.set(x, "beforeStyles", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDestroy(value: Boolean): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDirection(value: AnimationDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setFill(value: AnimationFill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFrom(value: js.Array[PartialPropertyValue] | PartialPropertyValue): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromTo(value: js.Array[PropertyValue] | PropertyValue): Self = StObject.set(x, "fromTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromToUndefined: Self = StObject.set(x, "fromTo", js.undefined)
      
      @scala.inline
      def setFromToVarargs(value: PropertyValue*): Self = StObject.set(x, "fromTo", js.Array(value :_*))
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setFromVarargs(value: PartialPropertyValue*): Self = StObject.set(x, "from", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIterationsUndefined: Self = StObject.set(x, "iterations", js.undefined)
      
      @scala.inline
      def setKeyframes(value: AnimationKeyFrames): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
      
      @scala.inline
      def setKeyframesVarargs(value: AnimationKeyFrame*): Self = StObject.set(x, "keyframes", js.Array(value :_*))
      
      @scala.inline
      def setOnFinish(value: Callback): Self = StObject.set(x, "onFinish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnFinishUndefined: Self = StObject.set(x, "onFinish", js.undefined)
      
      @scala.inline
      def setPause(value: Boolean): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseUndefined: Self = StObject.set(x, "pause", js.undefined)
      
      @scala.inline
      def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
      
      @scala.inline
      def setProgressEnd(value: Dur): Self = StObject.set(x, "progressEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressEndUndefined: Self = StObject.set(x, "progressEnd", js.undefined)
      
      @scala.inline
      def setProgressStart(value: ForceLinearEasing): Self = StObject.set(x, "progressStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressStartUndefined: Self = StObject.set(x, "progressStart", js.undefined)
      
      @scala.inline
      def setProgressStep(value: Step): Self = StObject.set(x, "progressStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressStepUndefined: Self = StObject.set(x, "progressStep", js.undefined)
      
      @scala.inline
      def setStop(value: Boolean): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      @scala.inline
      def setTo(value: js.Array[PartialPropertyValue] | PartialPropertyValue): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      @scala.inline
      def setToVarargs(value: PartialPropertyValue*): Self = StObject.set(x, "to", js.Array(value :_*))
    }
  }
  
  trait PartialPropertyValue extends StObject {
    
    var property: String
    
    var value: js.Any
  }
  object PartialPropertyValue {
    
    @scala.inline
    def apply(property: String, value: js.Any): PartialPropertyValue = {
      val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PartialPropertyValue]
    }
    
    @scala.inline
    implicit class PartialPropertyValueMutableBuilder[Self <: PartialPropertyValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PropertyValue extends StObject {
    
    var fromValue: js.Any
    
    var property: String
    
    var toValue: js.Any
  }
  object PropertyValue {
    
    @scala.inline
    def apply(fromValue: js.Any, property: String, toValue: js.Any): PropertyValue = {
      val __obj = js.Dynamic.literal(fromValue = fromValue.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], toValue = toValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropertyValue]
    }
    
    @scala.inline
    implicit class PropertyValueMutableBuilder[Self <: PropertyValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromValue(value: js.Any): Self = StObject.set(x, "fromValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToValue(value: js.Any): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    }
  }
}
