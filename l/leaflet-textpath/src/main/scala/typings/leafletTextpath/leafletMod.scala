package typings.leafletTextpath

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*
  * Add new properties to existing types in the leaflet module.
  */
/* augmented module */
object leafletMod {
  
  @js.native
  trait LayerGroup extends StObject {
    
    /**
      * Set the text to display over the Polylines in this layer group.
      * @default null Represents no text.
      */
    def setText(): Unit = js.native
    def setText(text: String): Unit = js.native
    def setText(text: String, options: TextPathOptions): Unit = js.native
    def setText(text: Null, options: TextPathOptions): Unit = js.native
  }
  
  @js.native
  trait Polyline extends StObject {
    
    /**
      * Set the text to display over this Polyline.
      * @default null Represents no text.
      */
    def setText(): Unit = js.native
    def setText(text: String): Unit = js.native
    def setText(text: String, options: TextPathOptions): Unit = js.native
    def setText(text: Null, options: TextPathOptions): Unit = js.native
  }
  
  trait TextPathOptions extends StObject {
    
    /**
      * Object containing the attributes applied to the text tag.
      * @see https://developer.mozilla.org/en-US/docs/Web/SVG/Element/text#attributes
      * @default {}
      */
    var attributes: js.UndefOr[Record[String, String]] = js.undefined
    
    /**
      * Show text below the path.
      * @default false
      */
    var below: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Centers the text according to the polyline's bounding box.
      * @default false
      */
    var center: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set an offset to position text relative to the polyline.
      * @default 0
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * Rotate text.
      * @default 0
      */
    var orientation: js.UndefOr[TextPathOrientation] = js.undefined
    
    /**
      * Specifies if the text should be repeated along the polyline.
      * @default false
      */
    var repeat: js.UndefOr[Boolean] = js.undefined
  }
  object TextPathOptions {
    
    inline def apply(): TextPathOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextPathOptions]
    }
    
    extension [Self <: TextPathOptions](x: Self) {
      
      inline def setAttributes(value: Record[String, String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      inline def setBelow(value: Boolean): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
      
      inline def setBelowUndefined: Self = StObject.set(x, "below", js.undefined)
      
      inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setOrientation(value: TextPathOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    }
  }
  
  /**
    * <number> rotates the text by the specified angle, in degrees.
    * 'flip' rotates the text by 180 degrees.
    * 'perpendicular' rotates the text by 90 degrees.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.leafletTextpath.leafletTextpathStrings.flip
    - typings.leafletTextpath.leafletTextpathStrings.perpendicular
    - scala.Double
  */
  type TextPathOrientation = _TextPathOrientation | Double
  
  trait _TextPathOrientation extends StObject
}
