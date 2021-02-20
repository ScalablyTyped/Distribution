package typings.jointjs.mod

import typings.jointjs.jointjsStrings.connectionClosest
import typings.jointjs.jointjsStrings.connectionLength
import typings.jointjs.jointjsStrings.connectionPerpendicular
import typings.jointjs.jointjsStrings.connectionRatio
import typings.jointjs.mod.anchors.GenericAnchor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linkAnchors {
  
  @JSImport("jointjs", "linkAnchors")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "linkAnchors.connectionClosest")
  @js.native
  def connectionClosest: GenericAnchor[typings.jointjs.jointjsStrings.connectionClosest] = js.native
  @scala.inline
  def connectionClosest_=(x: GenericAnchor[connectionClosest]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionClosest")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "linkAnchors.connectionLength")
  @js.native
  def connectionLength: GenericAnchor[typings.jointjs.jointjsStrings.connectionLength] = js.native
  @scala.inline
  def connectionLength_=(x: GenericAnchor[connectionLength]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionLength")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "linkAnchors.connectionPerpendicular")
  @js.native
  def connectionPerpendicular: GenericAnchor[typings.jointjs.jointjsStrings.connectionPerpendicular] = js.native
  @scala.inline
  def connectionPerpendicular_=(x: GenericAnchor[connectionPerpendicular]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionPerpendicular")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "linkAnchors.connectionRatio")
  @js.native
  def connectionRatio: GenericAnchor[typings.jointjs.jointjsStrings.connectionRatio] = js.native
  @scala.inline
  def connectionRatio_=(x: GenericAnchor[connectionRatio]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connectionRatio")(x.asInstanceOf[js.Any])
  
  @js.native
  trait ConnectionClosestAnchorArguments extends StObject {
    
    var fixedAt: js.UndefOr[Double | String] = js.native
  }
  object ConnectionClosestAnchorArguments {
    
    @scala.inline
    def apply(): ConnectionClosestAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionClosestAnchorArguments]
    }
    
    @scala.inline
    implicit class ConnectionClosestAnchorArgumentsMutableBuilder[Self <: ConnectionClosestAnchorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedAt(value: Double | String): Self = StObject.set(x, "fixedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedAtUndefined: Self = StObject.set(x, "fixedAt", js.undefined)
    }
  }
  
  @js.native
  trait ConnectionLengthAnchorArguments extends StObject {
    
    var length: js.UndefOr[Double] = js.native
  }
  object ConnectionLengthAnchorArguments {
    
    @scala.inline
    def apply(): ConnectionLengthAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionLengthAnchorArguments]
    }
    
    @scala.inline
    implicit class ConnectionLengthAnchorArgumentsMutableBuilder[Self <: ConnectionLengthAnchorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
  
  @js.native
  trait ConnectionPerpendicularAnchorArguments extends StObject {
    
    var fallbackAt: js.UndefOr[Double | String] = js.native
    
    var fixedAt: js.UndefOr[Double | String] = js.native
  }
  object ConnectionPerpendicularAnchorArguments {
    
    @scala.inline
    def apply(): ConnectionPerpendicularAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionPerpendicularAnchorArguments]
    }
    
    @scala.inline
    implicit class ConnectionPerpendicularAnchorArgumentsMutableBuilder[Self <: ConnectionPerpendicularAnchorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFallbackAt(value: Double | String): Self = StObject.set(x, "fallbackAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackAtUndefined: Self = StObject.set(x, "fallbackAt", js.undefined)
      
      @scala.inline
      def setFixedAt(value: Double | String): Self = StObject.set(x, "fixedAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedAtUndefined: Self = StObject.set(x, "fixedAt", js.undefined)
    }
  }
  
  @js.native
  trait ConnectionRatioAnchorArguments extends StObject {
    
    var ratio: js.UndefOr[Double] = js.native
  }
  object ConnectionRatioAnchorArguments {
    
    @scala.inline
    def apply(): ConnectionRatioAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionRatioAnchorArguments]
    }
    
    @scala.inline
    implicit class ConnectionRatioAnchorArgumentsMutableBuilder[Self <: ConnectionRatioAnchorArguments] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
}
