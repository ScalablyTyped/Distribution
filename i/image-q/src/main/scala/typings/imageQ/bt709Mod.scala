package typings.imageQ

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bt709Mod {
  
  @js.native
  sealed trait Y_ extends StObject
  @JSImport("image-q/dist/constants/bt709", "Y")
  @js.native
  object Y_ extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Y_ & Double] = js.native
    
    @js.native
    sealed trait BLUE
      extends StObject
         with Y_
    /* 0.0722 */ val BLUE: typings.imageQ.bt709Mod.Y_.BLUE & Double = js.native
    
    @js.native
    sealed trait GREEN
      extends StObject
         with Y_
    /* 0.7152 */ val GREEN: typings.imageQ.bt709Mod.Y_.GREEN & Double = js.native
    
    @js.native
    sealed trait RED
      extends StObject
         with Y_
    /* 0.2126 */ val RED: typings.imageQ.bt709Mod.Y_.RED & Double = js.native
    
    @js.native
    sealed trait WHITE
      extends StObject
         with Y_
    /* 1 */ val WHITE: typings.imageQ.bt709Mod.Y_.WHITE & Double = js.native
  }
  
  @js.native
  sealed trait x extends StObject
  @JSImport("image-q/dist/constants/bt709", "x")
  @js.native
  object x extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[x & Double] = js.native
    
    @js.native
    sealed trait BLUE
      extends StObject
         with x
    /* 0.15 */ val BLUE: typings.imageQ.bt709Mod.x.BLUE & Double = js.native
    
    @js.native
    sealed trait GREEN
      extends StObject
         with x
    /* 0.3 */ val GREEN: typings.imageQ.bt709Mod.x.GREEN & Double = js.native
    
    @js.native
    sealed trait RED
      extends StObject
         with x
    /* 0.64 */ val RED: typings.imageQ.bt709Mod.x.RED & Double = js.native
    
    @js.native
    sealed trait WHITE
      extends StObject
         with x
    /* 0.3127 */ val WHITE: typings.imageQ.bt709Mod.x.WHITE & Double = js.native
  }
  
  @js.native
  sealed trait y extends StObject
  @JSImport("image-q/dist/constants/bt709", "y")
  @js.native
  object y extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[y & Double] = js.native
    
    @js.native
    sealed trait BLUE
      extends StObject
         with y
    /* 0.06 */ val BLUE: typings.imageQ.bt709Mod.y.BLUE & Double = js.native
    
    @js.native
    sealed trait GREEN
      extends StObject
         with y
    /* 0.6 */ val GREEN: typings.imageQ.bt709Mod.y.GREEN & Double = js.native
    
    @js.native
    sealed trait RED
      extends StObject
         with y
    /* 0.33 */ val RED: typings.imageQ.bt709Mod.y.RED & Double = js.native
    
    @js.native
    sealed trait WHITE
      extends StObject
         with y
    /* 0.329 */ val WHITE: typings.imageQ.bt709Mod.y.WHITE & Double = js.native
  }
}
