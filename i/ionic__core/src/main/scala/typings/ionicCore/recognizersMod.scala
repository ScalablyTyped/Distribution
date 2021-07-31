package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recognizersMod {
  
  @JSImport("@ionic/core/dist/types/utils/gesture/recognizers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createPanRecognizer(direction: String, thresh: Double, maxAngle: Double): PanRecognizer = (^.asInstanceOf[js.Dynamic].applyDynamic("createPanRecognizer")(direction.asInstanceOf[js.Any], thresh.asInstanceOf[js.Any], maxAngle.asInstanceOf[js.Any])).asInstanceOf[PanRecognizer]
  
  trait PanRecognizer extends StObject {
    
    def detect(x: Double, y: Double): Boolean
    
    def getDirection(): Double
    
    def isGesture(): Boolean
    
    def start(x: Double, y: Double): Unit
  }
  object PanRecognizer {
    
    @scala.inline
    def apply(
      detect: (Double, Double) => Boolean,
      getDirection: () => Double,
      isGesture: () => Boolean,
      start: (Double, Double) => Unit
    ): PanRecognizer = {
      val __obj = js.Dynamic.literal(detect = js.Any.fromFunction2(detect), getDirection = js.Any.fromFunction0(getDirection), isGesture = js.Any.fromFunction0(isGesture), start = js.Any.fromFunction2(start))
      __obj.asInstanceOf[PanRecognizer]
    }
    
    @scala.inline
    implicit class PanRecognizerMutableBuilder[Self <: PanRecognizer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetect(value: (Double, Double) => Boolean): Self = StObject.set(x, "detect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetDirection(value: () => Double): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsGesture(value: () => Boolean): Self = StObject.set(x, "isGesture", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStart(value: (Double, Double) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
    }
  }
}
