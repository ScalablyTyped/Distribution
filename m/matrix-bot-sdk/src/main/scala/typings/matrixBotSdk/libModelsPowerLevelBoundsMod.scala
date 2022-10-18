package typings.matrixBotSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModelsPowerLevelBoundsMod {
  
  trait PowerLevelBounds extends StObject {
    
    /**
      * Whether or not the user can even modify the power level of the user. This
      * will be false if the user can't send power level events, or the user is
      * unobtainably high in power.
      */
    var canModify: Boolean
    
    /**
      * The maximum possible power level the user can set on the target user.
      */
    var maximumPossibleLevel: Double
  }
  object PowerLevelBounds {
    
    inline def apply(canModify: Boolean, maximumPossibleLevel: Double): PowerLevelBounds = {
      val __obj = js.Dynamic.literal(canModify = canModify.asInstanceOf[js.Any], maximumPossibleLevel = maximumPossibleLevel.asInstanceOf[js.Any])
      __obj.asInstanceOf[PowerLevelBounds]
    }
    
    extension [Self <: PowerLevelBounds](x: Self) {
      
      inline def setCanModify(value: Boolean): Self = StObject.set(x, "canModify", value.asInstanceOf[js.Any])
      
      inline def setMaximumPossibleLevel(value: Double): Self = StObject.set(x, "maximumPossibleLevel", value.asInstanceOf[js.Any])
    }
  }
}
