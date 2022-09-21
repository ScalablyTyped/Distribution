package typings.googletag.googletag

import typings.googletag.googletagStrings.fluid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * A valid size configuration for a slot, which can be one or multiple sizes.
  */
type GeneralSize = SingleSize | MultiSize

/**
  * A list of single valid sizes.
  */
type MultiSize = js.Array[SingleSize]

/**
  * Named sizes that a slot can have.
  * In most cases size is a fixed-size rectangle but there are some cases when we need other kinds of size specifications.
  * Only the following are valid named sizes:
  * - `'fluid'`: the ad container takes 100% width of parent div and then resizes its height to fit creative content.
  * Similar to how regular block elements on a page behave.
  * Used for native ads (see [related article](https://support.google.com/admanager/answer/6366845)).
  * Note that both 'fluid' and ['fluid'] are acceptable forms to declare a slot size as fluid.
  */
type NamedSize = fluid | js.Array[fluid]

/**
  * A single valid size for a slot.
  */
type SingleSize = SingleSizeArray | NamedSize

/**
  * Array of two numbers representing [width, height].
  */
type SingleSizeArray = js.Tuple2[Double, Double]

/**
  * A mapping of viewport size to ad sizes. Used for responsive ads.
  */
type SizeMapping = js.Tuple2[SingleSizeArray, GeneralSize]

/**
  * A list of size mappings.
  */
type SizeMappingArray = js.Array[SizeMapping]
