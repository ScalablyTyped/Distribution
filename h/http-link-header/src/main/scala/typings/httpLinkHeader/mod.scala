package typings.httpLinkHeader

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  class ^ () extends Link {
    def this(value: String) = this()
  }
  
  /* static member */
  @JSImport("http-link-header", "escapeQuotes")
  @js.native
  def escapeQuotes(value: String): String = js.native
  
  /**
    * Format a given attribute and it's value
    */
  /* static member */
  @JSImport("http-link-header", "formatAttribute")
  @js.native
  def formatAttribute(attr: String, value: String): String = js.native
  @JSImport("http-link-header", "formatAttribute")
  @js.native
  def formatAttribute(attr: String, value: js.Array[String | Buffer]): String = js.native
  @JSImport("http-link-header", "formatAttribute")
  @js.native
  def formatAttribute(attr: String, value: Buffer): String = js.native
  
  /* static member */
  @JSImport("http-link-header", "formatExtendedAttribute")
  @js.native
  def formatExtendedAttribute(attr: String, data: LinkData): String = js.native
  
  /**
    * Determines whether an encoding can be
    * natively handled with a `Buffer`
    */
  /* static member */
  @JSImport("http-link-header", "isCompatibleEncoding")
  @js.native
  def isCompatibleEncoding(value: String): Boolean = js.native
  
  /* static member */
  @JSImport("http-link-header", "isSingleOccurenceAttr")
  @js.native
  def isSingleOccurenceAttr(attr: String): Boolean = js.native
  
  /* static member */
  @JSImport("http-link-header", "isTokenAttr")
  @js.native
  def isTokenAttr(attr: String): Boolean = js.native
  
  /**
    * Creates a new Link by parsing a link header beginning at the provided
    * offset
    * @param value The header to parse
    * @param offset The offset to start at. Defaults to 0.
    * @return A new Link
    */
  /* static member */
  @JSImport("http-link-header", "parse")
  @js.native
  def parse(value: String): Link = js.native
  @JSImport("http-link-header", "parse")
  @js.native
  def parse(value: String, offset: Double): Link = js.native
  
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
  
  @js.native
  trait LinkData extends StObject {
    
    /** @default 'utf-8' */
    var encoding: js.UndefOr[String] = js.native
    
    /** @default 'en' */
    var language: js.UndefOr[String] = js.native
    
    var value: String | Buffer = js.native
  }
  object LinkData {
    
    @scala.inline
    def apply(value: String | Buffer): LinkData = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkData]
    }
    
    @scala.inline
    implicit class LinkDataMutableBuilder[Self <: LinkData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setValue(value: String | Buffer): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Reference extends /* index */ StringDictionary[String] {
    
    var rel: String = js.native
    
    var uri: String = js.native
  }
  object Reference {
    
    @scala.inline
    def apply(rel: String, uri: String): Reference = {
      val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reference]
    }
    
    @scala.inline
    implicit class ReferenceMutableBuilder[Self <: Reference] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
