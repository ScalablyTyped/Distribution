package typings.leafletSync

import typings.leaflet.mod.CircleMarkerOptions
import typings.leaflet.mod.LatLngExpression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object leafletMod {
  
  @js.native
  trait Sync extends StObject {
    
    def offsetHelper(ratioRef: js.Array[Double], ratioTarget: js.Array[Double]): js.Function4[
        /* center */ LatLngExpression, 
        /* zoom */ Double, 
        /* refMap */ Map, 
        /* targetMap */ Map, 
        LatLngExpression
      ] = js.native
    def offsetHelper(ratioRef: js.Array[Double], ratioTarget: js.Tuple2[Double, Double]): js.Function4[
        /* center */ LatLngExpression, 
        /* zoom */ Double, 
        /* refMap */ Map, 
        /* targetMap */ Map, 
        LatLngExpression
      ] = js.native
    def offsetHelper(ratioRef: js.Tuple2[Double, Double], ratioTarget: js.Array[Double]): js.Function4[
        /* center */ LatLngExpression, 
        /* zoom */ Double, 
        /* refMap */ Map, 
        /* targetMap */ Map, 
        LatLngExpression
      ] = js.native
    def offsetHelper(ratioRef: js.Tuple2[Double, Double], ratioTarget: js.Tuple2[Double, Double]): js.Function4[
        /* center */ LatLngExpression, 
        /* zoom */ Double, 
        /* refMap */ Map, 
        /* targetMap */ Map, 
        LatLngExpression
      ] = js.native
  }
  @JSImport("leaflet", "Sync")
  @js.native
  val Sync: typings.leafletSync.leafletMod.Sync = js.native
  
  @js.native
  trait Map extends StObject {
    
    def isSynced(): Boolean = js.native
    def isSynced(otherMap: Map): Boolean = js.native
    
    def sync(map: Map): this.type = js.native
    def sync(map: Map, options: SyncMapOptions): this.type = js.native
    
    def unsync(map: Map): this.type = js.native
  }
  
  trait SyncMapOptions extends StObject {
    
    var noInitialSync: js.UndefOr[Boolean] = js.undefined
    
    var offsetFn: js.UndefOr[
        js.Function4[
          /* center */ LatLngExpression, 
          /* zoom */ Double, 
          /* refMap */ Map, 
          /* targetMap */ Map, 
          LatLngExpression
        ]
      ] = js.undefined
    
    var syncCursor: js.UndefOr[Boolean] = js.undefined
    
    var syncCursorMarkerOptions: js.UndefOr[CircleMarkerOptions] = js.undefined
  }
  object SyncMapOptions {
    
    inline def apply(): SyncMapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyncMapOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SyncMapOptions] (val x: Self) extends AnyVal {
      
      inline def setNoInitialSync(value: Boolean): Self = StObject.set(x, "noInitialSync", value.asInstanceOf[js.Any])
      
      inline def setNoInitialSyncUndefined: Self = StObject.set(x, "noInitialSync", js.undefined)
      
      inline def setOffsetFn(
        value: (/* center */ LatLngExpression, /* zoom */ Double, /* refMap */ Map, /* targetMap */ Map) => LatLngExpression
      ): Self = StObject.set(x, "offsetFn", js.Any.fromFunction4(value))
      
      inline def setOffsetFnUndefined: Self = StObject.set(x, "offsetFn", js.undefined)
      
      inline def setSyncCursor(value: Boolean): Self = StObject.set(x, "syncCursor", value.asInstanceOf[js.Any])
      
      inline def setSyncCursorMarkerOptions(value: CircleMarkerOptions): Self = StObject.set(x, "syncCursorMarkerOptions", value.asInstanceOf[js.Any])
      
      inline def setSyncCursorMarkerOptionsUndefined: Self = StObject.set(x, "syncCursorMarkerOptions", js.undefined)
      
      inline def setSyncCursorUndefined: Self = StObject.set(x, "syncCursor", js.undefined)
    }
  }
}
