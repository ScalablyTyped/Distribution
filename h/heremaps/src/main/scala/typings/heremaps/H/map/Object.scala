package typings.heremaps.H.map

import typings.heremaps.H.map.provider.Invalidations
import typings.heremaps.H.map.provider.ObjectProvider
import typings.heremaps.H.map.provider.Provider
import typings.heremaps.H.math.BitMask
import typings.heremaps.H.util.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents the abstract base class for map objects such as polylines, polygons, markers, groups etc.
  */
@js.native
trait Object
  extends StObject
     with EventTarget {
  
  def addOnDisposeCallback(callback: js.Function0[Unit], opt_scope: js.Object): Unit = js.native
  
  /**
    * Checks whether the given object is an inclusive descendant of this object
    * @param object {*} - The object that's being compared against.
    * @returns {boolean}
    */
  def contains(`object`: js.Any): Boolean = js.native
  
  /**
    * This method returns previously stored arbitrary data from this object.
    * @returns {*} - the previously stored data or undefined if not data was stored.
    */
  def getData(): js.Any = js.native
  
  /**
    * Returns the ID of this object.
    * @returns {*}
    */
  def getId(): js.Any = js.native
  
  /**
    * Returns the invalidations of this object
    * @returns {H.map.provider.Invalidations} - an invalidation object
    */
  def getInvalidations(): Invalidations = js.native
  
  /**
    * Returns the parent group which contains this object or null if the object is not contained by any group.
    * @returns {?H.map.Group}
    */
  def getParentGroup(): Group = js.native
  
  /**
    * The current provider of this object
    * @returns {?H.map.provider.ObjectProvider} - the current provider
    */
  def getProvider(): ObjectProvider = js.native
  
  /**
    * The root object in which this object is attached or the object itself.
    * @returns {!H.map.Object}
    */
  def getRootGroup(): Object = js.native
  
  /**
    * Returns the visibility of this object.
    * @param opt_effective {boolean=} - Indicates that the effective visibility is requested. In this case the visibility of all possible ancestor groups is also taken into account
    * @returns {boolean}
    */
  def getVisibility(): Boolean = js.native
  def getVisibility(opt_effective: Boolean): Boolean = js.native
  
  /**
    * Returns the z-index of this object.
    * @returns {(number | undefined)}
    */
  def getZIndex(): Double | Unit = js.native
  
  /**
    * This method invalidates this map object.
    * @param flags {H.math.BitMask} - The flags indicating the types of occurred changes
    * @returns {boolean} - indicates whether a validtion was executed (only if the object has a provider)
    */
  def invalidate(flags: BitMask): Boolean = js.native
  
  /**
    * This method stores arbitrary data with this map object
    * @param data {*} - the data to be stored
    * @returns {H.map.Object} - returns this map object instance
    */
  def setData(data: js.Any): Object = js.native
  
  /**
    * Sets the visibility of this object.
    * @param opt_visibility {boolean=} - Indicates whether this map object should be visible.
    * @returns {H.map.Object} - returns this object
    */
  def setVisibility(): Object = js.native
  def setVisibility(opt_visibility: Boolean): Object = js.native
  
  /**
    * To set the-index of this object.
    * @param zIndex {(number | undefined)}
    * @returns {H.map.Object} - returns this object
    */
  def setZIndex(): Object = js.native
  def setZIndex(zIndex: Double): Object = js.native
}
object Object {
  
  @js.native
  sealed trait Type extends StObject
  /**
    * The major types of map objects
    */
  @JSGlobal("H.map.Object.Type")
  @js.native
  object Type extends StObject {
    
    /** spatial object */
    @js.native
    sealed trait ANY
      extends StObject
         with Type
    
    /** DomMarker object */
    @js.native
    sealed trait DOM_MARKER
      extends StObject
         with Type
    
    /** DomMarker object */
    @js.native
    sealed trait GROUP
      extends StObject
         with Type
    
    /** Marker object */
    @js.native
    sealed trait MARKER
      extends StObject
         with Type
    
    /** spatial object */
    @js.native
    sealed trait OVERLAY
      extends StObject
         with Type
    
    /** spatial object */
    @js.native
    sealed trait SPATIAL
      extends StObject
         with Type
  }
  
  /**
    * Options used to initialize a map object
    * @property min {number=} - The minimum zoom level for which the object is visible, default is -Infinity
    * @property max {number=} - The maximum zoom level for which the object is visible, default is Infinity
    * @property visibility {boolean=} - Indicates whether the map object is visible at all, default is true
    * @property zIndex {number=} - The z-index value of the map object, default is 0
    * @property provider {(H.map.provider.Provider | null)=} - The provider of this object. This property is only needed if a customized Implementation of ObjectProvider wants to instantiate
    * an object.
    * @property data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData.
    */
  trait Options extends StObject {
    
    var data: js.UndefOr[js.Any] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var provider: js.UndefOr[Provider] = js.undefined
    
    var visibility: js.UndefOr[Boolean] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      @scala.inline
      def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
