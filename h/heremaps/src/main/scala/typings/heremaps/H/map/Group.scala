package typings.heremaps.H.map

import typings.heremaps.H.map.provider.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents a map object which can contain other map objects. It's visibility, zIndex and object-order influences the contained map objects
  */
@js.native
trait Group
  extends StObject
     with Object {
  
  /**
    * To add an object to this group.
    * @param object {!H.map.Object}
    * @returns {!H.map.Object} - a reference to the appended object
    */
  def addObject(`object`: Object): Object = js.native
  
  /**
    * Appends a list of objects to this group
    * @param objects {Array<!H.map.Object>}
    */
  def addObjects(objects: js.Array[Object]): Unit = js.native
  
  /**
    *
    * @param callback {function(!H.map.Object, number, !H.map.Group)}
    * @param opt_recursive {boolean=} - Indicates whether sub groups should be traversed recursively
    * @param opt_context {*=} - The context to use as "this" within the callback
    */
  def forEach(callback: js.Function3[/* object */ Object, /* n */ Double, /* group */ this.type, Unit]): Unit = js.native
  def forEach(
    callback: js.Function3[/* object */ Object, /* n */ Double, /* group */ this.type, Unit],
    opt_recursive: Boolean
  ): Unit = js.native
  def forEach(
    callback: js.Function3[/* object */ Object, /* n */ Double, /* group */ this.type, Unit],
    opt_recursive: Boolean,
    opt_context: Any
  ): Unit = js.native
  def forEach(
    callback: js.Function3[/* object */ Object, /* n */ Double, /* group */ this.type, Unit],
    opt_recursive: Unit,
    opt_context: Any
  ): Unit = js.native
  
  /**
    * Method returns the bounding rectangle for the group. The rectangle is the smallest rectangle that covers all objects. If group doesn't contains objects method returns null.
    * @returns {H.geo.Rect} - geo ractangle that covers all objects in the group
    */
  def getBoundingBox(): typings.heremaps.H.geo.Rect = js.native
  
  /**
    * To get a list of all objects of this group. On groups with many chilren this method can cause a higher memory and CPU consumption. Alternatively you case use H.map.Group#forEach
    * @param opt_recursive {boolean=} - Indicates whether objects in sub-groups are also collected .
    * @returns {!Array<!H.map.Object>}
    */
  def getObjects(): js.Array[Object] = js.native
  def getObjects(opt_recursive: Boolean): js.Array[Object] = js.native
  
  /**
    * Method removes all objects from the group.
    */
  def removeAll(): Unit = js.native
  
  /**
    * Removes an object from this group.
    * @param object {!H.map.Object} - The object to remove
    * @returns {!H.map.Object} - a reference to the removed object
    */
  def removeObject(`object`: Object): Object = js.native
  
  /**
    * Removes objects from this group.
    * @param objects {!Array<!H.map.Object>} - The list of objects to remove
    */
  def removeObjects(objects: js.Array[Object]): Unit = js.native
}
object Group {
  
  /**
    * Options used to initialize a group
    * min {number=} - The minimum zoom level for which the object is visible, default is -Infinity
    * max {number=} - The maximum zoom level for which the object is visible, default is Infinity
    * visibility {boolean=} - Indicates whether the map object is visible, default is true
    * zIndex {number=} - The z-index value of the map object, default is 0
    * provider {(H.map.provider.Provider | null)=} - The provider of this object. This property is only needed if a customized Implementation of ObjectProvider wants to instantiate
    * an object.
    * data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData.
    * objects {Array<H.map.Object>=} - A list of map objects to add initially to this group.
    */
  trait Options extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var objects: js.UndefOr[js.Array[Object]] = js.undefined
    
    var provider: js.UndefOr[Provider] = js.undefined
    
    var visibility: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setObjects(value: js.Array[Object]): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
      
      inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
      
      inline def setObjectsVarargs(value: Object*): Self = StObject.set(x, "objects", js.Array(value*))
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
