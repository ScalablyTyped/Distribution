package typings.halfred

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("halfred", "disableValidation")
  @js.native
  def disableValidation(): Unit = js.native
  
  @JSImport("halfred", "enableValidation")
  @js.native
  def enableValidation(flag: Boolean): Unit = js.native
  
  @JSImport("halfred", "parse")
  @js.native
  def parse(`object`: js.Any): Resource = js.native
  
  /**
    * A Link Object represents a hyperlink from the containing resource to a URI.
    *
    * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5
    */
  @js.native
  trait Link extends StObject {
    
    /**
      * The "deprecation" property is OPTIONAL.
      * 
      * Its presence indicates that the link is to be deprecated (i.e.
      * removed) at a future date.  Its value is a URL that SHOULD provide
      * further information about the deprecation.
      *
      * A client SHOULD provide some notification (for example, by logging a
      * warning message) whenever it traverses over a link that has this
      * property.  The notification SHOULD include the deprecation property's
      * value so that a client manitainer can easily find information about
      * the deprecation.
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.4
      */
    var deprecation: js.UndefOr[String] = js.native
    
    /**
      * The "href" property is REQUIRED.
      *
      * Its value is either a URI [RFC3986] or a URI Template [RFC6570].
      *
      * If the value is a URI Template then the Link Object SHOULD have a
      * "templated" attribute whose value is true.
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.1
      */
    var href: String = js.native
    
    /**
      * The "hreflang" property is OPTIONAL.
      *
      * Its value is a string and is intended for indicating the language of
      * the target resource (as defined by [RFC5988]).
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.8
      */
    var hreflang: js.UndefOr[String] = js.native
    
    /**
      * The "name" property is OPTIONAL.
      *
      * Its value MAY be used as a secondary key for selecting Link Objects
      * which share the same relation type.
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.5
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * The "profile" property is OPTIONAL.
      *
      * Its value is a string which is a URI that hints about the profile (as
      * defined by [I-D.wilde-profile-link]) of the target resource.
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.6
      */
    var profile: js.UndefOr[String] = js.native
    
    /**
      * The "templated" property is OPTIONAL.
      *
      * Its value is boolean and SHOULD be true when the Link Object's "href"
      * property is a URI Template.
      *
      * Its value SHOULD be considered false if it is undefined or any other
      * value than true.
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.2
      */
    var templated: js.UndefOr[Boolean] = js.native
    
    /**
      * The "title" property is OPTIONAL.
      *
      * Its value is a string and is intended for labelling the link with a
      * human-readable identifier (as defined by [RFC5988]).
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.7
      */
    var title: js.UndefOr[String] = js.native
    
    /**
      * The "type" property is OPTIONAL.
      *
      * Its value is a string used as a hint to indicate the media type
      * expected when dereferencing the target resource.
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.3
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object Link {
    
    @scala.inline
    def apply(href: String): Link = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit class LinkMutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeprecation(value: String): Self = StObject.set(x, "deprecation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeprecationUndefined: Self = StObject.set(x, "deprecation", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      @scala.inline
      def setTemplated(value: Boolean): Self = StObject.set(x, "templated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplatedUndefined: Self = StObject.set(x, "templated", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /** @see https://github.com/basti1302/halfred#links-and-embedded-resources */
  type LinkCollection = StringDictionary[js.Array[Link]]
  
  @js.native
  trait Resource extends StObject {
    
    /** Alias for allEmbeddedResourceArrays() */
    def allEmbeddedArrays(): ResourceCollection = js.native
    
    /**
      * Returns an object which has an array for each embedded resource that was present in the
      * source object.
      * See below why each embedded resource is represented as an array. Each element of any of
      * this arrays is in turn a Resource object.
      */
    def allEmbeddedResourceArrays(): ResourceCollection = js.native
    
    /** Alias for allEmbeddedResourceArrays() */
    def allEmbeddedResources(): ResourceCollection = js.native
    
    /**
      * Returns an object which has an array for each link that was present in the source object.
      * See below why each link is represented as an array.
      */
    def allLinkArrays(): LinkCollection = js.native
    
    /** Alias for allLinkArrays() */
    def allLinks(): LinkCollection = js.native
    
    /**
      * Returns the curie with the given name, if any. The returned object is a link object, which
      * means it can be templated etc. See below for link object API.
      */
    def curie(name: String): Link = js.native
    
    /**
      * Returns the array of CURIEs. Each object in the array is a link object, which means it
      * can be templated etc. See below for the link object API.
      */
    def curieArray(): js.Array[Link] = js.native
    
    /** Alias for embeddedResource(key) */
    def embedded(key: String): Resource = js.native
    
    /** Alias for embeddedResourceArray() */
    def embeddedArray(key: String): js.Array[Resource] = js.native
    
    /**
      * Returns the first element of the array of embedded resources for the given key or null if
      * there are no embedded resources for this key. The returend object is a Resource object.
      */
    def embeddedResource(key: String): Resource = js.native
    
    /**
      * Returns the array of embedded resources for the given key, or null if there are no embedded
      * resources for this key. Each element of this arrays is in turn a Resource object.
      */
    def embeddedResourceArray(key: String): js.Array[Resource] = js.native
    
    /**
      * Returns true if the resource has any CURIEs (Compact URIs).
      *
      * @see http://www.w3.org/TR/2010/NOTE-curie-20101216/
      */
    def hasCuries(): Boolean = js.native
    
    /**
      * Returns the first element of the array of links for the given key or null if there are no
      * links for this key.
      */
    def link(key: String): Link = js.native
    
    /**
      * Returns the array of links for the given key, or null if there are no links for this key.
      */
    def linkArray(key: String): js.Array[Link] = js.native
    
    /**
      * Returns the unmodified, original object that was parsed to this resource. This is rather
      * uninteresting for the source object you give to the parse method (because you probably
      * still have a reference to the source object) but it is a convenient way to get the part of
      * the source object that corresponds to an embedded resource.
      */
    def original(): js.Any = js.native
    
    /**
      * Returns the compact URI for the given full URL, if any
      */
    def reverseResolveCurie(fullUrl: String): String = js.native
    
    /**
      * Alias for validationIssues()
      */
    def validation(): js.Any = js.native
    
    /**
      * Returns all validation issues. Validation issues are only gathered if validation has been
      * turned on by calling ``halfred.enableValidation()`` before calling ``halfred.parse``.
      */
    def validationIssues(): js.Any = js.native
  }
  object Resource {
    
    @scala.inline
    def apply(
      allEmbeddedArrays: () => ResourceCollection,
      allEmbeddedResourceArrays: () => ResourceCollection,
      allEmbeddedResources: () => ResourceCollection,
      allLinkArrays: () => LinkCollection,
      allLinks: () => LinkCollection,
      curie: String => Link,
      curieArray: () => js.Array[Link],
      embedded: String => Resource,
      embeddedArray: String => js.Array[Resource],
      embeddedResource: String => Resource,
      embeddedResourceArray: String => js.Array[Resource],
      hasCuries: () => Boolean,
      link: String => Link,
      linkArray: String => js.Array[Link],
      original: () => js.Any,
      reverseResolveCurie: String => String,
      validation: () => js.Any,
      validationIssues: () => js.Any
    ): Resource = {
      val __obj = js.Dynamic.literal(allEmbeddedArrays = js.Any.fromFunction0(allEmbeddedArrays), allEmbeddedResourceArrays = js.Any.fromFunction0(allEmbeddedResourceArrays), allEmbeddedResources = js.Any.fromFunction0(allEmbeddedResources), allLinkArrays = js.Any.fromFunction0(allLinkArrays), allLinks = js.Any.fromFunction0(allLinks), curie = js.Any.fromFunction1(curie), curieArray = js.Any.fromFunction0(curieArray), embedded = js.Any.fromFunction1(embedded), embeddedArray = js.Any.fromFunction1(embeddedArray), embeddedResource = js.Any.fromFunction1(embeddedResource), embeddedResourceArray = js.Any.fromFunction1(embeddedResourceArray), hasCuries = js.Any.fromFunction0(hasCuries), link = js.Any.fromFunction1(link), linkArray = js.Any.fromFunction1(linkArray), original = js.Any.fromFunction0(original), reverseResolveCurie = js.Any.fromFunction1(reverseResolveCurie), validation = js.Any.fromFunction0(validation), validationIssues = js.Any.fromFunction0(validationIssues))
      __obj.asInstanceOf[Resource]
    }
    
    @scala.inline
    implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllEmbeddedArrays(value: () => ResourceCollection): Self = StObject.set(x, "allEmbeddedArrays", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAllEmbeddedResourceArrays(value: () => ResourceCollection): Self = StObject.set(x, "allEmbeddedResourceArrays", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAllEmbeddedResources(value: () => ResourceCollection): Self = StObject.set(x, "allEmbeddedResources", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAllLinkArrays(value: () => LinkCollection): Self = StObject.set(x, "allLinkArrays", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAllLinks(value: () => LinkCollection): Self = StObject.set(x, "allLinks", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCurie(value: String => Link): Self = StObject.set(x, "curie", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCurieArray(value: () => js.Array[Link]): Self = StObject.set(x, "curieArray", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmbedded(value: String => Resource): Self = StObject.set(x, "embedded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmbeddedArray(value: String => js.Array[Resource]): Self = StObject.set(x, "embeddedArray", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmbeddedResource(value: String => Resource): Self = StObject.set(x, "embeddedResource", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEmbeddedResourceArray(value: String => js.Array[Resource]): Self = StObject.set(x, "embeddedResourceArray", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasCuries(value: () => Boolean): Self = StObject.set(x, "hasCuries", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLink(value: String => Link): Self = StObject.set(x, "link", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLinkArray(value: String => js.Array[Link]): Self = StObject.set(x, "linkArray", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOriginal(value: () => js.Any): Self = StObject.set(x, "original", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReverseResolveCurie(value: String => String): Self = StObject.set(x, "reverseResolveCurie", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidation(value: () => js.Any): Self = StObject.set(x, "validation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setValidationIssues(value: () => js.Any): Self = StObject.set(x, "validationIssues", js.Any.fromFunction0(value))
    }
  }
  
  /** @see https://github.com/basti1302/halfred#links-and-embedded-resources */
  type ResourceCollection = StringDictionary[js.Array[Resource]]
}
