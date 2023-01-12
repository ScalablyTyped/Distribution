package typings.languageTags

import typings.languageTags.languageTagsStrings.extlang
import typings.languageTags.languageTagsStrings.language
import typings.languageTags.languageTagsStrings.region
import typings.languageTags.languageTagsStrings.script
import typings.languageTags.languageTagsStrings.variant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subtagMod {
  
  @JSImport("language-tags/Subtag", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Subtag {
    
    /**
      * Returns a date string reflecting the date the subtag was added to the registry.
      *
      * ```
      * > tags.language('ja').added();
      * '2005-10-16'
      * ```
      */
    /* CompleteClass */
    override def added(): String = js.native
    
    /**
      * Returns an array of comments, if any, otherwise returns an empty array.
      *
      * ```
      * > tags.language('nmf').comments();
      * ['see ntx']
      * ```
      */
    /* CompleteClass */
    override def comments(): js.Array[String] = js.native
    
    /**
      * Returns a date string reflecting the deprecation date if the subtag is deprecated, otherwise returns `null`.
      *
      * ```
      * > tags.language('ja').deprecated();
      * '2008-11-22'
      * ```
      */
    /* CompleteClass */
    override def deprecated(): String | Null = js.native
    
    /**
      * Returns an array of description strings (a subtag may have more than one description).
      *
      * ```
      * > tags.language('ro').descriptions();
      * ['Romanian', 'Moldavian', 'Moldovan']
      * ```
      */
    /* CompleteClass */
    override def descriptions(): js.Array[String] = js.native
    
    /**
      *
      * Return the subtag code formatted according to the case conventions defined in
      * [RFC 5646 section 2.1.1](http://tools.ietf.org/html/rfc5646#section-2.1.1).
      *
      * - language codes are made lowercase ('mn' for Mongolian)
      * - script codes are made lowercase with the initial letter capitalized ('Cyrl' for Cyrillic)
      * - country codes are capitalized ('MN' for Mongolia)
      */
    /* CompleteClass */
    override def format(): String = js.native
    
    /**
      * Returns a preferred subtag as a `Subtag` object if the subtag is deprecated. For example, `ro` is preferred over
      * deprecated `mo`.
      *
      * ```
      * > tags.language('mo').preferred();
      * Subtag
      * ```
      */
    /* CompleteClass */
    override def preferred(): Subtag | Null = js.native
    
    /**
      * Returns the subtag scope as a string, or `null` if the subtag has no scope.
      *
      * Tip: if the subtag represents a macrolanguage, you can use `tags.languages(macrolanguage)` to get a list of all
      * the macrolanguage's individual languages.
      *
      * ```
      * > tags.language('zh').scope();
      * 'macrolanguage'
      * > tags.language('nah').scope();
      * 'collection'
      * ```
      */
    /* CompleteClass */
    override def scope(): String | Null = js.native
    
    /**
      * For subtags of type 'language' or 'extlang', returns a `Subtag` object representing the language's default
      * script. See [RFC 5646 section 3.1.9](http://tools.ietf.org/html/rfc5646#section-3.1.9) for a definition of
      * 'Suppress-Script'.
      */
    /* CompleteClass */
    override def script(): Subtag | Null = js.native
    
    /**
      * Get the subtag type (either 'language', 'extlang', 'script', 'region' or 'variant'). See
      * [RFC 5646 section 2.2](http://tools.ietf.org/html/rfc5646#section-2.2) for type definitions.
      */
    /* CompleteClass */
    override def `type`(): language | extlang | script | region | variant = js.native
  }
  
  trait Subtag extends StObject {
    
    /**
      * Returns a date string reflecting the date the subtag was added to the registry.
      *
      * ```
      * > tags.language('ja').added();
      * '2005-10-16'
      * ```
      */
    def added(): String
    
    /**
      * Returns an array of comments, if any, otherwise returns an empty array.
      *
      * ```
      * > tags.language('nmf').comments();
      * ['see ntx']
      * ```
      */
    def comments(): js.Array[String]
    
    /**
      * Returns a date string reflecting the deprecation date if the subtag is deprecated, otherwise returns `null`.
      *
      * ```
      * > tags.language('ja').deprecated();
      * '2008-11-22'
      * ```
      */
    def deprecated(): String | Null
    
    /**
      * Returns an array of description strings (a subtag may have more than one description).
      *
      * ```
      * > tags.language('ro').descriptions();
      * ['Romanian', 'Moldavian', 'Moldovan']
      * ```
      */
    def descriptions(): js.Array[String]
    
    /**
      *
      * Return the subtag code formatted according to the case conventions defined in
      * [RFC 5646 section 2.1.1](http://tools.ietf.org/html/rfc5646#section-2.1.1).
      *
      * - language codes are made lowercase ('mn' for Mongolian)
      * - script codes are made lowercase with the initial letter capitalized ('Cyrl' for Cyrillic)
      * - country codes are capitalized ('MN' for Mongolia)
      */
    def format(): String
    
    /**
      * Returns a preferred subtag as a `Subtag` object if the subtag is deprecated. For example, `ro` is preferred over
      * deprecated `mo`.
      *
      * ```
      * > tags.language('mo').preferred();
      * Subtag
      * ```
      */
    def preferred(): Subtag | Null
    
    /**
      * Returns the subtag scope as a string, or `null` if the subtag has no scope.
      *
      * Tip: if the subtag represents a macrolanguage, you can use `tags.languages(macrolanguage)` to get a list of all
      * the macrolanguage's individual languages.
      *
      * ```
      * > tags.language('zh').scope();
      * 'macrolanguage'
      * > tags.language('nah').scope();
      * 'collection'
      * ```
      */
    def scope(): String | Null
    
    /**
      * For subtags of type 'language' or 'extlang', returns a `Subtag` object representing the language's default
      * script. See [RFC 5646 section 3.1.9](http://tools.ietf.org/html/rfc5646#section-3.1.9) for a definition of
      * 'Suppress-Script'.
      */
    def script(): Subtag | Null
    
    /**
      * Get the subtag type (either 'language', 'extlang', 'script', 'region' or 'variant'). See
      * [RFC 5646 section 2.2](http://tools.ietf.org/html/rfc5646#section-2.2) for type definitions.
      */
    def `type`(): language | extlang | script | region | variant
  }
  object Subtag {
    
    inline def apply(
      added: () => String,
      comments: () => js.Array[String],
      deprecated: () => String | Null,
      descriptions: () => js.Array[String],
      format: () => String,
      preferred: () => Subtag | Null,
      scope: () => String | Null,
      script: () => Subtag | Null,
      `type`: () => language | extlang | script | region | variant
    ): Subtag = {
      val __obj = js.Dynamic.literal(added = js.Any.fromFunction0(added), comments = js.Any.fromFunction0(comments), deprecated = js.Any.fromFunction0(deprecated), descriptions = js.Any.fromFunction0(descriptions), format = js.Any.fromFunction0(format), preferred = js.Any.fromFunction0(preferred), scope = js.Any.fromFunction0(scope), script = js.Any.fromFunction0(script))
      __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
      __obj.asInstanceOf[Subtag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subtag] (val x: Self) extends AnyVal {
      
      inline def setAdded(value: () => String): Self = StObject.set(x, "added", js.Any.fromFunction0(value))
      
      inline def setComments(value: () => js.Array[String]): Self = StObject.set(x, "comments", js.Any.fromFunction0(value))
      
      inline def setDeprecated(value: () => String | Null): Self = StObject.set(x, "deprecated", js.Any.fromFunction0(value))
      
      inline def setDescriptions(value: () => js.Array[String]): Self = StObject.set(x, "descriptions", js.Any.fromFunction0(value))
      
      inline def setFormat(value: () => String): Self = StObject.set(x, "format", js.Any.fromFunction0(value))
      
      inline def setPreferred(value: () => Subtag | Null): Self = StObject.set(x, "preferred", js.Any.fromFunction0(value))
      
      inline def setScope(value: () => String | Null): Self = StObject.set(x, "scope", js.Any.fromFunction0(value))
      
      inline def setScript(value: () => Subtag | Null): Self = StObject.set(x, "script", js.Any.fromFunction0(value))
      
      inline def setType(value: () => language | extlang | script | region | variant): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
    }
  }
}
