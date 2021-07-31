package typings.howler

import typings.howler.howlerBooleans.`true`
import typings.howler.howlerStrings.HRTF
import typings.howler.howlerStrings.equalpower
import typings.howler.howlerStrings.inverse
import typings.howler.howlerStrings.linear
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ConeInnerAngle extends StObject {
    
    var coneInnerAngle: js.UndefOr[Double] = js.undefined
    
    var coneOuterAngle: js.UndefOr[Double] = js.undefined
    
    var coneOuterGain: js.UndefOr[Double] = js.undefined
    
    var distanceModel: inverse | linear
    
    var maxDistance: Double
    
    var panningModel: HRTF | equalpower
    
    var refDistance: Double
    
    var rolloffFactor: Double
  }
  object ConeInnerAngle {
    
    @scala.inline
    def apply(
      distanceModel: inverse | linear,
      maxDistance: Double,
      panningModel: HRTF | equalpower,
      refDistance: Double,
      rolloffFactor: Double
    ): ConeInnerAngle = {
      val __obj = js.Dynamic.literal(distanceModel = distanceModel.asInstanceOf[js.Any], maxDistance = maxDistance.asInstanceOf[js.Any], panningModel = panningModel.asInstanceOf[js.Any], refDistance = refDistance.asInstanceOf[js.Any], rolloffFactor = rolloffFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConeInnerAngle]
    }
    
    @scala.inline
    implicit class ConeInnerAngleMutableBuilder[Self <: ConeInnerAngle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConeInnerAngle(value: Double): Self = StObject.set(x, "coneInnerAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConeInnerAngleUndefined: Self = StObject.set(x, "coneInnerAngle", js.undefined)
      
      @scala.inline
      def setConeOuterAngle(value: Double): Self = StObject.set(x, "coneOuterAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConeOuterAngleUndefined: Self = StObject.set(x, "coneOuterAngle", js.undefined)
      
      @scala.inline
      def setConeOuterGain(value: Double): Self = StObject.set(x, "coneOuterGain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConeOuterGainUndefined: Self = StObject.set(x, "coneOuterGain", js.undefined)
      
      @scala.inline
      def setDistanceModel(value: inverse | linear): Self = StObject.set(x, "distanceModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDistance(value: Double): Self = StObject.set(x, "maxDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanningModel(value: HRTF | equalpower): Self = StObject.set(x, "panningModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefDistance(value: Double): Self = StObject.set(x, "refDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolloffFactor(value: Double): Self = StObject.set(x, "rolloffFactor", value.asInstanceOf[js.Any])
    }
  }
  
  trait Headers extends StObject {
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var withCredentials: js.UndefOr[`true`] = js.undefined
  }
  object Headers {
    
    @scala.inline
    def apply(): Headers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Headers]
    }
    
    @scala.inline
    implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: `true`): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
