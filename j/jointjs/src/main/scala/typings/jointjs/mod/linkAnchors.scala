package typings.jointjs.mod

import typings.jointjs.jointjsStrings.connectionClosest
import typings.jointjs.jointjsStrings.connectionLength
import typings.jointjs.jointjsStrings.connectionPerpendicular
import typings.jointjs.jointjsStrings.connectionRatio
import typings.jointjs.mod.anchors.GenericAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkAnchors {
  
  @JSImport("jointjs", "linkAnchors")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "linkAnchors.connectionClosest")
  @js.native
  def connectionClosest: GenericAnchor[typings.jointjs.jointjsStrings.connectionClosest] = js.native
  inline def connectionClosest_=(x: GenericAnchor[connectionClosest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionClosest")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "linkAnchors.connectionLength")
  @js.native
  def connectionLength: GenericAnchor[typings.jointjs.jointjsStrings.connectionLength] = js.native
  inline def connectionLength_=(x: GenericAnchor[connectionLength]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionLength")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "linkAnchors.connectionPerpendicular")
  @js.native
  def connectionPerpendicular: GenericAnchor[typings.jointjs.jointjsStrings.connectionPerpendicular] = js.native
  inline def connectionPerpendicular_=(x: GenericAnchor[connectionPerpendicular]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPerpendicular")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "linkAnchors.connectionRatio")
  @js.native
  def connectionRatio: GenericAnchor[typings.jointjs.jointjsStrings.connectionRatio] = js.native
  inline def connectionRatio_=(x: GenericAnchor[connectionRatio]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRatio")(x.asInstanceOf[js.Any])
  
  trait ConnectionClosestAnchorArguments extends StObject {
    
    var fixedAt: js.UndefOr[Double | String] = js.undefined
  }
  object ConnectionClosestAnchorArguments {
    
    inline def apply(): ConnectionClosestAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionClosestAnchorArguments]
    }
    
    extension [Self <: ConnectionClosestAnchorArguments](x: Self) {
      
      inline def setFixedAt(value: Double | String): Self = StObject.set(x, "fixedAt", value.asInstanceOf[js.Any])
      
      inline def setFixedAtUndefined: Self = StObject.set(x, "fixedAt", js.undefined)
    }
  }
  
  trait ConnectionLengthAnchorArguments extends StObject {
    
    var length: js.UndefOr[Double] = js.undefined
  }
  object ConnectionLengthAnchorArguments {
    
    inline def apply(): ConnectionLengthAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionLengthAnchorArguments]
    }
    
    extension [Self <: ConnectionLengthAnchorArguments](x: Self) {
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
  
  trait ConnectionPerpendicularAnchorArguments extends StObject {
    
    var fallbackAt: js.UndefOr[Double | String] = js.undefined
    
    var fixedAt: js.UndefOr[Double | String] = js.undefined
  }
  object ConnectionPerpendicularAnchorArguments {
    
    inline def apply(): ConnectionPerpendicularAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPerpendicularAnchorArguments]
    }
    
    extension [Self <: ConnectionPerpendicularAnchorArguments](x: Self) {
      
      inline def setFallbackAt(value: Double | String): Self = StObject.set(x, "fallbackAt", value.asInstanceOf[js.Any])
      
      inline def setFallbackAtUndefined: Self = StObject.set(x, "fallbackAt", js.undefined)
      
      inline def setFixedAt(value: Double | String): Self = StObject.set(x, "fixedAt", value.asInstanceOf[js.Any])
      
      inline def setFixedAtUndefined: Self = StObject.set(x, "fixedAt", js.undefined)
    }
  }
  
  trait ConnectionRatioAnchorArguments extends StObject {
    
    var ratio: js.UndefOr[Double] = js.undefined
  }
  object ConnectionRatioAnchorArguments {
    
    inline def apply(): ConnectionRatioAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionRatioAnchorArguments]
    }
    
    extension [Self <: ConnectionRatioAnchorArguments](x: Self) {
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
}
