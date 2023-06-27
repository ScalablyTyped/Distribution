package typings.graphemer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBoundariesMod {
  
  @js.native
  sealed trait CLUSTER_BREAK extends StObject
  @JSImport("graphemer/lib/boundaries", "CLUSTER_BREAK")
  @js.native
  object CLUSTER_BREAK extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CLUSTER_BREAK & Double] = js.native
    
    @js.native
    sealed trait CONTROL
      extends StObject
         with CLUSTER_BREAK
    /* 2 */ val CONTROL: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.CONTROL & Double = js.native
    
    @js.native
    sealed trait CR
      extends StObject
         with CLUSTER_BREAK
    /* 0 */ val CR: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.CR & Double = js.native
    
    @js.native
    sealed trait EXTEND
      extends StObject
         with CLUSTER_BREAK
    /* 3 */ val EXTEND: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.EXTEND & Double = js.native
    
    @js.native
    sealed trait E_BASE
      extends StObject
         with CLUSTER_BREAK
    /* 13 */ val E_BASE: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.E_BASE & Double = js.native
    
    @js.native
    sealed trait E_BASE_GAZ
      extends StObject
         with CLUSTER_BREAK
    /* 17 */ val E_BASE_GAZ: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.E_BASE_GAZ & Double = js.native
    
    @js.native
    sealed trait E_MODIFIER
      extends StObject
         with CLUSTER_BREAK
    /* 14 */ val E_MODIFIER: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.E_MODIFIER & Double = js.native
    
    @js.native
    sealed trait GLUE_AFTER_ZWJ
      extends StObject
         with CLUSTER_BREAK
    /* 16 */ val GLUE_AFTER_ZWJ: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.GLUE_AFTER_ZWJ & Double = js.native
    
    @js.native
    sealed trait L
      extends StObject
         with CLUSTER_BREAK
    /* 6 */ val L: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.L & Double = js.native
    
    @js.native
    sealed trait LF
      extends StObject
         with CLUSTER_BREAK
    /* 1 */ val LF: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.LF & Double = js.native
    
    @js.native
    sealed trait LV
      extends StObject
         with CLUSTER_BREAK
    /* 9 */ val LV: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.LV & Double = js.native
    
    @js.native
    sealed trait LVT
      extends StObject
         with CLUSTER_BREAK
    /* 10 */ val LVT: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.LVT & Double = js.native
    
    @js.native
    sealed trait OTHER
      extends StObject
         with CLUSTER_BREAK
    /* 11 */ val OTHER: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.OTHER & Double = js.native
    
    @js.native
    sealed trait PREPEND
      extends StObject
         with CLUSTER_BREAK
    /* 12 */ val PREPEND: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.PREPEND & Double = js.native
    
    @js.native
    sealed trait REGIONAL_INDICATOR
      extends StObject
         with CLUSTER_BREAK
    /* 4 */ val REGIONAL_INDICATOR: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.REGIONAL_INDICATOR & Double = js.native
    
    @js.native
    sealed trait SPACINGMARK
      extends StObject
         with CLUSTER_BREAK
    /* 5 */ val SPACINGMARK: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.SPACINGMARK & Double = js.native
    
    @js.native
    sealed trait T
      extends StObject
         with CLUSTER_BREAK
    /* 8 */ val T: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.T & Double = js.native
    
    @js.native
    sealed trait V
      extends StObject
         with CLUSTER_BREAK
    /* 7 */ val V: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.V & Double = js.native
    
    @js.native
    sealed trait ZWJ
      extends StObject
         with CLUSTER_BREAK
    /* 15 */ val ZWJ: typings.graphemer.libBoundariesMod.CLUSTER_BREAK.ZWJ & Double = js.native
  }
  
  @JSImport("graphemer/lib/boundaries", "EXTENDED_PICTOGRAPHIC")
  @js.native
  val EXTENDED_PICTOGRAPHIC: /* 101 */ Double = js.native
}
