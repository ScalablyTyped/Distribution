package typings.jstoxml

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jstoxml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toXML(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toXML")().asInstanceOf[String]
  inline def toXML(obj: js.Array[XmlElement]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toXML(obj: js.Array[XmlElement], options: XmlOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toXML(obj: Unit, options: XmlOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def toXML(obj: XmlElement): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toXML(obj: XmlElement, options: XmlOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toXML")(obj.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type XmlAttrs = StringDictionary[Any]
  
  trait XmlElement
    extends StObject
       with /**
    * Another way to create (sub)-elements (like in _content).
    */
  /* key */ StringDictionary[XmlElement | js.Array[XmlElement] | Any] {
    
    /**
      * Element's attributes.
      */
    var _attrs: js.UndefOr[XmlAttrs | js.Array[XmlAttrs]] = js.undefined
    
    /**
      * Element's content.
      */
    var _content: js.UndefOr[XmlElement | js.Array[XmlElement] | Any] = js.undefined
    
    /**
      * Element's name
      */
    var _name: js.UndefOr[String] = js.undefined
  }
  object XmlElement {
    
    inline def apply(): XmlElement = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlElement] (val x: Self) extends AnyVal {
      
      inline def set_attrs(value: XmlAttrs | js.Array[XmlAttrs]): Self = StObject.set(x, "_attrs", value.asInstanceOf[js.Any])
      
      inline def set_attrsUndefined: Self = StObject.set(x, "_attrs", js.undefined)
      
      inline def set_attrsVarargs(value: XmlAttrs*): Self = StObject.set(x, "_attrs", js.Array(value*))
      
      inline def set_content(value: XmlElement | js.Array[XmlElement] | Any): Self = StObject.set(x, "_content", value.asInstanceOf[js.Any])
      
      inline def set_contentUndefined: Self = StObject.set(x, "_content", js.undefined)
      
      inline def set_contentVarargs(value: XmlElement*): Self = StObject.set(x, "_content", js.Array(value*))
      
      inline def set_name(value: String): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
      
      inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    }
  }
  
  trait XmlOptions extends StObject {
    
    /**
      * If for some reason you want to avoid self-closing tags, you can pass in a special config option _selfCloseTag.
      * @default true
      */
    var _selfCloseTag: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Custom filter for XML attributes
      * Default filters are:
      * @example
      * <code>
      * const defaultEntityFilter = {
      *   "<": "&lt;",
      *   ">": "&gt;",
      *   "&": "&amp;",
      * };
      * </code>
      * Setting this to `false` disables attribute filters.
      */
    var attributesFilter: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Tree depth.
      * @default 0
      */
    var depth: js.UndefOr[Double] = js.undefined
    
    /**
      * Custom filter for XML entities.
      */
    var filter: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Set Custom XML header when given a string,
      * when setting to true the default xml header will be added.
      * @default false
      */
    var header: js.UndefOr[String | Boolean] = js.undefined
    
    /**
      * By default elements are intented with 1 whitespace per depth.
      * @default " "
      */
    var indent: js.UndefOr[String] = js.undefined
  }
  object XmlOptions {
    
    inline def apply(): XmlOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XmlOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XmlOptions] (val x: Self) extends AnyVal {
      
      inline def setAttributesFilter(value: js.Object): Self = StObject.set(x, "attributesFilter", value.asInstanceOf[js.Any])
      
      inline def setAttributesFilterUndefined: Self = StObject.set(x, "attributesFilter", js.undefined)
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setFilter(value: StringDictionary[String]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setHeader(value: String | Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      inline def set_selfCloseTag(value: Boolean): Self = StObject.set(x, "_selfCloseTag", value.asInstanceOf[js.Any])
      
      inline def set_selfCloseTagUndefined: Self = StObject.set(x, "_selfCloseTag", js.undefined)
    }
  }
}
