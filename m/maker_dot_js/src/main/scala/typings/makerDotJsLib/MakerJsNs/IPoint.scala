package typings
package makerDotJsLib.MakerJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An x-y point in a two-dimensional space.
  * Implemented as an array with 2 elements. The first element is x, the second element is y.
  *
  * Examples:
  * ```
  * var p: IPoint = [0, 0];   //typescript
  * var p = [0, 0];   //javascript
  * ```
  */
trait IPoint
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[scala.Double]

object IPoint {
  @scala.inline
  def apply(NumberDictionary: /* index */ org.scalablytyped.runtime.NumberDictionary[scala.Double] = null): IPoint = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[IPoint]
  }
}

