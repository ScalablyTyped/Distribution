package typings.hastToHyperscript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Basic shape of a create element function,
    * this should be extended by a concrete type.
    *
    * @remark
    * This exists to avoid needing to make all supported renders' typings as dependencies
    */
  type CreateElementLike = js.Function3[
    /* name */ java.lang.String, 
    /* attributes */ org.scalablytyped.runtime.StringDictionary[js.Any], 
    /* children */ js.Array[js.Any], 
    js.Any
  ]
  /**
    * Prefix to use as a prefix for keys passed in attrs to h(), this behaviour is turned off by passing false, turned on by passing a string.
    */
  type Prefix = java.lang.String | scala.Boolean
}
