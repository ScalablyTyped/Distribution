package typings.halfred

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("halfred", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def disableValidation(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableValidation")().asInstanceOf[Unit]
  
  inline def enableValidation(flag: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableValidation")(flag.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parse(`object`: Any): Resource = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(`object`.asInstanceOf[js.Any]).asInstanceOf[Resource]
  
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
    var deprecation: js.UndefOr[String] = js.undefined
    
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
    var href: String
    
    /**
      * The "hreflang" property is OPTIONAL.
      *
      * Its value is a string and is intended for indicating the language of
      * the target resource (as defined by [RFC5988]).
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.8
      */
    var hreflang: js.UndefOr[String] = js.undefined
    
    /**
      * The "name" property is OPTIONAL.
      *
      * Its value MAY be used as a secondary key for selecting Link Objects
      * which share the same relation type.
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.5
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The "profile" property is OPTIONAL.
      *
      * Its value is a string which is a URI that hints about the profile (as
      * defined by [I-D.wilde-profile-link]) of the target resource.
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.6
      */
    var profile: js.UndefOr[String] = js.undefined
    
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
    var templated: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The "title" property is OPTIONAL.
      *
      * Its value is a string and is intended for labelling the link with a
      * human-readable identifier (as defined by [RFC5988]).
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.7
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * The "type" property is OPTIONAL.
      *
      * Its value is a string used as a hint to indicate the media type
      * expected when dereferencing the target resource.
      *
      * @see https://tools.ietf.org/html/draft-kelly-json-hal-08#section-5.3
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Link {
    
    inline def apply(href: String): Link = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Link] (val x: Self) extends AnyVal {
      
      inline def setDeprecation(value: String): Self = StObject.set(x, "deprecation", value.asInstanceOf[js.Any])
      
      inline def setDeprecationUndefined: Self = StObject.set(x, "deprecation", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHreflang(value: String): Self = StObject.set(x, "hreflang", value.asInstanceOf[js.Any])
      
      inline def setHreflangUndefined: Self = StObject.set(x, "hreflang", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setTemplated(value: Boolean): Self = StObject.set(x, "templated", value.asInstanceOf[js.Any])
      
      inline def setTemplatedUndefined: Self = StObject.set(x, "templated", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type LinkCollection = StringDictionary[js.Array[Link]]
  
  trait Resource extends StObject {
    
    /** Alias for allEmbeddedResourceArrays() */
    def allEmbeddedArrays(): ResourceCollection
    
    /**
      * Returns an object which has an array for each embedded resource that was present in the
      * source object.
      * See below why each embedded resource is represented as an array. Each element of any of
      * this arrays is in turn a Resource object.
      */
    def allEmbeddedResourceArrays(): ResourceCollection
    
    /** Alias for allEmbeddedResourceArrays() */
    def allEmbeddedResources(): ResourceCollection
    
    /**
      * Returns an object which has an array for each link that was present in the source object.
      * See below why each link is represented as an array.
      */
    def allLinkArrays(): LinkCollection
    
    /** Alias for allLinkArrays() */
    def allLinks(): LinkCollection
    
    /**
      * Returns the curie with the given name, if any. The returned object is a link object, which
      * means it can be templated etc. See below for link object API.
      */
    def curie(name: String): Link
    
    /**
      * Returns the array of CURIEs. Each object in the array is a link object, which means it
      * can be templated etc. See below for the link object API.
      */
    def curieArray(): js.Array[Link]
    
    /** Alias for embeddedResource(key) */
    def embedded(key: String): Resource
    
    /** Alias for embeddedResourceArray() */
    def embeddedArray(key: String): js.Array[Resource]
    
    /**
      * Returns the first element of the array of embedded resources for the given key or null if
      * there are no embedded resources for this key. The returend object is a Resource object.
      */
    def embeddedResource(key: String): Resource
    
    /**
      * Returns the array of embedded resources for the given key, or null if there are no embedded
      * resources for this key. Each element of this arrays is in turn a Resource object.
      */
    def embeddedResourceArray(key: String): js.Array[Resource]
    
    /**
      * Returns true if the resource has any CURIEs (Compact URIs).
      *
      * @see http://www.w3.org/TR/2010/NOTE-curie-20101216/
      */
    def hasCuries(): Boolean
    
    /**
      * Returns the first element of the array of links for the given key or null if there are no
      * links for this key.
      */
    def link(key: String): Link
    
    /**
      * Returns the array of links for the given key, or null if there are no links for this key.
      */
    def linkArray(key: String): js.Array[Link]
    
    /**
      * Returns the unmodified, original object that was parsed to this resource. This is rather
      * uninteresting for the source object you give to the parse method (because you probably
      * still have a reference to the source object) but it is a convenient way to get the part of
      * the source object that corresponds to an embedded resource.
      */
    def original(): Any
    
    /**
      * Returns the compact URI for the given full URL, if any
      */
    def reverseResolveCurie(fullUrl: String): String
    
    /**
      * Alias for validationIssues()
      */
    def validation(): Any
    
    /**
      * Returns all validation issues. Validation issues are only gathered if validation has been
      * turned on by calling ``halfred.enableValidation()`` before calling ``halfred.parse``.
      */
    def validationIssues(): Any
  }
  object Resource {
    
    inline def apply(
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
      original: () => Any,
      reverseResolveCurie: String => String,
      validation: () => Any,
      validationIssues: () => Any
    ): Resource = {
      val __obj = js.Dynamic.literal(allEmbeddedArrays = js.Any.fromFunction0(allEmbeddedArrays), allEmbeddedResourceArrays = js.Any.fromFunction0(allEmbeddedResourceArrays), allEmbeddedResources = js.Any.fromFunction0(allEmbeddedResources), allLinkArrays = js.Any.fromFunction0(allLinkArrays), allLinks = js.Any.fromFunction0(allLinks), curie = js.Any.fromFunction1(curie), curieArray = js.Any.fromFunction0(curieArray), embedded = js.Any.fromFunction1(embedded), embeddedArray = js.Any.fromFunction1(embeddedArray), embeddedResource = js.Any.fromFunction1(embeddedResource), embeddedResourceArray = js.Any.fromFunction1(embeddedResourceArray), hasCuries = js.Any.fromFunction0(hasCuries), link = js.Any.fromFunction1(link), linkArray = js.Any.fromFunction1(linkArray), original = js.Any.fromFunction0(original), reverseResolveCurie = js.Any.fromFunction1(reverseResolveCurie), validation = js.Any.fromFunction0(validation), validationIssues = js.Any.fromFunction0(validationIssues))
      __obj.asInstanceOf[Resource]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
      
      inline def setAllEmbeddedArrays(value: () => ResourceCollection): Self = StObject.set(x, "allEmbeddedArrays", js.Any.fromFunction0(value))
      
      inline def setAllEmbeddedResourceArrays(value: () => ResourceCollection): Self = StObject.set(x, "allEmbeddedResourceArrays", js.Any.fromFunction0(value))
      
      inline def setAllEmbeddedResources(value: () => ResourceCollection): Self = StObject.set(x, "allEmbeddedResources", js.Any.fromFunction0(value))
      
      inline def setAllLinkArrays(value: () => LinkCollection): Self = StObject.set(x, "allLinkArrays", js.Any.fromFunction0(value))
      
      inline def setAllLinks(value: () => LinkCollection): Self = StObject.set(x, "allLinks", js.Any.fromFunction0(value))
      
      inline def setCurie(value: String => Link): Self = StObject.set(x, "curie", js.Any.fromFunction1(value))
      
      inline def setCurieArray(value: () => js.Array[Link]): Self = StObject.set(x, "curieArray", js.Any.fromFunction0(value))
      
      inline def setEmbedded(value: String => Resource): Self = StObject.set(x, "embedded", js.Any.fromFunction1(value))
      
      inline def setEmbeddedArray(value: String => js.Array[Resource]): Self = StObject.set(x, "embeddedArray", js.Any.fromFunction1(value))
      
      inline def setEmbeddedResource(value: String => Resource): Self = StObject.set(x, "embeddedResource", js.Any.fromFunction1(value))
      
      inline def setEmbeddedResourceArray(value: String => js.Array[Resource]): Self = StObject.set(x, "embeddedResourceArray", js.Any.fromFunction1(value))
      
      inline def setHasCuries(value: () => Boolean): Self = StObject.set(x, "hasCuries", js.Any.fromFunction0(value))
      
      inline def setLink(value: String => Link): Self = StObject.set(x, "link", js.Any.fromFunction1(value))
      
      inline def setLinkArray(value: String => js.Array[Link]): Self = StObject.set(x, "linkArray", js.Any.fromFunction1(value))
      
      inline def setOriginal(value: () => Any): Self = StObject.set(x, "original", js.Any.fromFunction0(value))
      
      inline def setReverseResolveCurie(value: String => String): Self = StObject.set(x, "reverseResolveCurie", js.Any.fromFunction1(value))
      
      inline def setValidation(value: () => Any): Self = StObject.set(x, "validation", js.Any.fromFunction0(value))
      
      inline def setValidationIssues(value: () => Any): Self = StObject.set(x, "validationIssues", js.Any.fromFunction0(value))
    }
  }
  
  type ResourceCollection = StringDictionary[js.Array[Resource]]
}
