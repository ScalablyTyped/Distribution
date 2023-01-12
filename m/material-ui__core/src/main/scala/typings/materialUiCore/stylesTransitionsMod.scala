package typings.materialUiCore

import typings.materialUiCore.anon.PartialDuration
import typings.materialUiCore.anon.PartialEasing
import typings.materialUiCore.anon.Partialdurationnumberstri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesTransitionsMod {
  
  @JSImport("@material-ui/core/styles/transitions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // export type TransitionsOptions = DeepPartial<Transitions>;
  @JSImport("@material-ui/core/styles/transitions", JSImport.Default)
  @js.native
  val default: Transitions = js.native
  
  @JSImport("@material-ui/core/styles/transitions", "duration")
  @js.native
  val duration: Duration_ = js.native
  
  @JSImport("@material-ui/core/styles/transitions", "easing")
  @js.native
  val easing: Easing_ = js.native
  
  inline def formatMs(milliseconds: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatMs")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Duration_ extends StObject {
    
    var complex: Double
    
    var enteringScreen: Double
    
    var leavingScreen: Double
    
    var short: Double
    
    var shorter: Double
    
    var shortest: Double
    
    var standard: Double
  }
  object Duration_ {
    
    inline def apply(
      complex: Double,
      enteringScreen: Double,
      leavingScreen: Double,
      short: Double,
      shorter: Double,
      shortest: Double,
      standard: Double
    ): Duration_ = {
      val __obj = js.Dynamic.literal(complex = complex.asInstanceOf[js.Any], enteringScreen = enteringScreen.asInstanceOf[js.Any], leavingScreen = leavingScreen.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], shorter = shorter.asInstanceOf[js.Any], shortest = shortest.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Duration_] (val x: Self) extends AnyVal {
      
      inline def setComplex(value: Double): Self = StObject.set(x, "complex", value.asInstanceOf[js.Any])
      
      inline def setEnteringScreen(value: Double): Self = StObject.set(x, "enteringScreen", value.asInstanceOf[js.Any])
      
      inline def setLeavingScreen(value: Double): Self = StObject.set(x, "leavingScreen", value.asInstanceOf[js.Any])
      
      inline def setShort(value: Double): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      inline def setShorter(value: Double): Self = StObject.set(x, "shorter", value.asInstanceOf[js.Any])
      
      inline def setShortest(value: Double): Self = StObject.set(x, "shortest", value.asInstanceOf[js.Any])
      
      inline def setStandard(value: Double): Self = StObject.set(x, "standard", value.asInstanceOf[js.Any])
    }
  }
  
  trait Easing_ extends StObject {
    
    var easeIn: String
    
    var easeInOut: String
    
    var easeOut: String
    
    var sharp: String
  }
  object Easing_ {
    
    inline def apply(easeIn: String, easeInOut: String, easeOut: String, sharp: String): Easing_ = {
      val __obj = js.Dynamic.literal(easeIn = easeIn.asInstanceOf[js.Any], easeInOut = easeInOut.asInstanceOf[js.Any], easeOut = easeOut.asInstanceOf[js.Any], sharp = sharp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Easing_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Easing_] (val x: Self) extends AnyVal {
      
      inline def setEaseIn(value: String): Self = StObject.set(x, "easeIn", value.asInstanceOf[js.Any])
      
      inline def setEaseInOut(value: String): Self = StObject.set(x, "easeInOut", value.asInstanceOf[js.Any])
      
      inline def setEaseOut(value: String): Self = StObject.set(x, "easeOut", value.asInstanceOf[js.Any])
      
      inline def setSharp(value: String): Self = StObject.set(x, "sharp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Transitions extends StObject {
    
    def create(props: String): String = js.native
    def create(props: String, options: Partialdurationnumberstri): String = js.native
    def create(props: js.Array[String]): String = js.native
    def create(props: js.Array[String], options: Partialdurationnumberstri): String = js.native
    
    var duration: Duration_ = js.native
    
    var easing: Easing_ = js.native
    
    def getAutoHeightDuration(height: Double): Double = js.native
  }
  
  trait TransitionsOptions extends StObject {
    
    var create: js.UndefOr[
        js.Function2[
          /* props */ String | js.Array[String], 
          /* options */ js.UndefOr[Partialdurationnumberstri], 
          String
        ]
      ] = js.undefined
    
    var duration: js.UndefOr[PartialDuration] = js.undefined
    
    var easing: js.UndefOr[PartialEasing] = js.undefined
    
    var getAutoHeightDuration: js.UndefOr[js.Function1[/* height */ Double, Double]] = js.undefined
  }
  object TransitionsOptions {
    
    inline def apply(): TransitionsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransitionsOptions] (val x: Self) extends AnyVal {
      
      inline def setCreate(
        value: (/* props */ String | js.Array[String], /* options */ js.UndefOr[Partialdurationnumberstri]) => String
      ): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setDuration(value: PartialDuration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(value: PartialEasing): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setGetAutoHeightDuration(value: /* height */ Double => Double): Self = StObject.set(x, "getAutoHeightDuration", js.Any.fromFunction1(value))
      
      inline def setGetAutoHeightDurationUndefined: Self = StObject.set(x, "getAutoHeightDuration", js.undefined)
    }
  }
}
