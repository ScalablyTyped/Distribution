package typings.mapboxShelfPack

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/shelf-pack", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with ShelfPack {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    def this(width: Unit, height: Double) = this()
    def this(width: Double, height: Double, options: CreateOption) = this()
    def this(width: Double, height: Unit, options: CreateOption) = this()
    def this(width: Unit, height: Double, options: CreateOption) = this()
    def this(width: Unit, height: Unit, options: CreateOption) = this()
  }
  
  @JSImport("@mapbox/shelf-pack", "Bin")
  @js.native
  class Bin protected () extends StObject {
    def this(id: ID, x: Double, y: Double, w: Double, h: Double) = this()
    def this(id: ID, x: Double, y: Double, w: Double, h: Double, maxw: Double) = this()
    def this(id: ID, x: Double, y: Double, w: Double, h: Double, maxw: Double, maxh: Double) = this()
    def this(id: ID, x: Double, y: Double, w: Double, h: Double, maxw: Unit, maxh: Double) = this()
    
    var h: Double = js.native
    
    var id: ID = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  trait CreateOption extends StObject {
    
    /// If true , the sprite will automatically grow
    var autoResize: js.UndefOr[Boolean] = js.undefined
  }
  object CreateOption {
    
    inline def apply(): CreateOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOption]
    }
    
    extension [Self <: CreateOption](x: Self) {
      
      inline def setAutoResize(value: Boolean): Self = StObject.set(x, "autoResize", value.asInstanceOf[js.Any])
      
      inline def setAutoResizeUndefined: Self = StObject.set(x, "autoResize", js.undefined)
    }
  }
  
  type ID = Double | String
  
  trait PackOption extends StObject {
    
    /// If true , the supplied bin objects will be updated inplace with x and y properties
    var inPlace: js.UndefOr[Boolean] = js.undefined
  }
  object PackOption {
    
    inline def apply(): PackOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackOption]
    }
    
    extension [Self <: PackOption](x: Self) {
      
      inline def setInPlace(value: Boolean): Self = StObject.set(x, "inPlace", value.asInstanceOf[js.Any])
      
      inline def setInPlaceUndefined: Self = StObject.set(x, "inPlace", js.undefined)
    }
  }
  
  trait Request extends StObject {
    
    var id: js.UndefOr[ID] = js.undefined
  }
  object Request {
    
    inline def apply(): Request = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    }
  }
  
  trait RequestLong
    extends StObject
       with Request {
    
    var height: Double
    
    var width: Double
  }
  object RequestLong {
    
    inline def apply(height: Double, width: Double): RequestLong = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestLong]
    }
    
    extension [Self <: RequestLong](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestShort
    extends StObject
       with Request {
    
    var h: Double
    
    var w: Double
  }
  object RequestShort {
    
    inline def apply(h: Double, w: Double): RequestShort = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestShort]
    }
    
    extension [Self <: RequestShort](x: Self) {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShelfPack extends StObject {
    
    def clear(): Unit = js.native
    
    def getBin(id: ID): Bin = js.native
    
    var h: Double = js.native
    
    def pack(bins: js.Array[RequestShort | RequestLong]): js.Array[Bin] = js.native
    def pack(bins: js.Array[RequestShort | RequestLong], options: PackOption): js.Array[Bin] = js.native
    
    def packOne(w: Double, h: Double): Bin = js.native
    def packOne(w: Double, h: Double, id: ID): Bin = js.native
    
    def ref(bin: Bin): Double = js.native
    
    def resize(w: Double, h: Double): Boolean = js.native
    
    def unref(bin: Bin): Double = js.native
    
    var w: Double = js.native
  }
}
