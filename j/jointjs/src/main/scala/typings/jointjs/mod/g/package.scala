package typings.jointjs.mod.g

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def normalizeAngle(angle: scala.Double): scala.Double = typings.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[scala.Double]

@scala.inline
def random(): scala.Double = typings.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("random")().asInstanceOf[scala.Double]
@scala.inline
def random(min: scala.Double): scala.Double = typings.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
@scala.inline
def random(min: scala.Double, max: scala.Double): scala.Double = (typings.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
@scala.inline
def random(min: scala.Unit, max: scala.Double): scala.Double = (typings.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

@scala.inline
def snapToGrid(`val`: scala.Double, gridSize: scala.Double): scala.Double = (typings.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("snapToGrid")(`val`.asInstanceOf[js.Any], gridSize.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

@scala.inline
def toDeg(rad: scala.Double): scala.Double = typings.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("toDeg")(rad.asInstanceOf[js.Any]).asInstanceOf[scala.Double]

@scala.inline
def toRad(deg: scala.Double): scala.Double = typings.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("toRad")(deg.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
@scala.inline
def toRad(deg: scala.Double, over360: scala.Boolean): scala.Double = (typings.jointjs.mod.g.^.asInstanceOf[js.Dynamic].applyDynamic("toRad")(deg.asInstanceOf[js.Any], over360.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

/* Rewritten from type alias, can be one of: 
  - typings.jointjs.mod.g.Line
  - js.Array[typings.jointjs.mod.g.Curve | typings.jointjs.mod.g.Line]
  - typings.jointjs.mod.g.Curve
*/
type PathObjectUnit = typings.jointjs.mod.g._PathObjectUnit | (js.Array[typings.jointjs.mod.g.Curve | typings.jointjs.mod.g.Line])

type PathSegmentUnit = typings.jointjs.mod.g.Segment | js.Array[typings.jointjs.mod.g.Segment]

type SegmentTypes = org.scalablytyped.runtime.StringDictionary[typings.jointjs.mod.g.Segment]
