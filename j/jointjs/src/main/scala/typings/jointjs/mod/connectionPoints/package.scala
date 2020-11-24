package typings.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object connectionPoints {
  
  type ConnectionPoint = typings.jointjs.mod.connectionPoints.GenericConnectionPoint[typings.jointjs.mod.connectionPoints.ConnectionPointType]
  
  type ConnectionPointJSON = typings.jointjs.mod.connectionPoints.GenericConnectionPointJSON[typings.jointjs.mod.connectionPoints.ConnectionPointType]
  
  type GenericConnectionPoint[K /* <: typings.jointjs.mod.connectionPoints.ConnectionPointType */] = js.Function4[
    /* endPathSegmentLine */ typings.jointjs.mod.g.Line, 
    /* endView */ typings.jointjs.mod.dia.CellView, 
    /* endMagnet */ typings.std.SVGElement, 
    /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ /* opt */ js.Any, 
    typings.jointjs.mod.g.Point
  ]
  
  type GenericConnectionPointArguments[K /* <: typings.jointjs.mod.connectionPoints.ConnectionPointType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ js.Any
}
