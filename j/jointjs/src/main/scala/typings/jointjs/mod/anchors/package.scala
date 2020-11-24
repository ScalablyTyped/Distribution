package typings.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object anchors {
  
  type Anchor = typings.jointjs.mod.anchors.GenericAnchor[typings.jointjs.mod.anchors.AnchorType]
  
  type AnchorJSON = typings.jointjs.mod.anchors.GenericAnchorJSON[typings.jointjs.mod.anchors.AnchorType]
  
  type GenericAnchor[K /* <: typings.jointjs.mod.anchors.AnchorType */] = js.Function4[
    /* endView */ typings.jointjs.mod.dia.CellView, 
    /* endMagnet */ typings.std.SVGElement, 
    /* anchorReference */ typings.jointjs.mod.g.Point | typings.std.SVGElement, 
    /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ /* opt */ js.Any, 
    typings.jointjs.mod.g.Point
  ]
  
  type GenericAnchorArguments[K /* <: typings.jointjs.mod.anchors.AnchorType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
}
