package typings.httpLinkHeader

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parse & format HTTP link headers according to RFC 8288
    */
  @JSImport("http-link-header", JSImport.Namespace)
  @js.native
  /**
    * Link
    * @param value Link header to parse
    */
  class ^ ()
    extends StObject
       with Link {
    def this(value: String) = this()
  }
  @JSImport("http-link-header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def escapeQuotes(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeQuotes")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Format a given attribute and it's value
    */
  /* static member */
  inline def formatAttribute(attr: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAttribute")(attr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatAttribute(attr: String, value: js.Array[String | Buffer]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAttribute")(attr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatAttribute(attr: String, value: Buffer): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatAttribute")(attr.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def formatExtendedAttribute(attr: String, data: LinkData): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatExtendedAttribute")(attr.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Determines whether an encoding can be
    * natively handled with a `Buffer`
    */
  /* static member */
  inline def isCompatibleEncoding(value: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCompatibleEncoding")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isSingleOccurenceAttr(attr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSingleOccurenceAttr")(attr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* static member */
  inline def isTokenAttr(attr: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTokenAttr")(attr.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Creates a new Link by parsing a link header beginning at the provided
    * offset
    * @param value The header to parse
    * @param offset The offset to start at. Defaults to 0.
    * @return A new Link
    */
  /* static member */
  inline def parse(value: String): Link = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any]).asInstanceOf[Link]
  inline def parse(value: String, offset: Double): Link = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(value.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Link]
  
  /**
    * Parse & format HTTP link headers according to RFC 8288
    */
  @js.native
  trait Link extends StObject {
    
    /**
      * Get refs where the given attribute has a given value
      * @param attribute Attribute name
      * @param value Value to match
      * @return An array of references
      */
    def get(attribute: String, value: String): js.Array[Reference] = js.native
    
    def has(attribute: String, value: String): Boolean = js.native
    
    /**
      * Parse a link header beginning at the provided offset
      * @param value The header to parse
      * @param offset The offset to start at. Defaults to 0.
      * @return The calling instance
      */
    def parse(value: String): Link = js.native
    def parse(value: String, offset: Double): Link = js.native
    
    var refs: js.Array[Reference] = js.native
    
    /**
      * Get refs with given relation type
      * @param value The rel value
      * @return An array of references
      */
    def rel(value: String): js.Array[Reference] = js.native
    
    def set(ref: Reference): Link = js.native
  }
  
  trait LinkData extends StObject {
    
    /** @default 'utf-8' */
    var encoding: js.UndefOr[String] = js.undefined
    
    /** @default 'en' */
    var language: js.UndefOr[String] = js.undefined
    
    var value: String | Buffer
  }
  object LinkData {
    
    inline def apply(value: String | Buffer): LinkData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkData]
    }
    
    extension [Self <: LinkData](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reference
    extends StObject
       with /* index */ StringDictionary[String] {
    
    var rel: String
    
    var uri: String
  }
  object Reference {
    
    inline def apply(rel: String, uri: String): Reference = {
      val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reference]
    }
    
    extension [Self <: Reference](x: Self) {
      
      inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
