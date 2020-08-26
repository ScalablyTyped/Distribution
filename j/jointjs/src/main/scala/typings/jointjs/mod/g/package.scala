package typings.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object g {
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.mod.g.Line
    - js.Array[typings.jointjs.mod.g.Curve | typings.jointjs.mod.g.Line]
    - typings.jointjs.mod.g.Curve
  */
  type PathObjectUnit = typings.jointjs.mod.g._PathObjectUnit | (js.Array[typings.jointjs.mod.g.Curve | typings.jointjs.mod.g.Line])
  type PathSegmentUnit = typings.jointjs.mod.g.Segment | js.Array[typings.jointjs.mod.g.Segment]
  type SegmentTypes = org.scalablytyped.runtime.StringDictionary[typings.jointjs.mod.g.Segment]
}
