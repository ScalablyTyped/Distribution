package typings.hapiMimos

import org.scalablytyped.runtime.StringDictionary
import typings.mimeDb.mod.MimeSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @hapi/mimos.@hapi/mimos.MimosOptionsValue & {[key: string] : any} */
  trait MimosOptionsValuekeystrin
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    /** The default charset associated with this type, if any. */
    val charset: js.UndefOr[String] = js.undefined
    
    /** Whether a file of this type can be gzipped. */
    val compressible: js.UndefOr[Boolean] = js.undefined
    
    /** Known extensions associated with this mime type. */
    val extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Where the mime type is defined.
      * If not set, it's probably a custom media type.
      */
    val source: js.UndefOr[MimeSource] = js.undefined
    
    /**
      * Specify the type value of result objects, defaults to key.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MimosOptionsValuekeystrin {
    
    @scala.inline
    def apply(): MimosOptionsValuekeystrin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MimosOptionsValuekeystrin]
    }
    
    @scala.inline
    implicit class MimosOptionsValuekeystrinMutableBuilder[Self <: MimosOptionsValuekeystrin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setCompressible(value: Boolean): Self = StObject.set(x, "compressible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressibleUndefined: Self = StObject.set(x, "compressible", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: MimeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined @hapi/mimos.@hapi/mimos.MimosOptionsValue & {  predicate :(mime : @hapi/mimos.@hapi/mimos.MimosOptionsValue & {[key: string] : any}): @hapi/mimos.@hapi/mimos.MimosOptionsValue & {[key: string] : any} | undefined} */
  trait MimosOptionsValuepredicat extends StObject {
    
    /** The default charset associated with this type, if any. */
    val charset: js.UndefOr[String] = js.undefined
    
    /** Whether a file of this type can be gzipped. */
    val compressible: js.UndefOr[Boolean] = js.undefined
    
    /** Known extensions associated with this mime type. */
    val extensions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Method with signature function(mime) when this mime type is found in the database,
      * this function will run. This allows you make customizations to mime based on developer criteria.
      */
    var predicate: js.UndefOr[js.Function1[/* mime */ MimosOptionsValuekeystrin, MimosOptionsValuekeystrin]] = js.undefined
    
    /**
      * Where the mime type is defined.
      * If not set, it's probably a custom media type.
      */
    val source: js.UndefOr[MimeSource] = js.undefined
    
    /**
      * Specify the type value of result objects, defaults to key.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MimosOptionsValuepredicat {
    
    @scala.inline
    def apply(): MimosOptionsValuepredicat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MimosOptionsValuepredicat]
    }
    
    @scala.inline
    implicit class MimosOptionsValuepredicatMutableBuilder[Self <: MimosOptionsValuepredicat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
      
      @scala.inline
      def setCompressible(value: Boolean): Self = StObject.set(x, "compressible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressibleUndefined: Self = StObject.set(x, "compressible", js.undefined)
      
      @scala.inline
      def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
      
      @scala.inline
      def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
      
      @scala.inline
      def setPredicate(value: /* mime */ MimosOptionsValuekeystrin => MimosOptionsValuekeystrin): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
      @scala.inline
      def setSource(value: MimeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
