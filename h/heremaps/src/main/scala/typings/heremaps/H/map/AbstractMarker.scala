package typings.heremaps.H.map

import typings.heremaps.H.geo.IPoint
import typings.heremaps.H.geo.MultiPoint
import typings.heremaps.H.geo.Point
import typings.heremaps.H.map.provider.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class represents marker, which offers a means of identifying a location on the map with an icon.
  */
@js.native
trait AbstractMarker
  extends StObject
     with Object {
  
  /**
    * @description This property ensure that the marker can receive drag events.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  
  /**
    * This method returns this marker's current position.
    * @returns {H.geo.Point} - current marker geo position
    */
  def getGeometry(): Point | MultiPoint = js.native
  
  /**
    * Returns this marker's current icon.
    * @returns {!(H.map.Icon | H.map.DomIcon)}
    */
  def getIcon(): Icon | DomIcon = js.native
  
  /**
    * This method sets the marker's current position.
    * @param position {H.geo.IPoint}
    * @returns {H.map.AbstractMarker} - the marker itself
    */
  def setGeometry(position: IPoint): AbstractMarker = js.native
  def setGeometry(position: MultiPoint): AbstractMarker = js.native
  
  def setIcon(icon: DomIcon): AbstractMarker = js.native
  /**
    * Sets the marker's current icon.
    * @param icon {!(H.map.Icon | H.map.DomIcon)} - The new marker icon
    * @returns {H.map.AbstractMarker} - the marker itself
    */
  def setIcon(icon: Icon): AbstractMarker = js.native
}
object AbstractMarker {
  
  /**
    * Options used to initialize a AbstractMarker
    * min {number=} - The minimum zoom level for which the object is visible, default is -Infinity
    * max {number=} - The maximum zoom level for which the object is visible, default is Infinity
    * visibility {boolean=} - Indicates whether the map object is visible at all, default is true.
    * zIndex {number=} - The z-index value of the map object, default is 0
    * provider {(H.map.provider.Provider | null)=} - The provider of this object.
    * This property is only needed if a customized Implementation of ObjectProvider wants to instantiate an object.
    * icon {(H.map.Icon | H.map.DomIcon)=} - The icon to use for the visual representation, if omitted a default icon is used.
    * data {*} - Optional arbitrary data to be stored with this map object. This data can be retrieved by calling getData.
    */
  trait Options extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var icon: js.UndefOr[Icon | DomIcon] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
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
      
      inline def setIcon(value: Icon | DomIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setProvider(value: Provider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
      
      inline def setVisibility(value: Boolean): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
      
      inline def setVisibilityUndefined: Self = StObject.set(x, "visibility", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
