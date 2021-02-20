package typings.imageQ

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bt709Mod {
  
  @js.native
  sealed trait Y_ extends StObject
  @JSImport("image-q/dist/constants/bt709", "Y")
  @js.native
  object Y_ extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Y_ with Double] = js.native
    
    @js.native
    sealed trait BLUE extends Y_
    /* 0.0722 */ val BLUE: typings.imageQ.bt709Mod.Y_.BLUE with Double = js.native
    
    @js.native
    sealed trait GREEN extends Y_
    /* 0.7152 */ val GREEN: typings.imageQ.bt709Mod.Y_.GREEN with Double = js.native
    
    @js.native
    sealed trait RED extends Y_
    /* 0.2126 */ val RED: typings.imageQ.bt709Mod.Y_.RED with Double = js.native
    
    @js.native
    sealed trait WHITE extends Y_
    /* 1 */ val WHITE: typings.imageQ.bt709Mod.Y_.WHITE with Double = js.native
  }
  
  @js.native
  sealed trait x extends StObject
  @JSImport("image-q/dist/constants/bt709", "x")
  @js.native
  object x extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[x with Double] = js.native
    
    @js.native
    sealed trait BLUE extends x
    /* 0.15 */ val BLUE: typings.imageQ.bt709Mod.x.BLUE with Double = js.native
    
    @js.native
    sealed trait GREEN extends x
    /* 0.3 */ val GREEN: typings.imageQ.bt709Mod.x.GREEN with Double = js.native
    
    @js.native
    sealed trait RED extends x
    /* 0.64 */ val RED: typings.imageQ.bt709Mod.x.RED with Double = js.native
    
    @js.native
    sealed trait WHITE extends x
    /* 0.3127 */ val WHITE: typings.imageQ.bt709Mod.x.WHITE with Double = js.native
  }
  
  @js.native
  sealed trait y extends StObject
  @JSImport("image-q/dist/constants/bt709", "y")
  @js.native
  object y extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[y with Double] = js.native
    
    @js.native
    sealed trait BLUE extends y
    /* 0.06 */ val BLUE: typings.imageQ.bt709Mod.y.BLUE with Double = js.native
    
    @js.native
    sealed trait GREEN extends y
    /* 0.6 */ val GREEN: typings.imageQ.bt709Mod.y.GREEN with Double = js.native
    
    @js.native
    sealed trait RED extends y
    /* 0.33 */ val RED: typings.imageQ.bt709Mod.y.RED with Double = js.native
    
    @js.native
    sealed trait WHITE extends y
    /* 0.329 */ val WHITE: typings.imageQ.bt709Mod.y.WHITE with Double = js.native
  }
}
