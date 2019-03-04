package typings
package halfredLib.halfredMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Resource extends js.Object {
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
  def curie(name: java.lang.String): Link
  /**
    * Returns the array of CURIEs. Each object in the array is a link object, which means it
    * can be templated etc. See below for the link object API.
    */
  def curieArray(): js.Array[Link]
  /** Alias for embeddedResource(key) */
  def embedded(key: java.lang.String): Resource
  /** Alias for embeddedResourceArray() */
  def embeddedArray(key: java.lang.String): js.Array[Resource]
  /**
    * Returns the first element of the array of embedded resources for the given key or null if
    * there are no embedded resources for this key. The returend object is a Resource object.
    */
  def embeddedResource(key: java.lang.String): Resource
  /**
    * Returns the array of embedded resources for the given key, or null if there are no embedded
    * resources for this key. Each element of this arrays is in turn a Resource object.
    */
  def embeddedResourceArray(key: java.lang.String): js.Array[Resource]
  /**
    * Returns true if the resource has any CURIEs (Compact URIs).
    *
    * @see http://www.w3.org/TR/2010/NOTE-curie-20101216/
    */
  def hasCuries(): scala.Boolean
  /**
    * Returns the first element of the array of links for the given key or null if there are no
    * links for this key.
    */
  def link(key: java.lang.String): Link
  /**
    * Returns the array of links for the given key, or null if there are no links for this key.
    */
  def linkArray(key: java.lang.String): js.Array[Link]
  /**
    * Returns the unmodified, original object that was parsed to this resource. This is rather
    * uninteresting for the source object you give to the parse method (because you probably
    * still have a reference to the source object) but it is a convenient way to get the part of
    * the source object that corresponds to an embedded resource.
    */
  def original(): js.Any
  /**
    * Returns the compact URI for the given full URL, if any
    */
  def reverseResolveCurie(fullUrl: java.lang.String): java.lang.String
  /**
    * Alias for validationIssues()
    */
  def validation(): js.Any
  /**
    * Returns all validation issues. Validation issues are only gathered if validation has been
    * turned on by calling ``halfred.enableValidation()`` before calling ``halfred.parse``.
    */
  def validationIssues(): js.Any
}

object Resource {
  @scala.inline
  def apply(
    allEmbeddedArrays: js.Function0[ResourceCollection],
    allEmbeddedResourceArrays: js.Function0[ResourceCollection],
    allEmbeddedResources: js.Function0[ResourceCollection],
    allLinkArrays: js.Function0[LinkCollection],
    allLinks: js.Function0[LinkCollection],
    curie: js.Function1[java.lang.String, Link],
    curieArray: js.Function0[js.Array[Link]],
    embedded: js.Function1[java.lang.String, Resource],
    embeddedArray: js.Function1[java.lang.String, js.Array[Resource]],
    embeddedResource: js.Function1[java.lang.String, Resource],
    embeddedResourceArray: js.Function1[java.lang.String, js.Array[Resource]],
    hasCuries: js.Function0[scala.Boolean],
    link: js.Function1[java.lang.String, Link],
    linkArray: js.Function1[java.lang.String, js.Array[Link]],
    original: js.Function0[js.Any],
    reverseResolveCurie: js.Function1[java.lang.String, java.lang.String],
    validation: js.Function0[js.Any],
    validationIssues: js.Function0[js.Any]
  ): Resource = {
    val __obj = js.Dynamic.literal(allEmbeddedArrays = allEmbeddedArrays, allEmbeddedResourceArrays = allEmbeddedResourceArrays, allEmbeddedResources = allEmbeddedResources, allLinkArrays = allLinkArrays, allLinks = allLinks, curie = curie, curieArray = curieArray, embedded = embedded, embeddedArray = embeddedArray, embeddedResource = embeddedResource, embeddedResourceArray = embeddedResourceArray, hasCuries = hasCuries, link = link, linkArray = linkArray, original = original, reverseResolveCurie = reverseResolveCurie, validation = validation, validationIssues = validationIssues)
  
    __obj.asInstanceOf[Resource]
  }
}

