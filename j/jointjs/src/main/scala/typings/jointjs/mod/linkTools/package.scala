package typings.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object linkTools {
  
  type Anchor = typings.jointjs.mod.linkTools.Anchor_
  
  type AnchorCallback[T] = js.Function6[
    /* coords */ typings.jointjs.mod.g.Point, 
    /* view */ typings.jointjs.mod.dia.CellView, 
    /* magnet */ typings.std.SVGElement, 
    /* type */ java.lang.String, 
    /* linkView */ typings.jointjs.mod.dia.LinkView, 
    /* toolView */ typings.jointjs.mod.dia.ToolView, 
    T
  ]
  
  type Boundary = typings.jointjs.mod.linkTools.Boundary_
  
  type Button = typings.jointjs.mod.linkTools.Button_
  
  type Segments = typings.jointjs.mod.linkTools.Segments_
  
  type Vertices = typings.jointjs.mod.linkTools.Vertices_
}
