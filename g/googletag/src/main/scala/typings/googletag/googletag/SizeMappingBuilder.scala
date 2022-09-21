package typings.googletag.googletag

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Builder for size mapping specification objects.
  * This builder is provided to help easily construct size specifications.
  *
  * **See also**
  * - [Ad sizes: Responsive ads](https://developers.google.com/publisher-tag/guides/ad-sizes#responsive_ads)
  */
trait SizeMappingBuilder extends StObject {
  
  /**
    * Adds a mapping from a single-size array (representing the viewport) to a single- or multi-size array representing the slot.
    *
    * **Example**
    * ```
    * var mapping1 =
    *     googletag.sizeMapping()
    *              .addSize([1024, 768], [970, 250])
    *              .addSize([980, 690], [728, 90])
    *              .addSize([640, 480], 'fluid')
    *              .addSize([0, 0], [88, 31]) // All viewports < 640x480
    *              .build();
    * var mapping2 =
    *     googletag.sizeMapping()
    *              .addSize([1024, 768], [970, 250])
    *              .addSize([980, 690], [])
    *              .addSize([640, 480], [120, 60])
    *              .addSize([0, 0], [])
    *              .build();
    * // mapping2 will not show any ads for the following viewport sizes:
    * // [1024, 768] > size >= [980, 690] and
    * // [640, 480] > size >= [0, 0]
    * ```
    *
    * @param viewportSize The size of the viewport for this mapping entry.
    * @param slotSize The sizes of the slot for this mapping entry.
    * @returns A reference to this builder.
    */
  def addSize(viewportSize: SingleSizeArray, slotSize: GeneralSize): SizeMappingBuilder
  
  /**
    * Builds a size map specification from the mappings added to this builder.
    *
    * If any invalid mappings have been supplied, this method will return `null`.
    * Otherwise it returns a specification in the correct format to pass to {@link googletag.Slot.defineSizeMapping()}.
    *
    * Note: the behavior of the builder after calling this method is undefined.
    *
    * @returns The result built by this builder. Can be null if invalid size mappings were supplied.
    */
  def build(): SizeMappingArray
}
object SizeMappingBuilder {
  
  inline def apply(addSize: (SingleSizeArray, GeneralSize) => SizeMappingBuilder, build: () => SizeMappingArray): SizeMappingBuilder = {
    val __obj = js.Dynamic.literal(addSize = js.Any.fromFunction2(addSize), build = js.Any.fromFunction0(build))
    __obj.asInstanceOf[SizeMappingBuilder]
  }
  
  extension [Self <: SizeMappingBuilder](x: Self) {
    
    inline def setAddSize(value: (SingleSizeArray, GeneralSize) => SizeMappingBuilder): Self = StObject.set(x, "addSize", js.Any.fromFunction2(value))
    
    inline def setBuild(value: () => SizeMappingArray): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
  }
}
